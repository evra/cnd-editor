/**
 */
package com.github.evra.jcr.cnd.impl;

import com.github.evra.jcr.cnd.CndPackage;
import com.github.evra.jcr.cnd.NodeDefinition;
import com.github.evra.jcr.cnd.NodeTypeDefinition;
import com.github.evra.jcr.cnd.PropertyDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl#getDeclaredSupertypeNames <em>Declared Supertype Names</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl#isOrderable <em>Orderable</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl#isMixin <em>Mixin</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl#isQueryable <em>Queryable</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl#isNotqueryable <em>Notqueryable</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl#getPrimaryItem <em>Primary Item</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl#getDeclaredPropertyDefinitions <em>Declared Property Definitions</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.NodeTypeDefinitionImpl#getDeclaredChildNodeDefinitions <em>Declared Child Node Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeTypeDefinitionImpl extends MinimalEObjectImpl.Container implements NodeTypeDefinition
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
   * The cached value of the '{@link #getDeclaredSupertypeNames() <em>Declared Supertype Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredSupertypeNames()
   * @generated
   * @ordered
   */
  protected EList<String> declaredSupertypeNames;

  /**
   * The default value of the '{@link #isOrderable() <em>Orderable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOrderable()
   * @generated
   * @ordered
   */
  protected static final boolean ORDERABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOrderable() <em>Orderable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOrderable()
   * @generated
   * @ordered
   */
  protected boolean orderable = ORDERABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isMixin() <em>Mixin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMixin()
   * @generated
   * @ordered
   */
  protected static final boolean MIXIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMixin() <em>Mixin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMixin()
   * @generated
   * @ordered
   */
  protected boolean mixin = MIXIN_EDEFAULT;

  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #isQueryable() <em>Queryable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQueryable()
   * @generated
   * @ordered
   */
  protected static final boolean QUERYABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isQueryable() <em>Queryable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQueryable()
   * @generated
   * @ordered
   */
  protected boolean queryable = QUERYABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isNotqueryable() <em>Notqueryable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotqueryable()
   * @generated
   * @ordered
   */
  protected static final boolean NOTQUERYABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNotqueryable() <em>Notqueryable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotqueryable()
   * @generated
   * @ordered
   */
  protected boolean notqueryable = NOTQUERYABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getPrimaryItem() <em>Primary Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryItem()
   * @generated
   * @ordered
   */
  protected static final String PRIMARY_ITEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimaryItem() <em>Primary Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryItem()
   * @generated
   * @ordered
   */
  protected String primaryItem = PRIMARY_ITEM_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeclaredPropertyDefinitions() <em>Declared Property Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredPropertyDefinitions()
   * @generated
   * @ordered
   */
  protected EList<PropertyDefinition> declaredPropertyDefinitions;

  /**
   * The cached value of the '{@link #getDeclaredChildNodeDefinitions() <em>Declared Child Node Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredChildNodeDefinitions()
   * @generated
   * @ordered
   */
  protected EList<NodeDefinition> declaredChildNodeDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeTypeDefinitionImpl()
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
    return CndPackage.Literals.NODE_TYPE_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_TYPE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDeclaredSupertypeNames()
  {
    if (declaredSupertypeNames == null)
    {
      declaredSupertypeNames = new EDataTypeEList<String>(String.class, this, CndPackage.NODE_TYPE_DEFINITION__DECLARED_SUPERTYPE_NAMES);
    }
    return declaredSupertypeNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOrderable()
  {
    return orderable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrderable(boolean newOrderable)
  {
    boolean oldOrderable = orderable;
    orderable = newOrderable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_TYPE_DEFINITION__ORDERABLE, oldOrderable, orderable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMixin()
  {
    return mixin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMixin(boolean newMixin)
  {
    boolean oldMixin = mixin;
    mixin = newMixin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_TYPE_DEFINITION__MIXIN, oldMixin, mixin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_TYPE_DEFINITION__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isQueryable()
  {
    return queryable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryable(boolean newQueryable)
  {
    boolean oldQueryable = queryable;
    queryable = newQueryable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_TYPE_DEFINITION__QUERYABLE, oldQueryable, queryable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNotqueryable()
  {
    return notqueryable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotqueryable(boolean newNotqueryable)
  {
    boolean oldNotqueryable = notqueryable;
    notqueryable = newNotqueryable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_TYPE_DEFINITION__NOTQUERYABLE, oldNotqueryable, notqueryable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimaryItem()
  {
    return primaryItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryItem(String newPrimaryItem)
  {
    String oldPrimaryItem = primaryItem;
    primaryItem = newPrimaryItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CndPackage.NODE_TYPE_DEFINITION__PRIMARY_ITEM, oldPrimaryItem, primaryItem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyDefinition> getDeclaredPropertyDefinitions()
  {
    if (declaredPropertyDefinitions == null)
    {
      declaredPropertyDefinitions = new EObjectContainmentEList<PropertyDefinition>(PropertyDefinition.class, this, CndPackage.NODE_TYPE_DEFINITION__DECLARED_PROPERTY_DEFINITIONS);
    }
    return declaredPropertyDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeDefinition> getDeclaredChildNodeDefinitions()
  {
    if (declaredChildNodeDefinitions == null)
    {
      declaredChildNodeDefinitions = new EObjectContainmentEList<NodeDefinition>(NodeDefinition.class, this, CndPackage.NODE_TYPE_DEFINITION__DECLARED_CHILD_NODE_DEFINITIONS);
    }
    return declaredChildNodeDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_PROPERTY_DEFINITIONS:
        return ((InternalEList<?>)getDeclaredPropertyDefinitions()).basicRemove(otherEnd, msgs);
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_CHILD_NODE_DEFINITIONS:
        return ((InternalEList<?>)getDeclaredChildNodeDefinitions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CndPackage.NODE_TYPE_DEFINITION__NAME:
        return getName();
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_SUPERTYPE_NAMES:
        return getDeclaredSupertypeNames();
      case CndPackage.NODE_TYPE_DEFINITION__ORDERABLE:
        return isOrderable();
      case CndPackage.NODE_TYPE_DEFINITION__MIXIN:
        return isMixin();
      case CndPackage.NODE_TYPE_DEFINITION__ABSTRACT:
        return isAbstract();
      case CndPackage.NODE_TYPE_DEFINITION__QUERYABLE:
        return isQueryable();
      case CndPackage.NODE_TYPE_DEFINITION__NOTQUERYABLE:
        return isNotqueryable();
      case CndPackage.NODE_TYPE_DEFINITION__PRIMARY_ITEM:
        return getPrimaryItem();
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_PROPERTY_DEFINITIONS:
        return getDeclaredPropertyDefinitions();
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_CHILD_NODE_DEFINITIONS:
        return getDeclaredChildNodeDefinitions();
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
      case CndPackage.NODE_TYPE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_SUPERTYPE_NAMES:
        getDeclaredSupertypeNames().clear();
        getDeclaredSupertypeNames().addAll((Collection<? extends String>)newValue);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__ORDERABLE:
        setOrderable((Boolean)newValue);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__MIXIN:
        setMixin((Boolean)newValue);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__QUERYABLE:
        setQueryable((Boolean)newValue);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__NOTQUERYABLE:
        setNotqueryable((Boolean)newValue);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__PRIMARY_ITEM:
        setPrimaryItem((String)newValue);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_PROPERTY_DEFINITIONS:
        getDeclaredPropertyDefinitions().clear();
        getDeclaredPropertyDefinitions().addAll((Collection<? extends PropertyDefinition>)newValue);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_CHILD_NODE_DEFINITIONS:
        getDeclaredChildNodeDefinitions().clear();
        getDeclaredChildNodeDefinitions().addAll((Collection<? extends NodeDefinition>)newValue);
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
      case CndPackage.NODE_TYPE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_SUPERTYPE_NAMES:
        getDeclaredSupertypeNames().clear();
        return;
      case CndPackage.NODE_TYPE_DEFINITION__ORDERABLE:
        setOrderable(ORDERABLE_EDEFAULT);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__MIXIN:
        setMixin(MIXIN_EDEFAULT);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__QUERYABLE:
        setQueryable(QUERYABLE_EDEFAULT);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__NOTQUERYABLE:
        setNotqueryable(NOTQUERYABLE_EDEFAULT);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__PRIMARY_ITEM:
        setPrimaryItem(PRIMARY_ITEM_EDEFAULT);
        return;
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_PROPERTY_DEFINITIONS:
        getDeclaredPropertyDefinitions().clear();
        return;
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_CHILD_NODE_DEFINITIONS:
        getDeclaredChildNodeDefinitions().clear();
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
      case CndPackage.NODE_TYPE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_SUPERTYPE_NAMES:
        return declaredSupertypeNames != null && !declaredSupertypeNames.isEmpty();
      case CndPackage.NODE_TYPE_DEFINITION__ORDERABLE:
        return orderable != ORDERABLE_EDEFAULT;
      case CndPackage.NODE_TYPE_DEFINITION__MIXIN:
        return mixin != MIXIN_EDEFAULT;
      case CndPackage.NODE_TYPE_DEFINITION__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case CndPackage.NODE_TYPE_DEFINITION__QUERYABLE:
        return queryable != QUERYABLE_EDEFAULT;
      case CndPackage.NODE_TYPE_DEFINITION__NOTQUERYABLE:
        return notqueryable != NOTQUERYABLE_EDEFAULT;
      case CndPackage.NODE_TYPE_DEFINITION__PRIMARY_ITEM:
        return PRIMARY_ITEM_EDEFAULT == null ? primaryItem != null : !PRIMARY_ITEM_EDEFAULT.equals(primaryItem);
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_PROPERTY_DEFINITIONS:
        return declaredPropertyDefinitions != null && !declaredPropertyDefinitions.isEmpty();
      case CndPackage.NODE_TYPE_DEFINITION__DECLARED_CHILD_NODE_DEFINITIONS:
        return declaredChildNodeDefinitions != null && !declaredChildNodeDefinitions.isEmpty();
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
    result.append(", declaredSupertypeNames: ");
    result.append(declaredSupertypeNames);
    result.append(", orderable: ");
    result.append(orderable);
    result.append(", mixin: ");
    result.append(mixin);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(", queryable: ");
    result.append(queryable);
    result.append(", notqueryable: ");
    result.append(notqueryable);
    result.append(", primaryItem: ");
    result.append(primaryItem);
    result.append(')');
    return result.toString();
  }

} //NodeTypeDefinitionImpl
