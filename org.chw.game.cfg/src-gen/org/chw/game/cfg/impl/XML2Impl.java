/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg.impl;

import java.util.Collection;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.PackDef;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;

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
 * An implementation of the model object '<em><b>XML2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.cfg.impl.XML2Impl#getPack <em>Pack</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.XML2Impl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.XML2Impl#getOtherComm <em>Other Comm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XML2Impl extends MinimalEObjectImpl.Container implements XML2
{
  /**
   * The cached value of the '{@link #getPack() <em>Pack</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPack()
   * @generated
   * @ordered
   */
  protected PackDef pack;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> types;

  /**
   * The cached value of the '{@link #getOtherComm() <em>Other Comm</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherComm()
   * @generated
   * @ordered
   */
  protected EList<String> otherComm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XML2Impl()
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
    return CfgPackage.Literals.XML2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackDef getPack()
  {
    return pack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPack(PackDef newPack, NotificationChain msgs)
  {
    PackDef oldPack = pack;
    pack = newPack;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfgPackage.XML2__PACK, oldPack, newPack);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPack(PackDef newPack)
  {
    if (newPack != pack)
    {
      NotificationChain msgs = null;
      if (pack != null)
        msgs = ((InternalEObject)pack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfgPackage.XML2__PACK, null, msgs);
      if (newPack != null)
        msgs = ((InternalEObject)newPack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfgPackage.XML2__PACK, null, msgs);
      msgs = basicSetPack(newPack, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.XML2__PACK, newPack, newPack));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<Type>(Type.class, this, CfgPackage.XML2__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOtherComm()
  {
    if (otherComm == null)
    {
      otherComm = new EDataTypeEList<String>(String.class, this, CfgPackage.XML2__OTHER_COMM);
    }
    return otherComm;
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
      case CfgPackage.XML2__PACK:
        return basicSetPack(null, msgs);
      case CfgPackage.XML2__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
      case CfgPackage.XML2__PACK:
        return getPack();
      case CfgPackage.XML2__TYPES:
        return getTypes();
      case CfgPackage.XML2__OTHER_COMM:
        return getOtherComm();
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
      case CfgPackage.XML2__PACK:
        setPack((PackDef)newValue);
        return;
      case CfgPackage.XML2__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case CfgPackage.XML2__OTHER_COMM:
        getOtherComm().clear();
        getOtherComm().addAll((Collection<? extends String>)newValue);
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
      case CfgPackage.XML2__PACK:
        setPack((PackDef)null);
        return;
      case CfgPackage.XML2__TYPES:
        getTypes().clear();
        return;
      case CfgPackage.XML2__OTHER_COMM:
        getOtherComm().clear();
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
      case CfgPackage.XML2__PACK:
        return pack != null;
      case CfgPackage.XML2__TYPES:
        return types != null && !types.isEmpty();
      case CfgPackage.XML2__OTHER_COMM:
        return otherComm != null && !otherComm.isEmpty();
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
    result.append(" (otherComm: ");
    result.append(otherComm);
    result.append(')');
    return result.toString();
  }

} //XML2Impl
