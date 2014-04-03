/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.MessageType#getFields <em>Fields</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.MessageType#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.ide.proto.ProtoPackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType extends Type
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.ide.proto.MessageField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.chw.game.ide.proto.ProtoPackage#getMessageType_Fields()
   * @model containment="true"
   * @generated
   */
  EList<MessageField> getFields();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.ide.proto.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.chw.game.ide.proto.ProtoPackage#getMessageType_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

} // MessageType
