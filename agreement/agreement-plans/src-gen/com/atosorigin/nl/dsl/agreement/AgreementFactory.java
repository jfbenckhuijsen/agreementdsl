/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage
 * @generated
 */
public interface AgreementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgreementFactory eINSTANCE = com.atosorigin.nl.dsl.agreement.impl.AgreementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan</em>'.
	 * @generated
	 */
	Plan createPlan();

	/**
	 * Returns a new object of class '<em>Rate Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rate Decl</em>'.
	 * @generated
	 */
	RateDecl createRateDecl();

	/**
	 * Returns a new object of class '<em>Value Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Decl</em>'.
	 * @generated
	 */
	ValueDecl createValueDecl();

	/**
	 * Returns a new object of class '<em>Event Rules Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Rules Decl</em>'.
	 * @generated
	 */
	EventRulesDecl createEventRulesDecl();

	/**
	 * Returns a new object of class '<em>Temporal Posting Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Posting Rule</em>'.
	 * @generated
	 */
	TemporalPostingRule createTemporalPostingRule();

	/**
	 * Returns a new object of class '<em>Amount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount</em>'.
	 * @generated
	 */
	Amount createAmount();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Literal Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Rule</em>'.
	 * @generated
	 */
	LiteralRule createLiteralRule();

	/**
	 * Returns a new object of class '<em>Variable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Rule</em>'.
	 * @generated
	 */
	VariableRule createVariableRule();

	/**
	 * Returns a new object of class '<em>Expression Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Rule</em>'.
	 * @generated
	 */
	ExpressionRule createExpressionRule();

	/**
	 * Returns a new object of class '<em>Expression Rule Parenthesised</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Rule Parenthesised</em>'.
	 * @generated
	 */
	ExpressionRuleParenthesised createExpressionRuleParenthesised();

	/**
	 * Returns a new object of class '<em>If Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Rule</em>'.
	 * @generated
	 */
	IfRule createIfRule();

	/**
	 * Returns a new object of class '<em>And Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Comparison</em>'.
	 * @generated
	 */
	AndComparison createAndComparison();

	/**
	 * Returns a new object of class '<em>Or Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Comparison</em>'.
	 * @generated
	 */
	OrComparison createOrComparison();

	/**
	 * Returns a new object of class '<em>Simple Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Comparison</em>'.
	 * @generated
	 */
	SimpleComparison createSimpleComparison();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AgreementPackage getAgreementPackage();

} //AgreementFactory
