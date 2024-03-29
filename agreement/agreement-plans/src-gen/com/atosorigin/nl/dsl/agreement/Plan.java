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
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.Plan#getName <em>Name</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.Plan#getRates <em>Rates</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.Plan#getEventRules <em>Event Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getPlan()
 * @model
 * @generated
 */
public interface Plan extends EObject {
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
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getPlan_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.Plan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rates</b></em>' containment reference list.
	 * The list contents are of type {@link com.atosorigin.nl.dsl.agreement.RateDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rates</em>' containment reference list.
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getPlan_Rates()
	 * @model containment="true"
	 * @generated
	 */
	EList<RateDecl> getRates();

	/**
	 * Returns the value of the '<em><b>Event Rules</b></em>' containment reference list.
	 * The list contents are of type {@link com.atosorigin.nl.dsl.agreement.EventRulesDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Rules</em>' containment reference list.
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getPlan_EventRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventRulesDecl> getEventRules();

} // Plan
