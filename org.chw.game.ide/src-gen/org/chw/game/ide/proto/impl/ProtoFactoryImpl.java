/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto.impl;

import org.chw.game.ide.proto.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtoFactoryImpl extends EFactoryImpl implements ProtoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProtoFactory init()
  {
    try
    {
      ProtoFactory theProtoFactory = (ProtoFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chw.org/game/ide/Proto"); 
      if (theProtoFactory != null)
      {
        return theProtoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProtoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProtoPackage.MODEL: return createModel();
      case ProtoPackage.IMPORT_INFO: return createImportInfo();
      case ProtoPackage.OPTION_INFO: return createOptionInfo();
      case ProtoPackage.ELEMENT: return createElement();
      case ProtoPackage.TYPE: return createType();
      case ProtoPackage.MAP: return createMap();
      case ProtoPackage.MAP_FIELD: return createMapField();
      case ProtoPackage.MAP_REF: return createMapRef();
      case ProtoPackage.MESSAGE_TYPE: return createMessageType();
      case ProtoPackage.MESSAGE_FIELD: return createMessageField();
      case ProtoPackage.MESSAGE_SIMPLE_FIELD: return createMessageSimpleField();
      case ProtoPackage.MESSAGE_COMPLEX_FIELD: return createMessageComplexField();
      case ProtoPackage.ENUM_TYPE: return createEnumType();
      case ProtoPackage.ENUM_FIELD: return createEnumField();
      case ProtoPackage.ENUM_FIELD_OPT: return createEnumFieldOpt();
      case ProtoPackage.COMMENT_ALL: return createComment_ALL();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportInfo createImportInfo()
  {
    ImportInfoImpl importInfo = new ImportInfoImpl();
    return importInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionInfo createOptionInfo()
  {
    OptionInfoImpl optionInfo = new OptionInfoImpl();
    return optionInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map createMap()
  {
    MapImpl map = new MapImpl();
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapField createMapField()
  {
    MapFieldImpl mapField = new MapFieldImpl();
    return mapField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapRef createMapRef()
  {
    MapRefImpl mapRef = new MapRefImpl();
    return mapRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageType createMessageType()
  {
    MessageTypeImpl messageType = new MessageTypeImpl();
    return messageType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageField createMessageField()
  {
    MessageFieldImpl messageField = new MessageFieldImpl();
    return messageField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageSimpleField createMessageSimpleField()
  {
    MessageSimpleFieldImpl messageSimpleField = new MessageSimpleFieldImpl();
    return messageSimpleField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageComplexField createMessageComplexField()
  {
    MessageComplexFieldImpl messageComplexField = new MessageComplexFieldImpl();
    return messageComplexField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumType()
  {
    EnumTypeImpl enumType = new EnumTypeImpl();
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumField createEnumField()
  {
    EnumFieldImpl enumField = new EnumFieldImpl();
    return enumField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumFieldOpt createEnumFieldOpt()
  {
    EnumFieldOptImpl enumFieldOpt = new EnumFieldOptImpl();
    return enumFieldOpt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment_ALL createComment_ALL()
  {
    Comment_ALLImpl comment_ALL = new Comment_ALLImpl();
    return comment_ALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtoPackage getProtoPackage()
  {
    return (ProtoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProtoPackage getPackage()
  {
    return ProtoPackage.eINSTANCE;
  }

} //ProtoFactoryImpl
