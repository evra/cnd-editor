/**
 */
package com.github.evra.jcr.cnd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.evra.jcr.cnd.NodeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeDefinition#getRequiredTypes <em>Required Types</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeDefinition#getDefaultType <em>Default Type</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeDefinition#isAutocreated <em>Autocreated</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeDefinition#isManadatory <em>Manadatory</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeDefinition#isProtected <em>Protected</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeDefinition#getOnParentVersion <em>On Parent Version</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeDefinition#isSameNameSiblings <em>Same Name Siblings</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.evra.jcr.cnd.CndPackage#getNodeDefinition()
 * @model
 * @generated
 */
public interface NodeDefinition extends EObject
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
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Required Types</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Types</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Types</em>' attribute list.
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeDefinition_RequiredTypes()
   * @model unique="false"
   * @generated
   */
  EList<String> getRequiredTypes();

  /**
   * Returns the value of the '<em><b>Default Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Type</em>' attribute.
   * @see #setDefaultType(String)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeDefinition_DefaultType()
   * @model
   * @generated
   */
  String getDefaultType();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeDefinition#getDefaultType <em>Default Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Type</em>' attribute.
   * @see #getDefaultType()
   * @generated
   */
  void setDefaultType(String value);

  /**
   * Returns the value of the '<em><b>Autocreated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Autocreated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autocreated</em>' attribute.
   * @see #setAutocreated(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeDefinition_Autocreated()
   * @model
   * @generated
   */
  boolean isAutocreated();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeDefinition#isAutocreated <em>Autocreated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autocreated</em>' attribute.
   * @see #isAutocreated()
   * @generated
   */
  void setAutocreated(boolean value);

  /**
   * Returns the value of the '<em><b>Manadatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manadatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manadatory</em>' attribute.
   * @see #setManadatory(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeDefinition_Manadatory()
   * @model
   * @generated
   */
  boolean isManadatory();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeDefinition#isManadatory <em>Manadatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manadatory</em>' attribute.
   * @see #isManadatory()
   * @generated
   */
  void setManadatory(boolean value);

  /**
   * Returns the value of the '<em><b>Protected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protected</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protected</em>' attribute.
   * @see #setProtected(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeDefinition_Protected()
   * @model
   * @generated
   */
  boolean isProtected();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeDefinition#isProtected <em>Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protected</em>' attribute.
   * @see #isProtected()
   * @generated
   */
  void setProtected(boolean value);

  /**
   * Returns the value of the '<em><b>On Parent Version</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.evra.jcr.cnd.Opv}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Parent Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Parent Version</em>' attribute.
   * @see com.github.evra.jcr.cnd.Opv
   * @see #setOnParentVersion(Opv)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeDefinition_OnParentVersion()
   * @model
   * @generated
   */
  Opv getOnParentVersion();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeDefinition#getOnParentVersion <em>On Parent Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Parent Version</em>' attribute.
   * @see com.github.evra.jcr.cnd.Opv
   * @see #getOnParentVersion()
   * @generated
   */
  void setOnParentVersion(Opv value);

  /**
   * Returns the value of the '<em><b>Same Name Siblings</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Same Name Siblings</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Same Name Siblings</em>' attribute.
   * @see #setSameNameSiblings(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeDefinition_SameNameSiblings()
   * @model
   * @generated
   */
  boolean isSameNameSiblings();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeDefinition#isSameNameSiblings <em>Same Name Siblings</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Same Name Siblings</em>' attribute.
   * @see #isSameNameSiblings()
   * @generated
   */
  void setSameNameSiblings(boolean value);

} // NodeDefinition
