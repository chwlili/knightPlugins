/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto.impl;

import org.chw.game.ide.proto.Map;
import org.chw.game.ide.proto.MapField;
import org.chw.game.ide.proto.MapRef;
import org.chw.game.ide.proto.ProtoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.impl.MapFieldImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.impl.MapFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.impl.MapFieldImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.impl.MapFieldImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapFieldImpl extends MinimalEObjectImpl.Container implements MapField
{
  /**
   * The default value of the '{@link #getAttr() <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected static final String ATTR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected String attr = ATTR_EDEFAULT;

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
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected Map filter;

  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected MapRef links;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapFieldImpl()
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
    return ProtoPackage.Literals.MAP_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttr()
  {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(String newAttr)
  {
    String oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.MAP_FIELD__ATTR, oldAttr, attr));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.MAP_FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map getFilter()
  {
    if (filter != null && filter.eIsProxy())
    {
      InternalEObject oldFilter = (InternalEObject)filter;
      filter = (Map)eResolveProxy(oldFilter);
      if (filter != oldFilter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtoPackage.MAP_FIELD__FILTER, oldFilter, filter));
      }
    }
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map basicGetFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(Map newFilter)
  {
    Map oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.MAP_FIELD__FILTER, oldFilter, filter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapRef getLinks()
  {
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLinks(MapRef newLinks, NotificationChain msgs)
  {
    MapRef oldLinks = links;
    links = newLinks;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtoPackage.MAP_FIELD__LINKS, oldLinks, newLinks);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinks(MapRef newLinks)
  {
    if (newLinks != links)
    {
      NotificationChain msgs = null;
      if (links != null)
        msgs = ((InternalEObject)links).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtoPackage.MAP_FIELD__LINKS, null, msgs);
      if (newLinks != null)
        msgs = ((InternalEObject)newLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtoPackage.MAP_FIELD__LINKS, null, msgs);
      msgs = basicSetLinks(newLinks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.MAP_FIELD__LINKS, newLinks, newLinks));
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
      case ProtoPackage.MAP_FIELD__LINKS:
        return basicSetLinks(null, msgs);
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
      case ProtoPackage.MAP_FIELD__ATTR:
        return getAttr();
      case ProtoPackage.MAP_FIELD__NAME:
        return getName();
      case ProtoPackage.MAP_FIELD__FILTER:
        if (resolve) return getFilter();
        return basicGetFilter();
      case ProtoPackage.MAP_FIELD__LINKS:
        return getLinks();
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
      case ProtoPackage.MAP_FIELD__ATTR:
        setAttr((String)newValue);
        return;
      case ProtoPackage.MAP_FIELD__NAME:
        setName((String)newValue);
        return;
      case ProtoPackage.MAP_FIELD__FILTER:
        setFilter((Map)newValue);
        return;
      case ProtoPackage.MAP_FIELD__LINKS:
        setLinks((MapRef)newValue);
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
      case ProtoPackage.MAP_FIELD__ATTR:
        setAttr(ATTR_EDEFAULT);
        return;
      case ProtoPackage.MAP_FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProtoPackage.MAP_FIELD__FILTER:
        setFilter((Map)null);
        return;
      case ProtoPackage.MAP_FIELD__LINKS:
        setLinks((MapRef)null);
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
      case ProtoPackage.MAP_FIELD__ATTR:
        return ATTR_EDEFAULT == null ? attr != null : !ATTR_EDEFAULT.equals(attr);
      case ProtoPackage.MAP_FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProtoPackage.MAP_FIELD__FILTER:
        return filter != null;
      case ProtoPackage.MAP_FIELD__LINKS:
        return links != null;
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
    result.append(" (attr: ");
    result.append(attr);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MapFieldImpl
