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
 *   <li>{@link com.github.evra.jcr.cnd.Model#getMappings <em>Mappings</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.Model#getNodetypes <em>Nodetypes</em>}</li>
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
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link com.github.evra.jcr.cnd.NsMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see com.github.evra.jcr.cnd.CndPackage#getModel_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<NsMapping> getMappings();

  /**
   * Returns the value of the '<em><b>Nodetypes</b></em>' containment reference list.
   * The list contents are of type {@link com.github.evra.jcr.cnd.NodeTypeDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodetypes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodetypes</em>' containment reference list.
   * @see com.github.evra.jcr.cnd.CndPackage#getModel_Nodetypes()
   * @model containment="true"
   * @generated
   */
  EList<NodeTypeDef> getNodetypes();

} // Model
