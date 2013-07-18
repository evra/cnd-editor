/**
 */
package com.github.evra.jcr.cnd.impl;

import com.github.evra.jcr.cnd.CndPackage;
import com.github.evra.jcr.cnd.Model;
import com.github.evra.jcr.cnd.NodeTypeDef;
import com.github.evra.jcr.cnd.NsMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.evra.jcr.cnd.impl.ModelImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.ModelImpl#getNodetypes <em>Nodetypes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappings()
   * @generated
   * @ordered
   */
  protected EList<NsMapping> mappings;

  /**
   * The cached value of the '{@link #getNodetypes() <em>Nodetypes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodetypes()
   * @generated
   * @ordered
   */
  protected EList<NodeTypeDef> nodetypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return CndPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NsMapping> getMappings()
  {
    if (mappings == null)
    {
      mappings = new EObjectContainmentEList<NsMapping>(NsMapping.class, this, CndPackage.MODEL__MAPPINGS);
    }
    return mappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeTypeDef> getNodetypes()
  {
    if (nodetypes == null)
    {
      nodetypes = new EObjectContainmentEList<NodeTypeDef>(NodeTypeDef.class, this, CndPackage.MODEL__NODETYPES);
    }
    return nodetypes;
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
      case CndPackage.MODEL__MAPPINGS:
        return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
      case CndPackage.MODEL__NODETYPES:
        return ((InternalEList<?>)getNodetypes()).basicRemove(otherEnd, msgs);
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
      case CndPackage.MODEL__MAPPINGS:
        return getMappings();
      case CndPackage.MODEL__NODETYPES:
        return getNodetypes();
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
      case CndPackage.MODEL__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends NsMapping>)newValue);
        return;
      case CndPackage.MODEL__NODETYPES:
        getNodetypes().clear();
        getNodetypes().addAll((Collection<? extends NodeTypeDef>)newValue);
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
      case CndPackage.MODEL__MAPPINGS:
        getMappings().clear();
        return;
      case CndPackage.MODEL__NODETYPES:
        getNodetypes().clear();
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
      case CndPackage.MODEL__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
      case CndPackage.MODEL__NODETYPES:
        return nodetypes != null && !nodetypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
