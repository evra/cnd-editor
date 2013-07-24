package com.github.evra.jcr;

import java.util.Arrays;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.github.evra.jcr.cnd.NodeTypeDefinition;
import com.google.common.collect.Iterables;

public class CNDSerializerScopeProvider implements IScopeProvider {

	//TODO this is proof of concept only.
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		return new IScope() {
			
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
		};
		
	}

}
