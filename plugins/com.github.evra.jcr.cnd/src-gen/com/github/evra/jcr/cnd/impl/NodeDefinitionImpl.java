/**
 */
package com.github.evra.jcr.cnd.impl;

import com.github.evra.jcr.cnd.CndPackage;
import com.github.evra.jcr.cnd.NodeDefinition;
import com.github.evra.jcr.cnd.NodeTypeDefinition;
import com.github.evra.jcr.cnd.Opv;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeDefinitionImpl#getRequiredTypes <em>Required Types</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeDefinitionImpl#getDefaultType <em>Default Type</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeDefinitionImpl#isAutocreated <em>Autocreated</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeDefinitionImpl#isManadatory <em>Manadatory</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeDefinitionImpl#isProtected <em>Protected</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeDefinitionImpl#getOnParentVersion <em>On Parent Version</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeDefinitionImpl#isSameNameSiblings <em>Same Name Siblings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeDefinitionImpl extends MinimalEObjectImpl.Container implements NodeDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequiredTypes() <em>Required Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredTypes()
   * @generated
   * @ordered
   */
  protected EList<NodeTypeDefinition> requiredTypes;

  /**
   * The cached value of the '{@link #getDefaultType() <em>Default Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultType()
   * @generated
   * @ordered
   */
  protected NodeTypeDefinition defaultType;

  /**
   * The default value of the '{@link #isAutocreated() <em>Autocreated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutocreated()
   * @generated
   * @ordered
   */
  protected static final boolean AUTOCREATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAutocreated() <em>Autocreated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutocreated()
   * @generated
   * @ordered
   */
  protected boolean autocreated = AUTOCREATED_EDEFAULT;

  /**
   * The default value of the '{@link #isManadatory() <em>Manadatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isManadatory()
   * @generated
   * @ordered
   */
  protected static final boolean MANADATORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isManadatory() <em>Manadatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isManadatory()
   * @generated
   * @ordered
   */
  protected boolean manadatory = MANADATORY_EDEFAULT;

  /**
   * The default value of the '{@link #isProtected() <em>Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProtected()
   * @generated
   * @ordered
   */
  protected static final boolean PROTECTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProtected() <em>Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProtected()
   * @generated
   * @ordered
   */
  protected boolean protected_ = PROTECTED_EDEFAULT;

  /**
   * The default value of the '{@link #getOnParentVersion() <em>On Parent Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnParentVersion()
   * @generated
   * @ordered
   */
  protected static final Opv ON_PARENT_VERSION_EDEFAULT = Opv.COPY;

  /**
   * The cached value of the '{@link #getOnParentVersion() <em>On Parent Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnParentVersion()
   * @generated
   * @ordered
   */
  protected Opv onParentVersion = ON_PARENT_VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #isSameNameSiblings() <em>Same Name Siblings</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSameNameSiblings()
   * @generated
   * @ordered
   */
  protected static final boolean SAME_NAME_SIBLINGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSameNameSiblings() <em>Same Name Siblings</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSameNameSiblings()
   * @generated
   * @ordered
   */
  protected boolean sameNameSiblings = SAME_NAME_SIBLINGS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CndPackage.Literals.NODE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeTypeDefinition> getRequiredTypes()
  {
    if (requiredTypes == null)
    {
      requiredTypes = new EObjectResolvingEList<NodeTypeDefinition>(NodeTypeDefinition.class, this, CndPackage.NODE_DEFINITION__REQUIRED_TYPES);
    }
    return requiredTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTypeDefinition getDefaultType()
  {
    if (defaultType != null && defaultType.eIsProxy())
    {
      InternalEObject oldDefaultType = (InternalEObject)defaultType;
      defaultType = (NodeTypeDefinition)eResolveProxy(oldDefaultType);
      if (defaultType != oldDefaultType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CndPackage.NODE_DEFINITION__DEFAULT_TYPE, oldDefaultType, defaultType));
      }
    }
    return defaultType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTypeDefinition basicGetDefaultType()
  {
    return defaultType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultType(NodeTypeDefinition newDefaultType)
  {
    NodeTypeDefinition oldDefaultType = defaultType;
    defaultType = newDefaultType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_DEFINITION__DEFAULT_TYPE, oldDefaultType, defaultType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAutocreated()
  {
    return autocreated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutocreated(boolean newAutocreated)
  {
    boolean oldAutocreated = autocreated;
    autocreated = newAutocreated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_DEFINITION__AUTOCREATED, oldAutocreated, autocreated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isManadatory()
  {
    return manadatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManadatory(boolean newManadatory)
  {
    boolean oldManadatory = manadatory;
    manadatory = newManadatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_DEFINITION__MANADATORY, oldManadatory, manadatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProtected()
  {
    return protected_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProtected(boolean newProtected)
  {
    boolean oldProtected = protected_;
    protected_ = newProtected;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_DEFINITION__PROTECTED, oldProtected, protected_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Opv getOnParentVersion()
  {
    return onParentVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnParentVersion(Opv newOnParentVersion)
  {
    Opv oldOnParentVersion = onParentVersion;
    onParentVersion = newOnParentVersion == null ? ON_PARENT_VERSION_EDEFAULT : newOnParentVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_DEFINITION__ON_PARENT_VERSION, oldOnParentVersion, onParentVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSameNameSiblings()
  {
    return sameNameSiblings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSameNameSiblings(boolean newSameNameSiblings)
  {
    boolean oldSameNameSiblings = sameNameSiblings;
    sameNameSiblings = newSameNameSiblings;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_DEFINITION__SAME_NAME_SIBLINGS, oldSameNameSiblings, sameNameSiblings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CndPackage.NODE_DEFINITION__NAME:
        return getName();
      case CndPackage.NODE_DEFINITION__REQUIRED_TYPES:
        return getRequiredTypes();
      case CndPackage.NODE_DEFINITION__DEFAULT_TYPE:
        if (resolve) return getDefaultType();
        return basicGetDefaultType();
      case CndPackage.NODE_DEFINITION__AUTOCREATED:
        return isAutocreated();
      case CndPackage.NODE_DEFINITION__MANADATORY:
        return isManadatory();
      case CndPackage.NODE_DEFINITION__PROTECTED:
        return isProtected();
      case CndPackage.NODE_DEFINITION__ON_PARENT_VERSION:
        return getOnParentVersion();
      case CndPackage.NODE_DEFINITION__SAME_NAME_SIBLINGS:
        return isSameNameSiblings();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CndPackage.NODE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case CndPackage.NODE_DEFINITION__REQUIRED_TYPES:
        getRequiredTypes().clear();
        getRequiredTypes().addAll((Collection<? extends NodeTypeDefinition>)newValue);
        return;
      case CndPackage.NODE_DEFINITION__DEFAULT_TYPE:
        setDefaultType((NodeTypeDefinition)newValue);
        return;
      case CndPackage.NODE_DEFINITION__AUTOCREATED:
        setAutocreated((Boolean)newValue);
        return;
      case CndPackage.NODE_DEFINITION__MANADATORY:
        setManadatory((Boolean)newValue);
        return;
      case CndPackage.NODE_DEFINITION__PROTECTED:
        setProtected((Boolean)newValue);
        return;
      case CndPackage.NODE_DEFINITION__ON_PARENT_VERSION:
        setOnParentVersion((Opv)newValue);
        return;
      case CndPackage.NODE_DEFINITION__SAME_NAME_SIBLINGS:
        setSameNameSiblings((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CndPackage.NODE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CndPackage.NODE_DEFINITION__REQUIRED_TYPES:
        getRequiredTypes().clear();
        return;
      case CndPackage.NODE_DEFINITION__DEFAULT_TYPE:
        setDefaultType((NodeTypeDefinition)null);
        return;
      case CndPackage.NODE_DEFINITION__AUTOCREATED:
        setAutocreated(AUTOCREATED_EDEFAULT);
        return;
      case CndPackage.NODE_DEFINITION__MANADATORY:
        setManadatory(MANADATORY_EDEFAULT);
        return;
      case CndPackage.NODE_DEFINITION__PROTECTED:
        setProtected(PROTECTED_EDEFAULT);
        return;
      case CndPackage.NODE_DEFINITION__ON_PARENT_VERSION:
        setOnParentVersion(ON_PARENT_VERSION_EDEFAULT);
        return;
      case CndPackage.NODE_DEFINITION__SAME_NAME_SIBLINGS:
        setSameNameSiblings(SAME_NAME_SIBLINGS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CndPackage.NODE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CndPackage.NODE_DEFINITION__REQUIRED_TYPES:
        return requiredTypes != null && !requiredTypes.isEmpty();
      case CndPackage.NODE_DEFINITION__DEFAULT_TYPE:
        return defaultType != null;
      case CndPackage.NODE_DEFINITION__AUTOCREATED:
        return autocreated != AUTOCREATED_EDEFAULT;
      case CndPackage.NODE_DEFINITION__MANADATORY:
        return manadatory != MANADATORY_EDEFAULT;
      case CndPackage.NODE_DEFINITION__PROTECTED:
        return protected_ != PROTECTED_EDEFAULT;
      case CndPackage.NODE_DEFINITION__ON_PARENT_VERSION:
        return onParentVersion != ON_PARENT_VERSION_EDEFAULT;
      case CndPackage.NODE_DEFINITION__SAME_NAME_SIBLINGS:
        return sameNameSiblings != SAME_NAME_SIBLINGS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", autocreated: ");
    result.append(autocreated);
    result.append(", manadatory: ");
    result.append(manadatory);
    result.append(", protected: ");
    result.append(protected_);
    result.append(", onParentVersion: ");
    result.append(onParentVersion);
    result.append(", sameNameSiblings: ");
    result.append(sameNameSiblings);
    result.append(')');
    return result.toString();
  }

} //NodeDefinitionImpl
