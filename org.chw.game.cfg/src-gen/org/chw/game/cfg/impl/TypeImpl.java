/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg.impl;

import java.util.Collection;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.Meta;
import org.chw.game.cfg.OtherComent;
import org.chw.game.cfg.Type;

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
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.cfg.impl.TypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.TypeImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.TypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.TypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.TypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.chw.game.cfg.impl.TypeImpl#getComm <em>Comm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected static final String COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected String comment = COMMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeta()
   * @generated
   * @ordered
   */
  protected EList<Meta> meta;

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
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

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
  protected TypeImpl()
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
    return CfgPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComment(String newComment)
  {
    String oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.TYPE__COMMENT, oldComment, comment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Meta> getMeta()
  {
    if (meta == null)
    {
      meta = new EObjectContainmentEList<Meta>(Meta.class, this, CfgPackage.TYPE__META);
    }
    return meta;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.TYPE__PREFIX, oldPrefix, prefix));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CfgPackage.TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, CfgPackage.TYPE__FIELDS);
    }
    return fields;
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
      comm = new EObjectContainmentEList<OtherComent>(OtherComent.class, this, CfgPackage.TYPE__COMM);
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
      case CfgPackage.TYPE__META:
        return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
      case CfgPackage.TYPE__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case CfgPackage.TYPE__COMM:
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
      case CfgPackage.TYPE__COMMENT:
        return getComment();
      case CfgPackage.TYPE__META:
        return getMeta();
      case CfgPackage.TYPE__PREFIX:
        return getPrefix();
      case CfgPackage.TYPE__NAME:
        return getName();
      case CfgPackage.TYPE__FIELDS:
        return getFields();
      case CfgPackage.TYPE__COMM:
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
      case CfgPackage.TYPE__COMMENT:
        setComment((String)newValue);
        return;
      case CfgPackage.TYPE__META:
        getMeta().clear();
        getMeta().addAll((Collection<? extends Meta>)newValue);
        return;
      case CfgPackage.TYPE__PREFIX:
        setPrefix((String)newValue);
        return;
      case CfgPackage.TYPE__NAME:
        setName((String)newValue);
        return;
      case CfgPackage.TYPE__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case CfgPackage.TYPE__COMM:
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
      case CfgPackage.TYPE__COMMENT:
        setComment(COMMENT_EDEFAULT);
        return;
      case CfgPackage.TYPE__META:
        getMeta().clear();
        return;
      case CfgPackage.TYPE__PREFIX:
        setPrefix(PREFIX_EDEFAULT);
        return;
      case CfgPackage.TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CfgPackage.TYPE__FIELDS:
        getFields().clear();
        return;
      case CfgPackage.TYPE__COMM:
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
      case CfgPackage.TYPE__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
      case CfgPackage.TYPE__META:
        return meta != null && !meta.isEmpty();
      case CfgPackage.TYPE__PREFIX:
        return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
      case CfgPackage.TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CfgPackage.TYPE__FIELDS:
        return fields != null && !fields.isEmpty();
      case CfgPackage.TYPE__COMM:
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
    result.append(" (comment: ");
    result.append(comment);
    result.append(", prefix: ");
    result.append(prefix);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
