package com.evrasoft.jcr.cnd.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.ISerializer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.evrasoft.jcr.CndInjectorProvider;
import com.evrasoft.jcr.cnd.CndFactory;
import com.evrasoft.jcr.cnd.ItemDefinition;
import com.evrasoft.jcr.cnd.Model;
import com.evrasoft.jcr.cnd.NodeDefinition;
import com.evrasoft.jcr.cnd.NodeTypeDefinition;
import com.evrasoft.jcr.cnd.NsMapping;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.name.Named;

@InjectWith(CndInjectorProvider.class)
@RunWith(XtextRunner.class)
public class SerializerTest extends AbstractXtextTests {

	@Inject
	ParseHelper<Model> parser;

	@Inject
	Injector injector;

	@Inject
	ISerializer serializer;

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

	@Inject
	private IResourceFactory resourceFactory;

	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	public String fileExtension;

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
	public void testUnresolvedSuperTypeNodeTypeReference() throws Exception {
		Model model = createModel();
		NodeTypeDefinition dslNtd = CndFactory.eINSTANCE.createNodeTypeDefinition();
		dslNtd.setName("test:nodeType");

		model.getNodeTypes().add(dslNtd);

		NodeTypeDefinition dslNtdUnresolvedSuperType = CndFactory.eINSTANCE.createNodeTypeDefinition();
		dslNtdUnresolvedSuperType.setName("mySuperType");
		dslNtd.getDeclaredSupertypeNames().add(dslNtdUnresolvedSuperType);

		String string = serializer.serialize(dslNtd, SaveOptions.defaultOptions());
		assertEquals("[ test:nodeType ] > mySuperType", string);
	}

	@Test
	public void testResolvedSuperTypeNodeTypeReference() throws Exception {
		Model model = createModel();
		NodeTypeDefinition dslNtd = CndFactory.eINSTANCE.createNodeTypeDefinition();
		dslNtd.setName("test:nodeType");

		model.getNodeTypes().add(dslNtd);

		NodeTypeDefinition dslNtdResolvedSuperType = CndFactory.eINSTANCE.createNodeTypeDefinition();
		dslNtdResolvedSuperType.setName("mySuperType");

		dslNtd.getDeclaredSupertypeNames().add(dslNtdResolvedSuperType);

		model.getNodeTypes().add(dslNtdResolvedSuperType);

		String string = serializer.serialize(dslNtd, SaveOptions.defaultOptions());
		assertEquals("[ test:nodeType ] > mySuperType", unform(string));
	}

	@Test(expected = Exception.class)
	public void testUnresolvedPrimaryItemReference() throws Exception {
		NodeTypeDefinition dslNtd = CndFactory.eINSTANCE.createNodeTypeDefinition();
		dslNtd.setName("test:nodeType");

		ItemDefinition itemDefinition = CndFactory.eINSTANCE.createNodeDefinition();
		itemDefinition.setName("myItem");
		dslNtd.setPrimaryItem(itemDefinition);

		String string = serializer.serialize(dslNtd, SaveOptions.newBuilder().noValidation().getOptions());
		assertEquals("[ test:nodeType ] primaryitem myItem", string);
	}

	@Test()
	public void testResolvedPrimaryItemReference() throws Exception {
		Model model = createModel();
		NodeTypeDefinition dslNtd = CndFactory.eINSTANCE.createNodeTypeDefinition();
		dslNtd.setName("test:nodeType");
		model.getNodeTypes().add(dslNtd);

		NodeDefinition itemDefinition = CndFactory.eINSTANCE.createNodeDefinition();
		itemDefinition.setName("myItem");
		dslNtd.setPrimaryItem(itemDefinition);

		dslNtd.getDeclaredChildNodeDefinitions().add(itemDefinition);

		String string = serializer.serialize(dslNtd);
		assertEquals("[ test:nodeType ] primaryitem myItem + myItem", unform(string));
	}

	protected static String unform(String string) {
		return string.replace("\r\n", " ").replace("\\s+", " ");
	}

	public Model createModel() {
		Model model = CndFactory.eINSTANCE.createModel();
		createDummyResource().getContents().add(model);
		return model;
	}

	public XtextResource createDummyResource() {
		XtextResourceSet rs = resourceSetProvider.get();
		rs.setClasspathURIContext(getClass());
		XtextResource resource = (XtextResource) resourceFactory.createResource(URI.createURI("mytestmodel."
				+ fileExtension));
		rs.getResources().add(resource);
		return resource;
	}

}
