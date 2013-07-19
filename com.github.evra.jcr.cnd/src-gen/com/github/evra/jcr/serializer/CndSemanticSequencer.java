package com.github.evra.jcr.serializer;

import com.github.evra.jcr.cnd.CndPackage;
import com.github.evra.jcr.cnd.Model;
import com.github.evra.jcr.cnd.NodeDefinition;
import com.github.evra.jcr.cnd.NodeTypeDefinition;
import com.github.evra.jcr.cnd.NsMapping;
import com.github.evra.jcr.cnd.PropertyDefinition;
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
			case CndPackage.NODE_DEFINITION:
				if(context == grammarAccess.getNodeDefinitionRule()) {
					sequence_NodeDefinition(context, (NodeDefinition) semanticObject); 
					return; 
				}
				else break;
			case CndPackage.NODE_TYPE_DEFINITION:
				if(context == grammarAccess.getNodeTypeDefinitionRule()) {
					sequence_NodeTypeDefinition(context, (NodeTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case CndPackage.NS_MAPPING:
				if(context == grammarAccess.getNsMappingRule()) {
					sequence_NsMapping(context, (NsMapping) semanticObject); 
					return; 
				}
				else break;
			case CndPackage.PROPERTY_DEFINITION:
				if(context == grammarAccess.getPropertyDefinitionRule()) {
					sequence_PropertyDefinition(context, (PropertyDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (namespaces+=NsMapping | nodeTypes+=NodeTypeDefinition)*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name=JcrString | name='*') 
	 *         (requiredTypes+=JcrString requiredTypes+=JcrString*)? 
	 *         defaultType=JcrString? 
	 *         autocreated?=Autocreated? 
	 *         manadatory?=Mandatory? 
	 *         protected?=Protected? 
	 *         onParentVersion=Opv? 
	 *         sameNameSiblings?=Sns?
	 *     )
	 */
	protected void sequence_NodeDefinition(EObject context, NodeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=JcrString 
	 *         (declaredSupertypeNames+=JcrString declaredSupertypeNames+=JcrString*)? 
	 *         orderable?=Orderable? 
	 *         mixin?=Mixin? 
	 *         abstract?=Abstract? 
	 *         queryable?=Queryable? 
	 *         notqueryable?=Notqueryable? 
	 *         primaryItem=PrimaryItem? 
	 *         (declaredPropertyDefinitions+=PropertyDefinition | declaredChildNodeDefinitions+=NodeDefinition)*
	 *     )
	 */
	protected void sequence_NodeTypeDefinition(EObject context, NodeTypeDefinition semanticObject) {
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
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=JcrString? 
	 *         type=PropertyType? 
	 *         (defaultValues+=JcrString defaultValues+=JcrString*)? 
	 *         autocreated?=Autocreated? 
	 *         mandatory?=Mandatory? 
	 *         protected?=Protected? 
	 *         onParentVersion=Opv? 
	 *         multiple?=Multiple? 
	 *         queryOps=QueryOps? 
	 *         noFullText?=NoFullText? 
	 *         noQueryOrder?=NoQueryOrder? 
	 *         primary?=Primary? 
	 *         (valueConstraints+=JcrString valueConstraints+=JcrString*)?
	 *     )
	 */
	protected void sequence_PropertyDefinition(EObject context, PropertyDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
