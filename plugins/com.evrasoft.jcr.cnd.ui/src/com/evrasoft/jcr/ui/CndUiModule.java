/*
 * generated by Xtext
 */
package com.evrasoft.jcr.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.formatting.IIndentationInformation;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.ui.editor.formatting.PreferenceStoreIndentationInformation;

import com.evrasoft.jcr.ui.linking.CndLinkingDiagnosticMessageProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class CndUiModule extends com.evrasoft.jcr.ui.AbstractCndUiModule {
	public CndUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends ILinkingDiagnosticMessageProvider> bindILinkingDiagnosticMessageProvider() {
		return CndLinkingDiagnosticMessageProvider.class;
	}

	@Override
	public Class<? extends IIndentationInformation> bindIIndentationInformation() {
		return PreferenceStoreIndentationInformation.class;
	}

}
