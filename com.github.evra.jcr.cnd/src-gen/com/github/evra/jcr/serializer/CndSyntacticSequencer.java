package com.github.evra.jcr.serializer;

import com.github.evra.jcr.services.CndGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CndSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CndGrammarAccess grammarAccess;
	protected AbstractElementAlias match_NodeTypeDef_SuperTypesParserRuleCall_1_q;
	protected AbstractElementAlias match_NodeTypeDef___ChildNodeDefParserRuleCall_3_1_or_PropertyDefParserRuleCall_3_0__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CndGrammarAccess) access;
		match_NodeTypeDef_SuperTypesParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getNodeTypeDefAccess().getSuperTypesParserRuleCall_1());
		match_NodeTypeDef___ChildNodeDefParserRuleCall_3_1_or_PropertyDefParserRuleCall_3_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getNodeTypeDefAccess().getChildNodeDefParserRuleCall_3_1()), new TokenAlias(false, false, grammarAccess.getNodeTypeDefAccess().getPropertyDefParserRuleCall_3_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getChildNodeDefRule())
			return getChildNodeDefToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPropertyDefRule())
			return getPropertyDefToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSuperTypesRule())
			return getSuperTypesToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ChildNodeDef:
	 * 	NodeName RequiredTypes? DefaultType? NodeAttribute*
	 * ;
	 */
	protected String getChildNodeDefToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+\"\"";
	}
	
	/**
	 * PropertyDef:
	 * 	PropertyName PropertyType? DefaultValues? PropertyAttribute* ValueConstraints?
	 * ;
	 */
	protected String getPropertyDefToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-\"\"";
	}
	
	/**
	 * SuperTypes:
	 * 	'>' (JcrStringList|'?') 
	 * ;
	 */
	protected String getSuperTypesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_NodeTypeDef_SuperTypesParserRuleCall_1_q.equals(syntax))
				emit_NodeTypeDef_SuperTypesParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NodeTypeDef___ChildNodeDefParserRuleCall_3_1_or_PropertyDefParserRuleCall_3_0__a.equals(syntax))
				emit_NodeTypeDef___ChildNodeDefParserRuleCall_3_1_or_PropertyDefParserRuleCall_3_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     SuperTypes?
	 */
	protected void emit_NodeTypeDef_SuperTypesParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ChildNodeDef | PropertyDef)*
	 */
	protected void emit_NodeTypeDef___ChildNodeDefParserRuleCall_3_1_or_PropertyDefParserRuleCall_3_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
