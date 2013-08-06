/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.evrasoft.jcr.connector.ui.importWizards;

import java.io.InputStream;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class TargetFileWizardPage extends WizardNewFileCreationPage {

	public TargetFileWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setTitle(pageName); // NON-NLS-1
		setDescription("Import Compact Node Definition from JCR2 repository"); // NON-NLS-1
		setFileExtension("cnd");
		setFileName("repository.cnd");
	}

	protected void createAdvancedControls(Composite parent) {
		Composite fileSelectionArea = new Composite(parent, SWT.NONE);
		GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL
				| GridData.FILL_HORIZONTAL);
		fileSelectionArea.setLayoutData(fileSelectionData);

		GridLayout fileSelectionLayout = new GridLayout();
		fileSelectionLayout.numColumns = 3;
		fileSelectionLayout.makeColumnsEqualWidth = false;
		fileSelectionLayout.marginWidth = 0;
		fileSelectionLayout.marginHeight = 0;
		fileSelectionArea.setLayout(fileSelectionLayout);

		fileSelectionArea.moveAbove(null);

	}

	protected void createLinkTarget() {
	}

	protected InputStream getInitialContents() {
		return null;
	}

	protected String getNewFileLabel() {
		return "File Name:"; // NON-NLS-1
	}

	protected IStatus validateLinkedResource() {
		return new Status(IStatus.OK, "com.evrasoft.jcr.connector.ui",
				IStatus.OK, "", null); // NON-NLS-1 //NON-NLS-2
	}
}
