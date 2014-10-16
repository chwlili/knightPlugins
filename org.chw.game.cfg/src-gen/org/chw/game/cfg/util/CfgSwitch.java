/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg.util;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.EnumField;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.FieldType;
import org.chw.game.cfg.InputDef;
import org.chw.game.cfg.Meta;
import org.chw.game.cfg.MetaParam;
import org.chw.game.cfg.OtherComent;
import org.chw.game.cfg.PackDef;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.chw.game.cfg.CfgPackage
 * @generated
 */
public class CfgSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CfgPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfgSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CfgPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CfgPackage.XML2:
      {
        XML2 xml2 = (XML2)theEObject;
        T result = caseXML2(xml2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfgPackage.INPUT_DEF:
      {
        InputDef inputDef = (InputDef)theEObject;
        T result = caseInputDef(inputDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfgPackage.PACK_DEF:
      {
        PackDef packDef = (PackDef)theEObject;
        T result = casePackDef(packDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfgPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfgPackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfgPackage.FIELD_TYPE:
      {
        FieldType fieldType = (FieldType)theEObject;
        T result = caseFieldType(fieldType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfgPackage.ENUM:
      {
        org.chw.game.cfg.Enum enum_ = (org.chw.game.cfg.Enum)theEObject;
        T result = caseEnum(enum_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfgPackage.ENUM_FIELD:
      {
        EnumField enumField = (EnumField)theEObject;
        T result = caseEnumField(enumField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfgPackage.META:
      {
        Meta meta = (Meta)theEObject;
        T result = caseMeta(meta);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfgPackage.META_PARAM:
      {
        MetaParam metaParam = (MetaParam)theEObject;
        T result = caseMetaParam(metaParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CfgPackage.OTHER_COMENT:
      {
        OtherComent otherComent = (OtherComent)theEObject;
        T result = caseOtherComent(otherComent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXML2(XML2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputDef(InputDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pack Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pack Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackDef(PackDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldType(FieldType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum(org.chw.game.cfg.Enum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumField(EnumField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeta(Meta object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaParam(MetaParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Other Coment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Coment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOtherComent(OtherComent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CfgSwitch
