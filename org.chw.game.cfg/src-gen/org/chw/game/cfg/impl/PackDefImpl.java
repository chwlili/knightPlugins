/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg.impl;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.PackDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pack Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.cfg.impl.PackDefImpl#getPackCHAR <em>Pack CHAR</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.PackDefImpl#getPack <em>Pack</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackDefImpl extends MinimalEObjectImpl.Container implements PackDef
{
  /**
   * The default value of the '{@link #getPackCHAR() <em>Pack CHAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackCHAR()
   * @generated
   * @ordered
   */
  protected static final String PACK_CHAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackCHAR() <em>Pack CHAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackCHAR()
   * @generated
   * @ordered
   */
  protected String packCHAR = PACK_CHAR_EDEFAULT;

  /**
   * The default value of the '{@link #getPack() <em>Pack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPack()
   * @generated
   * @ordered
   */
  protected static final String PACK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPack() <em>Pack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPack()
   * @generated
   * @ordered
   */
  protected String pack = PACK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackDefImpl()
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
    return CfgPackage.Literals.PACK_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackCHAR()
  {
    return packCHAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackCHAR(String newPackCHAR)
  {
    String oldPackCHAR = packCHAR;
    packCHAR = newPackCHAR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.PACK_DEF__PACK_CHAR, oldPackCHAR, packCHAR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPack()
  {
    return pack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPack(String newPack)
  {
    String oldPack = pack;
    pack = newPack;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.PACK_DEF__PACK, oldPack, pack));
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
      case CfgPackage.PACK_DEF__PACK_CHAR:
        return getPackCHAR();
      case CfgPackage.PACK_DEF__PACK:
        return getPack();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CfgPackage.PACK_DEF__PACK_CHAR:
        setPackCHAR((String)newValue);
        return;
      case CfgPackage.PACK_DEF__PACK:
        setPack((String)newValue);
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
      case CfgPackage.PACK_DEF__PACK_CHAR:
        setPackCHAR(PACK_CHAR_EDEFAULT);
        return;
      case CfgPackage.PACK_DEF__PACK:
        setPack(PACK_EDEFAULT);
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
      case CfgPackage.PACK_DEF__PACK_CHAR:
        return PACK_CHAR_EDEFAULT == null ? packCHAR != null : !PACK_CHAR_EDEFAULT.equals(packCHAR);
      case CfgPackage.PACK_DEF__PACK:
        return PACK_EDEFAULT == null ? pack != null : !PACK_EDEFAULT.equals(pack);
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
    result.append(" (packCHAR: ");
    result.append(packCHAR);
    result.append(", pack: ");
    result.append(pack);
    result.append(')');
    return result.toString();
  }

} //PackDefImpl
