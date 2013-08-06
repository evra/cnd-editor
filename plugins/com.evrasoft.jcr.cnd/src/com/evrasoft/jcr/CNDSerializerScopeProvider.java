package com.evrasoft.jcr;

import java.util.Arrays;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.evrasoft.jcr.cnd.NodeTypeDefinition;
import com.google.common.collect.Iterables;

public class CNDSerializerScopeProvider implements IScopeProvider {

	//TODO this is proof of concept only.
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		return new DummySerializationScope();		
	}

}
