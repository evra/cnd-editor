package com.evrasoft.jcr;

import java.util.Arrays;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.evrasoft.jcr.cnd.NodeTypeDefinition;

public class DummySerializationScope implements IScope {

	@Override
	public IEObjectDescription getSingleElement(EObject object) {
		System.out.println(object);
		return null;
	}
	
	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		System.out.println(name);
		return null;
	}
	
	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {
		if (object instanceof NodeTypeDefinition) {
			NodeTypeDefinition nodeTypeDefinition = (NodeTypeDefinition) object;
			IEObjectDescription objectDescription = EObjectDescription.create(nodeTypeDefinition.getName(), object);
			return Arrays.asList(objectDescription);					
		}				
		return Collections.emptyList();
	}
	
	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		System.out.println(name);
		return null;
	}
	
	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		System.out.println("Get all elements");
		return null;
	}
}
