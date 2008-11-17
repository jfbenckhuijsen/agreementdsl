/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.IfRule#getElse <em>Else</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.IfRule#getThen <em>Then</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.IfRule#getComparison <em>Comparison</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getIfRule()
 * @model
 * @generated
 */
public interface IfRule extends AmountRule {
	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(ExpressionRule)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getIfRule_Else()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionRule getElse();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.IfRule#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(ExpressionRule value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(ExpressionRule)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getIfRule_Then()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionRule getThen();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.IfRule#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(ExpressionRule value);

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' containment reference.
	 * @see #setComparison(Comparison)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getIfRule_Comparison()
	 * @model containment="true"
	 * @generated
	 */
	Comparison getComparison();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.IfRule#getComparison <em>Comparison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' containment reference.
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(Comparison value);

} // IfRule
