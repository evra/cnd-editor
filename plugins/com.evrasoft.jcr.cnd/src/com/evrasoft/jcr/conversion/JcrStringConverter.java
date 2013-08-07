package com.evrasoft.jcr.conversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class JcrStringConverter extends AbstractLexerBasedConverter<String> {

	@Override
	protected String toEscapedString(String value) {
		return '\'' + Strings.convertToJavaString(value, false) + '\'';
	}

	public String toValue(String string, INode node) {
		if (string == null)
			return null;
		try {
			if (string.length() > 1) {
				if ((string.startsWith("\"") && string.endsWith("\""))
						|| (string.startsWith("'") && string.endsWith("'"))) {
					return Strings.convertFromJavaString(string.substring(1, string.length() - 1), true);
				}
			}
			return Strings.convertFromJavaString(string, true);
		} catch (IllegalArgumentException e) {
			throw new ValueConverterException(e.getMessage(), node, e);
		}
	}

}
