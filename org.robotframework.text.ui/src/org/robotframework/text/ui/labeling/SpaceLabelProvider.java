/*
 *   Copyright 2012 Nokia Siemens Networks Oyj
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robotframework.text.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.robotframework.text.space.KeywordTable;
import org.robotframework.text.space.RobotStep;
import org.robotframework.text.space.SettingsTable;
import org.robotframework.text.space.TestCaseTable;
import org.robotframework.text.space.VariablesTable;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class SpaceLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public SpaceLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(TestCaseTable table) {
		return "*** Test Cases ***";
	}

	String text(KeywordTable table) {
		return "*** Keywords ***";
	}
	
	String text(VariablesTable table) {
		return "*** Variables ***";
	}
	
	String text(SettingsTable table) {
		return "*** Settings ***";
	}

	String text(RobotStep step) {
		return "Step"; 
	}
/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}
