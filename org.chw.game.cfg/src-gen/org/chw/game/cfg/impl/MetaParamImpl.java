/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg.impl;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.MetaParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.cfg.impl.MetaParamImpl#getFieldName <em>Field Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaParamImpl extends MinimalEObjectImpl.Container implements MetaParam
{
  /**
   * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected static final String FIELD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected String fieldName = FIELD_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetaParamImpl()
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
    return CfgPackage.Literals.META_PARAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldName()
  {
    return fieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldName(String newFieldName)
  {
    String oldFieldName = fieldName;
    fieldName = newFieldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.META_PARAM__FIELD_NAME, oldFieldName, fieldName));
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
      case CfgPackage.META_PARAM__FIELD_NAME:
        return getFieldName();
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
      case CfgPackage.META_PARAM__FIELD_NAME:
        setFieldName((String)newValue);
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
      case CfgPackage.META_PARAM__FIELD_NAME:
        setFieldName(FIELD_NAME_EDEFAULT);
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
      case CfgPackage.META_PARAM__FIELD_NAME:
        return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
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
    result.append(" (fieldName: ");
    result.append(fieldName);
    result.append(')');
    return result.toString();
  }

} //MetaParamImpl
