/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg.impl;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Enter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.cfg.impl.EnterImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.EnterImpl#getRootPath <em>Root Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnterImpl extends MinimalEObjectImpl.Container implements Enter
{
  /**
   * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected String prefix = PREFIX_EDEFAULT;

  /**
   * The default value of the '{@link #getRootPath() <em>Root Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootPath()
   * @generated
   * @ordered
   */
  protected static final String ROOT_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRootPath() <em>Root Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootPath()
   * @generated
   * @ordered
   */
  protected String rootPath = ROOT_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnterImpl()
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
    return CfgPackage.Literals.ENTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(String newPrefix)
  {
    String oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.ENTER__PREFIX, oldPrefix, prefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRootPath()
  {
    return rootPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootPath(String newRootPath)
  {
    String oldRootPath = rootPath;
    rootPath = newRootPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.ENTER__ROOT_PATH, oldRootPath, rootPath));
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
      case CfgPackage.ENTER__PREFIX:
        return getPrefix();
      case CfgPackage.ENTER__ROOT_PATH:
        return getRootPath();
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
      case CfgPackage.ENTER__PREFIX:
        setPrefix((String)newValue);
        return;
      case CfgPackage.ENTER__ROOT_PATH:
        setRootPath((String)newValue);
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
      case CfgPackage.ENTER__PREFIX:
        setPrefix(PREFIX_EDEFAULT);
        return;
      case CfgPackage.ENTER__ROOT_PATH:
        setRootPath(ROOT_PATH_EDEFAULT);
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
      case CfgPackage.ENTER__PREFIX:
        return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
      case CfgPackage.ENTER__ROOT_PATH:
        return ROOT_PATH_EDEFAULT == null ? rootPath != null : !ROOT_PATH_EDEFAULT.equals(rootPath);
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
    result.append(" (prefix: ");
    result.append(prefix);
    result.append(", rootPath: ");
    result.append(rootPath);
    result.append(')');
    return result.toString();
  }

} //EnterImpl
