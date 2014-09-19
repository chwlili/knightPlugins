/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg.impl;

import org.chw.game.cfg.CfgFactory;
import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Enter;
import org.chw.game.cfg.EnumField;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.FieldMetaKey;
import org.chw.game.cfg.FieldType;
import org.chw.game.cfg.InputDef;
import org.chw.game.cfg.ListMeta;
import org.chw.game.cfg.OtherComent;
import org.chw.game.cfg.PackDef;
import org.chw.game.cfg.SliceMeta;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;

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
public class CfgFactoryImpl extends EFactoryImpl implements CfgFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CfgFactory init()
  {
    try
    {
      CfgFactory theCfgFactory = (CfgFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chw.org/game/Cfg"); 
      if (theCfgFactory != null)
      {
        return theCfgFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CfgFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfgFactoryImpl()
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
      case CfgPackage.XML2: return createXML2();
      case CfgPackage.INPUT_DEF: return createInputDef();
      case CfgPackage.PACK_DEF: return createPackDef();
      case CfgPackage.TYPE: return createType();
      case CfgPackage.ENTER: return createEnter();
      case CfgPackage.FIELD: return createField();
      case CfgPackage.FIELD_TYPE: return createFieldType();
      case CfgPackage.LIST_META: return createListMeta();
      case CfgPackage.SLICE_META: return createSliceMeta();
      case CfgPackage.FIELD_META_KEY: return createFieldMetaKey();
      case CfgPackage.ENUM: return createEnum();
      case CfgPackage.ENUM_FIELD: return createEnumField();
      case CfgPackage.OTHER_COMENT: return createOtherComent();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XML2 createXML2()
  {
    XML2Impl xml2 = new XML2Impl();
    return xml2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputDef createInputDef()
  {
    InputDefImpl inputDef = new InputDefImpl();
    return inputDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackDef createPackDef()
  {
    PackDefImpl packDef = new PackDefImpl();
    return packDef;
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
  public Enter createEnter()
  {
    EnterImpl enter = new EnterImpl();
    return enter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldType createFieldType()
  {
    FieldTypeImpl fieldType = new FieldTypeImpl();
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListMeta createListMeta()
  {
    ListMetaImpl listMeta = new ListMetaImpl();
    return listMeta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SliceMeta createSliceMeta()
  {
    SliceMetaImpl sliceMeta = new SliceMetaImpl();
    return sliceMeta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldMetaKey createFieldMetaKey()
  {
    FieldMetaKeyImpl fieldMetaKey = new FieldMetaKeyImpl();
    return fieldMetaKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.chw.game.cfg.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
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
  public OtherComent createOtherComent()
  {
    OtherComentImpl otherComent = new OtherComentImpl();
    return otherComent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfgPackage getCfgPackage()
  {
    return (CfgPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CfgPackage getPackage()
  {
    return CfgPackage.eINSTANCE;
  }

} //CfgFactoryImpl
