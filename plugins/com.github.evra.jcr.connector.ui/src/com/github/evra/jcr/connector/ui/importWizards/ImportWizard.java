package com.github.evra.jcr.connector.ui.importWizards;

import java.io.File;
import java.io.IOException;
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

import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.jackrabbit.jcr2dav.Jcr2davRepositoryFactory;
import org.apache.jackrabbit.jcr2spi.Jcr2spiRepositoryFactory;
import org.apache.jackrabbit.jcr2spi.RepositoryImpl;
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
	
	private TargetFileWizardPage fileSelectionPage;
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
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        return true;
	}

	public static Repository createRepository(String repositoryUrl) throws RepositoryException, URISyntaxException {
		//Repository repository = JcrUtils.getRepository(repositoryUrl);
		
//		Jcr2davRepositoryFactory factory = new Jcr2davRepositoryFactory();    
//    	Map<String, String> parameters = new HashMap<String,String>();
//    	parameters.put(Spi2davexRepositoryServiceFactory.PARAM_REPOSITORY_URI,repositoryUrl );
//    	Repository repository = factory.getRepository(parameters);
    	
//    	java.net.URI uri = new java.net.URI(repositoryUrl.toString().trim());
//    	
//    	Map parameters = new HashMap();
//    	parameters.put(Spi2davexRepositoryServiceFactory.PARAM_REPOSITORY_URI,uri );
//    	
//		Jcr2spiRepositoryFactory.RepositoryConfigImpl config = 
//				new Jcr2spiRepositoryFactory.RepositoryConfigImpl(
//						new Spi2davexRepositoryServiceFactory(), parameters);
//		Repository repository = RepositoryImpl.create(config);

		
    	java.net.URI uri = new java.net.URI(repositoryUrl.toString().trim());
    	Map parameters = new HashMap();
    	parameters.put(Spi2davexRepositoryServiceFactory.PARAM_REPOSITORY_URI,uri );

    	parameters.put(Jcr2spiRepositoryFactory.PARAM_REPOSITORY_SERVICE_FACTORY, new Spi2davexRepositoryServiceFactory());
    	//parameters.put(Spi2davexRepositoryServiceFactory.PARAM_REPOSITORY_URI,uri );

		Jcr2spiRepositoryFactory factory = new Jcr2spiRepositoryFactory();
		Repository repository = factory.getRepository(parameters);
				
		return repository;
	}
	 
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Import repository node types"); //NON-NLS-1
		setNeedsProgressMonitor(true);
		fileSelectionPage = new TargetFileWizardPage("Import CND",selection); //NON-NLS-1
		repositoryConnectionPage = new RepositryConnectionWizardPage("Repository connection");
	}
	
    public void addPages() {
        super.addPages();
        addPage(repositoryConnectionPage);
        addPage(fileSelectionPage);        
    }
    
}
