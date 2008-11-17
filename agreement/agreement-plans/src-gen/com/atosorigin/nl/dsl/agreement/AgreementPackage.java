/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.atosorigin.nl.dsl.agreement.AgreementFactory
 * @model kind="package"
 * @generated
 */
public interface AgreementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agreement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nl.atosorigin.com/dsl/agreement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agreement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgreementPackage eINSTANCE = com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.PlanImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__RATES = 1;

	/**
	 * The feature id for the '<em><b>Event Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__EVENT_RULES = 2;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.RateDeclImpl <em>Rate Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.RateDeclImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getRateDecl()
	 * @generated
	 */
	int RATE_DECL = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_DECL__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_DECL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Rate Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_DECL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.ValueDeclImpl <em>Value Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.ValueDeclImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getValueDecl()
	 * @generated
	 */
	int VALUE_DECL = 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DECL__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DECL__DATE = 1;

	/**
	 * The number of structural features of the '<em>Value Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DECL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.EventRulesDeclImpl <em>Event Rules Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.EventRulesDeclImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getEventRulesDecl()
	 * @generated
	 */
	int EVENT_RULES_DECL = 3;

	/**
	 * The feature id for the '<em><b>Posting Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RULES_DECL__POSTING_RULES = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RULES_DECL__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Event Rules Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RULES_DECL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.TemporalPostingRuleImpl <em>Temporal Posting Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.TemporalPostingRuleImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getTemporalPostingRule()
	 * @generated
	 */
	int TEMPORAL_POSTING_RULE = 4;

	/**
	 * The feature id for the '<em><b>Amount Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_POSTING_RULE__AMOUNT_RULE = 0;

	/**
	 * The feature id for the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_POSTING_RULE__ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_POSTING_RULE__DATE = 2;

	/**
	 * The number of structural features of the '<em>Temporal Posting Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_POSTING_RULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.AmountImpl <em>Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.AmountImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getAmount()
	 * @generated
	 */
	int AMOUNT = 5;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.DateImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 6;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MONTH = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DAY = 2;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.AmountRuleImpl <em>Amount Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.AmountRuleImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getAmountRule()
	 * @generated
	 */
	int AMOUNT_RULE = 7;

	/**
	 * The number of structural features of the '<em>Amount Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_RULE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleHeadImpl <em>Expression Rule Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleHeadImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getExpressionRuleHead()
	 * @generated
	 */
	int EXPRESSION_RULE_HEAD = 12;

	/**
	 * The number of structural features of the '<em>Expression Rule Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RULE_HEAD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.SingleTermRuleImpl <em>Single Term Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.SingleTermRuleImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getSingleTermRule()
	 * @generated
	 */
	int SINGLE_TERM_RULE = 8;

	/**
	 * The number of structural features of the '<em>Single Term Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TERM_RULE_FEATURE_COUNT = EXPRESSION_RULE_HEAD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.LiteralRuleImpl <em>Literal Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.LiteralRuleImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getLiteralRule()
	 * @generated
	 */
	int LITERAL_RULE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_RULE__VALUE = SINGLE_TERM_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_RULE_FEATURE_COUNT = SINGLE_TERM_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.VariableRuleImpl <em>Variable Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.VariableRuleImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getVariableRule()
	 * @generated
	 */
	int VARIABLE_RULE = 10;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_RULE__VARIABLE = SINGLE_TERM_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_RULE_FEATURE_COUNT = SINGLE_TERM_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleImpl <em>Expression Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getExpressionRule()
	 * @generated
	 */
	int EXPRESSION_RULE = 11;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RULE__HEAD = AMOUNT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RULE__RIGHT = AMOUNT_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RULE__OPERATOR = AMOUNT_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expression Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RULE_FEATURE_COUNT = AMOUNT_RULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleParenthesisedImpl <em>Expression Rule Parenthesised</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleParenthesisedImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getExpressionRuleParenthesised()
	 * @generated
	 */
	int EXPRESSION_RULE_PARENTHESISED = 13;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RULE_PARENTHESISED__EXPRESSION = EXPRESSION_RULE_HEAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Rule Parenthesised</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RULE_PARENTHESISED_FEATURE_COUNT = EXPRESSION_RULE_HEAD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.IfRuleImpl <em>If Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.IfRuleImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getIfRule()
	 * @generated
	 */
	int IF_RULE = 14;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_RULE__ELSE = AMOUNT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_RULE__THEN = AMOUNT_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_RULE__COMPARISON = AMOUNT_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_RULE_FEATURE_COUNT = AMOUNT_RULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.ComparisonImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 15;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.CompoundComparisonImpl <em>Compound Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.CompoundComparisonImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getCompoundComparison()
	 * @generated
	 */
	int COMPOUND_COMPARISON = 16;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COMPARISON__RIGHT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COMPARISON__LEFT = COMPARISON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compound Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COMPARISON_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.AndComparisonImpl <em>And Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.AndComparisonImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getAndComparison()
	 * @generated
	 */
	int AND_COMPARISON = 17;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COMPARISON__RIGHT = COMPOUND_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COMPARISON__LEFT = COMPOUND_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>And Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COMPARISON_FEATURE_COUNT = COMPOUND_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.OrComparisonImpl <em>Or Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.OrComparisonImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getOrComparison()
	 * @generated
	 */
	int OR_COMPARISON = 18;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_COMPARISON__RIGHT = COMPOUND_COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_COMPARISON__LEFT = COMPOUND_COMPARISON__LEFT;

	/**
	 * The number of structural features of the '<em>Or Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_COMPARISON_FEATURE_COUNT = COMPOUND_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.impl.SimpleComparisonImpl <em>Simple Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.impl.SimpleComparisonImpl
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getSimpleComparison()
	 * @generated
	 */
	int SIMPLE_COMPARISON = 19;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARISON__LEFT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARISON__RIGHT = COMPARISON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARISON__OPERATOR = COMPARISON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARISON_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.EventType
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 20;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.AccountName <em>Account Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.AccountName
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getAccountName()
	 * @generated
	 */
	int ACCOUNT_NAME = 21;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.Operator
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 22;

	/**
	 * The meta object id for the '{@link com.atosorigin.nl.dsl.agreement.Comparator <em>Comparator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.atosorigin.nl.dsl.agreement.Comparator
	 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 23;


	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.Plan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Plan#getName()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.atosorigin.nl.dsl.agreement.Plan#getRates <em>Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rates</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Plan#getRates()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_Rates();

	/**
	 * Returns the meta object for the containment reference list '{@link com.atosorigin.nl.dsl.agreement.Plan#getEventRules <em>Event Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Rules</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Plan#getEventRules()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_EventRules();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.RateDecl <em>Rate Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate Decl</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.RateDecl
	 * @generated
	 */
	EClass getRateDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link com.atosorigin.nl.dsl.agreement.RateDecl#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.RateDecl#getValues()
	 * @see #getRateDecl()
	 * @generated
	 */
	EReference getRateDecl_Values();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.RateDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.RateDecl#getName()
	 * @see #getRateDecl()
	 * @generated
	 */
	EAttribute getRateDecl_Name();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.ValueDecl <em>Value Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Decl</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.ValueDecl
	 * @generated
	 */
	EClass getValueDecl();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.ValueDecl#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amount</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.ValueDecl#getAmount()
	 * @see #getValueDecl()
	 * @generated
	 */
	EReference getValueDecl_Amount();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.ValueDecl#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.ValueDecl#getDate()
	 * @see #getValueDecl()
	 * @generated
	 */
	EReference getValueDecl_Date();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.EventRulesDecl <em>Event Rules Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Rules Decl</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.EventRulesDecl
	 * @generated
	 */
	EClass getEventRulesDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link com.atosorigin.nl.dsl.agreement.EventRulesDecl#getPostingRules <em>Posting Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posting Rules</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.EventRulesDecl#getPostingRules()
	 * @see #getEventRulesDecl()
	 * @generated
	 */
	EReference getEventRulesDecl_PostingRules();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.EventRulesDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.EventRulesDecl#getType()
	 * @see #getEventRulesDecl()
	 * @generated
	 */
	EAttribute getEventRulesDecl_Type();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule <em>Temporal Posting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Posting Rule</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.TemporalPostingRule
	 * @generated
	 */
	EClass getTemporalPostingRule();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getAmountRule <em>Amount Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amount Rule</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getAmountRule()
	 * @see #getTemporalPostingRule()
	 * @generated
	 */
	EReference getTemporalPostingRule_AmountRule();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getAccount()
	 * @see #getTemporalPostingRule()
	 * @generated
	 */
	EAttribute getTemporalPostingRule_Account();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.TemporalPostingRule#getDate()
	 * @see #getTemporalPostingRule()
	 * @generated
	 */
	EReference getTemporalPostingRule_Date();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.Amount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Amount
	 * @generated
	 */
	EClass getAmount();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.Amount#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Amount#getUnit()
	 * @see #getAmount()
	 * @generated
	 */
	EAttribute getAmount_Unit();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.Amount#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Amount#getValue()
	 * @see #getAmount()
	 * @generated
	 */
	EAttribute getAmount_Value();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.Date#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Date#getMonth()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Month();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.Date#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Date#getYear()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Year();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.Date#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Date#getDay()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Day();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.AmountRule <em>Amount Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount Rule</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.AmountRule
	 * @generated
	 */
	EClass getAmountRule();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.SingleTermRule <em>Single Term Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Term Rule</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.SingleTermRule
	 * @generated
	 */
	EClass getSingleTermRule();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.LiteralRule <em>Literal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Rule</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.LiteralRule
	 * @generated
	 */
	EClass getLiteralRule();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.LiteralRule#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.LiteralRule#getValue()
	 * @see #getLiteralRule()
	 * @generated
	 */
	EReference getLiteralRule_Value();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.VariableRule <em>Variable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Rule</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.VariableRule
	 * @generated
	 */
	EClass getVariableRule();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.VariableRule#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.VariableRule#getVariable()
	 * @see #getVariableRule()
	 * @generated
	 */
	EAttribute getVariableRule_Variable();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.ExpressionRule <em>Expression Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Rule</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.ExpressionRule
	 * @generated
	 */
	EClass getExpressionRule();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.ExpressionRule#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.ExpressionRule#getHead()
	 * @see #getExpressionRule()
	 * @generated
	 */
	EReference getExpressionRule_Head();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.ExpressionRule#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.ExpressionRule#getRight()
	 * @see #getExpressionRule()
	 * @generated
	 */
	EReference getExpressionRule_Right();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.ExpressionRule#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.ExpressionRule#getOperator()
	 * @see #getExpressionRule()
	 * @generated
	 */
	EAttribute getExpressionRule_Operator();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.ExpressionRuleHead <em>Expression Rule Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Rule Head</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.ExpressionRuleHead
	 * @generated
	 */
	EClass getExpressionRuleHead();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.ExpressionRuleParenthesised <em>Expression Rule Parenthesised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Rule Parenthesised</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.ExpressionRuleParenthesised
	 * @generated
	 */
	EClass getExpressionRuleParenthesised();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.ExpressionRuleParenthesised#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.ExpressionRuleParenthesised#getExpression()
	 * @see #getExpressionRuleParenthesised()
	 * @generated
	 */
	EReference getExpressionRuleParenthesised_Expression();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.IfRule <em>If Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Rule</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.IfRule
	 * @generated
	 */
	EClass getIfRule();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.IfRule#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.IfRule#getElse()
	 * @see #getIfRule()
	 * @generated
	 */
	EReference getIfRule_Else();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.IfRule#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.IfRule#getThen()
	 * @see #getIfRule()
	 * @generated
	 */
	EReference getIfRule_Then();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.IfRule#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.IfRule#getComparison()
	 * @see #getIfRule()
	 * @generated
	 */
	EReference getIfRule_Comparison();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.CompoundComparison <em>Compound Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Comparison</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.CompoundComparison
	 * @generated
	 */
	EClass getCompoundComparison();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.CompoundComparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.CompoundComparison#getRight()
	 * @see #getCompoundComparison()
	 * @generated
	 */
	EReference getCompoundComparison_Right();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.CompoundComparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.CompoundComparison#getLeft()
	 * @see #getCompoundComparison()
	 * @generated
	 */
	EReference getCompoundComparison_Left();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.AndComparison <em>And Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Comparison</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.AndComparison
	 * @generated
	 */
	EClass getAndComparison();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.OrComparison <em>Or Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Comparison</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.OrComparison
	 * @generated
	 */
	EClass getOrComparison();

	/**
	 * Returns the meta object for class '{@link com.atosorigin.nl.dsl.agreement.SimpleComparison <em>Simple Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Comparison</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.SimpleComparison
	 * @generated
	 */
	EClass getSimpleComparison();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.SimpleComparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.SimpleComparison#getLeft()
	 * @see #getSimpleComparison()
	 * @generated
	 */
	EReference getSimpleComparison_Left();

	/**
	 * Returns the meta object for the containment reference '{@link com.atosorigin.nl.dsl.agreement.SimpleComparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.SimpleComparison#getRight()
	 * @see #getSimpleComparison()
	 * @generated
	 */
	EReference getSimpleComparison_Right();

	/**
	 * Returns the meta object for the attribute '{@link com.atosorigin.nl.dsl.agreement.SimpleComparison#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.SimpleComparison#getOperator()
	 * @see #getSimpleComparison()
	 * @generated
	 */
	EAttribute getSimpleComparison_Operator();

	/**
	 * Returns the meta object for enum '{@link com.atosorigin.nl.dsl.agreement.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the meta object for enum '{@link com.atosorigin.nl.dsl.agreement.AccountName <em>Account Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Account Name</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.AccountName
	 * @generated
	 */
	EEnum getAccountName();

	/**
	 * Returns the meta object for enum '{@link com.atosorigin.nl.dsl.agreement.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link com.atosorigin.nl.dsl.agreement.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparator</em>'.
	 * @see com.atosorigin.nl.dsl.agreement.Comparator
	 * @generated
	 */
	EEnum getComparator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AgreementFactory getAgreementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.PlanImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__NAME = eINSTANCE.getPlan_Name();

		/**
		 * The meta object literal for the '<em><b>Rates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__RATES = eINSTANCE.getPlan_Rates();

		/**
		 * The meta object literal for the '<em><b>Event Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__EVENT_RULES = eINSTANCE.getPlan_EventRules();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.RateDeclImpl <em>Rate Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.RateDeclImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getRateDecl()
		 * @generated
		 */
		EClass RATE_DECL = eINSTANCE.getRateDecl();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATE_DECL__VALUES = eINSTANCE.getRateDecl_Values();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_DECL__NAME = eINSTANCE.getRateDecl_Name();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.ValueDeclImpl <em>Value Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.ValueDeclImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getValueDecl()
		 * @generated
		 */
		EClass VALUE_DECL = eINSTANCE.getValueDecl();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_DECL__AMOUNT = eINSTANCE.getValueDecl_Amount();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_DECL__DATE = eINSTANCE.getValueDecl_Date();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.EventRulesDeclImpl <em>Event Rules Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.EventRulesDeclImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getEventRulesDecl()
		 * @generated
		 */
		EClass EVENT_RULES_DECL = eINSTANCE.getEventRulesDecl();

		/**
		 * The meta object literal for the '<em><b>Posting Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_RULES_DECL__POSTING_RULES = eINSTANCE.getEventRulesDecl_PostingRules();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_RULES_DECL__TYPE = eINSTANCE.getEventRulesDecl_Type();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.TemporalPostingRuleImpl <em>Temporal Posting Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.TemporalPostingRuleImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getTemporalPostingRule()
		 * @generated
		 */
		EClass TEMPORAL_POSTING_RULE = eINSTANCE.getTemporalPostingRule();

		/**
		 * The meta object literal for the '<em><b>Amount Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_POSTING_RULE__AMOUNT_RULE = eINSTANCE.getTemporalPostingRule_AmountRule();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_POSTING_RULE__ACCOUNT = eINSTANCE.getTemporalPostingRule_Account();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_POSTING_RULE__DATE = eINSTANCE.getTemporalPostingRule_Date();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.AmountImpl <em>Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.AmountImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getAmount()
		 * @generated
		 */
		EClass AMOUNT = eINSTANCE.getAmount();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT__UNIT = eINSTANCE.getAmount_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT__VALUE = eINSTANCE.getAmount_Value();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.DateImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DAY = eINSTANCE.getDate_Day();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.AmountRuleImpl <em>Amount Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.AmountRuleImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getAmountRule()
		 * @generated
		 */
		EClass AMOUNT_RULE = eINSTANCE.getAmountRule();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.SingleTermRuleImpl <em>Single Term Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.SingleTermRuleImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getSingleTermRule()
		 * @generated
		 */
		EClass SINGLE_TERM_RULE = eINSTANCE.getSingleTermRule();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.LiteralRuleImpl <em>Literal Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.LiteralRuleImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getLiteralRule()
		 * @generated
		 */
		EClass LITERAL_RULE = eINSTANCE.getLiteralRule();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_RULE__VALUE = eINSTANCE.getLiteralRule_Value();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.VariableRuleImpl <em>Variable Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.VariableRuleImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getVariableRule()
		 * @generated
		 */
		EClass VARIABLE_RULE = eINSTANCE.getVariableRule();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_RULE__VARIABLE = eINSTANCE.getVariableRule_Variable();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleImpl <em>Expression Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getExpressionRule()
		 * @generated
		 */
		EClass EXPRESSION_RULE = eINSTANCE.getExpressionRule();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_RULE__HEAD = eINSTANCE.getExpressionRule_Head();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_RULE__RIGHT = eINSTANCE.getExpressionRule_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_RULE__OPERATOR = eINSTANCE.getExpressionRule_Operator();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleHeadImpl <em>Expression Rule Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleHeadImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getExpressionRuleHead()
		 * @generated
		 */
		EClass EXPRESSION_RULE_HEAD = eINSTANCE.getExpressionRuleHead();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleParenthesisedImpl <em>Expression Rule Parenthesised</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.ExpressionRuleParenthesisedImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getExpressionRuleParenthesised()
		 * @generated
		 */
		EClass EXPRESSION_RULE_PARENTHESISED = eINSTANCE.getExpressionRuleParenthesised();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_RULE_PARENTHESISED__EXPRESSION = eINSTANCE.getExpressionRuleParenthesised_Expression();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.IfRuleImpl <em>If Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.IfRuleImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getIfRule()
		 * @generated
		 */
		EClass IF_RULE = eINSTANCE.getIfRule();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_RULE__ELSE = eINSTANCE.getIfRule_Else();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_RULE__THEN = eINSTANCE.getIfRule_Then();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_RULE__COMPARISON = eINSTANCE.getIfRule_Comparison();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.ComparisonImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.CompoundComparisonImpl <em>Compound Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.CompoundComparisonImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getCompoundComparison()
		 * @generated
		 */
		EClass COMPOUND_COMPARISON = eINSTANCE.getCompoundComparison();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_COMPARISON__RIGHT = eINSTANCE.getCompoundComparison_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_COMPARISON__LEFT = eINSTANCE.getCompoundComparison_Left();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.AndComparisonImpl <em>And Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.AndComparisonImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getAndComparison()
		 * @generated
		 */
		EClass AND_COMPARISON = eINSTANCE.getAndComparison();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.OrComparisonImpl <em>Or Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.OrComparisonImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getOrComparison()
		 * @generated
		 */
		EClass OR_COMPARISON = eINSTANCE.getOrComparison();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.impl.SimpleComparisonImpl <em>Simple Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.impl.SimpleComparisonImpl
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getSimpleComparison()
		 * @generated
		 */
		EClass SIMPLE_COMPARISON = eINSTANCE.getSimpleComparison();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_COMPARISON__LEFT = eINSTANCE.getSimpleComparison_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_COMPARISON__RIGHT = eINSTANCE.getSimpleComparison_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_COMPARISON__OPERATOR = eINSTANCE.getSimpleComparison_Operator();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.EventType
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.AccountName <em>Account Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.AccountName
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getAccountName()
		 * @generated
		 */
		EEnum ACCOUNT_NAME = eINSTANCE.getAccountName();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.Operator
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link com.atosorigin.nl.dsl.agreement.Comparator <em>Comparator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.atosorigin.nl.dsl.agreement.Comparator
		 * @see com.atosorigin.nl.dsl.agreement.impl.AgreementPackageImpl#getComparator()
		 * @generated
		 */
		EEnum COMPARATOR = eINSTANCE.getComparator();

	}

} //AgreementPackage
