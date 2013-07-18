/**
 */
package com.github.evra.jcr.cnd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeName#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeName()
 * @model
 * @generated
 */
public interface NodeTypeName extends NodeTypeDef
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' attribute list.
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeName_Attributes()
   * @model unique="false"
   * @generated
   */
  EList<String> getAttributes();

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
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeTypeName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // NodeTypeName
