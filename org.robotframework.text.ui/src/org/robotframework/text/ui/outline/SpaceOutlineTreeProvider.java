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
package org.robotframework.text.ui.outline;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.robotframework.text.space.Keyword;
import org.robotframework.text.space.KeywordSetting;
import org.robotframework.text.space.ListVariable;
import org.robotframework.text.space.RobotStep;
import org.robotframework.text.space.Setting;
import org.robotframework.text.space.TestCase;
import org.robotframework.text.space.TestCaseSetting;

/**
 * customization of the default outline structure
 * 
 */
public class SpaceOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	protected boolean _isLeaf(ListVariable modelElement) {
		return true;
	}
	
	protected boolean _isLeaf(TestCaseSetting modelElement) {
		return true;
	}

	protected boolean _isLeaf(Setting modelElement) {
		return true;
	}
	
	protected boolean _isLeaf(RobotStep modelElement) {
		return true;
	}
	
	protected void _createChildren(IOutlineNode parentNode, Keyword modelElement) {
		for(KeywordSetting setting:modelElement.getSettings()){
			createNode(parentNode, setting.getSetting());
		}
		for(RobotStep step : modelElement.getSteps()){
			createNode(parentNode, step);
		}
	}

	protected void _createChildren(IOutlineNode parentNode, TestCase modelElement) {
		for(TestCaseSetting setting:modelElement.getSettings()){
			createNode(parentNode, setting);
		}
		for(RobotStep step : modelElement.getSteps()){
			createNode(parentNode, step);
		}
	}
}
