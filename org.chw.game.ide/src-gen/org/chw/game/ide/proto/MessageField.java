/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.MessageField#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.MessageField#getName <em>Name</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.MessageField#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.ide.proto.ProtoPackage#getMessageField()
 * @model
 * @generated
 */
public interface MessageField extends EObject
{
  /**
   * Returns the value of the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' attribute.
   * @see #setAttr(String)
   * @see org.chw.game.ide.proto.ProtoPackage#getMessageField_Attr()
   * @model
   * @generated
   */
  String getAttr();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.MessageField#getAttr <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' attribute.
   * @see #getAttr()
   * @generated
   */
  void setAttr(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.chw.game.ide.proto.ProtoPackage#getMessageField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.MessageField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see org.chw.game.ide.proto.ProtoPackage#getMessageField_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.MessageField#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

} // MessageField
