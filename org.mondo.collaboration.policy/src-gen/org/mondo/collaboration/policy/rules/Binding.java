/**
 * generated by Xtext 2.10.0
 */
package org.mondo.collaboration.policy.rules;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.policy.rules.Binding#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.Binding#getBind <em>Bind</em>}</li>
 * </ul>
 *
 * @see org.mondo.collaboration.policy.rules.RulesPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Parameter)
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getBinding_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.rules.Binding#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

  /**
   * Returns the value of the '<em><b>Bind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind</em>' containment reference.
   * @see #setBind(Bind)
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getBinding_Bind()
   * @model containment="true"
   * @generated
   */
  Bind getBind();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.rules.Binding#getBind <em>Bind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind</em>' containment reference.
   * @see #getBind()
   * @generated
   */
  void setBind(Bind value);

} // Binding