/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.chw.game.cfg.CfgPackage
 * @generated
 */
public interface CfgFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CfgFactory eINSTANCE = org.chw.game.cfg.impl.CfgFactoryImpl.init();

  /**
   * Returns a new object of class '<em>XML2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XML2</em>'.
   * @generated
   */
  XML2 createXML2();

  /**
   * Returns a new object of class '<em>Input Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Def</em>'.
   * @generated
   */
  InputDef createInputDef();

  /**
   * Returns a new object of class '<em>Pack Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pack Def</em>'.
   * @generated
   */
  PackDef createPackDef();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Enter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enter</em>'.
   * @generated
   */
  Enter createEnter();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Field Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Type</em>'.
   * @generated
   */
  FieldType createFieldType();

  /**
   * Returns a new object of class '<em>Field Meta</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Meta</em>'.
   * @generated
   */
  FieldMeta createFieldMeta();

  /**
   * Returns a new object of class '<em>Field Meta Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Meta Key</em>'.
   * @generated
   */
  FieldMetaKey createFieldMetaKey();

  /**
   * Returns a new object of class '<em>Other Coment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Coment</em>'.
   * @generated
   */
  OtherComent createOtherComent();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CfgPackage getCfgPackage();

} //CfgFactory
