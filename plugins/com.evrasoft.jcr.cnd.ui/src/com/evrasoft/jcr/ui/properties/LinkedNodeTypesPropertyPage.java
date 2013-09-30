package com.evrasoft.jcr.ui.properties;

import java.net.URI;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IPathVariableManager;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.PropertyPage;

import com.evrasoft.jcr.ui.variableresolvers.Jsr283NodeTypesVarPathResolver;

public class LinkedNodeTypesPropertyPage extends PropertyPage {

	@Override
	protected Control createContents(Composite parent) {

		Group refactoringGroup = new Group(parent, SWT.SHADOW_IN);
		refactoringGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

		refactoringGroup.setText("Linked resources");
		GridLayout layout = new GridLayout(2, false);
		refactoringGroup.setLayout(layout);

		Label label = new Label(refactoringGroup, SWT.NONE);
		label.setText("Add built-in JSR283 node types as linked resource");

		Button buttonAdd = new Button(refactoringGroup, SWT.NONE);
		buttonAdd.setText("Add");

		IAdaptable element2 = this.getElement();
		final IProject project = (IProject) element2.getAdapter(IProject.class);

		buttonAdd.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (project != null) {
					addBuiltinNodeTypes(project);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		refactoringGroup.pack();

		return refactoringGroup;
	}

	private void addBuiltinNodeTypes(IProject project) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPathVariableManager pathMan = project.getPathVariableManager();

		URI targetUri;
		if (pathMan.validateName(Jsr283NodeTypesVarPathResolver.NAME).isOK()) {
			targetUri = pathMan.getURIValue(Jsr283NodeTypesVarPathResolver.NAME);

		} else {
			// invalid name or value, throw an exception or warn user
			return;
		}

		IFolder link = project.getFolder(Jsr283NodeTypesVarPathResolver.NAME);
		IPath location = new Path(targetUri.getSchemeSpecificPart());
		ResourceAttributes attributes = link.getResourceAttributes();
		if (attributes != null) {
			attributes.setReadOnly(true);
			try {
				link.setResourceAttributes(attributes);
			} catch (CoreException e) {
				return;
			}
		}

		if (!link.exists() && workspace.validateLinkLocation(link, location).isOK()) {
			try {
				link.createLink(location, IResource.NONE, null);
			} catch (CoreException e) {
				return;
			}
		} else {
			// invalid location, throw an exception or warn user
		}
	}
}
