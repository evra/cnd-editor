package com.github.evra.jcr.serializer;

import com.github.evra.jcr.services.CndGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CndSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CndGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CndGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getAbstractRule())
			return getAbstractToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getAutocreatedRule())
			return getAutocreatedToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMandatoryRule())
			return getMandatoryToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMixinRule())
			return getMixinToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMultipleRule())
			return getMultipleToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNoFullTextRule())
			return getNoFullTextToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNoQueryOrderRule())
			return getNoQueryOrderToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNotqueryableRule())
			return getNotqueryableToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOrderableRule())
			return getOrderableToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPrimaryRule())
			return getPrimaryToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getProtectedRule())
			return getProtectedToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getQueryableRule())
			return getQueryableToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSnsRule())
			return getSnsToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Abstract:
	 * 	('abstract' | 'abs' | 'a') 
	 * ;
	 */
	protected String getAbstractToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "abstract";
	}
	
	/**
	 * Autocreated:
	 * 	('autocreated' | 'aut' | 'a' )
	 * ;
	 */
	protected String getAutocreatedToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "autocreated";
	}
	
	/**
	 * Mandatory:
	 * 	('mandatory' | 'man' | 'm') 
	 * ;
	 */
	protected String getMandatoryToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "mandatory";
	}
	
	/**
	 * Mixin:
	 * 	('mixin' | 'mix' | 'm') 
	 * ;
	 */
	protected String getMixinToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "mixin";
	}
	
	/**
	 * Multiple:
	 * 	('multiple' | 'mul' | '*') 
	 * ;
	 */
	protected String getMultipleToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "multiple";
	}
	
	/**
	 * NoFullText:
	 * 	('nofulltext' | 'nof') 
	 * ;
	 */
	protected String getNoFullTextToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "nofulltext";
	}
	
	/**
	 * NoQueryOrder:
	 * 	('noqueryorder' | 'nqord')
	 * ;
	 */
	protected String getNoQueryOrderToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "noqueryorder";
	}
	
	/**
	 * Notqueryable:
	 * 	('noquery' | 'nq')
	 * ;
	 */
	protected String getNotqueryableToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "noquery";
	}
	
	/**
	 * Orderable:
	 * 	('orderable' | 'ord' | 'o') 	
	 * ;
	 */
	protected String getOrderableToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "orderable";
	}
	
	/**
	 * Primary:	
	 * 		('primary'|'!') 	
	 * ;
	 */
	protected String getPrimaryToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "primary";
	}
	
	/**
	 * Protected:
	 * 	('protected' | 'pro' | 'p') 
	 * ;
	 */
	protected String getProtectedToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "protected";
	}
	
	/**
	 * Queryable:
	 * 	('query' | 'q' )
	 * ;
	 */
	protected String getQueryableToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "query";
	}
	
	/**
	 * Sns:
	 * 	('sns' | '*' | 'multiple' ) 
	 * ;
	 */
	protected String getSnsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "sns";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
