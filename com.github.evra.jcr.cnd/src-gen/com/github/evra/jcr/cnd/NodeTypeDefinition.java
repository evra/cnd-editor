/**
 */
package com.github.evra.jcr.cnd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getDeclaredSupertypeNames <em>Declared Supertype Names</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isOrderable <em>Orderable</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isMixin <em>Mixin</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isQueryable <em>Queryable</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isNotqueryable <em>Notqueryable</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getPrimaryItem <em>Primary Item</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getDeclaredPropertyDefinitions <em>Declared Property Definitions</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getDeclaredChildNodeDefinitions <em>Declared Child Node Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition()
 * @model
 * @generated
 */
public interface NodeTypeDefinition extends EObject
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
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Declared Supertype Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Supertype Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Supertype Names</em>' attribute list.
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition_DeclaredSupertypeNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getDeclaredSupertypeNames();

  /**
   * Returns the value of the '<em><b>Orderable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orderable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orderable</em>' attribute.
   * @see #setOrderable(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition_Orderable()
   * @model
   * @generated
   */
  boolean isOrderable();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isOrderable <em>Orderable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orderable</em>' attribute.
   * @see #isOrderable()
   * @generated
   */
  void setOrderable(boolean value);

  /**
   * Returns the value of the '<em><b>Mixin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixin</em>' attribute.
   * @see #setMixin(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition_Mixin()
   * @model
   * @generated
   */
  boolean isMixin();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isMixin <em>Mixin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mixin</em>' attribute.
   * @see #isMixin()
   * @generated
   */
  void setMixin(boolean value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Queryable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queryable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queryable</em>' attribute.
   * @see #setQueryable(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition_Queryable()
   * @model
   * @generated
   */
  boolean isQueryable();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isQueryable <em>Queryable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Queryable</em>' attribute.
   * @see #isQueryable()
   * @generated
   */
  void setQueryable(boolean value);

  /**
   * Returns the value of the '<em><b>Notqueryable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notqueryable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notqueryable</em>' attribute.
   * @see #setNotqueryable(boolean)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition_Notqueryable()
   * @model
   * @generated
   */
  boolean isNotqueryable();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isNotqueryable <em>Notqueryable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Notqueryable</em>' attribute.
   * @see #isNotqueryable()
   * @generated
   */
  void setNotqueryable(boolean value);

  /**
   * Returns the value of the '<em><b>Primary Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Item</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Item</em>' attribute.
   * @see #setPrimaryItem(String)
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition_PrimaryItem()
   * @model
   * @generated
   */
  String getPrimaryItem();

  /**
   * Sets the value of the '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getPrimaryItem <em>Primary Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Item</em>' attribute.
   * @see #getPrimaryItem()
   * @generated
   */
  void setPrimaryItem(String value);

  /**
   * Returns the value of the '<em><b>Declared Property Definitions</b></em>' containment reference list.
   * The list contents are of type {@link com.github.evra.jcr.cnd.PropertyDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Property Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Property Definitions</em>' containment reference list.
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition_DeclaredPropertyDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<PropertyDefinition> getDeclaredPropertyDefinitions();

  /**
   * Returns the value of the '<em><b>Declared Child Node Definitions</b></em>' containment reference list.
   * The list contents are of type {@link com.github.evra.jcr.cnd.NodeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Child Node Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Child Node Definitions</em>' containment reference list.
   * @see com.github.evra.jcr.cnd.CndPackage#getNodeTypeDefinition_DeclaredChildNodeDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<NodeDefinition> getDeclaredChildNodeDefinitions();

} // NodeTypeDefinition
