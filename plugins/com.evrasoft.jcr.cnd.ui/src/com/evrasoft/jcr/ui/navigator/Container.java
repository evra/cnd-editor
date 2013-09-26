package com.evrasoft.jcr.ui.navigator;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.containers.IAllContainersState;

public class Container {

	private final String name;
	private final IAllContainersState containersState;

	public Container(String name, IAllContainersState containersState) {
		this.name = name;
		this.containersState = containersState;
	}

	public String getName() {
		return name;
	}

	public Object[] getResources() {

		LinkedList resources = new LinkedList();
		Collection<URI> containedURIs = containersState.getContainedURIs(name);
		for (URI uri : containedURIs) {

			String platformString = uri.toPlatformString(true);
			if (platformString != null) {
				Path path = new Path(platformString);
				resources.add(ResourcesPlugin.getWorkspace().getRoot().getFile(path));
			} else {
				resources.add(uri);
			}
		}

		return resources.toArray();
	}

	public boolean isEmpty() {
		return containersState.isEmpty(name);
	}

}
