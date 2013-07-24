/**
 */
package com.github.evra.jcr.cnd.impl;

import com.github.evra.jcr.cnd.CndPackage;
import com.github.evra.jcr.cnd.Opv;
import com.github.evra.jcr.cnd.PropertyDefinition;
import com.github.evra.jcr.cnd.PropertyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#getDefaultValues <em>Default Values</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#isAutocreated <em>Autocreated</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#isProtected <em>Protected</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#getOnParentVersion <em>On Parent Version</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#getQueryOps <em>Query Ops</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#isNoFullText <em>No Full Text</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#isNoQueryOrder <em>No Query Order</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#isPrimary <em>Primary</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.PropertyDefinitionImpl#getValueConstraints <em>Value Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyDefinitionImpl extends MinimalEObjectImpl.Container implements PropertyDefinition
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final PropertyType TYPE_EDEFAULT = PropertyType.UNDEFINED;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected PropertyType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefaultValues() <em>Default Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValues()
   * @generated
   * @ordered
   */
  protected EList<String> defaultValues;

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
   * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMandatory()
   * @generated
   * @ordered
   */
  protected static final boolean MANDATORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMandatory()
   * @generated
   * @ordered
   */
  protected boolean mandatory = MANDATORY_EDEFAULT;

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
   * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected static final boolean MULTIPLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected boolean multiple = MULTIPLE_EDEFAULT;

  /**
   * The default value of the '{@link #getQueryOps() <em>Query Ops</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryOps()
   * @generated
   * @ordered
   */
  protected static final String QUERY_OPS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQueryOps() <em>Query Ops</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryOps()
   * @generated
   * @ordered
   */
  protected String queryOps = QUERY_OPS_EDEFAULT;

  /**
   * The default value of the '{@link #isNoFullText() <em>No Full Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoFullText()
   * @generated
   * @ordered
   */
  protected static final boolean NO_FULL_TEXT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoFullText() <em>No Full Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoFullText()
   * @generated
   * @ordered
   */
  protected boolean noFullText = NO_FULL_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #isNoQueryOrder() <em>No Query Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoQueryOrder()
   * @generated
   * @ordered
   */
  protected static final boolean NO_QUERY_ORDER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoQueryOrder() <em>No Query Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoQueryOrder()
   * @generated
   * @ordered
   */
  protected boolean noQueryOrder = NO_QUERY_ORDER_EDEFAULT;

  /**
   * The default value of the '{@link #isPrimary() <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrimary()
   * @generated
   * @ordered
   */
  protected static final boolean PRIMARY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrimary() <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrimary()
   * @generated
   * @ordered
   */
  protected boolean primary = PRIMARY_EDEFAULT;

  /**
   * The cached value of the '{@link #getValueConstraints() <em>Value Constraints</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueConstraints()
   * @generated
   * @ordered
   */
  protected EList<String> valueConstraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyDefinitionImpl()
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
    return CndPackage.Literals.PROPERTY_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(PropertyType newType)
  {
    PropertyType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDefaultValues()
  {
    if (defaultValues == null)
    {
      defaultValues = new EDataTypeEList<String>(String.class, this, CndPackage.PROPERTY_DEFINITION__DEFAULT_VALUES);
    }
    return defaultValues;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__AUTOCREATED, oldAutocreated, autocreated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMandatory()
  {
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMandatory(boolean newMandatory)
  {
    boolean oldMandatory = mandatory;
    mandatory = newMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__MANDATORY, oldMandatory, mandatory));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__PROTECTED, oldProtected, protected_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__ON_PARENT_VERSION, oldOnParentVersion, onParentVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiple()
  {
    return multiple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiple(boolean newMultiple)
  {
    boolean oldMultiple = multiple;
    multiple = newMultiple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__MULTIPLE, oldMultiple, multiple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQueryOps()
  {
    return queryOps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryOps(String newQueryOps)
  {
    String oldQueryOps = queryOps;
    queryOps = newQueryOps;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__QUERY_OPS, oldQueryOps, queryOps));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoFullText()
  {
    return noFullText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoFullText(boolean newNoFullText)
  {
    boolean oldNoFullText = noFullText;
    noFullText = newNoFullText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__NO_FULL_TEXT, oldNoFullText, noFullText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoQueryOrder()
  {
    return noQueryOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoQueryOrder(boolean newNoQueryOrder)
  {
    boolean oldNoQueryOrder = noQueryOrder;
    noQueryOrder = newNoQueryOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__NO_QUERY_ORDER, oldNoQueryOrder, noQueryOrder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrimary()
  {
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimary(boolean newPrimary)
  {
    boolean oldPrimary = primary;
    primary = newPrimary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.PROPERTY_DEFINITION__PRIMARY, oldPrimary, primary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getValueConstraints()
  {
    if (valueConstraints == null)
    {
      valueConstraints = new EDataTypeEList<String>(String.class, this, CndPackage.PROPERTY_DEFINITION__VALUE_CONSTRAINTS);
    }
    return valueConstraints;
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
      case CndPackage.PROPERTY_DEFINITION__NAME:
        return getName();
      case CndPackage.PROPERTY_DEFINITION__TYPE:
        return getType();
      case CndPackage.PROPERTY_DEFINITION__DEFAULT_VALUES:
        return getDefaultValues();
      case CndPackage.PROPERTY_DEFINITION__AUTOCREATED:
        return isAutocreated();
      case CndPackage.PROPERTY_DEFINITION__MANDATORY:
        return isMandatory();
      case CndPackage.PROPERTY_DEFINITION__PROTECTED:
        return isProtected();
      case CndPackage.PROPERTY_DEFINITION__ON_PARENT_VERSION:
        return getOnParentVersion();
      case CndPackage.PROPERTY_DEFINITION__MULTIPLE:
        return isMultiple();
      case CndPackage.PROPERTY_DEFINITION__QUERY_OPS:
        return getQueryOps();
      case CndPackage.PROPERTY_DEFINITION__NO_FULL_TEXT:
        return isNoFullText();
      case CndPackage.PROPERTY_DEFINITION__NO_QUERY_ORDER:
        return isNoQueryOrder();
      case CndPackage.PROPERTY_DEFINITION__PRIMARY:
        return isPrimary();
      case CndPackage.PROPERTY_DEFINITION__VALUE_CONSTRAINTS:
        return getValueConstraints();
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
      case CndPackage.PROPERTY_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__TYPE:
        setType((PropertyType)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__DEFAULT_VALUES:
        getDefaultValues().clear();
        getDefaultValues().addAll((Collection<? extends String>)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__AUTOCREATED:
        setAutocreated((Boolean)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__MANDATORY:
        setMandatory((Boolean)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__PROTECTED:
        setProtected((Boolean)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__ON_PARENT_VERSION:
        setOnParentVersion((Opv)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__MULTIPLE:
        setMultiple((Boolean)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__QUERY_OPS:
        setQueryOps((String)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__NO_FULL_TEXT:
        setNoFullText((Boolean)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__NO_QUERY_ORDER:
        setNoQueryOrder((Boolean)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__PRIMARY:
        setPrimary((Boolean)newValue);
        return;
      case CndPackage.PROPERTY_DEFINITION__VALUE_CONSTRAINTS:
        getValueConstraints().clear();
        getValueConstraints().addAll((Collection<? extends String>)newValue);
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
      case CndPackage.PROPERTY_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__DEFAULT_VALUES:
        getDefaultValues().clear();
        return;
      case CndPackage.PROPERTY_DEFINITION__AUTOCREATED:
        setAutocreated(AUTOCREATED_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__MANDATORY:
        setMandatory(MANDATORY_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__PROTECTED:
        setProtected(PROTECTED_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__ON_PARENT_VERSION:
        setOnParentVersion(ON_PARENT_VERSION_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__MULTIPLE:
        setMultiple(MULTIPLE_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__QUERY_OPS:
        setQueryOps(QUERY_OPS_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__NO_FULL_TEXT:
        setNoFullText(NO_FULL_TEXT_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__NO_QUERY_ORDER:
        setNoQueryOrder(NO_QUERY_ORDER_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__PRIMARY:
        setPrimary(PRIMARY_EDEFAULT);
        return;
      case CndPackage.PROPERTY_DEFINITION__VALUE_CONSTRAINTS:
        getValueConstraints().clear();
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
      case CndPackage.PROPERTY_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CndPackage.PROPERTY_DEFINITION__TYPE:
        return type != TYPE_EDEFAULT;
      case CndPackage.PROPERTY_DEFINITION__DEFAULT_VALUES:
        return defaultValues != null && !defaultValues.isEmpty();
      case CndPackage.PROPERTY_DEFINITION__AUTOCREATED:
        return autocreated != AUTOCREATED_EDEFAULT;
      case CndPackage.PROPERTY_DEFINITION__MANDATORY:
        return mandatory != MANDATORY_EDEFAULT;
      case CndPackage.PROPERTY_DEFINITION__PROTECTED:
        return protected_ != PROTECTED_EDEFAULT;
      case CndPackage.PROPERTY_DEFINITION__ON_PARENT_VERSION:
        return onParentVersion != ON_PARENT_VERSION_EDEFAULT;
      case CndPackage.PROPERTY_DEFINITION__MULTIPLE:
        return multiple != MULTIPLE_EDEFAULT;
      case CndPackage.PROPERTY_DEFINITION__QUERY_OPS:
        return QUERY_OPS_EDEFAULT == null ? queryOps != null : !QUERY_OPS_EDEFAULT.equals(queryOps);
      case CndPackage.PROPERTY_DEFINITION__NO_FULL_TEXT:
        return noFullText != NO_FULL_TEXT_EDEFAULT;
      case CndPackage.PROPERTY_DEFINITION__NO_QUERY_ORDER:
        return noQueryOrder != NO_QUERY_ORDER_EDEFAULT;
      case CndPackage.PROPERTY_DEFINITION__PRIMARY:
        return primary != PRIMARY_EDEFAULT;
      case CndPackage.PROPERTY_DEFINITION__VALUE_CONSTRAINTS:
        return valueConstraints != null && !valueConstraints.isEmpty();
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
    result.append(", type: ");
    result.append(type);
    result.append(", defaultValues: ");
    result.append(defaultValues);
    result.append(", autocreated: ");
    result.append(autocreated);
    result.append(", mandatory: ");
    result.append(mandatory);
    result.append(", protected: ");
    result.append(protected_);
    result.append(", onParentVersion: ");
    result.append(onParentVersion);
    result.append(", multiple: ");
    result.append(multiple);
    result.append(", queryOps: ");
    result.append(queryOps);
    result.append(", noFullText: ");
    result.append(noFullText);
    result.append(", noQueryOrder: ");
    result.append(noQueryOrder);
    result.append(", primary: ");
    result.append(primary);
    result.append(", valueConstraints: ");
    result.append(valueConstraints);
    result.append(')');
    return result.toString();
  }

} //PropertyDefinitionImpl
