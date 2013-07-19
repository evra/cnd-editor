package com.github.evra.jcr.ui.linking;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;

import com.github.evra.jcr.cnd.NodeTypeDefinition;
import com.github.evra.jcr.cnd.util.CndSwitch;
import com.github.evra.jcr.validation.CndValidator;

public class CndLinkingDiagnosticMessageProvider extends
		LinkingDiagnosticMessageProvider {

	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(final ILinkingDiagnosticContext context) {
		EObject element = context.getContext();		
		//TODO  check reference type (use CndSwitch ?) 
		context.getReference().getEReferenceType();
				
//		if (element instanceof NodeTypeDefinition) {			
//			NodeTypeDefinition nodeTypeDefReference = (NodeTypeDefinition) element;
//			
//			DiagnosticMessage diagnosticMessage = new CndSwitch<DiagnosticMessage>() {
//				@Override
//				public DiagnosticMessage caseNodeDefinition(NodeTypeDefinition ntd) {
//					return new DiagnosticMessage("Missing supertype " + context.getLinkText(), Severity.ERROR,
//							IssueCodes.MISSING_TYPE, context.getLinkText());
//				}
//			}.doSwitch(nodeTypeDefReference.eContainer());
//			
//		}
		
		DiagnosticMessage diagnosticMessage = new DiagnosticMessage("Missing node type definition " + context.getLinkText(), Severity.WARNING,
				CndValidator.MISSING_NODETYPEDEF, context.getLinkText());
				
			return diagnosticMessage;
			//return super.getUnresolvedProxyMessage(context);
	}

}
