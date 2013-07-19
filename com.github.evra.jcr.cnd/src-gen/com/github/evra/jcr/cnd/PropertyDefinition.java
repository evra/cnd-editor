/**
 */
package com.github.evra.jcr.cnd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#getName <em>Name</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#getType <em>Type</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#getDefaultValues <em>Default Values</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#isAutocreated <em>Autocreated</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#isProtected <em>Protected</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#getOnParentVersion <em>On Parent Version</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#getQueryOps <em>Query Ops</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#isNoFullText <em>No Full Text</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#isNoQueryOrder <em>No Query Order</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#isPrimary <em>Primary</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.PropertyDefinition#getValueConstraints <em>Value Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition()
 * @model
 * @generated
 */
public interface PropertyDefinition extends EObject
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
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.evra.jcr.cnd.PropertyType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.github.evra.jcr.cnd.PropertyType
   * @see #setType(PropertyType)
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_Type()
   * @model
   * @generated
   */
  PropertyType getType();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.github.evra.jcr.cnd.PropertyType
   * @see #getType()
   * @generated
   */
  void setType(PropertyType value);

  /**
   * Returns the value of the '<em><b>Default Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Values</em>' attribute list.
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_DefaultValues()
   * @model unique="false"
   * @generated
   */
  EList<String> getDefaultValues();

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
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_Autocreated()
   * @model
   * @generated
   */
  boolean isAutocreated();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#isAutocreated <em>Autocreated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autocreated</em>' attribute.
   * @see #isAutocreated()
   * @generated
   */
  void setAutocreated(boolean value);

  /**
   * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatory</em>' attribute.
   * @see #setMandatory(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_Mandatory()
   * @model
   * @generated
   */
  boolean isMandatory();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#isMandatory <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' attribute.
   * @see #isMandatory()
   * @generated
   */
  void setMandatory(boolean value);

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
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_Protected()
   * @model
   * @generated
   */
  boolean isProtected();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#isProtected <em>Protected</em>}' attribute.
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
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_OnParentVersion()
   * @model
   * @generated
   */
  Opv getOnParentVersion();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#getOnParentVersion <em>On Parent Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Parent Version</em>' attribute.
   * @see com.github.evra.jcr.cnd.Opv
   * @see #getOnParentVersion()
   * @generated
   */
  void setOnParentVersion(Opv value);

  /**
   * Returns the value of the '<em><b>Multiple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiple</em>' attribute.
   * @see #setMultiple(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_Multiple()
   * @model
   * @generated
   */
  boolean isMultiple();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#isMultiple <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiple</em>' attribute.
   * @see #isMultiple()
   * @generated
   */
  void setMultiple(boolean value);

  /**
   * Returns the value of the '<em><b>Query Ops</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Ops</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Ops</em>' attribute.
   * @see #setQueryOps(String)
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_QueryOps()
   * @model
   * @generated
   */
  String getQueryOps();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#getQueryOps <em>Query Ops</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Ops</em>' attribute.
   * @see #getQueryOps()
   * @generated
   */
  void setQueryOps(String value);

  /**
   * Returns the value of the '<em><b>No Full Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Full Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Full Text</em>' attribute.
   * @see #setNoFullText(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_NoFullText()
   * @model
   * @generated
   */
  boolean isNoFullText();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#isNoFullText <em>No Full Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Full Text</em>' attribute.
   * @see #isNoFullText()
   * @generated
   */
  void setNoFullText(boolean value);

  /**
   * Returns the value of the '<em><b>No Query Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Query Order</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Query Order</em>' attribute.
   * @see #setNoQueryOrder(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_NoQueryOrder()
   * @model
   * @generated
   */
  boolean isNoQueryOrder();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#isNoQueryOrder <em>No Query Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Query Order</em>' attribute.
   * @see #isNoQueryOrder()
   * @generated
   */
  void setNoQueryOrder(boolean value);

  /**
   * Returns the value of the '<em><b>Primary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary</em>' attribute.
   * @see #setPrimary(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_Primary()
   * @model
   * @generated
   */
  boolean isPrimary();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.PropertyDefinition#isPrimary <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' attribute.
   * @see #isPrimary()
   * @generated
   */
  void setPrimary(boolean value);

  /**
   * Returns the value of the '<em><b>Value Constraints</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Constraints</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Constraints</em>' attribute list.
   * @see com.github.evra.jcr.cnd.CndPackage#getPropertyDefinition_ValueConstraints()
   * @model unique="false"
   * @generated
   */
  EList<String> getValueConstraints();

} // PropertyDefinition
