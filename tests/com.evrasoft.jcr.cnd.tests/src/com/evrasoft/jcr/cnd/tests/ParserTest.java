package com.evrasoft.jcr.cnd.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.Bundle;

import com.evrasoft.jcr.CndInjectorProvider;
import com.evrasoft.jcr.cnd.Model;
import com.google.inject.Inject;

@InjectWith(CndInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ParserTest {

	@Inject
	ParseHelper<Model> parser;

	@Test
	public void parseModelSmoke() throws Exception {
		Model model = parser.parse("[a:b]");
		assertEquals("a:b", model.getNodeTypes().get(0).getName());
	}

	@Test
	public void testParseJackrabbitBuildinCND() throws Exception {
		String cndContent = loadResource("/test-cnd/JackrabbitBuildin.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	@Test
	public void testParseWorstcaseJSRCND() throws Exception {
		String cndContent = loadResource("/test-cnd/worstcase-JSR283.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	@Test
	public void testParseWorstcaseJackRabbitCND() throws Exception {
		String cndContent = loadResource("/test-cnd/worstcase-Jackrabbit.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	@Test
	public void testParseSupercompactJackRabbitCND() throws Exception {
		String cndContent = loadResource("/test-cnd/supercompact-Jackrabbit.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	@Test
	public void testParseBuildInJSRModeShapeCND() throws Exception {
		String cndContent = loadResource("/test-cnd/BuildIn-JSR283_ModeShape.cnd");
		Model model = parser.parse(cndContent);
		assertNotNull(model);
	}

	public static String loadResource(String resource) throws IOException, URISyntaxException {
		Bundle bundle = Platform.getBundle("com.evrasoft.jcr.cnd.tests");
		URL fileURL = bundle.getEntry(resource);
		File file = new File(FileLocator.resolve(fileURL).toURI());

		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		StringBuilder out = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			out.append(line);
		}
		reader.close();
		return out.toString();
	}
}
