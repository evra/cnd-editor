package com.evrasoft.jcr.ui.variableresolvers;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.variableresolvers.PathVariableResolver;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;

import com.evrasoft.jcr.ui.internal.CndActivator;

public class Jsr283NodeTypesVarPathResolver extends PathVariableResolver {
	public static String NAME = "JSR283_NODETYPES"; //$NON-NLS-1$

	public Jsr283NodeTypesVarPathResolver() {
		// nothing to do.
	}

	@Override
	public String[] getVariableNames(String variable, IResource resource) {
		return new String[] { NAME };
	}

	@Override
	public String getValue(String variable, IResource resource) {
		URL url = FileLocator.find(CndActivator.getInstance().getBundle(), new Path("/jcr-cnd"),
				null);
		try {
			if (url != null) {
				url = FileLocator.toFileURL(url);
			}
			if (url != null) {
				return url.toExternalForm();
			}
			return null;
		} catch (IOException e) {
			return null;
		}
	}
}
