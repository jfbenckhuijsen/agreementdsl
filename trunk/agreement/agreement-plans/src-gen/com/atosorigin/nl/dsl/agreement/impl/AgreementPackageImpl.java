/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.atosorigin.nl.dsl.agreement.AccountName;
import com.atosorigin.nl.dsl.agreement.AgreementFactory;
import com.atosorigin.nl.dsl.agreement.AgreementPackage;
import com.atosorigin.nl.dsl.agreement.Amount;
import com.atosorigin.nl.dsl.agreement.AmountRule;
import com.atosorigin.nl.dsl.agreement.AndComparison;
import com.atosorigin.nl.dsl.agreement.Comparator;
import com.atosorigin.nl.dsl.agreement.Comparison;
import com.atosorigin.nl.dsl.agreement.CompoundComparison;
import com.atosorigin.nl.dsl.agreement.Date;
import com.atosorigin.nl.dsl.agreement.EventRulesDecl;
import com.atosorigin.nl.dsl.agreement.EventType;
import com.atosorigin.nl.dsl.agreement.ExpressionRule;
import com.atosorigin.nl.dsl.agreement.ExpressionRuleHead;
import com.atosorigin.nl.dsl.agreement.ExpressionRuleParenthesised;
import com.atosorigin.nl.dsl.agreement.IfRule;
import com.atosorigin.nl.dsl.agreement.LiteralRule;
import com.atosorigin.nl.dsl.agreement.Operator;
import com.atosorigin.nl.dsl.agreement.OrComparison;
import com.atosorigin.nl.dsl.agreement.Plan;
import com.atosorigin.nl.dsl.agreement.RateDecl;
import com.atosorigin.nl.dsl.agreement.SimpleComparison;
import com.atosorigin.nl.dsl.agreement.SingleTermRule;
import com.atosorigin.nl.dsl.agreement.TemporalPostingRule;
import com.atosorigin.nl.dsl.agreement.ValueDecl;
import com.atosorigin.nl.dsl.agreement.VariableRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgreementPackageImpl extends EPackageImpl implements AgreementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventRulesDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalPostingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleTermRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionRuleHeadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionRuleParenthesisedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accountNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AgreementPackageImpl() {
		super(eNS_URI, AgreementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AgreementPackage init() {
		if (isInited) return (AgreementPackage)EPackage.Registry.INSTANCE.getEPackage(AgreementPackage.eNS_URI);

		// Obtain or create and register package
		AgreementPackageImpl theAgreementPackage = (AgreementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AgreementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AgreementPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAgreementPackage.createPackageContents();

		// Initialize created meta-data
		theAgreementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAgreementPackage.freeze();

		return theAgreementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlan() {
		return planEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_Name() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlan_Rates() {
		return (EReference)planEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlan_EventRules() {
		return (EReference)planEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRateDecl() {
		return rateDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRateDecl_Values() {
		return (EReference)rateDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateDecl_Name() {
		return (EAttribute)rateDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueDecl() {
		return valueDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDecl_Amount() {
		return (EReference)valueDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDecl_Date() {
		return (EReference)valueDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventRulesDecl() {
		return eventRulesDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventRulesDecl_PostingRules() {
		return (EReference)eventRulesDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventRulesDecl_Type() {
		return (EAttribute)eventRulesDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalPostingRule() {
		return temporalPostingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalPostingRule_AmountRule() {
		return (EReference)temporalPostingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalPostingRule_Account() {
		return (EAttribute)temporalPostingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalPostingRule_Date() {
		return (EReference)temporalPostingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmount() {
		return amountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmount_Unit() {
		return (EAttribute)amountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmount_Value() {
		return (EAttribute)amountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Month() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Year() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Day() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountRule() {
		return amountRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleTermRule() {
		return singleTermRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralRule() {
		return literalRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralRule_Value() {
		return (EReference)literalRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRule() {
		return variableRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableRule_Variable() {
		return (EAttribute)variableRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionRule() {
		return expressionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionRule_Head() {
		return (EReference)expressionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionRule_Right() {
		return (EReference)expressionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionRule_Operator() {
		return (EAttribute)expressionRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionRuleHead() {
		return expressionRuleHeadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionRuleParenthesised() {
		return expressionRuleParenthesisedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionRuleParenthesised_Expression() {
		return (EReference)expressionRuleParenthesisedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfRule() {
		return ifRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfRule_Else() {
		return (EReference)ifRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfRule_Then() {
		return (EReference)ifRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfRule_Comparison() {
		return (EReference)ifRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundComparison() {
		return compoundComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundComparison_Right() {
		return (EReference)compoundComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundComparison_Left() {
		return (EReference)compoundComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndComparison() {
		return andComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrComparison() {
		return orComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleComparison() {
		return simpleComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleComparison_Left() {
		return (EReference)simpleComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleComparison_Right() {
		return (EReference)simpleComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleComparison_Operator() {
		return (EAttribute)simpleComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventType() {
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccountName() {
		return accountNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparator() {
		return comparatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementFactory getAgreementFactory() {
		return (AgreementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		planEClass = createEClass(PLAN);
		createEAttribute(planEClass, PLAN__NAME);
		createEReference(planEClass, PLAN__RATES);
		createEReference(planEClass, PLAN__EVENT_RULES);

		rateDeclEClass = createEClass(RATE_DECL);
		createEReference(rateDeclEClass, RATE_DECL__VALUES);
		createEAttribute(rateDeclEClass, RATE_DECL__NAME);

		valueDeclEClass = createEClass(VALUE_DECL);
		createEReference(valueDeclEClass, VALUE_DECL__AMOUNT);
		createEReference(valueDeclEClass, VALUE_DECL__DATE);

		eventRulesDeclEClass = createEClass(EVENT_RULES_DECL);
		createEReference(eventRulesDeclEClass, EVENT_RULES_DECL__POSTING_RULES);
		createEAttribute(eventRulesDeclEClass, EVENT_RULES_DECL__TYPE);

		temporalPostingRuleEClass = createEClass(TEMPORAL_POSTING_RULE);
		createEReference(temporalPostingRuleEClass, TEMPORAL_POSTING_RULE__AMOUNT_RULE);
		createEAttribute(temporalPostingRuleEClass, TEMPORAL_POSTING_RULE__ACCOUNT);
		createEReference(temporalPostingRuleEClass, TEMPORAL_POSTING_RULE__DATE);

		amountEClass = createEClass(AMOUNT);
		createEAttribute(amountEClass, AMOUNT__UNIT);
		createEAttribute(amountEClass, AMOUNT__VALUE);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__MONTH);
		createEAttribute(dateEClass, DATE__YEAR);
		createEAttribute(dateEClass, DATE__DAY);

		amountRuleEClass = createEClass(AMOUNT_RULE);

		singleTermRuleEClass = createEClass(SINGLE_TERM_RULE);

		literalRuleEClass = createEClass(LITERAL_RULE);
		createEReference(literalRuleEClass, LITERAL_RULE__VALUE);

		variableRuleEClass = createEClass(VARIABLE_RULE);
		createEAttribute(variableRuleEClass, VARIABLE_RULE__VARIABLE);

		expressionRuleEClass = createEClass(EXPRESSION_RULE);
		createEReference(expressionRuleEClass, EXPRESSION_RULE__HEAD);
		createEReference(expressionRuleEClass, EXPRESSION_RULE__RIGHT);
		createEAttribute(expressionRuleEClass, EXPRESSION_RULE__OPERATOR);

		expressionRuleHeadEClass = createEClass(EXPRESSION_RULE_HEAD);

		expressionRuleParenthesisedEClass = createEClass(EXPRESSION_RULE_PARENTHESISED);
		createEReference(expressionRuleParenthesisedEClass, EXPRESSION_RULE_PARENTHESISED__EXPRESSION);

		ifRuleEClass = createEClass(IF_RULE);
		createEReference(ifRuleEClass, IF_RULE__ELSE);
		createEReference(ifRuleEClass, IF_RULE__THEN);
		createEReference(ifRuleEClass, IF_RULE__COMPARISON);

		comparisonEClass = createEClass(COMPARISON);

		compoundComparisonEClass = createEClass(COMPOUND_COMPARISON);
		createEReference(compoundComparisonEClass, COMPOUND_COMPARISON__RIGHT);
		createEReference(compoundComparisonEClass, COMPOUND_COMPARISON__LEFT);

		andComparisonEClass = createEClass(AND_COMPARISON);

		orComparisonEClass = createEClass(OR_COMPARISON);

		simpleComparisonEClass = createEClass(SIMPLE_COMPARISON);
		createEReference(simpleComparisonEClass, SIMPLE_COMPARISON__LEFT);
		createEReference(simpleComparisonEClass, SIMPLE_COMPARISON__RIGHT);
		createEAttribute(simpleComparisonEClass, SIMPLE_COMPARISON__OPERATOR);

		// Create enums
		eventTypeEEnum = createEEnum(EVENT_TYPE);
		accountNameEEnum = createEEnum(ACCOUNT_NAME);
		operatorEEnum = createEEnum(OPERATOR);
		comparatorEEnum = createEEnum(COMPARATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		singleTermRuleEClass.getESuperTypes().add(this.getExpressionRuleHead());
		literalRuleEClass.getESuperTypes().add(this.getSingleTermRule());
		variableRuleEClass.getESuperTypes().add(this.getSingleTermRule());
		expressionRuleEClass.getESuperTypes().add(this.getAmountRule());
		expressionRuleParenthesisedEClass.getESuperTypes().add(this.getExpressionRuleHead());
		ifRuleEClass.getESuperTypes().add(this.getAmountRule());
		compoundComparisonEClass.getESuperTypes().add(this.getComparison());
		andComparisonEClass.getESuperTypes().add(this.getCompoundComparison());
		orComparisonEClass.getESuperTypes().add(this.getCompoundComparison());
		simpleComparisonEClass.getESuperTypes().add(this.getComparison());

		// Initialize classes and features; add operations and parameters
		initEClass(planEClass, Plan.class, "Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlan_Name(), ecorePackage.getEString(), "name", null, 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlan_Rates(), this.getRateDecl(), null, "rates", null, 0, -1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlan_EventRules(), this.getEventRulesDecl(), null, "eventRules", null, 0, -1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rateDeclEClass, RateDecl.class, "RateDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRateDecl_Values(), this.getValueDecl(), null, "values", null, 0, -1, RateDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, RateDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueDeclEClass, ValueDecl.class, "ValueDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueDecl_Amount(), this.getAmount(), null, "amount", null, 0, 1, ValueDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueDecl_Date(), this.getDate(), null, "date", null, 0, 1, ValueDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventRulesDeclEClass, EventRulesDecl.class, "EventRulesDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventRulesDecl_PostingRules(), this.getTemporalPostingRule(), null, "postingRules", null, 0, -1, EventRulesDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventRulesDecl_Type(), this.getEventType(), "type", null, 0, 1, EventRulesDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalPostingRuleEClass, TemporalPostingRule.class, "TemporalPostingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalPostingRule_AmountRule(), this.getAmountRule(), null, "amountRule", null, 0, 1, TemporalPostingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalPostingRule_Account(), this.getAccountName(), "account", null, 0, 1, TemporalPostingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalPostingRule_Date(), this.getDate(), null, "date", null, 0, 1, TemporalPostingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amountEClass, Amount.class, "Amount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmount_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Amount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmount_Value(), ecorePackage.getEString(), "value", null, 0, 1, Amount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Month(), ecorePackage.getEInt(), "month", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Day(), ecorePackage.getEInt(), "day", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amountRuleEClass, AmountRule.class, "AmountRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleTermRuleEClass, SingleTermRule.class, "SingleTermRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalRuleEClass, LiteralRule.class, "LiteralRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralRule_Value(), this.getAmount(), null, "value", null, 0, 1, LiteralRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableRuleEClass, VariableRule.class, "VariableRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableRule_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, VariableRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionRuleEClass, ExpressionRule.class, "ExpressionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionRule_Head(), this.getExpressionRuleHead(), null, "head", null, 0, 1, ExpressionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionRule_Right(), this.getExpressionRule(), null, "right", null, 0, 1, ExpressionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionRule_Operator(), this.getOperator(), "operator", null, 0, 1, ExpressionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionRuleHeadEClass, ExpressionRuleHead.class, "ExpressionRuleHead", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionRuleParenthesisedEClass, ExpressionRuleParenthesised.class, "ExpressionRuleParenthesised", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionRuleParenthesised_Expression(), this.getExpressionRule(), null, "expression", null, 0, 1, ExpressionRuleParenthesised.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifRuleEClass, IfRule.class, "IfRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfRule_Else(), this.getExpressionRule(), null, "else", null, 0, 1, IfRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfRule_Then(), this.getExpressionRule(), null, "then", null, 0, 1, IfRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfRule_Comparison(), this.getComparison(), null, "comparison", null, 0, 1, IfRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonEClass, Comparison.class, "Comparison", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compoundComparisonEClass, CompoundComparison.class, "CompoundComparison", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundComparison_Right(), this.getSimpleComparison(), null, "right", null, 0, 1, CompoundComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundComparison_Left(), this.getSimpleComparison(), null, "left", null, 0, 1, CompoundComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andComparisonEClass, AndComparison.class, "AndComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orComparisonEClass, OrComparison.class, "OrComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleComparisonEClass, SimpleComparison.class, "SimpleComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleComparison_Left(), this.getSingleTermRule(), null, "left", null, 0, 1, SimpleComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleComparison_Right(), this.getSingleTermRule(), null, "right", null, 0, 1, SimpleComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleComparison_Operator(), this.getComparator(), "operator", null, 0, 1, SimpleComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventTypeEEnum, EventType.class, "EventType");
		addEEnumLiteral(eventTypeEEnum, EventType.NULL);
		addEEnumLiteral(eventTypeEEnum, EventType.USAGE);
		addEEnumLiteral(eventTypeEEnum, EventType.SERVICE_CALL);
		addEEnumLiteral(eventTypeEEnum, EventType.TAX);

		initEEnum(accountNameEEnum, AccountName.class, "AccountName");
		addEEnumLiteral(accountNameEEnum, AccountName.NULL);
		addEEnumLiteral(accountNameEEnum, AccountName.BASE_USAGE);
		addEEnumLiteral(accountNameEEnum, AccountName.SERVICE);
		addEEnumLiteral(accountNameEEnum, AccountName.TAX);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.NULL);
		addEEnumLiteral(operatorEEnum, Operator.ADD);
		addEEnumLiteral(operatorEEnum, Operator.SUBSTRACT);
		addEEnumLiteral(operatorEEnum, Operator.MULTIPLY);
		addEEnumLiteral(operatorEEnum, Operator.DIVIDE);

		initEEnum(comparatorEEnum, Comparator.class, "Comparator");
		addEEnumLiteral(comparatorEEnum, Comparator.NULL);
		addEEnumLiteral(comparatorEEnum, Comparator.LESS);
		addEEnumLiteral(comparatorEEnum, Comparator.MORE);
		addEEnumLiteral(comparatorEEnum, Comparator.LESS_EQUAL);
		addEEnumLiteral(comparatorEEnum, Comparator.MORE_EQUAL);
		addEEnumLiteral(comparatorEEnum, Comparator.EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //AgreementPackageImpl
