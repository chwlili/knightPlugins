/**
 */
package org.chw.game.ide.proto.impl;

import java.util.Collection;

import org.chw.game.ide.proto.Comment_ALL;
import org.chw.game.ide.proto.Element;
import org.chw.game.ide.proto.ImportInfo;
import org.chw.game.ide.proto.Model;
import org.chw.game.ide.proto.OptionInfo;
import org.chw.game.ide.proto.ProtoPackage;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.impl.ModelImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.impl.ModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.impl.ModelImpl#getComm <em>Comm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportInfo> imports;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<OptionInfo> options;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Element> elements;

  /**
   * The cached value of the '{@link #getComm() <em>Comm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComm()
   * @generated
   * @ordered
   */
  protected EList<Comment_ALL> comm;

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
    return ProtoPackage.Literals.MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportInfo> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportInfo>(ImportInfo.class, this, ProtoPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OptionInfo> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<OptionInfo>(OptionInfo.class, this, ProtoPackage.MODEL__OPTIONS);
    }
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Element>(Element.class, this, ProtoPackage.MODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comment_ALL> getComm()
  {
    if (comm == null)
    {
      comm = new EObjectContainmentEList<Comment_ALL>(Comment_ALL.class, this, ProtoPackage.MODEL__COMM);
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
      case ProtoPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case ProtoPackage.MODEL__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
      case ProtoPackage.MODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case ProtoPackage.MODEL__COMM:
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
      case ProtoPackage.MODEL__NAME:
        return getName();
      case ProtoPackage.MODEL__IMPORTS:
        return getImports();
      case ProtoPackage.MODEL__OPTIONS:
        return getOptions();
      case ProtoPackage.MODEL__ELEMENTS:
        return getElements();
      case ProtoPackage.MODEL__COMM:
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
      case ProtoPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case ProtoPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportInfo>)newValue);
        return;
      case ProtoPackage.MODEL__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends OptionInfo>)newValue);
        return;
      case ProtoPackage.MODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
        return;
      case ProtoPackage.MODEL__COMM:
        getComm().clear();
        getComm().addAll((Collection<? extends Comment_ALL>)newValue);
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
      case ProtoPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProtoPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case ProtoPackage.MODEL__OPTIONS:
        getOptions().clear();
        return;
      case ProtoPackage.MODEL__ELEMENTS:
        getElements().clear();
        return;
      case ProtoPackage.MODEL__COMM:
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
      case ProtoPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProtoPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case ProtoPackage.MODEL__OPTIONS:
        return options != null && !options.isEmpty();
      case ProtoPackage.MODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case ProtoPackage.MODEL__COMM:
        return comm != null && !comm.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ModelImpl
