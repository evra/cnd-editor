/*
* generated by Xtext
*/
package com.github.evra.jcr.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.github.evra.jcr.services.CndGrammarAccess;

public class CndParser extends AbstractContentAssistParser {
	
	@Inject
	private CndGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.github.evra.jcr.ui.contentassist.antlr.internal.InternalCndParser createParser() {
		com.github.evra.jcr.ui.contentassist.antlr.internal.InternalCndParser result = new com.github.evra.jcr.ui.contentassist.antlr.internal.InternalCndParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getNodeTypeDefAccess().getAlternatives_3(), "rule__NodeTypeDef__Alternatives_3");
					put(grammarAccess.getNodeAttributeAccess().getAlternatives(), "rule__NodeAttribute__Alternatives");
					put(grammarAccess.getSnsAccess().getAlternatives_0(), "rule__Sns__Alternatives_0");
					put(grammarAccess.getDefaultTypeAccess().getAlternatives_1(), "rule__DefaultType__Alternatives_1");
					put(grammarAccess.getRequiredTypesAccess().getAlternatives_1(), "rule__RequiredTypes__Alternatives_1");
					put(grammarAccess.getNodeNameAccess().getAlternatives_1(), "rule__NodeName__Alternatives_1");
					put(grammarAccess.getValueConstraintsAccess().getAlternatives_1(), "rule__ValueConstraints__Alternatives_1");
					put(grammarAccess.getPropertyAttributeAccess().getAlternatives(), "rule__PropertyAttribute__Alternatives");
					put(grammarAccess.getNoQueryOrderAccess().getAlternatives_0(), "rule__NoQueryOrder__Alternatives_0");
					put(grammarAccess.getNoFullTextAccess().getAlternatives_0(), "rule__NoFullText__Alternatives_0");
					put(grammarAccess.getQueryOpsAccess().getAlternatives_0(), "rule__QueryOps__Alternatives_0");
					put(grammarAccess.getQueryOpsAccess().getAlternatives_1(), "rule__QueryOps__Alternatives_1");
					put(grammarAccess.getMultipleAccess().getAlternatives_0(), "rule__Multiple__Alternatives_0");
					put(grammarAccess.getOpvAccess().getAlternatives(), "rule__Opv__Alternatives");
					put(grammarAccess.getProtectedAccess().getAlternatives_0(), "rule__Protected__Alternatives_0");
					put(grammarAccess.getMandatoryAccess().getAlternatives_0(), "rule__Mandatory__Alternatives_0");
					put(grammarAccess.getAutocreatedAccess().getAlternatives_0(), "rule__Autocreated__Alternatives_0");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getDefaultValuesAccess().getAlternatives_1(), "rule__DefaultValues__Alternatives_1");
					put(grammarAccess.getPropertyTypeAccess().getAlternatives_1(), "rule__PropertyType__Alternatives_1");
					put(grammarAccess.getPropertyNameAccess().getAlternatives_1(), "rule__PropertyName__Alternatives_1");
					put(grammarAccess.getNodeTypeAttributeAccess().getAlternatives(), "rule__NodeTypeAttribute__Alternatives");
					put(grammarAccess.getPrimaryItemAccess().getAlternatives_0(), "rule__PrimaryItem__Alternatives_0");
					put(grammarAccess.getPrimaryItemAccess().getAlternatives_1(), "rule__PrimaryItem__Alternatives_1");
					put(grammarAccess.getQueryAccess().getAlternatives(), "rule__Query__Alternatives");
					put(grammarAccess.getQueryAccess().getAlternatives_0(), "rule__Query__Alternatives_0");
					put(grammarAccess.getQueryAccess().getAlternatives_1(), "rule__Query__Alternatives_1");
					put(grammarAccess.getAbstractAccess().getAlternatives_0(), "rule__Abstract__Alternatives_0");
					put(grammarAccess.getMixinAccess().getAlternatives_0(), "rule__Mixin__Alternatives_0");
					put(grammarAccess.getOrderableAccess().getAlternatives_0(), "rule__Orderable__Alternatives_0");
					put(grammarAccess.getSuperTypesAccess().getAlternatives_1(), "rule__SuperTypes__Alternatives_1");
					put(grammarAccess.getJcrStringAccess().getAlternatives(), "rule__JcrString__Alternatives");
					put(grammarAccess.getXiDAccess().getAlternatives(), "rule__XiD__Alternatives");
					put(grammarAccess.getNodeTypeDefAccess().getGroup(), "rule__NodeTypeDef__Group__0");
					put(grammarAccess.getChildNodeDefAccess().getGroup(), "rule__ChildNodeDef__Group__0");
					put(grammarAccess.getSnsAccess().getGroup(), "rule__Sns__Group__0");
					put(grammarAccess.getDefaultTypeAccess().getGroup(), "rule__DefaultType__Group__0");
					put(grammarAccess.getRequiredTypesAccess().getGroup(), "rule__RequiredTypes__Group__0");
					put(grammarAccess.getNodeNameAccess().getGroup(), "rule__NodeName__Group__0");
					put(grammarAccess.getPropertyDefAccess().getGroup(), "rule__PropertyDef__Group__0");
					put(grammarAccess.getValueConstraintsAccess().getGroup(), "rule__ValueConstraints__Group__0");
					put(grammarAccess.getNoQueryOrderAccess().getGroup(), "rule__NoQueryOrder__Group__0");
					put(grammarAccess.getNoFullTextAccess().getGroup(), "rule__NoFullText__Group__0");
					put(grammarAccess.getQueryOpsAccess().getGroup(), "rule__QueryOps__Group__0");
					put(grammarAccess.getMultipleAccess().getGroup(), "rule__Multiple__Group__0");
					put(grammarAccess.getOpvAccess().getGroup_6(), "rule__Opv__Group_6__0");
					put(grammarAccess.getProtectedAccess().getGroup(), "rule__Protected__Group__0");
					put(grammarAccess.getMandatoryAccess().getGroup(), "rule__Mandatory__Group__0");
					put(grammarAccess.getAutocreatedAccess().getGroup(), "rule__Autocreated__Group__0");
					put(grammarAccess.getDefaultValuesAccess().getGroup(), "rule__DefaultValues__Group__0");
					put(grammarAccess.getPropertyTypeAccess().getGroup(), "rule__PropertyType__Group__0");
					put(grammarAccess.getPropertyNameAccess().getGroup(), "rule__PropertyName__Group__0");
					put(grammarAccess.getPrimaryItemAccess().getGroup(), "rule__PrimaryItem__Group__0");
					put(grammarAccess.getAbstractAccess().getGroup(), "rule__Abstract__Group__0");
					put(grammarAccess.getMixinAccess().getGroup(), "rule__Mixin__Group__0");
					put(grammarAccess.getOrderableAccess().getGroup(), "rule__Orderable__Group__0");
					put(grammarAccess.getSuperTypesAccess().getGroup(), "rule__SuperTypes__Group__0");
					put(grammarAccess.getNodeTypeNameAccess().getGroup(), "rule__NodeTypeName__Group__0");
					put(grammarAccess.getNsMappingAccess().getGroup(), "rule__NsMapping__Group__0");
					put(grammarAccess.getJcrStringListAccess().getGroup(), "rule__JcrStringList__Group__0");
					put(grammarAccess.getJcrStringListAccess().getGroup_1(), "rule__JcrStringList__Group_1__0");
					put(grammarAccess.getModelAccess().getMappingsAssignment_0(), "rule__Model__MappingsAssignment_0");
					put(grammarAccess.getModelAccess().getNodetypesAssignment_1(), "rule__Model__NodetypesAssignment_1");
					put(grammarAccess.getNodeTypeDefAccess().getAttributesAssignment_2(), "rule__NodeTypeDef__AttributesAssignment_2");
					put(grammarAccess.getNodeTypeNameAccess().getNameAssignment_1(), "rule__NodeTypeName__NameAssignment_1");
					put(grammarAccess.getNsMappingAccess().getNameAssignment_1(), "rule__NsMapping__NameAssignment_1");
					put(grammarAccess.getNsMappingAccess().getUriAssignment_3(), "rule__NsMapping__UriAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.github.evra.jcr.ui.contentassist.antlr.internal.InternalCndParser typedParser = (com.github.evra.jcr.ui.contentassist.antlr.internal.InternalCndParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CndGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CndGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
