/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.cfg.util;

import org.chw.game.cfg.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.chw.game.cfg.CfgPackage
 * @generated
 */
public class CfgAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CfgPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CfgAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CfgPackage.eINSTANCE;
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
  protected CfgSwitch<Adapter> modelSwitch =
    new CfgSwitch<Adapter>()
    {
      @Override
      public Adapter caseXML2(XML2 object)
      {
        return createXML2Adapter();
      }
      @Override
      public Adapter caseInputDef(InputDef object)
      {
        return createInputDefAdapter();
      }
      @Override
      public Adapter casePackDef(PackDef object)
      {
        return createPackDefAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseEnter(Enter object)
      {
        return createEnterAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseFieldType(FieldType object)
      {
        return createFieldTypeAdapter();
      }
      @Override
      public Adapter caseFieldMeta(FieldMeta object)
      {
        return createFieldMetaAdapter();
      }
      @Override
      public Adapter caseFieldMetaKey(FieldMetaKey object)
      {
        return createFieldMetaKeyAdapter();
      }
      @Override
      public Adapter caseOtherComent(OtherComent object)
      {
        return createOtherComentAdapter();
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
   * Creates a new adapter for an object of class '{@link org.chw.game.cfg.XML2 <em>XML2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.cfg.XML2
   * @generated
   */
  public Adapter createXML2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.cfg.InputDef <em>Input Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.cfg.InputDef
   * @generated
   */
  public Adapter createInputDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.cfg.PackDef <em>Pack Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.cfg.PackDef
   * @generated
   */
  public Adapter createPackDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.cfg.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.cfg.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.cfg.Enter <em>Enter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.cfg.Enter
   * @generated
   */
  public Adapter createEnterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.cfg.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.cfg.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.cfg.FieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.cfg.FieldType
   * @generated
   */
  public Adapter createFieldTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.cfg.FieldMeta <em>Field Meta</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.cfg.FieldMeta
   * @generated
   */
  public Adapter createFieldMetaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.cfg.FieldMetaKey <em>Field Meta Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.cfg.FieldMetaKey
   * @generated
   */
  public Adapter createFieldMetaKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chw.game.cfg.OtherComent <em>Other Coment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chw.game.cfg.OtherComent
   * @generated
   */
  public Adapter createOtherComentAdapter()
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

} //CfgAdapterFactory
