package com.evrasoft.jcr.connector.ui.adapter;

import javax.jcr.nodetype.NodeDefinition;
import javax.jcr.nodetype.NodeTypeManager;
import javax.jcr.version.OnParentVersionAction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import com.evrasoft.jcr.cnd.CndFactory;
import com.evrasoft.jcr.cnd.NodeTypeDefinition;
import com.evrasoft.jcr.cnd.Opv;

public class NodeTypeDefintitionConverter {

	public NodeTypeDefinition asDslElement(javax.jcr.nodetype.NodeTypeDefinition ntd, NodeTypeManager nodeTypeManager) {

		NodeTypeDefinition dslNtd = CndFactory.eINSTANCE.createNodeTypeDefinition();

		dslNtd.setAbstract(ntd.isAbstract());
		dslNtd.setMixin(ntd.isMixin());
		dslNtd.setName(ntd.getName());
		dslNtd.setNotqueryable(!ntd.isQueryable());
		dslNtd.setQueryable(ntd.isQueryable());

		// TODO not clear how to get this flag. See JSR-238 23.1
		// may be need to query
		// Repository.NODE_TYPE_MANAGEMENT_ORDERABLE_CHILD_NODES_SUPPORTED
		// dslNtd.setOrderable();

		// TODO set reference
		// dslNtd.setPrimaryItem(ntd.getPrimaryItemName());
		String primaryItemName = ntd.getPrimaryItemName();

		String[] declaredSupertypeNames = ntd.getDeclaredSupertypeNames();
		if (declaredSupertypeNames != null) {
			// http://stackoverflow.com/questions/13634242/xtext-permit-invalid-cross-reference/13662647#13662647

			for (String superTypeName : declaredSupertypeNames) {
				NodeTypeDefinition dslNtdUnresolvedSuperType = CndFactory.eINSTANCE.createNodeTypeDefinition();
				dslNtdUnresolvedSuperType.setName(superTypeName);
				dslNtd.getDeclaredSupertypeNames().add(dslNtdUnresolvedSuperType);
			}
		}

		NodeDefinition[] declaredChildNodeDefinitions = ntd.getDeclaredChildNodeDefinitions();
		for (NodeDefinition childNodeDefinition : declaredChildNodeDefinitions) {
			com.evrasoft.jcr.cnd.NodeDefinition dslNodeDefinition = CndFactory.eINSTANCE.createNodeDefinition();
			dslNodeDefinition.setName(childNodeDefinition.getName());
			dslNodeDefinition.setAutocreated(childNodeDefinition.isAutoCreated());

			// TODO set default type ref
			// dslNodeDefinition.setDefaultType(value);

			dslNodeDefinition.setManadatory(childNodeDefinition.isMandatory());
			int onParentVersionCode = childNodeDefinition.getOnParentVersion();
			Opv onParentVersion = getConvertOnParentVersionCode(onParentVersionCode);
			dslNodeDefinition.setOnParentVersion(onParentVersion);

			if (primaryItemName != null && primaryItemName.equals(childNodeDefinition.getName())) {
				dslNodeDefinition.setPrimary(true);
			}

			dslNodeDefinition.setProtected(childNodeDefinition.isProtected());
			dslNodeDefinition.setSameNameSiblings(childNodeDefinition.allowsSameNameSiblings());

			// TODO set default primary type
			// childNodeDefinition.getDefaultPrimaryTypeName()
			// dslNodeDefinition.setDefaultType(value);

			// TODO add requeired types
			dslNodeDefinition.getRequiredTypes();

		}

		return dslNtd;

	}

	private Opv getConvertOnParentVersionCode(int onParentVersionCode) {

		switch (onParentVersionCode) {
		case OnParentVersionAction.ABORT:
			return Opv.ABORT;

		case OnParentVersionAction.COMPUTE:
			return Opv.COMPUTE;
		case OnParentVersionAction.COPY:
			return Opv.COPY;
		case OnParentVersionAction.IGNORE:
			return Opv.IGNORE;
		case OnParentVersionAction.INITIALIZE:
			return Opv.INITIALIZE;
		case OnParentVersionAction.VERSION:
			return Opv.VERSION;
		default:
			break;
		}

		return null;
	}

	public static EObject createProxy(EClass eClass, URI uri) {
		InternalEObject proxy = (InternalEObject) eClass.getEPackage().getEFactoryInstance().create(eClass);
		proxy.eSetProxyURI(uri);
		return proxy;
	}

	// public static EObject createProxy() {
	// Given some EObject x that's a resolved proxy held by feature f of object
	// y, you can use EcoreUtil.create(x.eClass()), cast it to InternalEObject,
	// call setEProxyURI with EcoreUtil.getURI(x), and then use
	// EcoreUtil.replace(y, f, x, <that proxy object>).
	//
	// }
}
