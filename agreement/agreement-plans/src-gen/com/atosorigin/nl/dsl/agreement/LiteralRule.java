/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.LiteralRule#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getLiteralRule()
 * @model
 * @generated
 */
public interface LiteralRule extends SingleTermRule {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Amount)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getLiteralRule_Value()
	 * @model containment="true"
	 * @generated
	 */
	Amount getValue();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.LiteralRule#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Amount value);

} // LiteralRule
