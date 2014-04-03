/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.Map#getBind <em>Bind</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.Map#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.ide.proto.ProtoPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends Element
{
  /**
   * Returns the value of the '<em><b>Bind</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind</em>' reference.
   * @see #setBind(MessageType)
   * @see org.chw.game.ide.proto.ProtoPackage#getMap_Bind()
   * @model
   * @generated
   */
  MessageType getBind();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.Map#getBind <em>Bind</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind</em>' reference.
   * @see #getBind()
   * @generated
   */
  void setBind(MessageType value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.ide.proto.MapField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.chw.game.ide.proto.ProtoPackage#getMap_Fields()
   * @model containment="true"
   * @generated
   */
  EList<MapField> getFields();

} // Map
