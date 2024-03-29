/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement.impl;

import com.atosorigin.nl.dsl.agreement.AgreementPackage;
import com.atosorigin.nl.dsl.agreement.CompoundComparison;
import com.atosorigin.nl.dsl.agreement.SimpleComparison;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.CompoundComparisonImpl#getRight <em>Right</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.impl.CompoundComparisonImpl#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CompoundComparisonImpl extends ComparisonImpl implements CompoundComparison {
	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected SimpleComparison right;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected SimpleComparison left;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.COMPOUND_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleComparison getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(SimpleComparison newRight, NotificationChain msgs) {
		SimpleComparison oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementPackage.COMPOUND_COMPARISON__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(SimpleComparison newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.COMPOUND_COMPARISON__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.COMPOUND_COMPARISON__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.COMPOUND_COMPARISON__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleComparison getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(SimpleComparison newLeft, NotificationChain msgs) {
		SimpleComparison oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementPackage.COMPOUND_COMPARISON__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(SimpleComparison newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.COMPOUND_COMPARISON__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementPackage.COMPOUND_COMPARISON__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.COMPOUND_COMPARISON__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgreementPackage.COMPOUND_COMPARISON__RIGHT:
				return basicSetRight(null, msgs);
			case AgreementPackage.COMPOUND_COMPARISON__LEFT:
				return basicSetLeft(null, msgs);
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
			case AgreementPackage.COMPOUND_COMPARISON__RIGHT:
				return getRight();
			case AgreementPackage.COMPOUND_COMPARISON__LEFT:
				return getLeft();
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
			case AgreementPackage.COMPOUND_COMPARISON__RIGHT:
				setRight((SimpleComparison)newValue);
				return;
			case AgreementPackage.COMPOUND_COMPARISON__LEFT:
				setLeft((SimpleComparison)newValue);
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
			case AgreementPackage.COMPOUND_COMPARISON__RIGHT:
				setRight((SimpleComparison)null);
				return;
			case AgreementPackage.COMPOUND_COMPARISON__LEFT:
				setLeft((SimpleComparison)null);
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
			case AgreementPackage.COMPOUND_COMPARISON__RIGHT:
				return right != null;
			case AgreementPackage.COMPOUND_COMPARISON__LEFT:
				return left != null;
		}
		return super.eIsSet(featureID);
	}

} //CompoundComparisonImpl
