/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.ExpressionRule#getHead <em>Head</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.ExpressionRule#getRight <em>Right</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.ExpressionRule#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getExpressionRule()
 * @model
 * @generated
 */
public interface ExpressionRule extends AmountRule {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(ExpressionRuleHead)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getExpressionRule_Head()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionRuleHead getHead();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.ExpressionRule#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(ExpressionRuleHead value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ExpressionRule)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getExpressionRule_Right()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionRule getRight();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.ExpressionRule#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ExpressionRule value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.atosorigin.nl.dsl.agreement.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.atosorigin.nl.dsl.agreement.Operator
	 * @see #setOperator(Operator)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getExpressionRule_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.ExpressionRule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.atosorigin.nl.dsl.agreement.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // ExpressionRule
