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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.cfg.impl.XML2Impl#getInput <em>Input</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.XML2Impl#getPack <em>Pack</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.XML2Impl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.XML2Impl#getEnums <em>Enums</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.XML2Impl#getComm <em>Comm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XML2Impl extends MinimalEObjectImpl.Container implements XML2
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected InputDef input;

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
   * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnums()
   * @generated
   * @ordered
   */
  protected EList<org.chw.game.cfg.Enum> enums;

  /**
   * The cached value of the '{@link #getComm() <em>Comm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComm()
   * @generated
   * @ordered
   */
  protected EList<OtherComent> comm;

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
  public InputDef getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(InputDef newInput, NotificationChain msgs)
  {
    InputDef oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfgPackage.XML2__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(InputDef newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfgPackage.XML2__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfgPackage.XML2__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.XML2__INPUT, newInput, newInput));
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
  public EList<org.chw.game.cfg.Enum> getEnums()
  {
    if (enums == null)
    {
      enums = new EObjectContainmentEList<org.chw.game.cfg.Enum>(org.chw.game.cfg.Enum.class, this, CfgPackage.XML2__ENUMS);
    }
    return enums;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OtherComent> getComm()
  {
    if (comm == null)
    {
      comm = new EObjectContainmentEList<OtherComent>(OtherComent.class, this, CfgPackage.XML2__COMM);
    }
    return comm;
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
      case CfgPackage.XML2__INPUT:
        return basicSetInput(null, msgs);
      case CfgPackage.XML2__PACK:
        return basicSetPack(null, msgs);
      case CfgPackage.XML2__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case CfgPackage.XML2__ENUMS:
        return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
      case CfgPackage.XML2__COMM:
        return ((InternalEList<?>)getComm()).basicRemove(otherEnd, msgs);
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
      case CfgPackage.XML2__INPUT:
        return getInput();
      case CfgPackage.XML2__PACK:
        return getPack();
      case CfgPackage.XML2__TYPES:
        return getTypes();
      case CfgPackage.XML2__ENUMS:
        return getEnums();
      case CfgPackage.XML2__COMM:
        return getComm();
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
      case CfgPackage.XML2__INPUT:
        setInput((InputDef)newValue);
        return;
      case CfgPackage.XML2__PACK:
        setPack((PackDef)newValue);
        return;
      case CfgPackage.XML2__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case CfgPackage.XML2__ENUMS:
        getEnums().clear();
        getEnums().addAll((Collection<? extends org.chw.game.cfg.Enum>)newValue);
        return;
      case CfgPackage.XML2__COMM:
        getComm().clear();
        getComm().addAll((Collection<? extends OtherComent>)newValue);
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
      case CfgPackage.XML2__INPUT:
        setInput((InputDef)null);
        return;
      case CfgPackage.XML2__PACK:
        setPack((PackDef)null);
        return;
      case CfgPackage.XML2__TYPES:
        getTypes().clear();
        return;
      case CfgPackage.XML2__ENUMS:
        getEnums().clear();
        return;
      case CfgPackage.XML2__COMM:
        getComm().clear();
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
      case CfgPackage.XML2__INPUT:
        return input != null;
      case CfgPackage.XML2__PACK:
        return pack != null;
      case CfgPackage.XML2__TYPES:
        return types != null && !types.isEmpty();
      case CfgPackage.XML2__ENUMS:
        return enums != null && !enums.isEmpty();
      case CfgPackage.XML2__COMM:
        return comm != null && !comm.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //XML2Impl
