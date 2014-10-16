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
 * A representation of the model object '<em><b>Enum Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.cfg.EnumField#getComment <em>Comment</em>}</li>
 *   <li>{@link org.chw.game.cfg.EnumField#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.chw.game.cfg.EnumField#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.chw.game.cfg.EnumField#getFieldValue <em>Field Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.cfg.CfgPackage#getEnumField()
 * @model
 * @generated
 */
public interface EnumField extends EObject
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
   * @see org.chw.game.cfg.CfgPackage#getEnumField_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.EnumField#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Meta</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.cfg.Meta}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' containment reference list.
   * @see org.chw.game.cfg.CfgPackage#getEnumField_Meta()
   * @model containment="true"
   * @generated
   */
  EList<Meta> getMeta();

  /**
   * Returns the value of the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Name</em>' attribute.
   * @see #setFieldName(String)
   * @see org.chw.game.cfg.CfgPackage#getEnumField_FieldName()
   * @model
   * @generated
   */
  String getFieldName();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.EnumField#getFieldName <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Name</em>' attribute.
   * @see #getFieldName()
   * @generated
   */
  void setFieldName(String value);

  /**
   * Returns the value of the '<em><b>Field Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Value</em>' attribute.
   * @see #setFieldValue(String)
   * @see org.chw.game.cfg.CfgPackage#getEnumField_FieldValue()
   * @model
   * @generated
   */
  String getFieldValue();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.EnumField#getFieldValue <em>Field Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Value</em>' attribute.
   * @see #getFieldValue()
   * @generated
   */
  void setFieldValue(String value);

} // EnumField
