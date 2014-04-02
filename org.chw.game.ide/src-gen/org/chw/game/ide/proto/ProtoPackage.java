/**
 */
package org.chw.game.ide.proto;

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
 * @see org.chw.game.ide.proto.ProtoFactory
 * @model kind="package"
 * @generated
 */
public interface ProtoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "proto";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.chw.org/game/ide/Proto";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "proto";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProtoPackage eINSTANCE = org.chw.game.ide.proto.impl.ProtoPackageImpl.init();

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.ModelImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OPTIONS = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 3;

  /**
   * The feature id for the '<em><b>Comm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMM = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.ImportInfoImpl <em>Import Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.ImportInfoImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getImportInfo()
   * @generated
   */
  int IMPORT_INFO = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_INFO__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_INFO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.OptionInfoImpl <em>Option Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.OptionInfoImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getOptionInfo()
   * @generated
   */
  int OPTION_INFO = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_INFO__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_INFO__VALUE = 1;

  /**
   * The number of structural features of the '<em>Option Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_INFO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.ElementImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Comm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__COMM = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.TypeImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Comm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__COMM = ELEMENT__COMM;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.MapImpl <em>Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.MapImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMap()
   * @generated
   */
  int MAP = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Comm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__COMM = ELEMENT__COMM;

  /**
   * The feature id for the '<em><b>Bind</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__BIND = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__FIELDS = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.MapFieldImpl <em>Map Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.MapFieldImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMapField()
   * @generated
   */
  int MAP_FIELD = 6;

  /**
   * The feature id for the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FIELD__ATTR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FIELD__NAME = 1;

  /**
   * The feature id for the '<em><b>Filter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FIELD__FILTER = 2;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FIELD__LINKS = 3;

  /**
   * The number of structural features of the '<em>Map Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FIELD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.MapRefImpl <em>Map Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.MapRefImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMapRef()
   * @generated
   */
  int MAP_REF = 7;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_REF__LINK = 0;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_REF__CHILD = 1;

  /**
   * The number of structural features of the '<em>Map Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_REF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.MessageTypeImpl <em>Message Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.MessageTypeImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMessageType()
   * @generated
   */
  int MESSAGE_TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Comm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__COMM = TYPE__COMM;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__FIELDS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__TYPES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Message Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.MessageFieldImpl <em>Message Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.MessageFieldImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMessageField()
   * @generated
   */
  int MESSAGE_FIELD = 9;

  /**
   * The feature id for the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD__ATTR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD__NAME = 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD__INDEX = 2;

  /**
   * The number of structural features of the '<em>Message Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FIELD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.MessageSimpleFieldImpl <em>Message Simple Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.MessageSimpleFieldImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMessageSimpleField()
   * @generated
   */
  int MESSAGE_SIMPLE_FIELD = 10;

  /**
   * The feature id for the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_SIMPLE_FIELD__ATTR = MESSAGE_FIELD__ATTR;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_SIMPLE_FIELD__NAME = MESSAGE_FIELD__NAME;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_SIMPLE_FIELD__INDEX = MESSAGE_FIELD__INDEX;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_SIMPLE_FIELD__TYPE = MESSAGE_FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Message Simple Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_SIMPLE_FIELD_FEATURE_COUNT = MESSAGE_FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.MessageComplexFieldImpl <em>Message Complex Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.MessageComplexFieldImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMessageComplexField()
   * @generated
   */
  int MESSAGE_COMPLEX_FIELD = 11;

  /**
   * The feature id for the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_COMPLEX_FIELD__ATTR = MESSAGE_FIELD__ATTR;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_COMPLEX_FIELD__NAME = MESSAGE_FIELD__NAME;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_COMPLEX_FIELD__INDEX = MESSAGE_FIELD__INDEX;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_COMPLEX_FIELD__TYPE = MESSAGE_FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Message Complex Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_COMPLEX_FIELD_FEATURE_COUNT = MESSAGE_FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.EnumTypeImpl <em>Enum Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.EnumTypeImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getEnumType()
   * @generated
   */
  int ENUM_TYPE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Comm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__COMM = TYPE__COMM;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__FIELDS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__OPTIONS = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.EnumFieldImpl <em>Enum Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.EnumFieldImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getEnumField()
   * @generated
   */
  int ENUM_FIELD = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD__INDEX = 1;

  /**
   * The number of structural features of the '<em>Enum Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.EnumFieldOptImpl <em>Enum Field Opt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.EnumFieldOptImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getEnumFieldOpt()
   * @generated
   */
  int ENUM_FIELD_OPT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD_OPT__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD_OPT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Enum Field Opt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FIELD_OPT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chw.game.ide.proto.impl.Comment_ALLImpl <em>Comment ALL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chw.game.ide.proto.impl.Comment_ALLImpl
   * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getComment_ALL()
   * @generated
   */
  int COMMENT_ALL = 15;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_ALL__TEXT = 0;

  /**
   * The number of structural features of the '<em>Comment ALL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_ALL_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.chw.game.ide.proto.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chw.game.ide.proto.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.ide.proto.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.chw.game.ide.proto.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.ide.proto.Model#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see org.chw.game.ide.proto.Model#getOptions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Options();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.ide.proto.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.chw.game.ide.proto.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.ide.proto.Model#getComm <em>Comm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comm</em>'.
   * @see org.chw.game.ide.proto.Model#getComm()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Comm();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.ImportInfo <em>Import Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Info</em>'.
   * @see org.chw.game.ide.proto.ImportInfo
   * @generated
   */
  EClass getImportInfo();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.ImportInfo#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.chw.game.ide.proto.ImportInfo#getImportURI()
   * @see #getImportInfo()
   * @generated
   */
  EAttribute getImportInfo_ImportURI();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.OptionInfo <em>Option Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option Info</em>'.
   * @see org.chw.game.ide.proto.OptionInfo
   * @generated
   */
  EClass getOptionInfo();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.OptionInfo#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chw.game.ide.proto.OptionInfo#getName()
   * @see #getOptionInfo()
   * @generated
   */
  EAttribute getOptionInfo_Name();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.OptionInfo#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.chw.game.ide.proto.OptionInfo#getValue()
   * @see #getOptionInfo()
   * @generated
   */
  EAttribute getOptionInfo_Value();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.chw.game.ide.proto.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chw.game.ide.proto.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.ide.proto.Element#getComm <em>Comm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comm</em>'.
   * @see org.chw.game.ide.proto.Element#getComm()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Comm();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.chw.game.ide.proto.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.Map <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map</em>'.
   * @see org.chw.game.ide.proto.Map
   * @generated
   */
  EClass getMap();

  /**
   * Returns the meta object for the reference '{@link org.chw.game.ide.proto.Map#getBind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bind</em>'.
   * @see org.chw.game.ide.proto.Map#getBind()
   * @see #getMap()
   * @generated
   */
  EReference getMap_Bind();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.ide.proto.Map#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.chw.game.ide.proto.Map#getFields()
   * @see #getMap()
   * @generated
   */
  EReference getMap_Fields();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.MapField <em>Map Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Field</em>'.
   * @see org.chw.game.ide.proto.MapField
   * @generated
   */
  EClass getMapField();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.MapField#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attr</em>'.
   * @see org.chw.game.ide.proto.MapField#getAttr()
   * @see #getMapField()
   * @generated
   */
  EAttribute getMapField_Attr();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.MapField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chw.game.ide.proto.MapField#getName()
   * @see #getMapField()
   * @generated
   */
  EAttribute getMapField_Name();

  /**
   * Returns the meta object for the reference '{@link org.chw.game.ide.proto.MapField#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Filter</em>'.
   * @see org.chw.game.ide.proto.MapField#getFilter()
   * @see #getMapField()
   * @generated
   */
  EReference getMapField_Filter();

  /**
   * Returns the meta object for the containment reference '{@link org.chw.game.ide.proto.MapField#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Links</em>'.
   * @see org.chw.game.ide.proto.MapField#getLinks()
   * @see #getMapField()
   * @generated
   */
  EReference getMapField_Links();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.MapRef <em>Map Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Ref</em>'.
   * @see org.chw.game.ide.proto.MapRef
   * @generated
   */
  EClass getMapRef();

  /**
   * Returns the meta object for the reference '{@link org.chw.game.ide.proto.MapRef#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see org.chw.game.ide.proto.MapRef#getLink()
   * @see #getMapRef()
   * @generated
   */
  EReference getMapRef_Link();

  /**
   * Returns the meta object for the containment reference '{@link org.chw.game.ide.proto.MapRef#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.chw.game.ide.proto.MapRef#getChild()
   * @see #getMapRef()
   * @generated
   */
  EReference getMapRef_Child();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.MessageType <em>Message Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Type</em>'.
   * @see org.chw.game.ide.proto.MessageType
   * @generated
   */
  EClass getMessageType();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.ide.proto.MessageType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.chw.game.ide.proto.MessageType#getFields()
   * @see #getMessageType()
   * @generated
   */
  EReference getMessageType_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.ide.proto.MessageType#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.chw.game.ide.proto.MessageType#getTypes()
   * @see #getMessageType()
   * @generated
   */
  EReference getMessageType_Types();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.MessageField <em>Message Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Field</em>'.
   * @see org.chw.game.ide.proto.MessageField
   * @generated
   */
  EClass getMessageField();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.MessageField#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attr</em>'.
   * @see org.chw.game.ide.proto.MessageField#getAttr()
   * @see #getMessageField()
   * @generated
   */
  EAttribute getMessageField_Attr();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.MessageField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chw.game.ide.proto.MessageField#getName()
   * @see #getMessageField()
   * @generated
   */
  EAttribute getMessageField_Name();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.MessageField#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see org.chw.game.ide.proto.MessageField#getIndex()
   * @see #getMessageField()
   * @generated
   */
  EAttribute getMessageField_Index();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.MessageSimpleField <em>Message Simple Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Simple Field</em>'.
   * @see org.chw.game.ide.proto.MessageSimpleField
   * @generated
   */
  EClass getMessageSimpleField();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.MessageSimpleField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.chw.game.ide.proto.MessageSimpleField#getType()
   * @see #getMessageSimpleField()
   * @generated
   */
  EAttribute getMessageSimpleField_Type();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.MessageComplexField <em>Message Complex Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Complex Field</em>'.
   * @see org.chw.game.ide.proto.MessageComplexField
   * @generated
   */
  EClass getMessageComplexField();

  /**
   * Returns the meta object for the reference '{@link org.chw.game.ide.proto.MessageComplexField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.chw.game.ide.proto.MessageComplexField#getType()
   * @see #getMessageComplexField()
   * @generated
   */
  EReference getMessageComplexField_Type();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type</em>'.
   * @see org.chw.game.ide.proto.EnumType
   * @generated
   */
  EClass getEnumType();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.ide.proto.EnumType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.chw.game.ide.proto.EnumType#getFields()
   * @see #getEnumType()
   * @generated
   */
  EReference getEnumType_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link org.chw.game.ide.proto.EnumType#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see org.chw.game.ide.proto.EnumType#getOptions()
   * @see #getEnumType()
   * @generated
   */
  EReference getEnumType_Options();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.EnumField <em>Enum Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Field</em>'.
   * @see org.chw.game.ide.proto.EnumField
   * @generated
   */
  EClass getEnumField();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.EnumField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chw.game.ide.proto.EnumField#getName()
   * @see #getEnumField()
   * @generated
   */
  EAttribute getEnumField_Name();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.EnumField#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see org.chw.game.ide.proto.EnumField#getIndex()
   * @see #getEnumField()
   * @generated
   */
  EAttribute getEnumField_Index();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.EnumFieldOpt <em>Enum Field Opt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Field Opt</em>'.
   * @see org.chw.game.ide.proto.EnumFieldOpt
   * @generated
   */
  EClass getEnumFieldOpt();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.EnumFieldOpt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chw.game.ide.proto.EnumFieldOpt#getName()
   * @see #getEnumFieldOpt()
   * @generated
   */
  EAttribute getEnumFieldOpt_Name();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.EnumFieldOpt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.chw.game.ide.proto.EnumFieldOpt#getValue()
   * @see #getEnumFieldOpt()
   * @generated
   */
  EAttribute getEnumFieldOpt_Value();

  /**
   * Returns the meta object for class '{@link org.chw.game.ide.proto.Comment_ALL <em>Comment ALL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment ALL</em>'.
   * @see org.chw.game.ide.proto.Comment_ALL
   * @generated
   */
  EClass getComment_ALL();

  /**
   * Returns the meta object for the attribute '{@link org.chw.game.ide.proto.Comment_ALL#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.chw.game.ide.proto.Comment_ALL#getText()
   * @see #getComment_ALL()
   * @generated
   */
  EAttribute getComment_ALL_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProtoFactory getProtoFactory();

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
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.ModelImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__OPTIONS = eINSTANCE.getModel_Options();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '<em><b>Comm</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMM = eINSTANCE.getModel_Comm();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.ImportInfoImpl <em>Import Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.ImportInfoImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getImportInfo()
     * @generated
     */
    EClass IMPORT_INFO = eINSTANCE.getImportInfo();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_INFO__IMPORT_URI = eINSTANCE.getImportInfo_ImportURI();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.OptionInfoImpl <em>Option Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.OptionInfoImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getOptionInfo()
     * @generated
     */
    EClass OPTION_INFO = eINSTANCE.getOptionInfo();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION_INFO__NAME = eINSTANCE.getOptionInfo_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION_INFO__VALUE = eINSTANCE.getOptionInfo_Value();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.ElementImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Comm</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__COMM = eINSTANCE.getElement_Comm();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.TypeImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.MapImpl <em>Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.MapImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMap()
     * @generated
     */
    EClass MAP = eINSTANCE.getMap();

    /**
     * The meta object literal for the '<em><b>Bind</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP__BIND = eINSTANCE.getMap_Bind();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP__FIELDS = eINSTANCE.getMap_Fields();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.MapFieldImpl <em>Map Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.MapFieldImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMapField()
     * @generated
     */
    EClass MAP_FIELD = eINSTANCE.getMapField();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAP_FIELD__ATTR = eINSTANCE.getMapField_Attr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAP_FIELD__NAME = eINSTANCE.getMapField_Name();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_FIELD__FILTER = eINSTANCE.getMapField_Filter();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_FIELD__LINKS = eINSTANCE.getMapField_Links();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.MapRefImpl <em>Map Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.MapRefImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMapRef()
     * @generated
     */
    EClass MAP_REF = eINSTANCE.getMapRef();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_REF__LINK = eINSTANCE.getMapRef_Link();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_REF__CHILD = eINSTANCE.getMapRef_Child();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.MessageTypeImpl <em>Message Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.MessageTypeImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMessageType()
     * @generated
     */
    EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_TYPE__FIELDS = eINSTANCE.getMessageType_Fields();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_TYPE__TYPES = eINSTANCE.getMessageType_Types();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.MessageFieldImpl <em>Message Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.MessageFieldImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMessageField()
     * @generated
     */
    EClass MESSAGE_FIELD = eINSTANCE.getMessageField();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_FIELD__ATTR = eINSTANCE.getMessageField_Attr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_FIELD__NAME = eINSTANCE.getMessageField_Name();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_FIELD__INDEX = eINSTANCE.getMessageField_Index();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.MessageSimpleFieldImpl <em>Message Simple Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.MessageSimpleFieldImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMessageSimpleField()
     * @generated
     */
    EClass MESSAGE_SIMPLE_FIELD = eINSTANCE.getMessageSimpleField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_SIMPLE_FIELD__TYPE = eINSTANCE.getMessageSimpleField_Type();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.MessageComplexFieldImpl <em>Message Complex Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.MessageComplexFieldImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getMessageComplexField()
     * @generated
     */
    EClass MESSAGE_COMPLEX_FIELD = eINSTANCE.getMessageComplexField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_COMPLEX_FIELD__TYPE = eINSTANCE.getMessageComplexField_Type();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.EnumTypeImpl <em>Enum Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.EnumTypeImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getEnumType()
     * @generated
     */
    EClass ENUM_TYPE = eINSTANCE.getEnumType();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE__FIELDS = eINSTANCE.getEnumType_Fields();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE__OPTIONS = eINSTANCE.getEnumType_Options();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.EnumFieldImpl <em>Enum Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.EnumFieldImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getEnumField()
     * @generated
     */
    EClass ENUM_FIELD = eINSTANCE.getEnumField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_FIELD__NAME = eINSTANCE.getEnumField_Name();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_FIELD__INDEX = eINSTANCE.getEnumField_Index();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.EnumFieldOptImpl <em>Enum Field Opt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.EnumFieldOptImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getEnumFieldOpt()
     * @generated
     */
    EClass ENUM_FIELD_OPT = eINSTANCE.getEnumFieldOpt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_FIELD_OPT__NAME = eINSTANCE.getEnumFieldOpt_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_FIELD_OPT__VALUE = eINSTANCE.getEnumFieldOpt_Value();

    /**
     * The meta object literal for the '{@link org.chw.game.ide.proto.impl.Comment_ALLImpl <em>Comment ALL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chw.game.ide.proto.impl.Comment_ALLImpl
     * @see org.chw.game.ide.proto.impl.ProtoPackageImpl#getComment_ALL()
     * @generated
     */
    EClass COMMENT_ALL = eINSTANCE.getComment_ALL();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT_ALL__TEXT = eINSTANCE.getComment_ALL_Text();

  }

} //ProtoPackage
