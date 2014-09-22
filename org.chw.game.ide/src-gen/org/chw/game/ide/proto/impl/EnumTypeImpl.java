/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto.impl;

import java.util.Collection;

import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.EnumFieldOpt;
import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.ProtoPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.impl.EnumTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.impl.EnumTypeImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumTypeImpl extends TypeImpl implements EnumType
{
  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<EnumField> fields;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<EnumFieldOpt> options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumTypeImpl()
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
    return ProtoPackage.Literals.ENUM_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumField> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<EnumField>(EnumField.class, this, ProtoPackage.ENUM_TYPE__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumFieldOpt> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<EnumFieldOpt>(EnumFieldOpt.class, this, ProtoPackage.ENUM_TYPE__OPTIONS);
    }
    return options;
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
      case ProtoPackage.ENUM_TYPE__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case ProtoPackage.ENUM_TYPE__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
      case ProtoPackage.ENUM_TYPE__FIELDS:
        return getFields();
      case ProtoPackage.ENUM_TYPE__OPTIONS:
        return getOptions();
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
      case ProtoPackage.ENUM_TYPE__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends EnumField>)newValue);
        return;
      case ProtoPackage.ENUM_TYPE__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends EnumFieldOpt>)newValue);
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
      case ProtoPackage.ENUM_TYPE__FIELDS:
        getFields().clear();
        return;
      case ProtoPackage.ENUM_TYPE__OPTIONS:
        getOptions().clear();
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
      case ProtoPackage.ENUM_TYPE__FIELDS:
        return fields != null && !fields.isEmpty();
      case ProtoPackage.ENUM_TYPE__OPTIONS:
        return options != null && !options.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnumTypeImpl
