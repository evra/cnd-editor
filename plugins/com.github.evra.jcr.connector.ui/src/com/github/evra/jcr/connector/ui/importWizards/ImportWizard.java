package com.github.evra.jcr.connector.ui.importWizards;

import java.io.File;
import java.io.IOException;
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

import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.jackrabbit.jcr2dav.Jcr2davRepositoryFactory;
import org.apache.jackrabbit.spi2davex.Spi2davexRepositoryServiceFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import com.github.evra.jcr.cnd.CndFactory;
import com.github.evra.jcr.cnd.Model;
import com.github.evra.jcr.connector.ui.adapter.NodeTypeDefintitionConverter;

public class ImportWizard extends Wizard implements IImportWizard {
	
	private ImportWizardPage fileSelectionPage;
	private RepositryConnectionWizardPage repositoryConnectionPage;

	public ImportWizard() {
		super();
	}

	public boolean performFinish() {
		IFile file = fileSelectionPage.createNewFile();
		
        if (file == null)
            return false;
        
        try {
    
    	Repository repository = createRepository(repositoryConnectionPage.getUrl());
    	
		Session session = repository.login( 
				new SimpleCredentials(repositoryConnectionPage.getUser(), repositoryConnectionPage.getPassword().toCharArray()));
		                
        NodeTypeManager nodeTypeManager = session.getWorkspace().getNodeTypeManager();
		NodeTypeIterator nodeTypeIterator = nodeTypeManager.getAllNodeTypes();
		
		Model model = CndFactory.eINSTANCE.createModel();
		NodeTypeDefintitionConverter converter = new NodeTypeDefintitionConverter();
		
		while(nodeTypeIterator.hasNext()) {
			NodeType nodeType = nodeTypeIterator.nextNodeType();		
			model.getNodeTypes().add(converter.asDslElement(nodeType));
		}
		session.logout();
		
		ResourceSet rs = new ResourceSetImpl();
		
		//http://wiki.eclipse.org/index.php/EMF/FAQ#How_do_I_map_between_an_EMF_Resource_and_an_Eclipse_IFile.3F
		
		//URI uri = URI.createURI(new File("D:\\data\\projects\\jcr-modeling\\tmp\\model.cnd").toURI().toString());
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				
		Resource resource = rs.getResource(uri, true);
		resource.getContents().add(model);
		resource.save(Collections.EMPTY_MAP);
		
        } catch (RepositoryException e) {
        	//TODO error reporting 
        	e.printStackTrace();
        	return false;
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
        
        
        return true;
	}

	public static Repository createRepository(String repositoryUrl) throws RepositoryException {
		//Repository repository = JcrUtils.getRepository(repositoryConnectionPage.getUrl());
		Jcr2davRepositoryFactory factory = new Jcr2davRepositoryFactory();    
    	Map<String, String> parameters = new HashMap<String,String>();
    	parameters.put(Spi2davexRepositoryServiceFactory.PARAM_REPOSITORY_URI,repositoryUrl );
    	Repository repository = factory.getRepository(parameters);
		return repository;
	}
	 
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Import repository node types"); //NON-NLS-1
		setNeedsProgressMonitor(true);
		fileSelectionPage = new ImportWizardPage("Import File",selection); //NON-NLS-1
		repositoryConnectionPage = new RepositryConnectionWizardPage("Repository connection");
	}
	
    public void addPages() {
        super.addPages();
        addPage(repositoryConnectionPage);
        addPage(fileSelectionPage);        
    }

}
