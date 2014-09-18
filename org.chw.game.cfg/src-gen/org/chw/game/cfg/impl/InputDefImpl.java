/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg.impl;

import java.util.Collection;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.InputDef;
import org.chw.game.cfg.OtherComent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.cfg.impl.InputDefImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.InputDefImpl#getInputCHAR <em>Input CHAR</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.InputDefImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputDefImpl extends MinimalEObjectImpl.Container implements InputDef
{
  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected EList<OtherComent> comment;

  /**
   * The default value of the '{@link #getInputCHAR() <em>Input CHAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputCHAR()
   * @generated
   * @ordered
   */
  protected static final String INPUT_CHAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInputCHAR() <em>Input CHAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputCHAR()
   * @generated
   * @ordered
   */
  protected String inputCHAR = INPUT_CHAR_EDEFAULT;

  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputDefImpl()
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
    return CfgPackage.Literals.INPUT_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OtherComent> getComment()
  {
    if (comment == null)
    {
      comment = new EObjectContainmentEList<OtherComent>(OtherComent.class, this, CfgPackage.INPUT_DEF__COMMENT);
    }
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInputCHAR()
  {
    return inputCHAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputCHAR(String newInputCHAR)
  {
    String oldInputCHAR = inputCHAR;
    inputCHAR = newInputCHAR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.INPUT_DEF__INPUT_CHAR, oldInputCHAR, inputCHAR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.INPUT_DEF__URL, oldUrl, url));
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
      case CfgPackage.INPUT_DEF__COMMENT:
        return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
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
      case CfgPackage.INPUT_DEF__COMMENT:
        return getComment();
      case CfgPackage.INPUT_DEF__INPUT_CHAR:
        return getInputCHAR();
      case CfgPackage.INPUT_DEF__URL:
        return getUrl();
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
      case CfgPackage.INPUT_DEF__COMMENT:
        getComment().clear();
        getComment().addAll((Collection<? extends OtherComent>)newValue);
        return;
      case CfgPackage.INPUT_DEF__INPUT_CHAR:
        setInputCHAR((String)newValue);
        return;
      case CfgPackage.INPUT_DEF__URL:
        setUrl((String)newValue);
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
      case CfgPackage.INPUT_DEF__COMMENT:
        getComment().clear();
        return;
      case CfgPackage.INPUT_DEF__INPUT_CHAR:
        setInputCHAR(INPUT_CHAR_EDEFAULT);
        return;
      case CfgPackage.INPUT_DEF__URL:
        setUrl(URL_EDEFAULT);
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
      case CfgPackage.INPUT_DEF__COMMENT:
        return comment != null && !comment.isEmpty();
      case CfgPackage.INPUT_DEF__INPUT_CHAR:
        return INPUT_CHAR_EDEFAULT == null ? inputCHAR != null : !INPUT_CHAR_EDEFAULT.equals(inputCHAR);
      case CfgPackage.INPUT_DEF__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
    result.append(" (inputCHAR: ");
    result.append(inputCHAR);
    result.append(", url: ");
    result.append(url);
    result.append(')');
    return result.toString();
  }

} //InputDefImpl
