
package org.robotframework.text;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SpaceStandaloneSetup extends SpaceStandaloneSetupGenerated{

	public static void doSetup() {
		new SpaceStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

