/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.chw.game.cfg.CfgFactory
 * @model kind="package"
 * @generated
 */
public interface CfgPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cfg";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.chw.org/game/Cfg";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cfg";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CfgPackage eINSTANCE = org.chw.game.cfg.impl.CfgPackageImpl.init();

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.XML2Impl <em>XML2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.XML2Impl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getXML2()
   * @generated
   */
  int XML2 = 0;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML2__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Pack</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML2__PACK = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML2__TYPES = 2;

  /**
   * The feature id for the '<em><b>Comm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML2__COMM = 3;

  /**
   * The number of structural features of the '<em>XML2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML2_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.PackDefImpl <em>Pack Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.PackDefImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getPackDef()
   * @generated
   */
  int PACK_DEF = 1;

  /**
   * The feature id for the '<em><b>Pack CHAR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK_DEF__PACK_CHAR = 0;

  /**
   * The feature id for the '<em><b>Pack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK_DEF__PACK = 1;

  /**
   * The number of structural features of the '<em>Pack Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.TypeImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__INPUT = 1;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PREFIX = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 3;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__FIELDS = 4;

  /**
   * The feature id for the '<em><b>Comm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__COMM = 5;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.InputImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getInput()
   * @generated
   */
  int INPUT = 3;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__PREFIX = 0;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__FILE_PATH = 1;

  /**
   * The feature id for the '<em><b>Node Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__NODE_PATH = 2;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.FieldImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getField()
   * @generated
   */
  int FIELD = 4;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 1;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__FIELD_NAME = 2;

  /**
   * The feature id for the '<em><b>Node Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NODE_PATH = 3;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.NativeTypeImpl <em>Native Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.NativeTypeImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getNativeType()
   * @generated
   */
  int NATIVE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Native Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.ListTypeImpl <em>List Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.ListTypeImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getListType()
   * @generated
   */
  int LIST_TYPE = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>List Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.HashTypeImpl <em>Hash Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.HashTypeImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getHashType()
   * @generated
   */
  int HASH_TYPE = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASH_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASH_TYPE__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Hash Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASH_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.ParamImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getParam()
   * @generated
   */
  int PARAM = 8;

  /**
   * The feature id for the '<em><b>Param Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__PARAM_NAME = 0;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.OtherComentImpl <em>Other Coment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.OtherComentImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getOtherComent()
   * @generated
   */
  int OTHER_COMENT = 9;

  /**
   * The feature id for the '<em><b>Comm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_COMENT__COMM = 0;

  /**
   * The number of structural features of the '<em>Other Coment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_COMENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.XML2 <em>XML2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XML2</em>'.
   * @see org.chw.game.cfg.XML2
   * @generated
   */
  EClass getXML2();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.XML2#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comment</em>'.
   * @see org.chw.game.cfg.XML2#getComment()
   * @see #getXML2()
   * @generated
   */
  EReference getXML2_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.chw.game.cfg.XML2#getPack <em>Pack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pack</em>'.
   * @see org.chw.game.cfg.XML2#getPack()
   * @see #getXML2()
   * @generated
   */
  EReference getXML2_Pack();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.XML2#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.chw.game.cfg.XML2#getTypes()
   * @see #getXML2()
   * @generated
   */
  EReference getXML2_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.XML2#getComm <em>Comm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comm</em>'.
   * @see org.chw.game.cfg.XML2#getComm()
   * @see #getXML2()
   * @generated
   */
  EReference getXML2_Comm();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.PackDef <em>Pack Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pack Def</em>'.
   * @see org.chw.game.cfg.PackDef
   * @generated
   */
  EClass getPackDef();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.PackDef#getPackCHAR <em>Pack CHAR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pack CHAR</em>'.
   * @see org.chw.game.cfg.PackDef#getPackCHAR()
   * @see #getPackDef()
   * @generated
   */
  EAttribute getPackDef_PackCHAR();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.PackDef#getPack <em>Pack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pack</em>'.
   * @see org.chw.game.cfg.PackDef#getPack()
   * @see #getPackDef()
   * @generated
   */
  EAttribute getPackDef_Pack();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.chw.game.cfg.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Type#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.chw.game.cfg.Type#getComment()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.chw.game.cfg.Type#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.chw.game.cfg.Type#getInput()
   * @see #getType()
   * @generated
   */
  EReference getType_Input();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Type#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see org.chw.game.cfg.Type#getPrefix()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Prefix();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chw.game.cfg.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.Type#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.chw.game.cfg.Type#getFields()
   * @see #getType()
   * @generated
   */
  EReference getType_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.Type#getComm <em>Comm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comm</em>'.
   * @see org.chw.game.cfg.Type#getComm()
   * @see #getType()
   * @generated
   */
  EReference getType_Comm();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see org.chw.game.cfg.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Input#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see org.chw.game.cfg.Input#getPrefix()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Prefix();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Input#getFilePath <em>File Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Path</em>'.
   * @see org.chw.game.cfg.Input#getFilePath()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_FilePath();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Input#getNodePath <em>Node Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node Path</em>'.
   * @see org.chw.game.cfg.Input#getNodePath()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_NodePath();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.chw.game.cfg.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Field#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.chw.game.cfg.Field#getComment()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.chw.game.cfg.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.chw.game.cfg.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Field#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see org.chw.game.cfg.Field#getFieldName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_FieldName();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Field#getNodePath <em>Node Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node Path</em>'.
   * @see org.chw.game.cfg.Field#getNodePath()
   * @see #getField()
   * @generated
   */
  EAttribute getField_NodePath();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.NativeType <em>Native Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Native Type</em>'.
   * @see org.chw.game.cfg.NativeType
   * @generated
   */
  EClass getNativeType();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.NativeType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.chw.game.cfg.NativeType#getType()
   * @see #getNativeType()
   * @generated
   */
  EAttribute getNativeType_Type();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Type</em>'.
   * @see org.chw.game.cfg.ListType
   * @generated
   */
  EClass getListType();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.ListType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.chw.game.cfg.ListType#getType()
   * @see #getListType()
   * @generated
   */
  EAttribute getListType_Type();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.HashType <em>Hash Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hash Type</em>'.
   * @see org.chw.game.cfg.HashType
   * @generated
   */
  EClass getHashType();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.HashType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.chw.game.cfg.HashType#getType()
   * @see #getHashType()
   * @generated
   */
  EAttribute getHashType_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.HashType#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.chw.game.cfg.HashType#getParams()
   * @see #getHashType()
   * @generated
   */
  EReference getHashType_Params();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see org.chw.game.cfg.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Param#getParamName <em>Param Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Param Name</em>'.
   * @see org.chw.game.cfg.Param#getParamName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_ParamName();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.OtherComent <em>Other Coment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other Coment</em>'.
   * @see org.chw.game.cfg.OtherComent
   * @generated
   */
  EClass getOtherComent();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.OtherComent#getComm <em>Comm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comm</em>'.
   * @see org.chw.game.cfg.OtherComent#getComm()
   * @see #getOtherComent()
   * @generated
   */
  EAttribute getOtherComent_Comm();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CfgFactory getCfgFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.XML2Impl <em>XML2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.XML2Impl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getXML2()
     * @generated
     */
    EClass XML2 = eINSTANCE.getXML2();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML2__COMMENT = eINSTANCE.getXML2_Comment();

    /**
     * The meta object literal for the '<em><b>Pack</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML2__PACK = eINSTANCE.getXML2_Pack();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML2__TYPES = eINSTANCE.getXML2_Types();

    /**
     * The meta object literal for the '<em><b>Comm</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML2__COMM = eINSTANCE.getXML2_Comm();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.PackDefImpl <em>Pack Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.PackDefImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getPackDef()
     * @generated
     */
    EClass PACK_DEF = eINSTANCE.getPackDef();

    /**
     * The meta object literal for the '<em><b>Pack CHAR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACK_DEF__PACK_CHAR = eINSTANCE.getPackDef_PackCHAR();

    /**
     * The meta object literal for the '<em><b>Pack</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACK_DEF__PACK = eINSTANCE.getPackDef_Pack();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.TypeImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__COMMENT = eINSTANCE.getType_Comment();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__INPUT = eINSTANCE.getType_Input();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__PREFIX = eINSTANCE.getType_Prefix();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__FIELDS = eINSTANCE.getType_Fields();

    /**
     * The meta object literal for the '<em><b>Comm</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__COMM = eINSTANCE.getType_Comm();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.InputImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__PREFIX = eINSTANCE.getInput_Prefix();

    /**
     * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__FILE_PATH = eINSTANCE.getInput_FilePath();

    /**
     * The meta object literal for the '<em><b>Node Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__NODE_PATH = eINSTANCE.getInput_NodePath();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.FieldImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__COMMENT = eINSTANCE.getField_Comment();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__FIELD_NAME = eINSTANCE.getField_FieldName();

    /**
     * The meta object literal for the '<em><b>Node Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NODE_PATH = eINSTANCE.getField_NodePath();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.NativeTypeImpl <em>Native Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.NativeTypeImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getNativeType()
     * @generated
     */
    EClass NATIVE_TYPE = eINSTANCE.getNativeType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NATIVE_TYPE__TYPE = eINSTANCE.getNativeType_Type();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.ListTypeImpl <em>List Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.ListTypeImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getListType()
     * @generated
     */
    EClass LIST_TYPE = eINSTANCE.getListType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_TYPE__TYPE = eINSTANCE.getListType_Type();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.HashTypeImpl <em>Hash Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.HashTypeImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getHashType()
     * @generated
     */
    EClass HASH_TYPE = eINSTANCE.getHashType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HASH_TYPE__TYPE = eINSTANCE.getHashType_Type();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HASH_TYPE__PARAMS = eINSTANCE.getHashType_Params();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.ParamImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Param Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__PARAM_NAME = eINSTANCE.getParam_ParamName();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.OtherComentImpl <em>Other Coment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.OtherComentImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getOtherComent()
     * @generated
     */
    EClass OTHER_COMENT = eINSTANCE.getOtherComent();

    /**
     * The meta object literal for the '<em><b>Comm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OTHER_COMENT__COMM = eINSTANCE.getOtherComent_Comm();

  }

} //CfgPackage
