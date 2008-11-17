/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Posting Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getAmountRule <em>Amount Rule</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getAccount <em>Account</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getTemporalPostingRule()
 * @model
 * @generated
 */
public interface TemporalPostingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Amount Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Rule</em>' containment reference.
	 * @see #setAmountRule(AmountRule)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getTemporalPostingRule_AmountRule()
	 * @model containment="true"
	 * @generated
	 */
	AmountRule getAmountRule();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getAmountRule <em>Amount Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Rule</em>' containment reference.
	 * @see #getAmountRule()
	 * @generated
	 */
	void setAmountRule(AmountRule value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' attribute.
	 * The literals are from the enumeration {@link com.atosorigin.nl.dsl.agreement.AccountName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' attribute.
	 * @see com.atosorigin.nl.dsl.agreement.AccountName
	 * @see #setAccount(AccountName)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getTemporalPostingRule_Account()
	 * @model
	 * @generated
	 */
	AccountName getAccount();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getAccount <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' attribute.
	 * @see com.atosorigin.nl.dsl.agreement.AccountName
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(AccountName value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getTemporalPostingRule_Date()
	 * @model containment="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // TemporalPostingRule
