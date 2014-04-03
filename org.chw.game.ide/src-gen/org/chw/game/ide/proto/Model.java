/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.Model#getOptions <em>Options</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.Model#getComm <em>Comm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.ide.proto.ProtoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
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
   * @see org.chw.game.ide.proto.ProtoPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.ide.proto.ImportInfo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.chw.game.ide.proto.ProtoPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportInfo> getImports();

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.ide.proto.OptionInfo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see org.chw.game.ide.proto.ProtoPackage#getModel_Options()
   * @model containment="true"
   * @generated
   */
  EList<OptionInfo> getOptions();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.ide.proto.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.chw.game.ide.proto.ProtoPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

  /**
   * Returns the value of the '<em><b>Comm</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.ide.proto.Comment_ALL}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comm</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comm</em>' containment reference list.
   * @see org.chw.game.ide.proto.ProtoPackage#getModel_Comm()
   * @model containment="true"
   * @generated
   */
  EList<Comment_ALL> getComm();

} // Model
