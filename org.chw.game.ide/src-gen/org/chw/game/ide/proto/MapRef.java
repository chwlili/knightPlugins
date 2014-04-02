/**
 */
package org.chw.game.ide.proto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.MapRef#getLink <em>Link</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.MapRef#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.ide.proto.ProtoPackage#getMapRef()
 * @model
 * @generated
 */
public interface MapRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' reference.
   * @see #setLink(MessageField)
   * @see org.chw.game.ide.proto.ProtoPackage#getMapRef_Link()
   * @model
   * @generated
   */
  MessageField getLink();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.MapRef#getLink <em>Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' reference.
   * @see #getLink()
   * @generated
   */
  void setLink(MessageField value);

  /**
   * Returns the value of the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child</em>' containment reference.
   * @see #setChild(MapRef)
   * @see org.chw.game.ide.proto.ProtoPackage#getMapRef_Child()
   * @model containment="true"
   * @generated
   */
  MapRef getChild();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.MapRef#getChild <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child</em>' containment reference.
   * @see #getChild()
   * @generated
   */
  void setChild(MapRef value);

} // MapRef
