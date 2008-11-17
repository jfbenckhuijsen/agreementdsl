/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement.util;

import com.atosorigin.nl.dsl.agreement.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage
 * @generated
 */
public class AgreementSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AgreementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementSwitch() {
		if (modelPackage == null) {
			modelPackage = AgreementPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AgreementPackage.PLAN: {
				Plan plan = (Plan)theEObject;
				T result = casePlan(plan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.RATE_DECL: {
				RateDecl rateDecl = (RateDecl)theEObject;
				T result = caseRateDecl(rateDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.VALUE_DECL: {
				ValueDecl valueDecl = (ValueDecl)theEObject;
				T result = caseValueDecl(valueDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.EVENT_RULES_DECL: {
				EventRulesDecl eventRulesDecl = (EventRulesDecl)theEObject;
				T result = caseEventRulesDecl(eventRulesDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.TEMPORAL_POSTING_RULE: {
				TemporalPostingRule temporalPostingRule = (TemporalPostingRule)theEObject;
				T result = caseTemporalPostingRule(temporalPostingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.AMOUNT: {
				Amount amount = (Amount)theEObject;
				T result = caseAmount(amount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.AMOUNT_RULE: {
				AmountRule amountRule = (AmountRule)theEObject;
				T result = caseAmountRule(amountRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.SINGLE_TERM_RULE: {
				SingleTermRule singleTermRule = (SingleTermRule)theEObject;
				T result = caseSingleTermRule(singleTermRule);
				if (result == null) result = caseExpressionRuleHead(singleTermRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.LITERAL_RULE: {
				LiteralRule literalRule = (LiteralRule)theEObject;
				T result = caseLiteralRule(literalRule);
				if (result == null) result = caseSingleTermRule(literalRule);
				if (result == null) result = caseExpressionRuleHead(literalRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.VARIABLE_RULE: {
				VariableRule variableRule = (VariableRule)theEObject;
				T result = caseVariableRule(variableRule);
				if (result == null) result = caseSingleTermRule(variableRule);
				if (result == null) result = caseExpressionRuleHead(variableRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.EXPRESSION_RULE: {
				ExpressionRule expressionRule = (ExpressionRule)theEObject;
				T result = caseExpressionRule(expressionRule);
				if (result == null) result = caseAmountRule(expressionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.EXPRESSION_RULE_HEAD: {
				ExpressionRuleHead expressionRuleHead = (ExpressionRuleHead)theEObject;
				T result = caseExpressionRuleHead(expressionRuleHead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.EXPRESSION_RULE_PARENTHESISED: {
				ExpressionRuleParenthesised expressionRuleParenthesised = (ExpressionRuleParenthesised)theEObject;
				T result = caseExpressionRuleParenthesised(expressionRuleParenthesised);
				if (result == null) result = caseExpressionRuleHead(expressionRuleParenthesised);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.IF_RULE: {
				IfRule ifRule = (IfRule)theEObject;
				T result = caseIfRule(ifRule);
				if (result == null) result = caseAmountRule(ifRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.COMPARISON: {
				Comparison comparison = (Comparison)theEObject;
				T result = caseComparison(comparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.COMPOUND_COMPARISON: {
				CompoundComparison compoundComparison = (CompoundComparison)theEObject;
				T result = caseCompoundComparison(compoundComparison);
				if (result == null) result = caseComparison(compoundComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.AND_COMPARISON: {
				AndComparison andComparison = (AndComparison)theEObject;
				T result = caseAndComparison(andComparison);
				if (result == null) result = caseCompoundComparison(andComparison);
				if (result == null) result = caseComparison(andComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.OR_COMPARISON: {
				OrComparison orComparison = (OrComparison)theEObject;
				T result = caseOrComparison(orComparison);
				if (result == null) result = caseCompoundComparison(orComparison);
				if (result == null) result = caseComparison(orComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgreementPackage.SIMPLE_COMPARISON: {
				SimpleComparison simpleComparison = (SimpleComparison)theEObject;
				T result = caseSimpleComparison(simpleComparison);
				if (result == null) result = caseComparison(simpleComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlan(Plan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateDecl(RateDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueDecl(ValueDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Rules Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Rules Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventRulesDecl(EventRulesDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Posting Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Posting Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalPostingRule(TemporalPostingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmount(Amount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmountRule(AmountRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Term Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Term Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleTermRule(SingleTermRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralRule(LiteralRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRule(VariableRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionRule(ExpressionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Rule Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Rule Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionRuleHead(ExpressionRuleHead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Rule Parenthesised</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Rule Parenthesised</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionRuleParenthesised(ExpressionRuleParenthesised object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfRule(IfRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparison(Comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundComparison(CompoundComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndComparison(AndComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrComparison(OrComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleComparison(SimpleComparison object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //AgreementSwitch
