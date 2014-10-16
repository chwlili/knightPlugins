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
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.cfg.Field#getComment <em>Comment</em>}</li>
 *   <li>{@link org.chw.game.cfg.Field#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.chw.game.cfg.Field#getType <em>Type</em>}</li>
 *   <li>{@link org.chw.game.cfg.Field#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.chw.game.cfg.Field#getNodePath <em>Node Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.cfg.CfgPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
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
   * @see org.chw.game.cfg.CfgPackage#getField_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.Field#getComment <em>Comment</em>}' attribute.
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
   * @see org.chw.game.cfg.CfgPackage#getField_Meta()
   * @model containment="true"
   * @generated
   */
  EList<Meta> getMeta();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(FieldType)
   * @see org.chw.game.cfg.CfgPackage#getField_Type()
   * @model containment="true"
   * @generated
   */
  FieldType getType();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.Field#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(FieldType value);

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
   * @see org.chw.game.cfg.CfgPackage#getField_FieldName()
   * @model
   * @generated
   */
  String getFieldName();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.Field#getFieldName <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Name</em>' attribute.
   * @see #getFieldName()
   * @generated
   */
  void setFieldName(String value);

  /**
   * Returns the value of the '<em><b>Node Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Path</em>' attribute.
   * @see #setNodePath(String)
   * @see org.chw.game.cfg.CfgPackage#getField_NodePath()
   * @model
   * @generated
   */
  String getNodePath();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.Field#getNodePath <em>Node Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Path</em>' attribute.
   * @see #getNodePath()
   * @generated
   */
  void setNodePath(String value);

} // Field
