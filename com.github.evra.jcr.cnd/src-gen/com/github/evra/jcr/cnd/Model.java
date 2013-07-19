/**
 */
package com.github.evra.jcr.cnd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.evra.jcr.cnd.Model#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.Model#getNodeTypes <em>Node Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.evra.jcr.cnd.CndPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
   * The list contents are of type {@link com.github.evra.jcr.cnd.NsMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespaces</em>' containment reference list.
   * @see com.github.evra.jcr.cnd.CndPackage#getModel_Namespaces()
   * @model containment="true"
   * @generated
   */
  EList<NsMapping> getNamespaces();

  /**
   * Returns the value of the '<em><b>Node Types</b></em>' containment reference list.
   * The list contents are of type {@link com.github.evra.jcr.cnd.NodeTypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Types</em>' containment reference list.
   * @see com.github.evra.jcr.cnd.CndPackage#getModel_NodeTypes()
   * @model containment="true"
   * @generated
   */
  EList<NodeTypeDefinition> getNodeTypes();

} // Model
