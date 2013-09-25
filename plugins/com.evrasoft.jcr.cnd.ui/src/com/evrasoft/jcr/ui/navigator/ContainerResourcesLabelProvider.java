package com.evrasoft.jcr.ui.navigator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.IImageHelper.IImageDescriptorHelper;

import com.google.inject.Inject;

public class ContainerResourcesLabelProvider implements ILabelProvider {

	@Inject
	private IImageHelper imageHelper;

	@Inject
	private IImageDescriptorHelper imageDescriptorHelper;

	private Image containerImage;

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
		if (containerImage != null) {
			containerImage.dispose();
		}
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
			return getContainersImage();
		} else if (element instanceof URI) {
			return imageHelper.getImage("elements_obj.gif");
		} else if (element instanceof Container) {
			return imageHelper.getImage("packagefolder_obj.gif");
		}
		return null;
	}

	private Image getContainersImage() {
		if (containerImage == null) {
			Image baseImage = imageHelper.getImage("classpath.gif");
			ImageDescriptor xtextOverlay = imageDescriptorHelper
					.getImageDescriptor("nature_overlay.png");
			DecorationOverlayIcon decorated = new DecorationOverlayIcon(baseImage,
					new ImageDescriptor[] { null, xtextOverlay, null, null, null });

			containerImage = imageHelper.getImage(decorated);
		}
		return containerImage;
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
