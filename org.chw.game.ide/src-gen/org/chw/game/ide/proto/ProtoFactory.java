/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.chw.game.ide.proto.ProtoPackage
 * @generated
 */
public interface ProtoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProtoFactory eINSTANCE = org.chw.game.ide.proto.impl.ProtoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import Info</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Info</em>'.
   * @generated
   */
  ImportInfo createImportInfo();

  /**
   * Returns a new object of class '<em>Option Info</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option Info</em>'.
   * @generated
   */
  OptionInfo createOptionInfo();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map</em>'.
   * @generated
   */
  Map createMap();

  /**
   * Returns a new object of class '<em>Map Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Field</em>'.
   * @generated
   */
  MapField createMapField();

  /**
   * Returns a new object of class '<em>Map Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Ref</em>'.
   * @generated
   */
  MapRef createMapRef();

  /**
   * Returns a new object of class '<em>Message Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Type</em>'.
   * @generated
   */
  MessageType createMessageType();

  /**
   * Returns a new object of class '<em>Message Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Field</em>'.
   * @generated
   */
  MessageField createMessageField();

  /**
   * Returns a new object of class '<em>Message Simple Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Simple Field</em>'.
   * @generated
   */
  MessageSimpleField createMessageSimpleField();

  /**
   * Returns a new object of class '<em>Message Complex Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Complex Field</em>'.
   * @generated
   */
  MessageComplexField createMessageComplexField();

  /**
   * Returns a new object of class '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Type</em>'.
   * @generated
   */
  EnumType createEnumType();

  /**
   * Returns a new object of class '<em>Enum Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Field</em>'.
   * @generated
   */
  EnumField createEnumField();

  /**
   * Returns a new object of class '<em>Enum Field Opt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Field Opt</em>'.
   * @generated
   */
  EnumFieldOpt createEnumFieldOpt();

  /**
   * Returns a new object of class '<em>Comment ALL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment ALL</em>'.
   * @generated
   */
  Comment_ALL createComment_ALL();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ProtoPackage getProtoPackage();

} //ProtoFactory
