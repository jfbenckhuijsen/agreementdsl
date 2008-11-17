/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement.impl;

import com.atosorigin.nl.dsl.agreement.AgreementPackage;
import com.atosorigin.nl.dsl.agreement.Comparison;
import com.atosorigin.nl.dsl.agreement.ExpressionRule;
import com.atosorigin.nl.dsl.agreement.IfRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.IfRuleImpl#getElse <em>Else</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.IfRuleImpl#getThen <em>Then</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.IfRuleImpl#getComparison <em>Comparison</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfRuleImpl extends AmountRuleImpl implements IfRule {
	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected ExpressionRule else_;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected ExpressionRule then;

	/**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected Comparison comparison;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.IF_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionRule getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(ExpressionRule newElse, NotificationChain msgs) {
		ExpressionRule oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementPackage.IF_RULE__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(ExpressionRule newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.IF_RULE__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.IF_RULE__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.IF_RULE__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionRule getThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(ExpressionRule newThen, NotificationChain msgs) {
		ExpressionRule oldThen = then;
		then = newThen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementPackage.IF_RULE__THEN, oldThen, newThen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(ExpressionRule newThen) {
		if (newThen != then) {
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.IF_RULE__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.IF_RULE__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.IF_RULE__THEN, newThen, newThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison getComparison() {
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparison(Comparison newComparison, NotificationChain msgs) {
		Comparison oldComparison = comparison;
		comparison = newComparison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementPackage.IF_RULE__COMPARISON, oldComparison, newComparison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparison(Comparison newComparison) {
		if (newComparison != comparison) {
			NotificationChain msgs = null;
			if (comparison != null)
				msgs = ((InternalEObject)comparison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.IF_RULE__COMPARISON, null, msgs);
			if (newComparison != null)
				msgs = ((InternalEObject)newComparison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.IF_RULE__COMPARISON, null, msgs);
			msgs = basicSetComparison(newComparison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.IF_RULE__COMPARISON, newComparison, newComparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgreementPackage.IF_RULE__ELSE:
				return basicSetElse(null, msgs);
			case AgreementPackage.IF_RULE__THEN:
				return basicSetThen(null, msgs);
			case AgreementPackage.IF_RULE__COMPARISON:
				return basicSetComparison(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementPackage.IF_RULE__ELSE:
				return getElse();
			case AgreementPackage.IF_RULE__THEN:
				return getThen();
			case AgreementPackage.IF_RULE__COMPARISON:
				return getComparison();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgreementPackage.IF_RULE__ELSE:
				setElse((ExpressionRule)newValue);
				return;
			case AgreementPackage.IF_RULE__THEN:
				setThen((ExpressionRule)newValue);
				return;
			case AgreementPackage.IF_RULE__COMPARISON:
				setComparison((Comparison)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AgreementPackage.IF_RULE__ELSE:
				setElse((ExpressionRule)null);
				return;
			case AgreementPackage.IF_RULE__THEN:
				setThen((ExpressionRule)null);
				return;
			case AgreementPackage.IF_RULE__COMPARISON:
				setComparison((Comparison)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AgreementPackage.IF_RULE__ELSE:
				return else_ != null;
			case AgreementPackage.IF_RULE__THEN:
				return then != null;
			case AgreementPackage.IF_RULE__COMPARISON:
				return comparison != null;
		}
		return super.eIsSet(featureID);
	}

} //IfRuleImpl
