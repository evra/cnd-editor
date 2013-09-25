package com.evrasoft.jcr.ui.navigator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.IAllContainersState;

import com.google.inject.Inject;

public class ContainerResourcesContentProvider implements ICommonContentProvider {

	@Inject
	private IAllContainersState.Provider allContainerStateProvider;

	@Inject
	IResourceDescriptions resourceDescriptionIndex;

	private static final Object[] NO_CHILDREN = new Object[0];

	public ContainerResourcesContentProvider() {
		super();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IProject) {
			IProject project = (IProject) parentElement;
			IAllContainersState containersState = allContainerStateProvider
					.get(resourceDescriptionIndex);

			List<String> visibleContainerHandles = containersState
					.getVisibleContainerHandles(project.getName());

			List<Container> containers = new ArrayList<Container>(visibleContainerHandles.size());
			for (String handle : visibleContainerHandles) {
				Container container = new Container(handle, containersState);
				containers.add(container);
			}

			return new Object[] { new ContainersNode(containers) };
		}
		if (parentElement instanceof ContainersNode) {
			ContainersNode node = (ContainersNode) parentElement;
			return node.getContainers().toArray();
		}
		if (parentElement instanceof Container) {
			Container container = (Container) parentElement;
			return container.getResources();
		}
		return NO_CHILDREN;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof ContainersNode) {
			ContainersNode node = (ContainersNode) element;
			return !node.isEmpty();
		}
		if (element instanceof Container) {
			Container container = (Container) element;
			return !container.isEmpty();

		}
		return false;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		// not a root content provider
		return NO_CHILDREN;
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public void restoreState(IMemento aMemento) {

	}

	@Override
	public void saveState(IMemento aMemento) {

	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {

	}

}
