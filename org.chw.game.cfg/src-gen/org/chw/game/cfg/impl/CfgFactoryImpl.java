/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg.impl;

import org.chw.game.cfg.*;

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
      case CfgPackage.FIELD_META: return createFieldMeta();
      case CfgPackage.FIELD_META_KEY: return createFieldMetaKey();
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
  public FieldMeta createFieldMeta()
  {
    FieldMetaImpl fieldMeta = new FieldMetaImpl();
    return fieldMeta;
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
