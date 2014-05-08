/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto.impl;

import org.chw.game.ide.proto.MapRef;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.ProtoPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.impl.MapRefImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.impl.MapRefImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapRefImpl extends MinimalEObjectImpl.Container implements MapRef
{
  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected MessageField link;

  /**
   * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChild()
   * @generated
   * @ordered
   */
  protected MapRef child;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapRefImpl()
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
    return ProtoPackage.Literals.MAP_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageField getLink()
  {
    if (link != null && link.eIsProxy())
    {
      InternalEObject oldLink = (InternalEObject)link;
      link = (MessageField)eResolveProxy(oldLink);
      if (link != oldLink)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtoPackage.MAP_REF__LINK, oldLink, link));
      }
    }
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageField basicGetLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(MessageField newLink)
  {
    MessageField oldLink = link;
    link = newLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.MAP_REF__LINK, oldLink, link));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapRef getChild()
  {
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChild(MapRef newChild, NotificationChain msgs)
  {
    MapRef oldChild = child;
    child = newChild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtoPackage.MAP_REF__CHILD, oldChild, newChild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChild(MapRef newChild)
  {
    if (newChild != child)
    {
      NotificationChain msgs = null;
      if (child != null)
        msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtoPackage.MAP_REF__CHILD, null, msgs);
      if (newChild != null)
        msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtoPackage.MAP_REF__CHILD, null, msgs);
      msgs = basicSetChild(newChild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.MAP_REF__CHILD, newChild, newChild));
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
      case ProtoPackage.MAP_REF__CHILD:
        return basicSetChild(null, msgs);
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
      case ProtoPackage.MAP_REF__LINK:
        if (resolve) return getLink();
        return basicGetLink();
      case ProtoPackage.MAP_REF__CHILD:
        return getChild();
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
      case ProtoPackage.MAP_REF__LINK:
        setLink((MessageField)newValue);
        return;
      case ProtoPackage.MAP_REF__CHILD:
        setChild((MapRef)newValue);
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
      case ProtoPackage.MAP_REF__LINK:
        setLink((MessageField)null);
        return;
      case ProtoPackage.MAP_REF__CHILD:
        setChild((MapRef)null);
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
      case ProtoPackage.MAP_REF__LINK:
        return link != null;
      case ProtoPackage.MAP_REF__CHILD:
        return child != null;
    }
    return super.eIsSet(featureID);
  }

} //MapRefImpl
