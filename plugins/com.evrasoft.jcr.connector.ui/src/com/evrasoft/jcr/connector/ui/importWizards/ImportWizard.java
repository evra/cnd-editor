package com.evrasoft.jcr.connector.ui.importWizards;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.nodetype.NodeType;
import javax.jcr.nodetype.NodeTypeIterator;
import javax.jcr.nodetype.NodeTypeManager;

import org.apache.jackrabbit.jcr2spi.Jcr2spiRepositoryFactory;
import org.apache.jackrabbit.spi2davex.Spi2davexRepositoryServiceFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import com.evrasoft.jcr.cnd.CndFactory;
import com.evrasoft.jcr.cnd.Model;
import com.evrasoft.jcr.cnd.NsMapping;
import com.evrasoft.jcr.connector.ui.Activator;
import com.evrasoft.jcr.connector.ui.adapter.NodeTypeDefintitionConverter;

public class ImportWizard extends Wizard implements IImportWizard {

	private TargetFileWizardPage fileSelectionPage;
	private RepositryConnectionWizardPage repositoryConnectionPage;
	protected IFile file;

	public ImportWizard() {
		super();
	}

	public boolean performFinish() {

		final String url = repositoryConnectionPage.getUrl();
		final String user = repositoryConnectionPage.getUser();
		final String password = repositoryConnectionPage.getPassword();
		final String workspace = repositoryConnectionPage.getWorkspace();

		try {
			getContainer().run(true, true, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					importCnd(monitor, url, user, password, workspace);
				}
			});
		} catch (Exception e1) {
			Activator.handleError("Unable to import CND", e1);
			return false;
		}

		return true;
	}

	protected void importCnd(IProgressMonitor monitor, String url, String user, String password, String workspace) {
		int connectTaskWorkUnits = 20;
		int importTaskWorkUnits = 100;
		int saveFileWorkUnits = 20;
		monitor.beginTask("Importing CND", connectTaskWorkUnits + importTaskWorkUnits + saveFileWorkUnits);

		try {

			monitor.subTask("Connecting to repository");
			Repository repository = createRepository(url);

			String ws = workspace;
			if (ws != null && ws.isEmpty()) {
				ws = null;
			}
			Session session = repository.login(new SimpleCredentials(user, password.toCharArray()), ws);

			monitor.worked(connectTaskWorkUnits);

			if (monitor.isCanceled()) {
				return;
			}

			Model model = CndFactory.eINSTANCE.createModel();

			String[] namespacePrefixes = session.getNamespacePrefixes();
			for (String nameSpacePrefix : namespacePrefixes) {
				String namespaceURI = session.getNamespaceURI(nameSpacePrefix);

				if ((nameSpacePrefix == null || nameSpacePrefix.isEmpty())
						&& (namespaceURI == null || namespaceURI.isEmpty())) {
					continue;
				}
				NsMapping nsMapping = CndFactory.eINSTANCE.createNsMapping();

				nsMapping.setName(nameSpacePrefix);
				nsMapping.setUri(namespaceURI);
				model.getNamespaces().add(nsMapping);
			}

			NodeTypeManager nodeTypeManager = session.getWorkspace().getNodeTypeManager();
			NodeTypeIterator nodeTypeIterator = nodeTypeManager.getAllNodeTypes();

			long nodeTypesTotalNum = nodeTypeIterator.getSize();
			int importTaskTick = (int) (importTaskWorkUnits / nodeTypesTotalNum);

			NodeTypeDefintitionConverter converter = new NodeTypeDefintitionConverter();

			while (nodeTypeIterator.hasNext()) {
				NodeType nodeType = nodeTypeIterator.nextNodeType();
				model.getNodeTypes().add(converter.asDslElement(nodeType, nodeTypeManager));

				monitor.worked(importTaskTick);
				if (monitor.isCanceled()) {
					return;
				}

			}
			session.logout();

			getContainer().getShell().getDisplay().syncExec(new Runnable() {
				public void run() {
					file = fileSelectionPage.createNewFile();
				}
			});

			if (file == null) {
				reportError("Unable to import CND, cannot create target file", null);
				return;
			}

			ResourceSet rs = new ResourceSetImpl();
			// http://wiki.eclipse.org/index.php/EMF/FAQ#How_do_I_map_between_an_EMF_Resource_and_an_Eclipse_IFile.3F
			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

			Resource resource = rs.getResource(uri, true);
			resource.getContents().add(model);
			resource.save(Collections.EMPTY_MAP);
			monitor.worked(saveFileWorkUnits);

		} catch (Exception e) {
			reportError("Unable to import CND", e);
		} finally {
			monitor.done();
		}
	}

	public static Repository createRepository(String repositoryUrl) throws RepositoryException, URISyntaxException {

		java.net.URI uri = new java.net.URI(repositoryUrl.toString().trim());
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put(Spi2davexRepositoryServiceFactory.PARAM_REPOSITORY_URI, uri);
		parameters.put(Jcr2spiRepositoryFactory.PARAM_REPOSITORY_SERVICE_FACTORY,
				new Spi2davexRepositoryServiceFactory());

		Jcr2spiRepositoryFactory factory = new Jcr2spiRepositoryFactory();
		Repository repository = factory.getRepository(parameters);

		return repository;
	}

	protected void reportError(final String message, final Throwable t) {
		Activator.handleError(message, t);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Import repository node types"); // NON-NLS-1
		setNeedsProgressMonitor(true);
		fileSelectionPage = new TargetFileWizardPage("Import CND", selection); // NON-NLS-1
		repositoryConnectionPage = new RepositryConnectionWizardPage("Repository connection");
	}

	public void addPages() {
		super.addPages();
		addPage(repositoryConnectionPage);
		addPage(fileSelectionPage);
	}

}
