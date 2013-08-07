package com.evrasoft.jcr.cnd.tests;

import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.evrasoft.jcr.CndInjectorProvider;
import com.evrasoft.jcr.cnd.Model;
import com.google.inject.Inject;
import com.google.inject.Injector;

@InjectWith(CndInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ParserTest extends AbstractXtextTests {

	@Inject
	Injector injector;

	@Inject
	ParseHelper<Model> parser;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		disableSerializerTest();
		setInjector(injector);
	}

	@Override
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void parseModelSmoke() throws Exception {
		Model model = parser.parse("[a:b]");
		assertEquals("a:b", model.getNodeTypes().get(0).getName());
	}

	@Test
	public void testParseJackrabbitBuildinCND() throws Exception {
		String resource = loadResource("test-cnd/JackrabbitBuildin.cnd");
		assertNotNull(getResourceFromString(resource));
	}

	@Test
	public void testParseWorstcaseJSRCND() throws Exception {
		String resource = loadResource("test-cnd/worstcase-JSR283.cnd");
		// unresolved references
		getResourceFromStringAndExpect(resource, 5);
	}

	@Test
	public void testParseWorstcaseJackRabbitCND() throws Exception {
		String cndContent = loadResource("test-cnd/worstcase-Jackrabbit.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	@Test
	public void testParseSupercompactJackRabbitCND() throws Exception {
		String resource = loadResource("test-cnd/supercompact-Jackrabbit.cnd");
		// unresolved references
		getResourceFromStringAndExpect(resource, 10);
	}

	@Test
	public void testParseBuildInJSRModeShapeCND() throws Exception {
		String resource = loadResource("test-cnd/BuildIn-JSR283_ModeShape.cnd");
		assertNotNull(getResourceFromString(resource));
	}

	@Test
	public void testInvalidSmoke() throws Exception {
		// assertTrue(getParseResult("[nt:resource] < invalid").hasSyntaxErrors());
		getResourceFromStringAndExpect("[nt:resource] < invalid", 1);
	}

	public String loadResource(String resource) throws IOException, URISyntaxException {
		return readFileIntoString(resource);
	}

}
