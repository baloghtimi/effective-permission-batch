/*
 * generated by Xtext 2.11.0
 */
package org.mondo.collaboration.policy.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.mondo.collaboration.policy.ui.internal.PolicyActivator;

public class RulesUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PolicyActivator.getInstance().getInjector("org.mondo.collaboration.policy.Rules");
	}

}