/**
 */
package com.github.evra.jcr.cnd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.evra.jcr.cnd.CndFactory
 * @model kind="package"
 * @generated
 */
public interface CndPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cnd";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.github.com/evra/jcr/Cnd";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cnd";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CndPackage eINSTANCE = com.github.evra.jcr.cnd.impl.CndPackageImpl.init();

  /**
   * The meta object id for the '{@link com.github.evra.jcr.cnd.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.evra.jcr.cnd.impl.ModelImpl
   * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAMESPACES = 0;

  /**
   * The feature id for the '<em><b>Node Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NODE_TYPES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl <em>Node Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl
   * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNodeTypeDefinition()
   * @generated
   */
  int NODE_TYPE_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Declared Supertype Names</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION__DECLARED_SUPERTYPE_NAMES = 1;

  /**
   * The feature id for the '<em><b>Orderable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION__ORDERABLE = 2;

  /**
   * The feature id for the '<em><b>Mixin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION__MIXIN = 3;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION__ABSTRACT = 4;

  /**
   * The feature id for the '<em><b>Queryable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION__QUERYABLE = 5;

  /**
   * The feature id for the '<em><b>Notqueryable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION__NOTQUERYABLE = 6;

  /**
   * The feature id for the '<em><b>Primary Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION__PRIMARY_ITEM = 7;

  /**
   * The feature id for the '<em><b>Declared Property Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION__DECLARED_PROPERTY_DEFINITIONS = 8;

  /**
   * The feature id for the '<em><b>Declared Child Node Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION__DECLARED_CHILD_NODE_DEFINITIONS = 9;

  /**
   * The number of structural features of the '<em>Node Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEFINITION_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link com.github.evra.jcr.cnd.impl.NodeDefinitionImpl <em>Node Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.evra.jcr.cnd.impl.NodeDefinitionImpl
   * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNodeDefinition()
   * @generated
   */
  int NODE_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Required Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEFINITION__REQUIRED_TYPES = 1;

  /**
   * The feature id for the '<em><b>Default Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEFINITION__DEFAULT_TYPE = 2;

  /**
   * The feature id for the '<em><b>Autocreated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEFINITION__AUTOCREATED = 3;

  /**
   * The feature id for the '<em><b>Manadatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEFINITION__MANADATORY = 4;

  /**
   * The feature id for the '<em><b>Protected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEFINITION__PROTECTED = 5;

  /**
   * The feature id for the '<em><b>On Parent Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEFINITION__ON_PARENT_VERSION = 6;

  /**
   * The feature id for the '<em><b>Same Name Siblings</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEFINITION__SAME_NAME_SIBLINGS = 7;

  /**
   * The number of structural features of the '<em>Node Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DEFINITION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl
   * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getPropertyDefinition()
   * @generated
   */
  int PROPERTY_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Default Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__DEFAULT_VALUES = 2;

  /**
   * The feature id for the '<em><b>Autocreated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__AUTOCREATED = 3;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__MANDATORY = 4;

  /**
   * The feature id for the '<em><b>Protected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__PROTECTED = 5;

  /**
   * The feature id for the '<em><b>On Parent Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__ON_PARENT_VERSION = 6;

  /**
   * The feature id for the '<em><b>Multiple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__MULTIPLE = 7;

  /**
   * The feature id for the '<em><b>Query Ops</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__QUERY_OPS = 8;

  /**
   * The feature id for the '<em><b>No Full Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__NO_FULL_TEXT = 9;

  /**
   * The feature id for the '<em><b>No Query Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__NO_QUERY_ORDER = 10;

  /**
   * The feature id for the '<em><b>Primary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__PRIMARY = 11;

  /**
   * The feature id for the '<em><b>Value Constraints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__VALUE_CONSTRAINTS = 12;

  /**
   * The number of structural features of the '<em>Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link com.github.evra.jcr.cnd.impl.NsMappingImpl <em>Ns Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.evra.jcr.cnd.impl.NsMappingImpl
   * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNsMapping()
   * @generated
   */
  int NS_MAPPING = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NS_MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NS_MAPPING__URI = 1;

  /**
   * The number of structural features of the '<em>Ns Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NS_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.evra.jcr.cnd.Opv <em>Opv</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.evra.jcr.cnd.Opv
   * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getOpv()
   * @generated
   */
  int OPV = 5;

  /**
   * The meta object id for the '{@link com.github.evra.jcr.cnd.PropertyType <em>Property Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.evra.jcr.cnd.PropertyType
   * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getPropertyType()
   * @generated
   */
  int PROPERTY_TYPE = 6;


  /**
   * Returns the meta object for class '{@link com.github.evra.jcr.cnd.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.github.evra.jcr.cnd.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.evra.jcr.cnd.Model#getNamespaces <em>Namespaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespaces</em>'.
   * @see com.github.evra.jcr.cnd.Model#getNamespaces()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Namespaces();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.evra.jcr.cnd.Model#getNodeTypes <em>Node Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Node Types</em>'.
   * @see com.github.evra.jcr.cnd.Model#getNodeTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_NodeTypes();

  /**
   * Returns the meta object for class '{@link com.github.evra.jcr.cnd.NodeTypeDefinition <em>Node Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Type Definition</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition
   * @generated
   */
  EClass getNodeTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition#getName()
   * @see #getNodeTypeDefinition()
   * @generated
   */
  EAttribute getNodeTypeDefinition_Name();

  /**
   * Returns the meta object for the reference list '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getDeclaredSupertypeNames <em>Declared Supertype Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Declared Supertype Names</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition#getDeclaredSupertypeNames()
   * @see #getNodeTypeDefinition()
   * @generated
   */
  EReference getNodeTypeDefinition_DeclaredSupertypeNames();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isOrderable <em>Orderable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orderable</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition#isOrderable()
   * @see #getNodeTypeDefinition()
   * @generated
   */
  EAttribute getNodeTypeDefinition_Orderable();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isMixin <em>Mixin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mixin</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition#isMixin()
   * @see #getNodeTypeDefinition()
   * @generated
   */
  EAttribute getNodeTypeDefinition_Mixin();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition#isAbstract()
   * @see #getNodeTypeDefinition()
   * @generated
   */
  EAttribute getNodeTypeDefinition_Abstract();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isQueryable <em>Queryable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Queryable</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition#isQueryable()
   * @see #getNodeTypeDefinition()
   * @generated
   */
  EAttribute getNodeTypeDefinition_Queryable();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#isNotqueryable <em>Notqueryable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Notqueryable</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition#isNotqueryable()
   * @see #getNodeTypeDefinition()
   * @generated
   */
  EAttribute getNodeTypeDefinition_Notqueryable();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getPrimaryItem <em>Primary Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primary Item</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition#getPrimaryItem()
   * @see #getNodeTypeDefinition()
   * @generated
   */
  EAttribute getNodeTypeDefinition_PrimaryItem();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getDeclaredPropertyDefinitions <em>Declared Property Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declared Property Definitions</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition#getDeclaredPropertyDefinitions()
   * @see #getNodeTypeDefinition()
   * @generated
   */
  EReference getNodeTypeDefinition_DeclaredPropertyDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.evra.jcr.cnd.NodeTypeDefinition#getDeclaredChildNodeDefinitions <em>Declared Child Node Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declared Child Node Definitions</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDefinition#getDeclaredChildNodeDefinitions()
   * @see #getNodeTypeDefinition()
   * @generated
   */
  EReference getNodeTypeDefinition_DeclaredChildNodeDefinitions();

  /**
   * Returns the meta object for class '{@link com.github.evra.jcr.cnd.NodeDefinition <em>Node Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Definition</em>'.
   * @see com.github.evra.jcr.cnd.NodeDefinition
   * @generated
   */
  EClass getNodeDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.evra.jcr.cnd.NodeDefinition#getName()
   * @see #getNodeDefinition()
   * @generated
   */
  EAttribute getNodeDefinition_Name();

  /**
   * Returns the meta object for the reference list '{@link com.github.evra.jcr.cnd.NodeDefinition#getRequiredTypes <em>Required Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Required Types</em>'.
   * @see com.github.evra.jcr.cnd.NodeDefinition#getRequiredTypes()
   * @see #getNodeDefinition()
   * @generated
   */
  EReference getNodeDefinition_RequiredTypes();

  /**
   * Returns the meta object for the reference '{@link com.github.evra.jcr.cnd.NodeDefinition#getDefaultType <em>Default Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Default Type</em>'.
   * @see com.github.evra.jcr.cnd.NodeDefinition#getDefaultType()
   * @see #getNodeDefinition()
   * @generated
   */
  EReference getNodeDefinition_DefaultType();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeDefinition#isAutocreated <em>Autocreated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Autocreated</em>'.
   * @see com.github.evra.jcr.cnd.NodeDefinition#isAutocreated()
   * @see #getNodeDefinition()
   * @generated
   */
  EAttribute getNodeDefinition_Autocreated();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeDefinition#isManadatory <em>Manadatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Manadatory</em>'.
   * @see com.github.evra.jcr.cnd.NodeDefinition#isManadatory()
   * @see #getNodeDefinition()
   * @generated
   */
  EAttribute getNodeDefinition_Manadatory();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeDefinition#isProtected <em>Protected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protected</em>'.
   * @see com.github.evra.jcr.cnd.NodeDefinition#isProtected()
   * @see #getNodeDefinition()
   * @generated
   */
  EAttribute getNodeDefinition_Protected();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeDefinition#getOnParentVersion <em>On Parent Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>On Parent Version</em>'.
   * @see com.github.evra.jcr.cnd.NodeDefinition#getOnParentVersion()
   * @see #getNodeDefinition()
   * @generated
   */
  EAttribute getNodeDefinition_OnParentVersion();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeDefinition#isSameNameSiblings <em>Same Name Siblings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Same Name Siblings</em>'.
   * @see com.github.evra.jcr.cnd.NodeDefinition#isSameNameSiblings()
   * @see #getNodeDefinition()
   * @generated
   */
  EAttribute getNodeDefinition_SameNameSiblings();

  /**
   * Returns the meta object for class '{@link com.github.evra.jcr.cnd.PropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Definition</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition
   * @generated
   */
  EClass getPropertyDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#getName()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#getType()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Type();

  /**
   * Returns the meta object for the attribute list '{@link com.github.evra.jcr.cnd.PropertyDefinition#getDefaultValues <em>Default Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Default Values</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#getDefaultValues()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_DefaultValues();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#isAutocreated <em>Autocreated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Autocreated</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#isAutocreated()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Autocreated();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#isMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mandatory</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#isMandatory()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Mandatory();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#isProtected <em>Protected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protected</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#isProtected()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Protected();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#getOnParentVersion <em>On Parent Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>On Parent Version</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#getOnParentVersion()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_OnParentVersion();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#isMultiple <em>Multiple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiple</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#isMultiple()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Multiple();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#getQueryOps <em>Query Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query Ops</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#getQueryOps()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_QueryOps();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#isNoFullText <em>No Full Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Full Text</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#isNoFullText()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_NoFullText();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#isNoQueryOrder <em>No Query Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Query Order</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#isNoQueryOrder()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_NoQueryOrder();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.PropertyDefinition#isPrimary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primary</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#isPrimary()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Primary();

  /**
   * Returns the meta object for the attribute list '{@link com.github.evra.jcr.cnd.PropertyDefinition#getValueConstraints <em>Value Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value Constraints</em>'.
   * @see com.github.evra.jcr.cnd.PropertyDefinition#getValueConstraints()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_ValueConstraints();

  /**
   * Returns the meta object for class '{@link com.github.evra.jcr.cnd.NsMapping <em>Ns Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ns Mapping</em>'.
   * @see com.github.evra.jcr.cnd.NsMapping
   * @generated
   */
  EClass getNsMapping();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NsMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.evra.jcr.cnd.NsMapping#getName()
   * @see #getNsMapping()
   * @generated
   */
  EAttribute getNsMapping_Name();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NsMapping#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see com.github.evra.jcr.cnd.NsMapping#getUri()
   * @see #getNsMapping()
   * @generated
   */
  EAttribute getNsMapping_Uri();

  /**
   * Returns the meta object for enum '{@link com.github.evra.jcr.cnd.Opv <em>Opv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Opv</em>'.
   * @see com.github.evra.jcr.cnd.Opv
   * @generated
   */
  EEnum getOpv();

  /**
   * Returns the meta object for enum '{@link com.github.evra.jcr.cnd.PropertyType <em>Property Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Property Type</em>'.
   * @see com.github.evra.jcr.cnd.PropertyType
   * @generated
   */
  EEnum getPropertyType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CndFactory getCndFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.github.evra.jcr.cnd.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.evra.jcr.cnd.impl.ModelImpl
     * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__NAMESPACES = eINSTANCE.getModel_Namespaces();

    /**
     * The meta object literal for the '<em><b>Node Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__NODE_TYPES = eINSTANCE.getModel_NodeTypes();

    /**
     * The meta object literal for the '{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl <em>Node Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl
     * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNodeTypeDefinition()
     * @generated
     */
    EClass NODE_TYPE_DEFINITION = eINSTANCE.getNodeTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_DEFINITION__NAME = eINSTANCE.getNodeTypeDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Declared Supertype Names</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TYPE_DEFINITION__DECLARED_SUPERTYPE_NAMES = eINSTANCE.getNodeTypeDefinition_DeclaredSupertypeNames();

    /**
     * The meta object literal for the '<em><b>Orderable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_DEFINITION__ORDERABLE = eINSTANCE.getNodeTypeDefinition_Orderable();

    /**
     * The meta object literal for the '<em><b>Mixin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_DEFINITION__MIXIN = eINSTANCE.getNodeTypeDefinition_Mixin();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_DEFINITION__ABSTRACT = eINSTANCE.getNodeTypeDefinition_Abstract();

    /**
     * The meta object literal for the '<em><b>Queryable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_DEFINITION__QUERYABLE = eINSTANCE.getNodeTypeDefinition_Queryable();

    /**
     * The meta object literal for the '<em><b>Notqueryable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_DEFINITION__NOTQUERYABLE = eINSTANCE.getNodeTypeDefinition_Notqueryable();

    /**
     * The meta object literal for the '<em><b>Primary Item</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_DEFINITION__PRIMARY_ITEM = eINSTANCE.getNodeTypeDefinition_PrimaryItem();

    /**
     * The meta object literal for the '<em><b>Declared Property Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TYPE_DEFINITION__DECLARED_PROPERTY_DEFINITIONS = eINSTANCE.getNodeTypeDefinition_DeclaredPropertyDefinitions();

    /**
     * The meta object literal for the '<em><b>Declared Child Node Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TYPE_DEFINITION__DECLARED_CHILD_NODE_DEFINITIONS = eINSTANCE.getNodeTypeDefinition_DeclaredChildNodeDefinitions();

    /**
     * The meta object literal for the '{@link com.github.evra.jcr.cnd.impl.NodeDefinitionImpl <em>Node Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.evra.jcr.cnd.impl.NodeDefinitionImpl
     * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNodeDefinition()
     * @generated
     */
    EClass NODE_DEFINITION = eINSTANCE.getNodeDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_DEFINITION__NAME = eINSTANCE.getNodeDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Required Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_DEFINITION__REQUIRED_TYPES = eINSTANCE.getNodeDefinition_RequiredTypes();

    /**
     * The meta object literal for the '<em><b>Default Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_DEFINITION__DEFAULT_TYPE = eINSTANCE.getNodeDefinition_DefaultType();

    /**
     * The meta object literal for the '<em><b>Autocreated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_DEFINITION__AUTOCREATED = eINSTANCE.getNodeDefinition_Autocreated();

    /**
     * The meta object literal for the '<em><b>Manadatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_DEFINITION__MANADATORY = eINSTANCE.getNodeDefinition_Manadatory();

    /**
     * The meta object literal for the '<em><b>Protected</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_DEFINITION__PROTECTED = eINSTANCE.getNodeDefinition_Protected();

    /**
     * The meta object literal for the '<em><b>On Parent Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_DEFINITION__ON_PARENT_VERSION = eINSTANCE.getNodeDefinition_OnParentVersion();

    /**
     * The meta object literal for the '<em><b>Same Name Siblings</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_DEFINITION__SAME_NAME_SIBLINGS = eINSTANCE.getNodeDefinition_SameNameSiblings();

    /**
     * The meta object literal for the '{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl
     * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getPropertyDefinition()
     * @generated
     */
    EClass PROPERTY_DEFINITION = eINSTANCE.getPropertyDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__NAME = eINSTANCE.getPropertyDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__TYPE = eINSTANCE.getPropertyDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Default Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__DEFAULT_VALUES = eINSTANCE.getPropertyDefinition_DefaultValues();

    /**
     * The meta object literal for the '<em><b>Autocreated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__AUTOCREATED = eINSTANCE.getPropertyDefinition_Autocreated();

    /**
     * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__MANDATORY = eINSTANCE.getPropertyDefinition_Mandatory();

    /**
     * The meta object literal for the '<em><b>Protected</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__PROTECTED = eINSTANCE.getPropertyDefinition_Protected();

    /**
     * The meta object literal for the '<em><b>On Parent Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__ON_PARENT_VERSION = eINSTANCE.getPropertyDefinition_OnParentVersion();

    /**
     * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__MULTIPLE = eINSTANCE.getPropertyDefinition_Multiple();

    /**
     * The meta object literal for the '<em><b>Query Ops</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__QUERY_OPS = eINSTANCE.getPropertyDefinition_QueryOps();

    /**
     * The meta object literal for the '<em><b>No Full Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__NO_FULL_TEXT = eINSTANCE.getPropertyDefinition_NoFullText();

    /**
     * The meta object literal for the '<em><b>No Query Order</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__NO_QUERY_ORDER = eINSTANCE.getPropertyDefinition_NoQueryOrder();

    /**
     * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__PRIMARY = eINSTANCE.getPropertyDefinition_Primary();

    /**
     * The meta object literal for the '<em><b>Value Constraints</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__VALUE_CONSTRAINTS = eINSTANCE.getPropertyDefinition_ValueConstraints();

    /**
     * The meta object literal for the '{@link com.github.evra.jcr.cnd.impl.NsMappingImpl <em>Ns Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.evra.jcr.cnd.impl.NsMappingImpl
     * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNsMapping()
     * @generated
     */
    EClass NS_MAPPING = eINSTANCE.getNsMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NS_MAPPING__NAME = eINSTANCE.getNsMapping_Name();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NS_MAPPING__URI = eINSTANCE.getNsMapping_Uri();

    /**
     * The meta object literal for the '{@link com.github.evra.jcr.cnd.Opv <em>Opv</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.evra.jcr.cnd.Opv
     * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getOpv()
     * @generated
     */
    EEnum OPV = eINSTANCE.getOpv();

    /**
     * The meta object literal for the '{@link com.github.evra.jcr.cnd.PropertyType <em>Property Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.evra.jcr.cnd.PropertyType
     * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getPropertyType()
     * @generated
     */
    EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

  }

} //CndPackage
