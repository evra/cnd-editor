/**
 */
package com.github.evra.jcr.cnd.impl;

import com.github.evra.jcr.cnd.CndFactory;
import com.github.evra.jcr.cnd.CndPackage;
import com.github.evra.jcr.cnd.Model;
import com.github.evra.jcr.cnd.NodeTypeDef;
import com.github.evra.jcr.cnd.NodeTypeName;
import com.github.evra.jcr.cnd.NsMapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CndPackageImpl extends EPackageImpl implements CndPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeTypeNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nsMappingEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.github.evra.jcr.cnd.CndPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CndPackageImpl()
  {
    super(eNS_URI, CndFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CndPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CndPackage init()
  {
    if (isInited) return (CndPackage)EPackage.Registry.INSTANCE.getEPackage(CndPackage.eNS_URI);

    // Obtain or create and register package
    CndPackageImpl theCndPackage = (CndPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CndPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CndPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCndPackage.createPackageContents();

    // Initialize created meta-data
    theCndPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCndPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CndPackage.eNS_URI, theCndPackage);
    return theCndPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Mappings()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Nodetypes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeTypeDef()
  {
    return nodeTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeTypeName()
  {
    return nodeTypeNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeName_Attributes()
  {
    return (EAttribute)nodeTypeNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeName_Name()
  {
    return (EAttribute)nodeTypeNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNsMapping()
  {
    return nsMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNsMapping_Name()
  {
    return (EAttribute)nsMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNsMapping_Uri()
  {
    return (EAttribute)nsMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CndFactory getCndFactory()
  {
    return (CndFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__MAPPINGS);
    createEReference(modelEClass, MODEL__NODETYPES);

    nodeTypeDefEClass = createEClass(NODE_TYPE_DEF);

    nodeTypeNameEClass = createEClass(NODE_TYPE_NAME);
    createEAttribute(nodeTypeNameEClass, NODE_TYPE_NAME__ATTRIBUTES);
    createEAttribute(nodeTypeNameEClass, NODE_TYPE_NAME__NAME);

    nsMappingEClass = createEClass(NS_MAPPING);
    createEAttribute(nsMappingEClass, NS_MAPPING__NAME);
    createEAttribute(nsMappingEClass, NS_MAPPING__URI);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    nodeTypeNameEClass.getESuperTypes().add(this.getNodeTypeDef());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Mappings(), this.getNsMapping(), null, "mappings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Nodetypes(), this.getNodeTypeDef(), null, "nodetypes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeTypeDefEClass, NodeTypeDef.class, "NodeTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeTypeNameEClass, NodeTypeName.class, "NodeTypeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeTypeName_Attributes(), ecorePackage.getEString(), "attributes", null, 0, -1, NodeTypeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeName_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeTypeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nsMappingEClass, NsMapping.class, "NsMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNsMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, NsMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNsMapping_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, NsMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CndPackageImpl
