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

@InjectWith(CndInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ParserTest extends AbstractXtextTests {

	@Inject
	ParseHelper<Model> parser;

	@Test
	public void parseModelSmoke() throws Exception {
		Model model = parser.parse("[a:b]");
		assertEquals("a:b", model.getNodeTypes().get(0).getName());
	}

	@Test
	public void testParseJackrabbitBuildinCND() throws Exception {
		String cndContent = loadResource("test-cnd/JackrabbitBuildin.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	@Test
	public void testParseWorstcaseJSRCND() throws Exception {
		String cndContent = loadResource("test-cnd/worstcase-JSR283.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	@Test
	public void testParseWorstcaseJackRabbitCND() throws Exception {
		String cndContent = loadResource("test-cnd/worstcase-Jackrabbit.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	@Test
	public void testParseSupercompactJackRabbitCND() throws Exception {
		String cndContent = loadResource("test-cnd/supercompact-Jackrabbit.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	@Test
	public void testParseBuildInJSRModeShapeCND() throws Exception {
		String cndContent = loadResource("test-cnd/BuildIn-JSR283_ModeShape.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	public String loadResource(String resource) throws IOException, URISyntaxException {
		return readFileIntoString(resource);
		// Bundle bundle = Platform.getBundle("com.evrasoft.jcr.cnd.tests");
		// URL fileURL = bundle.getEntry(resource);
		// File file = new File(FileLocator.resolve(fileURL).toURI());
		//
		// String content = null;
		// try {
		// FileReader reader = new FileReader(file);
		// char[] chars = new char[(int) file.length()];
		// reader.read(chars);
		// content = new String(chars);
		// reader.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// return content;
	}

}
