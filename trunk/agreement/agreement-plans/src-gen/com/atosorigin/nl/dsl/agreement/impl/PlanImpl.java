/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.atosorigin.nl.dsl.agreement.AgreementPackage;
import com.atosorigin.nl.dsl.agreement.EventRulesDecl;
import com.atosorigin.nl.dsl.agreement.Plan;
import com.atosorigin.nl.dsl.agreement.RateDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.PlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.PlanImpl#getRates <em>Rates</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.PlanImpl#getEventRules <em>Event Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanImpl extends EObjectImpl implements Plan {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRates() <em>Rates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRates()
	 * @generated
	 * @ordered
	 */
	protected EList<RateDecl> rates;

	/**
	 * The cached value of the '{@link #getEventRules() <em>Event Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRules()
	 * @generated
	 * @ordered
	 */
	protected EList<EventRulesDecl> eventRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.PLAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RateDecl> getRates() {
		if (rates == null) {
			rates = new EObjectContainmentEList<RateDecl>(RateDecl.class, this, AgreementPackage.PLAN__RATES);
		}
		return rates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventRulesDecl> getEventRules() {
		if (eventRules == null) {
			eventRules = new EObjectContainmentEList<EventRulesDecl>(EventRulesDecl.class, this, AgreementPackage.PLAN__EVENT_RULES);
		}
		return eventRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgreementPackage.PLAN__RATES:
				return ((InternalEList<?>)getRates()).basicRemove(otherEnd, msgs);
			case AgreementPackage.PLAN__EVENT_RULES:
				return ((InternalEList<?>)getEventRules()).basicRemove(otherEnd, msgs);
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
			case AgreementPackage.PLAN__NAME:
				return getName();
			case AgreementPackage.PLAN__RATES:
				return getRates();
			case AgreementPackage.PLAN__EVENT_RULES:
				return getEventRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgreementPackage.PLAN__NAME:
				setName((String)newValue);
				return;
			case AgreementPackage.PLAN__RATES:
				getRates().clear();
				getRates().addAll((Collection<? extends RateDecl>)newValue);
				return;
			case AgreementPackage.PLAN__EVENT_RULES:
				getEventRules().clear();
				getEventRules().addAll((Collection<? extends EventRulesDecl>)newValue);
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
			case AgreementPackage.PLAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AgreementPackage.PLAN__RATES:
				getRates().clear();
				return;
			case AgreementPackage.PLAN__EVENT_RULES:
				getEventRules().clear();
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
			case AgreementPackage.PLAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AgreementPackage.PLAN__RATES:
				return rates != null && !rates.isEmpty();
			case AgreementPackage.PLAN__EVENT_RULES:
				return eventRules != null && !eventRules.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PlanImpl
