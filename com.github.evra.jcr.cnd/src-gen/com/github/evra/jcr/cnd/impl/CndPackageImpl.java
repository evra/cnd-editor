/**
 */
package com.github.evra.jcr.cnd.impl;

import com.github.evra.jcr.cnd.CndFactory;
import com.github.evra.jcr.cnd.CndPackage;
import com.github.evra.jcr.cnd.Model;
import com.github.evra.jcr.cnd.NodeDefinition;
import com.github.evra.jcr.cnd.NodeTypeDefinition;
import com.github.evra.jcr.cnd.NsMapping;
import com.github.evra.jcr.cnd.Opv;
import com.github.evra.jcr.cnd.PropertyDefinition;
import com.github.evra.jcr.cnd.PropertyType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
  private EClass nodeTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nsMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opvEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum propertyTypeEEnum = null;

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
  public EReference getModel_Namespaces()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_NodeTypes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeTypeDefinition()
  {
    return nodeTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeDefinition_Name()
  {
    return (EAttribute)nodeTypeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeDefinition_DeclaredSupertypeNames()
  {
    return (EAttribute)nodeTypeDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeDefinition_Orderable()
  {
    return (EAttribute)nodeTypeDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeDefinition_Mixin()
  {
    return (EAttribute)nodeTypeDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeDefinition_Abstract()
  {
    return (EAttribute)nodeTypeDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeDefinition_Queryable()
  {
    return (EAttribute)nodeTypeDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeDefinition_Notqueryable()
  {
    return (EAttribute)nodeTypeDefinitionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeDefinition_PrimaryItem()
  {
    return (EAttribute)nodeTypeDefinitionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeTypeDefinition_DeclaredPropertyDefinitions()
  {
    return (EReference)nodeTypeDefinitionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeTypeDefinition_DeclaredChildNodeDefinitions()
  {
    return (EReference)nodeTypeDefinitionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeDefinition()
  {
    return nodeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeDefinition_Name()
  {
    return (EAttribute)nodeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeDefinition_RequiredTypes()
  {
    return (EAttribute)nodeDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeDefinition_DefaultType()
  {
    return (EAttribute)nodeDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeDefinition_Autocreated()
  {
    return (EAttribute)nodeDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeDefinition_Manadatory()
  {
    return (EAttribute)nodeDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeDefinition_Protected()
  {
    return (EAttribute)nodeDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeDefinition_OnParentVersion()
  {
    return (EAttribute)nodeDefinitionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeDefinition_SameNameSiblings()
  {
    return (EAttribute)nodeDefinitionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDefinition()
  {
    return propertyDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Name()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Type()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_DefaultValues()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Autocreated()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Mandatory()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Protected()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_OnParentVersion()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Multiple()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_QueryOps()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_NoFullText()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_NoQueryOrder()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Primary()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_ValueConstraints()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(12);
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
  public EEnum getOpv()
  {
    return opvEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPropertyType()
  {
    return propertyTypeEEnum;
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
    createEReference(modelEClass, MODEL__NAMESPACES);
    createEReference(modelEClass, MODEL__NODE_TYPES);

    nodeTypeDefinitionEClass = createEClass(NODE_TYPE_DEFINITION);
    createEAttribute(nodeTypeDefinitionEClass, NODE_TYPE_DEFINITION__NAME);
    createEAttribute(nodeTypeDefinitionEClass, NODE_TYPE_DEFINITION__DECLARED_SUPERTYPE_NAMES);
    createEAttribute(nodeTypeDefinitionEClass, NODE_TYPE_DEFINITION__ORDERABLE);
    createEAttribute(nodeTypeDefinitionEClass, NODE_TYPE_DEFINITION__MIXIN);
    createEAttribute(nodeTypeDefinitionEClass, NODE_TYPE_DEFINITION__ABSTRACT);
    createEAttribute(nodeTypeDefinitionEClass, NODE_TYPE_DEFINITION__QUERYABLE);
    createEAttribute(nodeTypeDefinitionEClass, NODE_TYPE_DEFINITION__NOTQUERYABLE);
    createEAttribute(nodeTypeDefinitionEClass, NODE_TYPE_DEFINITION__PRIMARY_ITEM);
    createEReference(nodeTypeDefinitionEClass, NODE_TYPE_DEFINITION__DECLARED_PROPERTY_DEFINITIONS);
    createEReference(nodeTypeDefinitionEClass, NODE_TYPE_DEFINITION__DECLARED_CHILD_NODE_DEFINITIONS);

    nodeDefinitionEClass = createEClass(NODE_DEFINITION);
    createEAttribute(nodeDefinitionEClass, NODE_DEFINITION__NAME);
    createEAttribute(nodeDefinitionEClass, NODE_DEFINITION__REQUIRED_TYPES);
    createEAttribute(nodeDefinitionEClass, NODE_DEFINITION__DEFAULT_TYPE);
    createEAttribute(nodeDefinitionEClass, NODE_DEFINITION__AUTOCREATED);
    createEAttribute(nodeDefinitionEClass, NODE_DEFINITION__MANADATORY);
    createEAttribute(nodeDefinitionEClass, NODE_DEFINITION__PROTECTED);
    createEAttribute(nodeDefinitionEClass, NODE_DEFINITION__ON_PARENT_VERSION);
    createEAttribute(nodeDefinitionEClass, NODE_DEFINITION__SAME_NAME_SIBLINGS);

    propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__NAME);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__TYPE);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__DEFAULT_VALUES);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__AUTOCREATED);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__MANDATORY);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__PROTECTED);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__ON_PARENT_VERSION);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__MULTIPLE);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__QUERY_OPS);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__NO_FULL_TEXT);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__NO_QUERY_ORDER);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__PRIMARY);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__VALUE_CONSTRAINTS);

    nsMappingEClass = createEClass(NS_MAPPING);
    createEAttribute(nsMappingEClass, NS_MAPPING__NAME);
    createEAttribute(nsMappingEClass, NS_MAPPING__URI);

    // Create enums
    opvEEnum = createEEnum(OPV);
    propertyTypeEEnum = createEEnum(PROPERTY_TYPE);
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

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Namespaces(), this.getNsMapping(), null, "namespaces", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_NodeTypes(), this.getNodeTypeDefinition(), null, "nodeTypes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeTypeDefinitionEClass, NodeTypeDefinition.class, "NodeTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeTypeDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeDefinition_DeclaredSupertypeNames(), ecorePackage.getEString(), "declaredSupertypeNames", null, 0, -1, NodeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeDefinition_Orderable(), ecorePackage.getEBoolean(), "orderable", null, 0, 1, NodeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeDefinition_Mixin(), ecorePackage.getEBoolean(), "mixin", null, 0, 1, NodeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeDefinition_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, NodeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeDefinition_Queryable(), ecorePackage.getEBoolean(), "queryable", null, 0, 1, NodeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeDefinition_Notqueryable(), ecorePackage.getEBoolean(), "notqueryable", null, 0, 1, NodeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeDefinition_PrimaryItem(), ecorePackage.getEString(), "primaryItem", null, 0, 1, NodeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeTypeDefinition_DeclaredPropertyDefinitions(), this.getPropertyDefinition(), null, "declaredPropertyDefinitions", null, 0, -1, NodeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeTypeDefinition_DeclaredChildNodeDefinitions(), this.getNodeDefinition(), null, "declaredChildNodeDefinitions", null, 0, -1, NodeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeDefinitionEClass, NodeDefinition.class, "NodeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeDefinition_RequiredTypes(), ecorePackage.getEString(), "requiredTypes", null, 0, -1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeDefinition_DefaultType(), ecorePackage.getEString(), "defaultType", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeDefinition_Autocreated(), ecorePackage.getEBoolean(), "autocreated", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeDefinition_Manadatory(), ecorePackage.getEBoolean(), "manadatory", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeDefinition_Protected(), ecorePackage.getEBoolean(), "protected", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeDefinition_OnParentVersion(), this.getOpv(), "onParentVersion", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeDefinition_SameNameSiblings(), ecorePackage.getEBoolean(), "sameNameSiblings", null, 0, 1, NodeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_Type(), this.getPropertyType(), "type", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_DefaultValues(), ecorePackage.getEString(), "defaultValues", null, 0, -1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_Autocreated(), ecorePackage.getEBoolean(), "autocreated", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_Protected(), ecorePackage.getEBoolean(), "protected", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_OnParentVersion(), this.getOpv(), "onParentVersion", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_QueryOps(), ecorePackage.getEString(), "queryOps", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_NoFullText(), ecorePackage.getEBoolean(), "noFullText", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_NoQueryOrder(), ecorePackage.getEBoolean(), "noQueryOrder", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_Primary(), ecorePackage.getEBoolean(), "primary", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_ValueConstraints(), ecorePackage.getEString(), "valueConstraints", null, 0, -1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nsMappingEClass, NsMapping.class, "NsMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNsMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, NsMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNsMapping_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, NsMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(opvEEnum, Opv.class, "Opv");
    addEEnumLiteral(opvEEnum, Opv.COPY);
    addEEnumLiteral(opvEEnum, Opv.VERSION);
    addEEnumLiteral(opvEEnum, Opv.INITIALIZE);
    addEEnumLiteral(opvEEnum, Opv.COMPUTE);
    addEEnumLiteral(opvEEnum, Opv.IGNORE);
    addEEnumLiteral(opvEEnum, Opv.ABORT);

    initEEnum(propertyTypeEEnum, PropertyType.class, "PropertyType");
    addEEnumLiteral(propertyTypeEEnum, PropertyType.UNDEFINED);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TSTRING);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TBINARY);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TLONG);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TDOUBLE);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.DDATE);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TBOOLEAN);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TNAME);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TPATH);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TREFERENCE);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TWEAKREFERENCE);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TURI);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.TDECIMAL);

    // Create resource
    createResource(eNS_URI);
  }

} //CndPackageImpl
