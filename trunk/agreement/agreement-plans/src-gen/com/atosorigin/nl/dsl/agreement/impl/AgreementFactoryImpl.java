/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement.impl;

import com.atosorigin.nl.dsl.agreement.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgreementFactoryImpl extends EFactoryImpl implements AgreementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AgreementFactory init() {
		try {
			AgreementFactory theAgreementFactory = (AgreementFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.nl.atosorigin.com/dsl/agreement"); 
			if (theAgreementFactory != null) {
				return theAgreementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AgreementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AgreementPackage.PLAN: return createPlan();
			case AgreementPackage.RATE_DECL: return createRateDecl();
			case AgreementPackage.VALUE_DECL: return createValueDecl();
			case AgreementPackage.EVENT_RULES_DECL: return createEventRulesDecl();
			case AgreementPackage.TEMPORAL_POSTING_RULE: return createTemporalPostingRule();
			case AgreementPackage.AMOUNT: return createAmount();
			case AgreementPackage.DATE: return createDate();
			case AgreementPackage.LITERAL_RULE: return createLiteralRule();
			case AgreementPackage.VARIABLE_RULE: return createVariableRule();
			case AgreementPackage.EXPRESSION_RULE: return createExpressionRule();
			case AgreementPackage.EXPRESSION_RULE_PARENTHESISED: return createExpressionRuleParenthesised();
			case AgreementPackage.IF_RULE: return createIfRule();
			case AgreementPackage.AND_COMPARISON: return createAndComparison();
			case AgreementPackage.OR_COMPARISON: return createOrComparison();
			case AgreementPackage.SIMPLE_COMPARISON: return createSimpleComparison();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AgreementPackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case AgreementPackage.ACCOUNT_NAME:
				return createAccountNameFromString(eDataType, initialValue);
			case AgreementPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			case AgreementPackage.COMPARATOR:
				return createComparatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AgreementPackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case AgreementPackage.ACCOUNT_NAME:
				return convertAccountNameToString(eDataType, instanceValue);
			case AgreementPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			case AgreementPackage.COMPARATOR:
				return convertComparatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan createPlan() {
		PlanImpl plan = new PlanImpl();
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateDecl createRateDecl() {
		RateDeclImpl rateDecl = new RateDeclImpl();
		return rateDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDecl createValueDecl() {
		ValueDeclImpl valueDecl = new ValueDeclImpl();
		return valueDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRulesDecl createEventRulesDecl() {
		EventRulesDeclImpl eventRulesDecl = new EventRulesDeclImpl();
		return eventRulesDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalPostingRule createTemporalPostingRule() {
		TemporalPostingRuleImpl temporalPostingRule = new TemporalPostingRuleImpl();
		return temporalPostingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amount createAmount() {
		AmountImpl amount = new AmountImpl();
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralRule createLiteralRule() {
		LiteralRuleImpl literalRule = new LiteralRuleImpl();
		return literalRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRule createVariableRule() {
		VariableRuleImpl variableRule = new VariableRuleImpl();
		return variableRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionRule createExpressionRule() {
		ExpressionRuleImpl expressionRule = new ExpressionRuleImpl();
		return expressionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionRuleParenthesised createExpressionRuleParenthesised() {
		ExpressionRuleParenthesisedImpl expressionRuleParenthesised = new ExpressionRuleParenthesisedImpl();
		return expressionRuleParenthesised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfRule createIfRule() {
		IfRuleImpl ifRule = new IfRuleImpl();
		return ifRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndComparison createAndComparison() {
		AndComparisonImpl andComparison = new AndComparisonImpl();
		return andComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrComparison createOrComparison() {
		OrComparisonImpl orComparison = new OrComparisonImpl();
		return orComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleComparison createSimpleComparison() {
		SimpleComparisonImpl simpleComparison = new SimpleComparisonImpl();
		return simpleComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountName createAccountNameFromString(EDataType eDataType, String initialValue) {
		AccountName result = AccountName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparator createComparatorFromString(EDataType eDataType, String initialValue) {
		Comparator result = Comparator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementPackage getAgreementPackage() {
		return (AgreementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AgreementPackage getPackage() {
		return AgreementPackage.eINSTANCE;
	}

} //AgreementFactoryImpl
