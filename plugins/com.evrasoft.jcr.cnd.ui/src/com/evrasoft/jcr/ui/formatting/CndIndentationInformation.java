package com.evrasoft.jcr.ui.formatting;

import org.eclipse.xtext.formatting.IIndentationInformation;

public class CndIndentationInformation implements IIndentationInformation {

	@Override
	public String getIndentString() {
		return "  ";
	}

}
