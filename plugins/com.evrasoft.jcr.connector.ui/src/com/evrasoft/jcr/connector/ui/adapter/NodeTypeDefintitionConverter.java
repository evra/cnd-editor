package com.evrasoft.jcr.connector.ui.adapter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import com.evrasoft.jcr.cnd.CndFactory;
import com.evrasoft.jcr.cnd.NodeTypeDefinition;

public class NodeTypeDefintitionConverter {

	public NodeTypeDefinition asDslElement(javax.jcr.nodetype.NodeTypeDefinition ntd) {

		NodeTypeDefinition dslNtd = CndFactory.eINSTANCE.createNodeTypeDefinition();

		dslNtd.setAbstract(ntd.isAbstract());
		dslNtd.setMixin(ntd.isMixin());
		dslNtd.setName(ntd.getName());
		dslNtd.setNotqueryable(!ntd.isQueryable());
		dslNtd.setQueryable(ntd.isQueryable());
		dslNtd.setPrimaryItem(ntd.getPrimaryItemName());

		String[] declaredSupertypeNames = ntd.getDeclaredSupertypeNames();
		if (declaredSupertypeNames != null) {
			// http://stackoverflow.com/questions/13634242/xtext-permit-invalid-cross-reference/13662647#13662647
			// dslNtd.getDeclaredSupertypeNames(Arrays.asList(declaredSupertypeNames));

			for (String superTypeName : declaredSupertypeNames) {
				NodeTypeDefinition dslNtdUnresolvedSuperType = CndFactory.eINSTANCE.createNodeTypeDefinition();
				dslNtdUnresolvedSuperType.setName(superTypeName);
				// URI superTypeNTDUri = URI.createURI("unresrefs");
				// superTypeNTDUri.appendFragment(superTypeName);
				// EObject superNodeTypeProxy = createProxy(
				// CndPackage.eINSTANCE.getNodeTypeDefinition(),
				// superTypeNTDUri);
				// dslNtd.getDeclaredSupertypeNames().add((NodeTypeDefinition)
				// superNodeTypeProxy);
				dslNtd.getDeclaredSupertypeNames().add(dslNtdUnresolvedSuperType);
			}
		}
		// LazyLinkingResource.
		// platform:/resource/t/JackRabbitBuildin.cnd#xtextLink_::0.1.1::1::/12
		return dslNtd;

	}

	public static EObject createProxy(EClass eClass, URI uri) {
		InternalEObject proxy = (InternalEObject) eClass.getEPackage().getEFactoryInstance().create(eClass);
		proxy.eSetProxyURI(uri);

		return proxy;
	}
}
