package com.evrasoft.jcr.conversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

public class CndConverters extends DefaultTerminalConverters {

	@ValueConverter(rule = "JcrString")
	public IValueConverter<String> JcrString() {
		return new JcrStringConverter("");
	}

	@ValueConverter(rule = "Uri")
	public IValueConverter<String> Uri() {
		return new JcrStringConverter("'");
	}

}
