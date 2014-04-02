/**
 */
package org.chw.game.ide.proto.util;

import org.chw.game.ide.proto.*;

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
 * @see org.chw.game.ide.proto.ProtoPackage
 * @generated
 */
public class ProtoSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProtoPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtoSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ProtoPackage.eINSTANCE;
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
      case ProtoPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.IMPORT_INFO:
      {
        ImportInfo importInfo = (ImportInfo)theEObject;
        T result = caseImportInfo(importInfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.OPTION_INFO:
      {
        OptionInfo optionInfo = (OptionInfo)theEObject;
        T result = caseOptionInfo(optionInfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.MAP:
      {
        Map map = (Map)theEObject;
        T result = caseMap(map);
        if (result == null) result = caseElement(map);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.MAP_FIELD:
      {
        MapField mapField = (MapField)theEObject;
        T result = caseMapField(mapField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.MAP_REF:
      {
        MapRef mapRef = (MapRef)theEObject;
        T result = caseMapRef(mapRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.MESSAGE_TYPE:
      {
        MessageType messageType = (MessageType)theEObject;
        T result = caseMessageType(messageType);
        if (result == null) result = caseType(messageType);
        if (result == null) result = caseElement(messageType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.MESSAGE_FIELD:
      {
        MessageField messageField = (MessageField)theEObject;
        T result = caseMessageField(messageField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.MESSAGE_SIMPLE_FIELD:
      {
        MessageSimpleField messageSimpleField = (MessageSimpleField)theEObject;
        T result = caseMessageSimpleField(messageSimpleField);
        if (result == null) result = caseMessageField(messageSimpleField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.MESSAGE_COMPLEX_FIELD:
      {
        MessageComplexField messageComplexField = (MessageComplexField)theEObject;
        T result = caseMessageComplexField(messageComplexField);
        if (result == null) result = caseMessageField(messageComplexField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.ENUM_TYPE:
      {
        EnumType enumType = (EnumType)theEObject;
        T result = caseEnumType(enumType);
        if (result == null) result = caseType(enumType);
        if (result == null) result = caseElement(enumType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.ENUM_FIELD:
      {
        EnumField enumField = (EnumField)theEObject;
        T result = caseEnumField(enumField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.ENUM_FIELD_OPT:
      {
        EnumFieldOpt enumFieldOpt = (EnumFieldOpt)theEObject;
        T result = caseEnumFieldOpt(enumFieldOpt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtoPackage.COMMENT_ALL:
      {
        Comment_ALL comment_ALL = (Comment_ALL)theEObject;
        T result = caseComment_ALL(comment_ALL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportInfo(ImportInfo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionInfo(OptionInfo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
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
   * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMap(Map object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapField(MapField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapRef(MapRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageType(MessageType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageField(MessageField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Simple Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Simple Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageSimpleField(MessageSimpleField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Complex Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Complex Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageComplexField(MessageComplexField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumType(EnumType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Enum Field Opt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Field Opt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumFieldOpt(EnumFieldOpt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment ALL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment ALL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment_ALL(Comment_ALL object)
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

} //ProtoSwitch
