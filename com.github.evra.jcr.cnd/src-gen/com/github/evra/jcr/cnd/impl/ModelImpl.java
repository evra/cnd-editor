/**
 */
package com.github.evra.jcr.cnd.impl;

import com.github.evra.jcr.cnd.CndPackage;
import com.github.evra.jcr.cnd.Model;
import com.github.evra.jcr.cnd.NodeTypeDefinition;
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
 *   <li>{@link com.github.evra.jcr.cnd.impl.ModelImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link com.github.evra.jcr.cnd.impl.ModelImpl#getNodeTypes <em>Node Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaces()
   * @generated
   * @ordered
   */
  protected EList<NsMapping> namespaces;

  /**
   * The cached value of the '{@link #getNodeTypes() <em>Node Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeTypes()
   * @generated
   * @ordered
   */
  protected EList<NodeTypeDefinition> nodeTypes;

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
  public EList<NsMapping> getNamespaces()
  {
    if (namespaces == null)
    {
      namespaces = new EObjectContainmentEList<NsMapping>(NsMapping.class, this, CndPackage.MODEL__NAMESPACES);
    }
    return namespaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeTypeDefinition> getNodeTypes()
  {
    if (nodeTypes == null)
    {
      nodeTypes = new EObjectContainmentEList<NodeTypeDefinition>(NodeTypeDefinition.class, this, CndPackage.MODEL__NODE_TYPES);
    }
    return nodeTypes;
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
      case CndPackage.MODEL__NAMESPACES:
        return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
      case CndPackage.MODEL__NODE_TYPES:
        return ((InternalEList<?>)getNodeTypes()).basicRemove(otherEnd, msgs);
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
      case CndPackage.MODEL__NAMESPACES:
        return getNamespaces();
      case CndPackage.MODEL__NODE_TYPES:
        return getNodeTypes();
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
      case CndPackage.MODEL__NAMESPACES:
        getNamespaces().clear();
        getNamespaces().addAll((Collection<? extends NsMapping>)newValue);
        return;
      case CndPackage.MODEL__NODE_TYPES:
        getNodeTypes().clear();
        getNodeTypes().addAll((Collection<? extends NodeTypeDefinition>)newValue);
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
      case CndPackage.MODEL__NAMESPACES:
        getNamespaces().clear();
        return;
      case CndPackage.MODEL__NODE_TYPES:
        getNodeTypes().clear();
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
      case CndPackage.MODEL__NAMESPACES:
        return namespaces != null && !namespaces.isEmpty();
      case CndPackage.MODEL__NODE_TYPES:
        return nodeTypes != null && !nodeTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
