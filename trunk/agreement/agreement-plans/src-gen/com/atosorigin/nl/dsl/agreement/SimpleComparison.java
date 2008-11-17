/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.SimpleComparison#getLeft <em>Left</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.SimpleComparison#getRight <em>Right</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.SimpleComparison#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getSimpleComparison()
 * @model
 * @generated
 */
public interface SimpleComparison extends Comparison {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(SingleTermRule)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getSimpleComparison_Left()
	 * @model containment="true"
	 * @generated
	 */
	SingleTermRule getLeft();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.SimpleComparison#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(SingleTermRule value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(SingleTermRule)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getSimpleComparison_Right()
	 * @model containment="true"
	 * @generated
	 */
	SingleTermRule getRight();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.SimpleComparison#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(SingleTermRule value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.atosorigin.nl.dsl.agreement.Comparator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.atosorigin.nl.dsl.agreement.Comparator
	 * @see #setOperator(Comparator)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getSimpleComparison_Operator()
	 * @model
	 * @generated
	 */
	Comparator getOperator();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.SimpleComparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.atosorigin.nl.dsl.agreement.Comparator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Comparator value);

} // SimpleComparison
