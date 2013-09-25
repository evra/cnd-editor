package com.evrasoft.jcr.ui.navigator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;

import com.google.inject.Inject;

public class ContainerResourcesLabelProvider implements ILabelProvider {

	@Inject
	private IImageHelper imageHelper;

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof ContainersNode) {
			return imageHelper.getImage("classpath.gif");
		} else if (element instanceof URI) {
			return imageHelper.getImage("elements_obj.gif");
		} else if (element instanceof Container) {
			return imageHelper.getImage("packagefolder_obj.gif");
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ContainersNode) {
			ContainersNode xtextResourceSetNode = (ContainersNode) element;
			return xtextResourceSetNode.getName();
		} else if (element instanceof Container) {
			Container container = (Container) element;
			return container.getName();
		} else if (element instanceof IFile) {
			// these object should not come because navigator framework will use
			// workbench label providers for IFile.
			IFile file = (IFile) element;
			return file.getFullPath().toString();
		} else if (element instanceof URI) {
			URI uri = (URI) element;
			if (uri.isPlatform()) {
				return uri.toPlatformString(true);
			}
			return uri.toString();
		}
		return element.toString();
	}

}
