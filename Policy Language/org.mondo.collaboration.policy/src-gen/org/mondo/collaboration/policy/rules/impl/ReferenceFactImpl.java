/**
 * generated by Xtext 2.11.0
 */
package org.mondo.collaboration.policy.rules.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable;

import org.mondo.collaboration.policy.rules.ReferenceFact;
import org.mondo.collaboration.policy.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.ReferenceFactImpl#getSourceVar <em>Source Var</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.ReferenceFactImpl#getTargetVar <em>Target Var</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.ReferenceFactImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceFactImpl extends ModelFactImpl implements ReferenceFact
{
  /**
   * The cached value of the '{@link #getSourceVar() <em>Source Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceVar()
   * @generated
   * @ordered
   */
  protected Variable sourceVar;

  /**
   * The cached value of the '{@link #getTargetVar() <em>Target Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetVar()
   * @generated
   * @ordered
   */
  protected Variable targetVar;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected EReference reference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceFactImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RulesPackage.Literals.REFERENCE_FACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getSourceVar()
  {
    if (sourceVar != null && sourceVar.eIsProxy())
    {
      InternalEObject oldSourceVar = (InternalEObject)sourceVar;
      sourceVar = (Variable)eResolveProxy(oldSourceVar);
      if (sourceVar != oldSourceVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.REFERENCE_FACT__SOURCE_VAR, oldSourceVar, sourceVar));
      }
    }
    return sourceVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetSourceVar()
  {
    return sourceVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceVar(Variable newSourceVar)
  {
    Variable oldSourceVar = sourceVar;
    sourceVar = newSourceVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REFERENCE_FACT__SOURCE_VAR, oldSourceVar, sourceVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getTargetVar()
  {
    if (targetVar != null && targetVar.eIsProxy())
    {
      InternalEObject oldTargetVar = (InternalEObject)targetVar;
      targetVar = (Variable)eResolveProxy(oldTargetVar);
      if (targetVar != oldTargetVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.REFERENCE_FACT__TARGET_VAR, oldTargetVar, targetVar));
      }
    }
    return targetVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetTargetVar()
  {
    return targetVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetVar(Variable newTargetVar)
  {
    Variable oldTargetVar = targetVar;
    targetVar = newTargetVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REFERENCE_FACT__TARGET_VAR, oldTargetVar, targetVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (EReference)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.REFERENCE_FACT__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(EReference newReference)
  {
    EReference oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REFERENCE_FACT__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RulesPackage.REFERENCE_FACT__SOURCE_VAR:
        if (resolve) return getSourceVar();
        return basicGetSourceVar();
      case RulesPackage.REFERENCE_FACT__TARGET_VAR:
        if (resolve) return getTargetVar();
        return basicGetTargetVar();
      case RulesPackage.REFERENCE_FACT__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RulesPackage.REFERENCE_FACT__SOURCE_VAR:
        setSourceVar((Variable)newValue);
        return;
      case RulesPackage.REFERENCE_FACT__TARGET_VAR:
        setTargetVar((Variable)newValue);
        return;
      case RulesPackage.REFERENCE_FACT__REFERENCE:
        setReference((EReference)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RulesPackage.REFERENCE_FACT__SOURCE_VAR:
        setSourceVar((Variable)null);
        return;
      case RulesPackage.REFERENCE_FACT__TARGET_VAR:
        setTargetVar((Variable)null);
        return;
      case RulesPackage.REFERENCE_FACT__REFERENCE:
        setReference((EReference)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RulesPackage.REFERENCE_FACT__SOURCE_VAR:
        return sourceVar != null;
      case RulesPackage.REFERENCE_FACT__TARGET_VAR:
        return targetVar != null;
      case RulesPackage.REFERENCE_FACT__REFERENCE:
        return reference != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferenceFactImpl
