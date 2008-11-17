/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.RateDecl#getValues <em>Values</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.RateDecl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getRateDecl()
 * @model
 * @generated
 */
public interface RateDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link com.atosorigin.nl.dsl.agreement.ValueDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getRateDecl_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueDecl> getValues();

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
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getRateDecl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.RateDecl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RateDecl
