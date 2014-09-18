/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.cfg.Type#getComment <em>Comment</em>}</li>
 *   <li>{@link org.chw.game.cfg.Type#getEnter <em>Enter</em>}</li>
 *   <li>{@link org.chw.game.cfg.Type#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.chw.game.cfg.Type#getName <em>Name</em>}</li>
 *   <li>{@link org.chw.game.cfg.Type#getFields <em>Fields</em>}</li>
 *   <li>{@link org.chw.game.cfg.Type#getComm <em>Comm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.cfg.CfgPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see org.chw.game.cfg.CfgPackage#getType_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.Type#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Enter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enter</em>' containment reference.
   * @see #setEnter(Enter)
   * @see org.chw.game.cfg.CfgPackage#getType_Enter()
   * @model containment="true"
   * @generated
   */
  Enter getEnter();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.Type#getEnter <em>Enter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enter</em>' containment reference.
   * @see #getEnter()
   * @generated
   */
  void setEnter(Enter value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see org.chw.game.cfg.CfgPackage#getType_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.Type#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

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
   * @see org.chw.game.cfg.CfgPackage#getType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.Type#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.cfg.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.chw.game.cfg.CfgPackage#getType_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

  /**
   * Returns the value of the '<em><b>Comm</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.cfg.OtherComent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comm</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comm</em>' containment reference list.
   * @see org.chw.game.cfg.CfgPackage#getType_Comm()
   * @model containment="true"
   * @generated
   */
  EList<OtherComent> getComm();

} // Type
