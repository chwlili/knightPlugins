/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.cfg.Param#getParamName <em>Param Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.cfg.CfgPackage#getParam()
 * @model
 * @generated
 */
public interface Param extends EObject
{
  /**
   * Returns the value of the '<em><b>Param Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Name</em>' attribute.
   * @see #setParamName(String)
   * @see org.chw.game.cfg.CfgPackage#getParam_ParamName()
   * @model
   * @generated
   */
  String getParamName();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.Param#getParamName <em>Param Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param Name</em>' attribute.
   * @see #getParamName()
   * @generated
   */
  void setParamName(String value);

} // Param
