/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto.impl;

import java.util.Collection;

import org.chw.game.ide.proto.Map;
import org.chw.game.ide.proto.MapField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.proto.ProtoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.impl.MapImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.impl.MapImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapImpl extends ElementImpl implements Map
{
  /**
   * The cached value of the '{@link #getBind() <em>Bind</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBind()
   * @generated
   * @ordered
   */
  protected MessageType bind;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<MapField> fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapImpl()
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
    return ProtoPackage.Literals.MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageType getBind()
  {
    if (bind != null && bind.eIsProxy())
    {
      InternalEObject oldBind = (InternalEObject)bind;
      bind = (MessageType)eResolveProxy(oldBind);
      if (bind != oldBind)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtoPackage.MAP__BIND, oldBind, bind));
      }
    }
    return bind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageType basicGetBind()
  {
    return bind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBind(MessageType newBind)
  {
    MessageType oldBind = bind;
    bind = newBind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.MAP__BIND, oldBind, bind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MapField> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<MapField>(MapField.class, this, ProtoPackage.MAP__FIELDS);
    }
    return fields;
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
      case ProtoPackage.MAP__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case ProtoPackage.MAP__BIND:
        if (resolve) return getBind();
        return basicGetBind();
      case ProtoPackage.MAP__FIELDS:
        return getFields();
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
      case ProtoPackage.MAP__BIND:
        setBind((MessageType)newValue);
        return;
      case ProtoPackage.MAP__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends MapField>)newValue);
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
      case ProtoPackage.MAP__BIND:
        setBind((MessageType)null);
        return;
      case ProtoPackage.MAP__FIELDS:
        getFields().clear();
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
      case ProtoPackage.MAP__BIND:
        return bind != null;
      case ProtoPackage.MAP__FIELDS:
        return fields != null && !fields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MapImpl
