/*
 * generated by Xtext
 */
package com.evrasoft.jcr.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import com.evrasoft.jcr.services.CndGrammarAccess

import com.google.inject.Inject;
import org.eclipse.xtext.Keyword

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class CndFormatter extends AbstractDeclarativeFormatter {

	@Inject extension CndGrammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
				

		//TODO add configuration parameter for line wrapping
		c.setAutoLinewrap(120);
		
		//namespaces
		c.setLinewrap(1).around(nsMappingRule);
		c.setNoSpace.range(nsMappingAccess.lessThanSignKeyword_0, nsMappingAccess.greaterThanSignKeyword_4);

		//line wrapping
		c.setLinewrap(2).around(nodeTypeDefinitionRule);				
		c.setLinewrap(1).around(propertyDefinitionRule);
		c.setLinewrap(1).around(nodeDefinitionRule);
		c.setLinewrap(1).around(itemDefinitionRule);

		//wrap line before node type definition options
		c.setLinewrap(1).after(nodeTypeDefinitionAccess.rightSquareBracketKeyword_2);
		c.setNoLinewrap.between(nodeTypeDefinitionAccess.rightSquareBracketKeyword_2, nodeTypeDefinitionAccess.greaterThanSignKeyword_3_0);
		c.setLinewrap(1).after(nodeTypeDefinitionAccess.declaredSupertypeNamesAssignment_3_1);		
		c.setLinewrap(1).after(nodeTypeDefinitionAccess.declaredSupertypeNamesAssignment_3_2_1);
		
				
		//indent nodeTypeDefinition options, property and node definitions 				
		c.setIndentationIncrement().after(nodeTypeDefinitionAccess.nameAssignment_1);
		c.setIndentationDecrement().after(nodeTypeDefinitionRule);
						
		//for some unknown reason formatter sometes puts newline before
		//some property and node options		      		
      	c.setNoLinewrap.before(propertyDefinitionAccess.onParentVersionOpvEnumRuleCall_5_3_0);
    	c.setNoLinewrap.before(propertyDefinitionAccess.manadatoryMandatoryParserRuleCall_5_1_0);
    	c.setNoLinewrap.before(propertyDefinitionAccess.autocreatedAutocreatedParserRuleCall_5_0_0);
    	c.setNoLinewrap.before(propertyDefinitionAccess.protectedProtectedParserRuleCall_5_2_0);
      	c.setNoLinewrap.before(nodeDefinitionAccess.onParentVersionOpvEnumRuleCall_5_3_0);
    	c.setNoLinewrap.before(nodeDefinitionAccess.manadatoryMandatoryParserRuleCall_5_1_0);
    	c.setNoLinewrap.before(nodeDefinitionAccess.autocreatedAutocreatedParserRuleCall_5_0_0);
    	c.setNoLinewrap.before(nodeDefinitionAccess.protectedProtectedParserRuleCall_5_2_0);


		c.setLinewrap(1).before(propertyDefinitionAccess.lessThanSignKeyword_6_0);
		c.setIndentationIncrement.before(propertyDefinitionAccess.lessThanSignKeyword_6_0);
		c.setIndentationDecrement.after(propertyDefinitionAccess.valueConstraintsAssignment_6_1_0);    			
		
						
		for (Keyword comma : findKeywords(",")) {
      		c.setNoSpace().before(comma);
    	}
    	
    	for ( pair : findKeywordPairs("(", ")")) {
		      c.setNoSpace().after(pair.getFirst());
		      c.setNoSpace().before(pair.getSecond());
    	}
    	
    	for ( pair : findKeywordPairs("[", "]")) {
		      c.setNoSpace().after(pair.getFirst());
		      c.setNoSpace().before(pair.getSecond());
    	}
	}
		
}
