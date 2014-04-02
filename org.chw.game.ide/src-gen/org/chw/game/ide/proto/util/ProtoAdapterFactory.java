/**
 */
package org.chw.game.ide.proto.util;

import org.chw.game.ide.proto.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.chw.game.ide.proto.ProtoPackage
 * @generated
 */
public class ProtoAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProtoPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtoAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ProtoPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtoSwitch<Adapter> modelSwitch =
    new ProtoSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseImportInfo(ImportInfo object)
      {
        return createImportInfoAdapter();
      }
      @Override
      public Adapter caseOptionInfo(OptionInfo object)
      {
        return createOptionInfoAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseMap(Map object)
      {
        return createMapAdapter();
      }
      @Override
      public Adapter caseMapField(MapField object)
      {
        return createMapFieldAdapter();
      }
      @Override
      public Adapter caseMapRef(MapRef object)
      {
        return createMapRefAdapter();
      }
      @Override
      public Adapter caseMessageType(MessageType object)
      {
        return createMessageTypeAdapter();
      }
      @Override
      public Adapter caseMessageField(MessageField object)
      {
        return createMessageFieldAdapter();
      }
      @Override
      public Adapter caseMessageSimpleField(MessageSimpleField object)
      {
        return createMessageSimpleFieldAdapter();
      }
      @Override
      public Adapter caseMessageComplexField(MessageComplexField object)
      {
        return createMessageComplexFieldAdapter();
      }
      @Override
      public Adapter caseEnumType(EnumType object)
      {
        return createEnumTypeAdapter();
      }
      @Override
      public Adapter caseEnumField(EnumField object)
      {
        return createEnumFieldAdapter();
      }
      @Override
      public Adapter caseEnumFieldOpt(EnumFieldOpt object)
      {
        return createEnumFieldOptAdapter();
      }
      @Override
      public Adapter caseComment_ALL(Comment_ALL object)
      {
        return createComment_ALLAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.ImportInfo <em>Import Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.ImportInfo
   * @generated
   */
  public Adapter createImportInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.OptionInfo <em>Option Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.OptionInfo
   * @generated
   */
  public Adapter createOptionInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.Map <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.Map
   * @generated
   */
  public Adapter createMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.MapField <em>Map Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.MapField
   * @generated
   */
  public Adapter createMapFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.MapRef <em>Map Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.MapRef
   * @generated
   */
  public Adapter createMapRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.MessageType <em>Message Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.MessageType
   * @generated
   */
  public Adapter createMessageTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.MessageField <em>Message Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.MessageField
   * @generated
   */
  public Adapter createMessageFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.MessageSimpleField <em>Message Simple Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.MessageSimpleField
   * @generated
   */
  public Adapter createMessageSimpleFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.MessageComplexField <em>Message Complex Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.MessageComplexField
   * @generated
   */
  public Adapter createMessageComplexFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.EnumType
   * @generated
   */
  public Adapter createEnumTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.EnumField <em>Enum Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.EnumField
   * @generated
   */
  public Adapter createEnumFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.EnumFieldOpt <em>Enum Field Opt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.EnumFieldOpt
   * @generated
   */
  public Adapter createEnumFieldOptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.ide.proto.Comment_ALL <em>Comment ALL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.ide.proto.Comment_ALL
   * @generated
   */
  public Adapter createComment_ALLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ProtoAdapterFactory
