package com.github.evra.jcr.connector.ui.importWizards;

import java.net.URI;
import java.net.URISyntaxException;

import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class RepositryConnectionWizardPage extends WizardPage {

	private Text txtUrl;
	private Text txtUser;
	private Text txtPassword;
	private Text lblStatusValue;
	private Text txtWorkspace;

	protected RepositryConnectionWizardPage(String pageName) {
		super(pageName);
		setTitle(pageName); // NON-NLS-1
		setDescription("JCR WebDav connection"); // NON-NLS-1

	}

	@Override
	public void createControl(Composite parent) {
		Composite selectionArea = new Composite(parent, SWT.NONE);
		GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL | GridData.FILL_HORIZONTAL);
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
		txtUrl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtUrl.setText("http://localhost:8080/server");

		txtUrl.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				String txt = ((Text) e.getSource()).getText();
				if (txt == null || txt.isEmpty()) {
					setErrorMessage("Invalid URL");
					return;
				}
				try {
					new URI(txt);
					setErrorMessage(null);
				} catch (URISyntaxException e1) {
					setErrorMessage("Invalid URL");
				}
			}
		});

		Label lblUser = new Label(selectionArea, SWT.NONE);
		lblUser.setText("User:");

		txtUser = new Text(selectionArea, SWT.BORDER);
		txtUser.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtUser.setText("admin");

		Label lblPassword = new Label(selectionArea, SWT.NONE);
		lblPassword.setText("Password:");

		txtPassword = new Text(selectionArea, SWT.BORDER | SWT.PASSWORD);
		txtPassword.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtPassword.setText("admin");

		Label lblWorkspace = new Label(selectionArea, SWT.NONE);
		lblWorkspace.setText("Workspace:");

		txtWorkspace = new Text(selectionArea, SWT.BORDER);
		txtWorkspace.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtWorkspace.setText("");
		txtWorkspace.setToolTipText("Repository workspace. If empty default workspace is used.");

		Label stub = new Label(selectionArea, SWT.NONE);
		Button testButon = new Button(selectionArea, SWT.NONE);
		testButon.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
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

		Label lblStatus = new Label(selectionArea, SWT.NONE);
		lblStatus.setText("Status:");

		lblStatusValue = new Text(selectionArea, SWT.MULTI | SWT.READ_ONLY | SWT.BORDER | SWT.WRAP);

		lblStatusValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 5));
		lblStatusValue.setText("Unknown");

	}

	protected void testConnection() {
		try {
			String repositoryUrl = txtUrl.getText();
			lblStatusValue.setText("Connecting " + repositoryUrl);

			Repository repository = ImportWizard.createRepository(repositoryUrl);

			if (repository == null) {
				lblStatusValue.setText("Error: cannot get JCR repository");
				this.setPageComplete(false);
				return;
			}

			String workspaceName = "".equals(txtWorkspace.getText()) ? null : txtWorkspace.getText();
			Session session = repository.login(new SimpleCredentials(txtUser.getText(), txtPassword.getText()
					.toCharArray()), workspaceName);

			session.logout();

			lblStatusValue.setText("Connection check successful");

			this.setPageComplete(true);

		} catch (Exception e) {
			String newline = System.getProperty("line.separator");
			StringBuilder log = new StringBuilder();
			log.append("Connection failed:");
			for (Throwable c = e; c != null; c = c.getCause()) {
				log.append(newline);
				log.append("        because of ");
				log.append(c.getClass().getSimpleName());
				log.append(": ");
				log.append(c.getMessage());
			}

			lblStatusValue.setText(log.toString());

			lblStatusValue.pack(true);
			lblStatusValue.setRedraw(true);
			lblStatusValue.redraw();

			this.setPageComplete(false);

		}

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

	public String getWorkspace() {
		return txtWorkspace.getText();
	}
}
