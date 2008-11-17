/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.CompoundComparison#getRight <em>Right</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.CompoundComparison#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getCompoundComparison()
 * @model abstract="true"
 * @generated
 */
public interface CompoundComparison extends Comparison {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(SimpleComparison)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getCompoundComparison_Right()
	 * @model containment="true"
	 * @generated
	 */
	SimpleComparison getRight();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.CompoundComparison#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(SimpleComparison value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(SimpleComparison)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getCompoundComparison_Left()
	 * @model containment="true"
	 * @generated
	 */
	SimpleComparison getLeft();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.CompoundComparison#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(SimpleComparison value);

} // CompoundComparison
