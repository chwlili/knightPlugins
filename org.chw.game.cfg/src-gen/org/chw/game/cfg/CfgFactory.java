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
   * Returns a new object of class '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum</em>'.
   * @generated
   */
  Enum createEnum();

  /**
   * Returns a new object of class '<em>Enum Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Field</em>'.
   * @generated
   */
  EnumField createEnumField();

  /**
   * Returns a new object of class '<em>Meta</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta</em>'.
   * @generated
   */
  Meta createMeta();

  /**
   * Returns a new object of class '<em>Meta Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Param</em>'.
   * @generated
   */
  MetaParam createMetaParam();

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
