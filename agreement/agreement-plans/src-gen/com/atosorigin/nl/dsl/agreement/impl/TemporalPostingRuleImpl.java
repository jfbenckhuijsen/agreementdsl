/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.atosorigin.nl.dsl.agreement.AccountName;
import com.atosorigin.nl.dsl.agreement.AgreementPackage;
import com.atosorigin.nl.dsl.agreement.AmountRule;
import com.atosorigin.nl.dsl.agreement.Date;
import com.atosorigin.nl.dsl.agreement.TemporalPostingRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Posting Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.TemporalPostingRuleImpl#getAmountRule <em>Amount Rule</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.TemporalPostingRuleImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.TemporalPostingRuleImpl#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemporalPostingRuleImpl extends EObjectImpl implements TemporalPostingRule {
	/**
	 * The cached value of the '{@link #getAmountRule() <em>Amount Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRule()
	 * @generated
	 * @ordered
	 */
	protected AmountRule amountRule;

	/**
	 * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected static final AccountName ACCOUNT_EDEFAULT = AccountName.NULL;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected AccountName account = ACCOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalPostingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.TEMPORAL_POSTING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountRule getAmountRule() {
		return amountRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountRule(AmountRule newAmountRule, NotificationChain msgs) {
		AmountRule oldAmountRule = amountRule;
		amountRule = newAmountRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementPackage.TEMPORAL_POSTING_RULE__AMOUNT_RULE, oldAmountRule, newAmountRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountRule(AmountRule newAmountRule) {
		if (newAmountRule != amountRule) {
			NotificationChain msgs = null;
			if (amountRule != null)
				msgs = ((InternalEObject)amountRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.TEMPORAL_POSTING_RULE__AMOUNT_RULE, null, msgs);
			if (newAmountRule != null)
				msgs = ((InternalEObject)newAmountRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.TEMPORAL_POSTING_RULE__AMOUNT_RULE, null, msgs);
			msgs = basicSetAmountRule(newAmountRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.TEMPORAL_POSTING_RULE__AMOUNT_RULE, newAmountRule, newAmountRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountName getAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(AccountName newAccount) {
		AccountName oldAccount = account;
		account = newAccount == null ? ACCOUNT_EDEFAULT : newAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.TEMPORAL_POSTING_RULE__ACCOUNT, oldAccount, account));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementPackage.TEMPORAL_POSTING_RULE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.TEMPORAL_POSTING_RULE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.TEMPORAL_POSTING_RULE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.TEMPORAL_POSTING_RULE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgreementPackage.TEMPORAL_POSTING_RULE__AMOUNT_RULE:
				return basicSetAmountRule(null, msgs);
			case AgreementPackage.TEMPORAL_POSTING_RULE__DATE:
				return basicSetDate(null, msgs);
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
			case AgreementPackage.TEMPORAL_POSTING_RULE__AMOUNT_RULE:
				return getAmountRule();
			case AgreementPackage.TEMPORAL_POSTING_RULE__ACCOUNT:
				return getAccount();
			case AgreementPackage.TEMPORAL_POSTING_RULE__DATE:
				return getDate();
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
			case AgreementPackage.TEMPORAL_POSTING_RULE__AMOUNT_RULE:
				setAmountRule((AmountRule)newValue);
				return;
			case AgreementPackage.TEMPORAL_POSTING_RULE__ACCOUNT:
				setAccount((AccountName)newValue);
				return;
			case AgreementPackage.TEMPORAL_POSTING_RULE__DATE:
				setDate((Date)newValue);
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
			case AgreementPackage.TEMPORAL_POSTING_RULE__AMOUNT_RULE:
				setAmountRule((AmountRule)null);
				return;
			case AgreementPackage.TEMPORAL_POSTING_RULE__ACCOUNT:
				setAccount(ACCOUNT_EDEFAULT);
				return;
			case AgreementPackage.TEMPORAL_POSTING_RULE__DATE:
				setDate((Date)null);
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
			case AgreementPackage.TEMPORAL_POSTING_RULE__AMOUNT_RULE:
				return amountRule != null;
			case AgreementPackage.TEMPORAL_POSTING_RULE__ACCOUNT:
				return account != ACCOUNT_EDEFAULT;
			case AgreementPackage.TEMPORAL_POSTING_RULE__DATE:
				return date != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (account: ");
		result.append(account);
		result.append(')');
		return result.toString();
	}

} //TemporalPostingRuleImpl
