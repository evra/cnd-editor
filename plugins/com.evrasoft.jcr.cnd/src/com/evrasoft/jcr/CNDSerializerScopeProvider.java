package com.evrasoft.jcr;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.evrasoft.jcr.cnd.CndPackage;
import com.evrasoft.jcr.cnd.NodeTypeDefinition;
import com.google.inject.Inject;

public class CNDSerializerScopeProvider implements IScopeProvider {

	@Inject
	private IScopeProvider scopeProvider;

	// TODO this is proof of concept only.

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (context instanceof NodeTypeDefinition
				&& CndPackage.eINSTANCE.getNodeTypeDefinition_DeclaredSupertypeNames().equals(reference)) {
			return new DummySerializationScope();
		}

		return scopeProvider.getScope(context, reference);
	}

}
