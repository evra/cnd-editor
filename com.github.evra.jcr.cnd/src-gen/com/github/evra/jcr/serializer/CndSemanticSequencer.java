package com.github.evra.jcr.serializer;

import com.github.evra.jcr.cnd.CndPackage;
import com.github.evra.jcr.cnd.Model;
import com.github.evra.jcr.cnd.NodeTypeName;
import com.github.evra.jcr.cnd.NsMapping;
import com.github.evra.jcr.services.CndGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CndSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CndGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CndPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CndPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case CndPackage.NODE_TYPE_NAME:
				if(context == grammarAccess.getNodeTypeDefRule()) {
					sequence_NodeTypeDef_NodeTypeName(context, (NodeTypeName) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNodeTypeNameRule()) {
					sequence_NodeTypeName(context, (NodeTypeName) semanticObject); 
					return; 
				}
				else break;
			case CndPackage.NS_MAPPING:
				if(context == grammarAccess.getNsMappingRule()) {
					sequence_NsMapping(context, (NsMapping) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (mappings+=NsMapping | nodetypes+=NodeTypeDef)*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=JcrString attributes+=NodeTypeAttribute*)
	 */
	protected void sequence_NodeTypeDef_NodeTypeName(EObject context, NodeTypeName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=JcrString
	 */
	protected void sequence_NodeTypeName(EObject context, NodeTypeName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Prefix uri=Uri)
	 */
	protected void sequence_NsMapping(EObject context, NsMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CndPackage.Literals.NS_MAPPING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CndPackage.Literals.NS_MAPPING__NAME));
			if(transientValues.isValueTransient(semanticObject, CndPackage.Literals.NS_MAPPING__URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CndPackage.Literals.NS_MAPPING__URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0(), semanticObject.getUri());
		feeder.finish();
	}
}
