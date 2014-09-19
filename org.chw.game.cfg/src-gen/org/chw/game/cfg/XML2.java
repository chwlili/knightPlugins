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
 * A representation of the model object '<em><b>XML2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.cfg.XML2#getInput <em>Input</em>}</li>
 *   <li>{@link org.chw.game.cfg.XML2#getPack <em>Pack</em>}</li>
 *   <li>{@link org.chw.game.cfg.XML2#getTypes <em>Types</em>}</li>
 *   <li>{@link org.chw.game.cfg.XML2#getEnums <em>Enums</em>}</li>
 *   <li>{@link org.chw.game.cfg.XML2#getComm <em>Comm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.cfg.CfgPackage#getXML2()
 * @model
 * @generated
 */
public interface XML2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(InputDef)
   * @see org.chw.game.cfg.CfgPackage#getXML2_Input()
   * @model containment="true"
   * @generated
   */
  InputDef getInput();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.XML2#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(InputDef value);

  /**
   * Returns the value of the '<em><b>Pack</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pack</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pack</em>' containment reference.
   * @see #setPack(PackDef)
   * @see org.chw.game.cfg.CfgPackage#getXML2_Pack()
   * @model containment="true"
   * @generated
   */
  PackDef getPack();

  /**
   * Sets the value of the '{@link org.chw.game.cfg.XML2#getPack <em>Pack</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pack</em>' containment reference.
   * @see #getPack()
   * @generated
   */
  void setPack(PackDef value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.cfg.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.chw.game.cfg.CfgPackage#getXML2_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

  /**
   * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.cfg.Enum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' containment reference list.
   * @see org.chw.game.cfg.CfgPackage#getXML2_Enums()
   * @model containment="true"
   * @generated
   */
  EList<org.chw.game.cfg.Enum> getEnums();

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
   * @see org.chw.game.cfg.CfgPackage#getXML2_Comm()
   * @model containment="true"
   * @generated
   */
  EList<OtherComent> getComm();

} // XML2
