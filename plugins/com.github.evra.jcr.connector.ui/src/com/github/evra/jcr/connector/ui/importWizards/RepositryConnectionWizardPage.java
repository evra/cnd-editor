package com.github.evra.jcr.connector.ui.importWizards;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.jcr.Repository;
import javax.jcr.RepositoryException;



import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.nodetype.NodeType;
import javax.jcr.nodetype.NodeTypeIterator;
import javax.jcr.nodetype.NodeTypeManager;

import org.apache.jackrabbit.commons.JcrUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.github.evra.jcr.cnd.CndFactory;
import com.github.evra.jcr.cnd.CndPackage;
import com.github.evra.jcr.cnd.Model;
import com.github.evra.jcr.connector.ui.adapter.NodeTypeDefintitionConverter;

public class RepositryConnectionWizardPage extends WizardPage {

	private Text txtUrl;
	private Text txtUser;
	private Text txtPassword;
	private Label lblStatusValue;

	protected RepositryConnectionWizardPage(String pageName) {
		super(pageName);
		setTitle(pageName); //NON-NLS-1
		setDescription("JCR WebDav connection"); //NON-NLS-1
		
	}

	@Override
	public void createControl(Composite parent) {
		Composite selectionArea = new Composite(parent, SWT.NONE);
		GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL
				| GridData.FILL_HORIZONTAL);
		selectionArea.setLayoutData(fileSelectionData);
		setControl(selectionArea);
		
		GridLayout fileSelectionLayout = new GridLayout();
		fileSelectionLayout.numColumns = 2;
		fileSelectionLayout.makeColumnsEqualWidth = false;
		fileSelectionLayout.marginWidth = 10;
		fileSelectionLayout.marginHeight = 10;
		selectionArea.setLayout(fileSelectionLayout);

	    Label lblUrl = new Label(selectionArea, SWT.NONE);
	    lblUrl.setText("URL:");
	    
	    txtUrl = new Text(selectionArea, SWT.BORDER);
	    txtUrl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,1, 1));
	    txtUrl.setText("http://localhost:8080/server");
	    
	    Label lblUser = new Label(selectionArea, SWT.NONE);
	    lblUser.setText("User:");

	    txtUser = new Text(selectionArea, SWT.BORDER);
	    txtUser.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,1, 1));
	    txtUser.setText("admin");
	    

	    Label lblPassword = new Label(selectionArea, SWT.NONE);
	    lblPassword.setText("Password:");
	    

	    txtPassword = new Text(selectionArea, SWT.BORDER | SWT.PASSWORD);
	    txtPassword.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,1, 1));	    
	    txtPassword.setText("admin");
	    
	    Label lblStatus = new Label(selectionArea, SWT.NONE);
	    lblStatus.setText("Status:");

	    lblStatusValue = new Label(selectionArea, SWT.NONE);
	    lblStatusValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,1, 1));
	    lblStatusValue.setText("Unknown");
	    	    
	    Label stub = new Label(selectionArea, SWT.NONE);	    
	    Button testButon = new Button(selectionArea, SWT.NONE);
	    testButon.setLayoutData(new GridData(SWT.FILL, SWT.RIGHT, false, false,1, 1));
	    testButon.setText("Test connection");
	
	    testButon.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				testConnection();				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				testConnection();
			}
		});
	    
	    
	}

	protected void testConnection() {
		try {
			String repositoryUrl = txtUrl.getText();
			lblStatusValue.setText("Connecting " + repositoryUrl);
			
			Repository repository = ImportWizard.createRepository(repositoryUrl);			
			Session session = repository.login( 
					new SimpleCredentials(txtUser.getText(), txtPassword.getText().toCharArray()));
			session.logout();
			
//			NodeTypeManager nodeTypeManager = session.getWorkspace().getNodeTypeManager();
//			NodeTypeIterator nodeTypeIterator = nodeTypeManager.getAllNodeTypes();
//			
//			Model model = CndFactory.eINSTANCE.createModel();
//			NodeTypeDefintitionConverter converter = new NodeTypeDefintitionConverter();
//			
//			while(nodeTypeIterator.hasNext()) {
//				NodeType nodeType = nodeTypeIterator.nextNodeType();
//				System.out.println("["+nodeType.getName() + "]");
//				model.getNodeTypes().add(converter.asDslElement(nodeType));
//			}
//			session.logout();
//			
//			ResourceSet rs = new ResourceSetImpl();
//			URI uri = URI.createURI(new File("D:\\data\\projects\\jcr-modeling\\tmp\\model.cnd").toURI().toString());
//			System.out.println("save to " + uri.toFileString());
//			Resource resource = rs.getResource(uri, true);
//			resource.getContents().add(model);
//			resource.save(new HashMap());
//						
			lblStatusValue.setText("Connection check successful");
			
			this.setPageComplete(true);
			setErrorMessage(null);
		} catch (RepositoryException e) {
			lblStatusValue.setText("Error: " + e.getMessage());
			setErrorMessage(e.getMessage());
			this.setPageComplete(false);
			//TODO log proper
			
			//e.printStackTrace();
		}
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public String getUrl() {
		return txtUrl.getText();
	}
	
	public String getUser() {
		return txtUser.getText();
	}
	
	public String getPassword() {
		return txtPassword.getText();
	}
}
