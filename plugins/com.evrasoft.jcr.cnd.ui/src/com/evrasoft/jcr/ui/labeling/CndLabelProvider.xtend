/*
* generated by Xtext
*/
package com.evrasoft.jcr.ui.labeling

import com.google.inject.Inject
import com.evrasoft.jcr.cnd.NsMapping
import com.evrasoft.jcr.cnd.NodeTypeDefinition
import com.evrasoft.jcr.cnd.PropertyDefinition
import org.eclipse.xtext.ui.PluginImageHelper
import com.evrasoft.jcr.cnd.NodeDefinition

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class CndLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject extension PluginImageHelper imageHelper;
	

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
	def text(NsMapping nsMapping) {
		return nsMapping.name
	}

	def image(NsMapping nsMapping) {
		return 'namespace.gif'
	}
	
	def text(NodeTypeDefinition nodeTypeDef) {
		return nodeTypeDef.name
	}
	
	def image(NodeTypeDefinition nodeTypeDef) {
		if (nodeTypeDef.mixin) {
			return 'mixin.gif';
		}
		return 'nodetypedef.gif'
	}
	
	def text(NodeDefinition nodeDef) {
		return nodeDef.name
	}
	
	def image(NodeDefinition nodeDef) {
		return 'nodedef.gif'
	}
		
	def text(PropertyDefinition propertyDef) {
		return propertyDef.name
	}
	
	def image(PropertyDefinition propertyDef) {
		return 'property.gif'
	}
	
}