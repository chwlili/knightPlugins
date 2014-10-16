/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.cfg.MetaParam#getFieldName <em>Field Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.cfg.CfgPackage#getMetaParam()
 * @model
 * @generated
 */
public interface MetaParam extends EObject
{
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
   * @see org.chw.game.cfg.CfgPackage#getMetaParam_FieldName()
   * @model
   * @generated
   */
  String getFieldName();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.MetaParam#getFieldName <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Name</em>' attribute.
   * @see #getFieldName()
   * @generated
   */
  void setFieldName(String value);

} // MetaParam
