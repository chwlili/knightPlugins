/**
 */
package org.chw.game.ide.proto;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.EnumType#getFields <em>Fields</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.EnumType#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.ide.proto.ProtoPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends Type
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.ide.proto.EnumField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.chw.game.ide.proto.ProtoPackage#getEnumType_Fields()
   * @model containment="true"
   * @generated
   */
  EList<EnumField> getFields();

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link org.chw.game.ide.proto.EnumFieldOpt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see org.chw.game.ide.proto.ProtoPackage#getEnumType_Options()
   * @model containment="true"
   * @generated
   */
  EList<EnumFieldOpt> getOptions();

} // EnumType
