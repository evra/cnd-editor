/**
 */
package com.github.evra.jcr.cnd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAPPINGS = 0;

  /**
   * The feature id for the '<em><b>Nodetypes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NODETYPES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.evra.jcr.cnd.impl.NodeTypeDefImpl <em>Node Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.evra.jcr.cnd.impl.NodeTypeDefImpl
   * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNodeTypeDef()
   * @generated
   */
  int NODE_TYPE_DEF = 1;

  /**
   * The number of structural features of the '<em>Node Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_DEF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.github.evra.jcr.cnd.impl.NodeTypeNameImpl <em>Node Type Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.evra.jcr.cnd.impl.NodeTypeNameImpl
   * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNodeTypeName()
   * @generated
   */
  int NODE_TYPE_NAME = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_NAME__ATTRIBUTES = NODE_TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_NAME__NAME = NODE_TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Node Type Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_NAME_FEATURE_COUNT = NODE_TYPE_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.github.evra.jcr.cnd.impl.NsMappingImpl <em>Ns Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.evra.jcr.cnd.impl.NsMappingImpl
   * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNsMapping()
   * @generated
   */
  int NS_MAPPING = 3;

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
   * Returns the meta object for class '{@link com.github.evra.jcr.cnd.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.github.evra.jcr.cnd.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.evra.jcr.cnd.Model#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see com.github.evra.jcr.cnd.Model#getMappings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Mappings();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.evra.jcr.cnd.Model#getNodetypes <em>Nodetypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodetypes</em>'.
   * @see com.github.evra.jcr.cnd.Model#getNodetypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Nodetypes();

  /**
   * Returns the meta object for class '{@link com.github.evra.jcr.cnd.NodeTypeDef <em>Node Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Type Def</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeDef
   * @generated
   */
  EClass getNodeTypeDef();

  /**
   * Returns the meta object for class '{@link com.github.evra.jcr.cnd.NodeTypeName <em>Node Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Type Name</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeName
   * @generated
   */
  EClass getNodeTypeName();

  /**
   * Returns the meta object for the attribute list '{@link com.github.evra.jcr.cnd.NodeTypeName#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Attributes</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeName#getAttributes()
   * @see #getNodeTypeName()
   * @generated
   */
  EAttribute getNodeTypeName_Attributes();

  /**
   * Returns the meta object for the attribute '{@link com.github.evra.jcr.cnd.NodeTypeName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.evra.jcr.cnd.NodeTypeName#getName()
   * @see #getNodeTypeName()
   * @generated
   */
  EAttribute getNodeTypeName_Name();

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
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAPPINGS = eINSTANCE.getModel_Mappings();

    /**
     * The meta object literal for the '<em><b>Nodetypes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__NODETYPES = eINSTANCE.getModel_Nodetypes();

    /**
     * The meta object literal for the '{@link com.github.evra.jcr.cnd.impl.NodeTypeDefImpl <em>Node Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.evra.jcr.cnd.impl.NodeTypeDefImpl
     * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNodeTypeDef()
     * @generated
     */
    EClass NODE_TYPE_DEF = eINSTANCE.getNodeTypeDef();

    /**
     * The meta object literal for the '{@link com.github.evra.jcr.cnd.impl.NodeTypeNameImpl <em>Node Type Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.evra.jcr.cnd.impl.NodeTypeNameImpl
     * @see com.github.evra.jcr.cnd.impl.CndPackageImpl#getNodeTypeName()
     * @generated
     */
    EClass NODE_TYPE_NAME = eINSTANCE.getNodeTypeName();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_NAME__ATTRIBUTES = eINSTANCE.getNodeTypeName_Attributes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_NAME__NAME = eINSTANCE.getNodeTypeName_Name();

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

  }

} //CndPackage
