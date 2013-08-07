package com.evrasoft.jcr.cnd.tests;

import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.ISerializer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.evrasoft.jcr.CndInjectorProvider;
import com.evrasoft.jcr.cnd.CndFactory;
import com.evrasoft.jcr.cnd.Model;
import com.evrasoft.jcr.cnd.NodeTypeDefinition;
import com.evrasoft.jcr.cnd.NsMapping;
import com.google.inject.Inject;
import com.google.inject.Injector;

@InjectWith(CndInjectorProvider.class)
@RunWith(XtextRunner.class)
public class SerializerTest extends AbstractXtextTests {

	@Inject
	ParseHelper<Model> parser;

	@Inject
	Injector injector;

	@Inject
	ISerializer serializer;

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@Test
	public void testSerilizeNsspace() throws Exception {

		NsMapping nsMapping = CndFactory.eINSTANCE.createNsMapping();
		nsMapping.setName("test");
		nsMapping.setUri("testUri");

		String string = serializer.serialize(nsMapping);
		assertEquals("<test=\'testUri\'>", string.replace(" ", ""));
	}

	@Test
	public void testSerilizeNsspaceURI() throws Exception {

		NsMapping nsMapping = CndFactory.eINSTANCE.createNsMapping();
		nsMapping.setName("test");
		nsMapping.setUri("http://test.host:8080/a/b");
		String string = serializer.serialize(nsMapping);
		assertEquals("<test=\'http://test.host:8080/a/b\'>", string.replace(" ", ""));
	}

	@Test
	public void testSerilizeNsspaceEmpty() throws Exception {

		NsMapping nsMapping = CndFactory.eINSTANCE.createNsMapping();
		nsMapping.setName("test");
		nsMapping.setUri("");
		String string = serializer.serialize(nsMapping);
		assertEquals("<test=\'\'>", string.replace(" ", ""));
	}

	@Test
	public void testUnresolvedNodeTypeReference() throws Exception {
		NodeTypeDefinition dslNtd = CndFactory.eINSTANCE.createNodeTypeDefinition();
		dslNtd.setName("test:nodeType");

		NodeTypeDefinition dslNtdUnresolvedSuperType = CndFactory.eINSTANCE.createNodeTypeDefinition();
		dslNtdUnresolvedSuperType.setName("mySuperType");
		dslNtd.getDeclaredSupertypeNames().add(dslNtdUnresolvedSuperType);

		String string = serializer.serialize(dslNtd, SaveOptions.defaultOptions());
		assertEquals("[ test:nodeType ] > mySuperType", string);
	}
}
