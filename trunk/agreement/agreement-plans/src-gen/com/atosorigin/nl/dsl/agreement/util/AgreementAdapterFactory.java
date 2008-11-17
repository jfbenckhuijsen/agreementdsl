/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement.util;

import com.atosorigin.nl.dsl.agreement.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage
 * @generated
 */
public class AgreementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AgreementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AgreementPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementSwitch<Adapter> modelSwitch =
		new AgreementSwitch<Adapter>() {
			@Override
			public Adapter casePlan(Plan object) {
				return createPlanAdapter();
			}
			@Override
			public Adapter caseRateDecl(RateDecl object) {
				return createRateDeclAdapter();
			}
			@Override
			public Adapter caseValueDecl(ValueDecl object) {
				return createValueDeclAdapter();
			}
			@Override
			public Adapter caseEventRulesDecl(EventRulesDecl object) {
				return createEventRulesDeclAdapter();
			}
			@Override
			public Adapter caseTemporalPostingRule(TemporalPostingRule object) {
				return createTemporalPostingRuleAdapter();
			}
			@Override
			public Adapter caseAmount(Amount object) {
				return createAmountAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseAmountRule(AmountRule object) {
				return createAmountRuleAdapter();
			}
			@Override
			public Adapter caseSingleTermRule(SingleTermRule object) {
				return createSingleTermRuleAdapter();
			}
			@Override
			public Adapter caseLiteralRule(LiteralRule object) {
				return createLiteralRuleAdapter();
			}
			@Override
			public Adapter caseVariableRule(VariableRule object) {
				return createVariableRuleAdapter();
			}
			@Override
			public Adapter caseExpressionRule(ExpressionRule object) {
				return createExpressionRuleAdapter();
			}
			@Override
			public Adapter caseExpressionRuleHead(ExpressionRuleHead object) {
				return createExpressionRuleHeadAdapter();
			}
			@Override
			public Adapter caseExpressionRuleParenthesised(ExpressionRuleParenthesised object) {
				return createExpressionRuleParenthesisedAdapter();
			}
			@Override
			public Adapter caseIfRule(IfRule object) {
				return createIfRuleAdapter();
			}
			@Override
			public Adapter caseComparison(Comparison object) {
				return createComparisonAdapter();
			}
			@Override
			public Adapter caseCompoundComparison(CompoundComparison object) {
				return createCompoundComparisonAdapter();
			}
			@Override
			public Adapter caseAndComparison(AndComparison object) {
				return createAndComparisonAdapter();
			}
			@Override
			public Adapter caseOrComparison(OrComparison object) {
				return createOrComparisonAdapter();
			}
			@Override
			public Adapter caseSimpleComparison(SimpleComparison object) {
				return createSimpleComparisonAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.Plan
	 * @generated
	 */
	public Adapter createPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.RateDecl <em>Rate Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.RateDecl
	 * @generated
	 */
	public Adapter createRateDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.ValueDecl <em>Value Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.ValueDecl
	 * @generated
	 */
	public Adapter createValueDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.EventRulesDecl <em>Event Rules Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.EventRulesDecl
	 * @generated
	 */
	public Adapter createEventRulesDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule <em>Temporal Posting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.TemporalPostingRule
	 * @generated
	 */
	public Adapter createTemporalPostingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.Amount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.Amount
	 * @generated
	 */
	public Adapter createAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.AmountRule <em>Amount Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.AmountRule
	 * @generated
	 */
	public Adapter createAmountRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.SingleTermRule <em>Single Term Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.SingleTermRule
	 * @generated
	 */
	public Adapter createSingleTermRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.LiteralRule <em>Literal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.LiteralRule
	 * @generated
	 */
	public Adapter createLiteralRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.VariableRule <em>Variable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.VariableRule
	 * @generated
	 */
	public Adapter createVariableRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.ExpressionRule <em>Expression Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.ExpressionRule
	 * @generated
	 */
	public Adapter createExpressionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.ExpressionRuleHead <em>Expression Rule Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.ExpressionRuleHead
	 * @generated
	 */
	public Adapter createExpressionRuleHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.ExpressionRuleParenthesised <em>Expression Rule Parenthesised</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.ExpressionRuleParenthesised
	 * @generated
	 */
	public Adapter createExpressionRuleParenthesisedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.IfRule <em>If Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.IfRule
	 * @generated
	 */
	public Adapter createIfRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.CompoundComparison <em>Compound Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.CompoundComparison
	 * @generated
	 */
	public Adapter createCompoundComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.AndComparison <em>And Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.AndComparison
	 * @generated
	 */
	public Adapter createAndComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.OrComparison <em>Or Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.OrComparison
	 * @generated
	 */
	public Adapter createOrComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.atosorigin.nl.dsl.agreement.SimpleComparison <em>Simple Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.atosorigin.nl.dsl.agreement.SimpleComparison
	 * @generated
	 */
	public Adapter createSimpleComparisonAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AgreementAdapterFactory
