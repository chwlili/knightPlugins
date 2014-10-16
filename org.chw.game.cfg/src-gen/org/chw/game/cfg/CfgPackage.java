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
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML2__INPUT = 0;

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
   * The feature id for the '<em><b>Enums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML2__ENUMS = 3;

  /**
   * The feature id for the '<em><b>Comm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML2__COMM = 4;

  /**
   * The number of structural features of the '<em>XML2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML2_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.InputDefImpl <em>Input Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.InputDefImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getInputDef()
   * @generated
   */
  int INPUT_DEF = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DEF__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Input CHAR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DEF__INPUT_CHAR = 1;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DEF__URL = 2;

  /**
   * The number of structural features of the '<em>Input Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.PackDefImpl <em>Pack Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.PackDefImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getPackDef()
   * @generated
   */
  int PACK_DEF = 2;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK_DEF__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Pack CHAR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK_DEF__PACK_CHAR = 1;

  /**
   * The feature id for the '<em><b>Pack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK_DEF__PACK = 2;

  /**
   * The number of structural features of the '<em>Pack Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.TypeImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Meta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__META = 1;

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
   * The feature id for the '<em><b>Meta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__META = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 2;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__FIELD_NAME = 3;

  /**
   * The feature id for the '<em><b>Node Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NODE_PATH = 4;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.FieldTypeImpl <em>Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.FieldTypeImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getFieldType()
   * @generated
   */
  int FIELD_TYPE = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.EnumImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 6;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__PREFIX = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = 2;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__FIELDS = 3;

  /**
   * The feature id for the '<em><b>Comm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__COMM = 4;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.EnumFieldImpl <em>Enum Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.EnumFieldImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getEnumField()
   * @generated
   */
  int ENUM_FIELD = 7;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Meta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD__META = 1;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD__FIELD_NAME = 2;

  /**
   * The feature id for the '<em><b>Field Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD__FIELD_VALUE = 3;

  /**
   * The number of structural features of the '<em>Enum Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.MetaImpl <em>Meta</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.MetaImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getMeta()
   * @generated
   */
  int META = 8;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META__PREFIX = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Meta</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.MetaParamImpl <em>Meta Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.MetaParamImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getMetaParam()
   * @generated
   */
  int META_PARAM = 9;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_PARAM__FIELD_NAME = 0;

  /**
   * The number of structural features of the '<em>Meta Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chw.game.cfg.impl.OtherComentImpl <em>Other Coment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.cfg.impl.OtherComentImpl
   * @see org.chw.game.cfg.impl.CfgPackageImpl#getOtherComent()
   * @generated
   */
  int OTHER_COMENT = 10;

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
   * Returns the meta object for the containment reference '{@link org.chw.game.cfg.XML2#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.chw.game.cfg.XML2#getInput()
   * @see #getXML2()
   * @generated
   */
  EReference getXML2_Input();

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
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.XML2#getEnums <em>Enums</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enums</em>'.
   * @see org.chw.game.cfg.XML2#getEnums()
   * @see #getXML2()
   * @generated
   */
  EReference getXML2_Enums();

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
   * Returns the meta object for class '{@link org.chw.game.cfg.InputDef <em>Input Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Def</em>'.
   * @see org.chw.game.cfg.InputDef
   * @generated
   */
  EClass getInputDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.InputDef#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comment</em>'.
   * @see org.chw.game.cfg.InputDef#getComment()
   * @see #getInputDef()
   * @generated
   */
  EReference getInputDef_Comment();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.InputDef#getInputCHAR <em>Input CHAR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input CHAR</em>'.
   * @see org.chw.game.cfg.InputDef#getInputCHAR()
   * @see #getInputDef()
   * @generated
   */
  EAttribute getInputDef_InputCHAR();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.InputDef#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.chw.game.cfg.InputDef#getUrl()
   * @see #getInputDef()
   * @generated
   */
  EAttribute getInputDef_Url();

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
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.PackDef#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comment</em>'.
   * @see org.chw.game.cfg.PackDef#getComment()
   * @see #getPackDef()
   * @generated
   */
  EReference getPackDef_Comment();

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
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.Type#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta</em>'.
   * @see org.chw.game.cfg.Type#getMeta()
   * @see #getType()
   * @generated
   */
  EReference getType_Meta();

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
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.Field#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta</em>'.
   * @see org.chw.game.cfg.Field#getMeta()
   * @see #getField()
   * @generated
   */
  EReference getField_Meta();

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
   * Returns the meta object for class '{@link org.chw.game.cfg.FieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Type</em>'.
   * @see org.chw.game.cfg.FieldType
   * @generated
   */
  EClass getFieldType();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.FieldType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.chw.game.cfg.FieldType#getType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Type();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see org.chw.game.cfg.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Enum#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.chw.game.cfg.Enum#getComment()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Comment();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Enum#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see org.chw.game.cfg.Enum#getPrefix()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Prefix();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Enum#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chw.game.cfg.Enum#getName()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.Enum#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.chw.game.cfg.Enum#getFields()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.Enum#getComm <em>Comm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comm</em>'.
   * @see org.chw.game.cfg.Enum#getComm()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Comm();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.EnumField <em>Enum Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Field</em>'.
   * @see org.chw.game.cfg.EnumField
   * @generated
   */
  EClass getEnumField();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.EnumField#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.chw.game.cfg.EnumField#getComment()
   * @see #getEnumField()
   * @generated
   */
  EAttribute getEnumField_Comment();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.EnumField#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta</em>'.
   * @see org.chw.game.cfg.EnumField#getMeta()
   * @see #getEnumField()
   * @generated
   */
  EReference getEnumField_Meta();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.EnumField#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see org.chw.game.cfg.EnumField#getFieldName()
   * @see #getEnumField()
   * @generated
   */
  EAttribute getEnumField_FieldName();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.EnumField#getFieldValue <em>Field Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Value</em>'.
   * @see org.chw.game.cfg.EnumField#getFieldValue()
   * @see #getEnumField()
   * @generated
   */
  EAttribute getEnumField_FieldValue();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.Meta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta</em>'.
   * @see org.chw.game.cfg.Meta
   * @generated
   */
  EClass getMeta();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.Meta#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see org.chw.game.cfg.Meta#getPrefix()
   * @see #getMeta()
   * @generated
   */
  EAttribute getMeta_Prefix();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.cfg.Meta#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.chw.game.cfg.Meta#getParams()
   * @see #getMeta()
   * @generated
   */
  EReference getMeta_Params();

  /**
   * Returns the meta object for class '{@link org.chw.game.cfg.MetaParam <em>Meta Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Param</em>'.
   * @see org.chw.game.cfg.MetaParam
   * @generated
   */
  EClass getMetaParam();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.cfg.MetaParam#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see org.chw.game.cfg.MetaParam#getFieldName()
   * @see #getMetaParam()
   * @generated
   */
  EAttribute getMetaParam_FieldName();

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
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML2__INPUT = eINSTANCE.getXML2_Input();

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
     * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML2__ENUMS = eINSTANCE.getXML2_Enums();

    /**
     * The meta object literal for the '<em><b>Comm</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML2__COMM = eINSTANCE.getXML2_Comm();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.InputDefImpl <em>Input Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.InputDefImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getInputDef()
     * @generated
     */
    EClass INPUT_DEF = eINSTANCE.getInputDef();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_DEF__COMMENT = eINSTANCE.getInputDef_Comment();

    /**
     * The meta object literal for the '<em><b>Input CHAR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_DEF__INPUT_CHAR = eINSTANCE.getInputDef_InputCHAR();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_DEF__URL = eINSTANCE.getInputDef_Url();

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
     * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACK_DEF__COMMENT = eINSTANCE.getPackDef_Comment();

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
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__META = eINSTANCE.getType_Meta();

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
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__META = eINSTANCE.getField_Meta();

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
     * The meta object literal for the '{@link org.chw.game.cfg.impl.FieldTypeImpl <em>Field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.FieldTypeImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getFieldType()
     * @generated
     */
    EClass FIELD_TYPE = eINSTANCE.getFieldType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_TYPE__TYPE = eINSTANCE.getFieldType_Type();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.EnumImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__COMMENT = eINSTANCE.getEnum_Comment();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__PREFIX = eINSTANCE.getEnum_Prefix();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__NAME = eINSTANCE.getEnum_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__FIELDS = eINSTANCE.getEnum_Fields();

    /**
     * The meta object literal for the '<em><b>Comm</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__COMM = eINSTANCE.getEnum_Comm();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.EnumFieldImpl <em>Enum Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.EnumFieldImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getEnumField()
     * @generated
     */
    EClass ENUM_FIELD = eINSTANCE.getEnumField();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_FIELD__COMMENT = eINSTANCE.getEnumField_Comment();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_FIELD__META = eINSTANCE.getEnumField_Meta();

    /**
     * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_FIELD__FIELD_NAME = eINSTANCE.getEnumField_FieldName();

    /**
     * The meta object literal for the '<em><b>Field Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_FIELD__FIELD_VALUE = eINSTANCE.getEnumField_FieldValue();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.MetaImpl <em>Meta</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.MetaImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getMeta()
     * @generated
     */
    EClass META = eINSTANCE.getMeta();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META__PREFIX = eINSTANCE.getMeta_Prefix();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META__PARAMS = eINSTANCE.getMeta_Params();

    /**
     * The meta object literal for the '{@link org.chw.game.cfg.impl.MetaParamImpl <em>Meta Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.cfg.impl.MetaParamImpl
     * @see org.chw.game.cfg.impl.CfgPackageImpl#getMetaParam()
     * @generated
     */
    EClass META_PARAM = eINSTANCE.getMetaParam();

    /**
     * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_PARAM__FIELD_NAME = eINSTANCE.getMetaParam_FieldName();

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
