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
 * A representation of the model object '<em><b>Input Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.cfg.InputDef#getComment <em>Comment</em>}</li>
 *   <li>{@link org.chw.game.cfg.InputDef#getInputCHAR <em>Input CHAR</em>}</li>
 *   <li>{@link org.chw.game.cfg.InputDef#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.cfg.CfgPackage#getInputDef()
 * @model
 * @generated
 */
public interface InputDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.cfg.OtherComent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' containment reference list.
   * @see org.chw.game.cfg.CfgPackage#getInputDef_Comment()
   * @model containment="true"
   * @generated
   */
  EList<OtherComent> getComment();

  /**
   * Returns the value of the '<em><b>Input CHAR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input CHAR</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input CHAR</em>' attribute.
   * @see #setInputCHAR(String)
   * @see org.chw.game.cfg.CfgPackage#getInputDef_InputCHAR()
   * @model
   * @generated
   */
  String getInputCHAR();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.InputDef#getInputCHAR <em>Input CHAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input CHAR</em>' attribute.
   * @see #getInputCHAR()
   * @generated
   */
  void setInputCHAR(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.chw.game.cfg.CfgPackage#getInputDef_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.InputDef#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

} // InputDef
