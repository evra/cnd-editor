/**
 */
package com.github.evra.jcr.cnd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ns Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.evra.jcr.cnd.NsMapping#getName <em>Name</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NsMapping#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.evra.jcr.cnd.CndPackage#getNsMapping()
 * @model
 * @generated
 */
public interface NsMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.evra.jcr.cnd.CndPackage#getNsMapping_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NsMapping#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see com.github.evra.jcr.cnd.CndPackage#getNsMapping_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NsMapping#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

} // NsMapping
