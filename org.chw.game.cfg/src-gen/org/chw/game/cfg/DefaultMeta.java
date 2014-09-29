/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.cfg.DefaultMeta#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.cfg.CfgPackage#getDefaultMeta()
 * @model
 * @generated
 */
public interface DefaultMeta extends EObject
{
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
   * @see org.chw.game.cfg.CfgPackage#getDefaultMeta_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.DefaultMeta#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

} // DefaultMeta
