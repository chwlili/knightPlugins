/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pack Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.cfg.PackDef#getPackCHAR <em>Pack CHAR</em>}</li>
 *   <li>{@link org.chw.game.cfg.PackDef#getPack <em>Pack</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.cfg.CfgPackage#getPackDef()
 * @model
 * @generated
 */
public interface PackDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Pack CHAR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pack CHAR</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pack CHAR</em>' attribute.
   * @see #setPackCHAR(String)
   * @see org.chw.game.cfg.CfgPackage#getPackDef_PackCHAR()
   * @model
   * @generated
   */
  String getPackCHAR();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.PackDef#getPackCHAR <em>Pack CHAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pack CHAR</em>' attribute.
   * @see #getPackCHAR()
   * @generated
   */
  void setPackCHAR(String value);

  /**
   * Returns the value of the '<em><b>Pack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pack</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pack</em>' attribute.
   * @see #setPack(String)
   * @see org.chw.game.cfg.CfgPackage#getPackDef_Pack()
   * @model
   * @generated
   */
  String getPack();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.PackDef#getPack <em>Pack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pack</em>' attribute.
   * @see #getPack()
   * @generated
   */
  void setPack(String value);

} // PackDef
