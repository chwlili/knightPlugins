/**
 * <copyright>
 * </copyright>
 *

 */
package org.chw.game.ide.proto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chw.game.ide.proto.MapField#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.MapField#getName <em>Name</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.MapField#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.chw.game.ide.proto.MapField#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chw.game.ide.proto.ProtoPackage#getMapField()
 * @model
 * @generated
 */
public interface MapField extends EObject
{
  /**
   * Returns the value of the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' attribute.
   * @see #setAttr(String)
   * @see org.chw.game.ide.proto.ProtoPackage#getMapField_Attr()
   * @model
   * @generated
   */
  String getAttr();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.MapField#getAttr <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' attribute.
   * @see #getAttr()
   * @generated
   */
  void setAttr(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.chw.game.ide.proto.ProtoPackage#getMapField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.MapField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' reference.
   * @see #setFilter(Map)
   * @see org.chw.game.ide.proto.ProtoPackage#getMapField_Filter()
   * @model
   * @generated
   */
  Map getFilter();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.MapField#getFilter <em>Filter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(Map value);

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference.
   * @see #setLinks(MapRef)
   * @see org.chw.game.ide.proto.ProtoPackage#getMapField_Links()
   * @model containment="true"
   * @generated
   */
  MapRef getLinks();

  /**
   * Sets the value of the '{@link org.chw.game.ide.proto.MapField#getLinks <em>Links</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Links</em>' containment reference.
   * @see #getLinks()
   * @generated
   */
  void setLinks(MapRef value);

} // MapField
