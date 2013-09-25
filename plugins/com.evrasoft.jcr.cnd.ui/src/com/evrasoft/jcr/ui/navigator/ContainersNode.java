package com.evrasoft.jcr.ui.navigator;

import java.util.List;

public class ContainersNode {

	private final List<Container> containers;

	public ContainersNode(List<Container> containers) {
		this.containers = containers;
	}

	public String getName() {
		return "Visible Xtext resources";
	}

	public boolean isEmpty() {
		return getContainers().isEmpty();
	}

	public List<Container> getContainers() {
		return containers;
	}

}
