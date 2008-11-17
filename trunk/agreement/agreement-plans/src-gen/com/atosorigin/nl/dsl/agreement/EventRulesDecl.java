/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.atosorigin.nl.dsl.agreement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Rules Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.EventRulesDecl#getPostingRules <em>Posting Rules</em>}</li>
 *   <li>{@link com.atosorigin.nl.dsl.agreement.EventRulesDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getEventRulesDecl()
 * @model
 * @generated
 */
public interface EventRulesDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>Posting Rules</b></em>' containment reference list.
	 * The list contents are of type {@link com.atosorigin.nl.dsl.agreement.TemporalPostingRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posting Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posting Rules</em>' containment reference list.
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getEventRulesDecl_PostingRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalPostingRule> getPostingRules();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.atosorigin.nl.dsl.agreement.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.atosorigin.nl.dsl.agreement.EventType
	 * @see #setType(EventType)
	 * @see com.atosorigin.nl.dsl.agreement.AgreementPackage#getEventRulesDecl_Type()
	 * @model
	 * @generated
	 */
	EventType getType();

	/**
	 * Sets the value of the '{@link com.atosorigin.nl.dsl.agreement.EventRulesDecl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.atosorigin.nl.dsl.agreement.EventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EventType value);

} // EventRulesDecl
