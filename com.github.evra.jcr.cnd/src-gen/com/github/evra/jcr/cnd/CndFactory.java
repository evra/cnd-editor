/**
 */
package com.github.evra.jcr.cnd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.evra.jcr.cnd.CndPackage
 * @generated
 */
public interface CndFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CndFactory eINSTANCE = com.github.evra.jcr.cnd.impl.CndFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Node Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Type Def</em>'.
   * @generated
   */
  NodeTypeDef createNodeTypeDef();

  /**
   * Returns a new object of class '<em>Node Type Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Type Name</em>'.
   * @generated
   */
  NodeTypeName createNodeTypeName();

  /**
   * Returns a new object of class '<em>Ns Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ns Mapping</em>'.
   * @generated
   */
  NsMapping createNsMapping();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CndPackage getCndPackage();

} //CndFactory
