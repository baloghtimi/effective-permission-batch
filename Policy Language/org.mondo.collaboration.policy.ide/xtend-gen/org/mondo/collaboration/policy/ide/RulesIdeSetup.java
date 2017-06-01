/**
 * generated by Xtext 2.11.0
 */
package org.mondo.collaboration.policy.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.mondo.collaboration.policy.RulesRuntimeModule;
import org.mondo.collaboration.policy.RulesStandaloneSetup;
import org.mondo.collaboration.policy.ide.RulesIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class RulesIdeSetup extends RulesStandaloneSetup {
  @Override
  public Injector createInjector() {
    RulesRuntimeModule _rulesRuntimeModule = new RulesRuntimeModule();
    RulesIdeModule _rulesIdeModule = new RulesIdeModule();
    return Guice.createInjector(Modules2.mixin(_rulesRuntimeModule, _rulesIdeModule));
  }
}