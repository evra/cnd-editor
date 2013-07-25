package com.github.evra.jcr.cnd.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.evra.jcr.CndInjectorProvider;
import com.github.evra.jcr.cnd.Model;
import com.google.inject.Inject;

@InjectWith(CndInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ParserTest {

	@Inject
	ParseHelper<Model> parser;
		
	@Test 
	public void parseModelPrimitive() throws Exception {
	    Model model = parser.parse("[a:b]");
	    assertEquals("a:b", model.getNodeTypes().get(0).getName());
	}

	
}
