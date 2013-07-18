/**
 */
package com.github.evra.jcr.cnd.impl;

import com.github.evra.jcr.cnd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CndFactoryImpl extends EFactoryImpl implements CndFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CndFactory init()
  {
    try
    {
      CndFactory theCndFactory = (CndFactory)EPackage.Registry.INSTANCE.getEFactory(CndPackage.eNS_URI);
      if (theCndFactory != null)
      {
        return theCndFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CndFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CndFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CndPackage.MODEL: return createModel();
      case CndPackage.NODE_TYPE_DEF: return createNodeTypeDef();
      case CndPackage.NODE_TYPE_NAME: return createNodeTypeName();
      case CndPackage.NS_MAPPING: return createNsMapping();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTypeDef createNodeTypeDef()
  {
    NodeTypeDefImpl nodeTypeDef = new NodeTypeDefImpl();
    return nodeTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTypeName createNodeTypeName()
  {
    NodeTypeNameImpl nodeTypeName = new NodeTypeNameImpl();
    return nodeTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NsMapping createNsMapping()
  {
    NsMappingImpl nsMapping = new NsMappingImpl();
    return nsMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CndPackage getCndPackage()
  {
    return (CndPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CndPackage getPackage()
  {
    return CndPackage.eINSTANCE;
  }

} //CndFactoryImpl
