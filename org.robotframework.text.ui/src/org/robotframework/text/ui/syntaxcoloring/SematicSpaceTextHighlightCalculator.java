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
package org.robotframework.text.ui.syntaxcoloring;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class SematicSpaceTextHighlightCalculator implements ISemanticHighlightingCalculator{

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;
		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			if (node.getGrammarElement() instanceof CrossReference) {
				CrossReference ref = (CrossReference) node.getGrammarElement();
				RuleCall r = (RuleCall) ref.getTerminal();
				colorRule(acceptor, node, r.getRule());
			}
			if(node.getGrammarElement() instanceof RuleCall){
				RuleCall r = (RuleCall) node.getGrammarElement();
				colorRule(acceptor, node, r.getRule());
			}
		}
	}

	private void colorRule(IHighlightedPositionAcceptor acceptor, INode node, AbstractRule rule) {
		String name = rule.getName();
		if(name.equals("MacroName"))
			setNodeColor(acceptor, node, SpaceTextHighlightingConfiguration.MACRO_NAME_ID);
		if(name.equals("SettingsTableHeader"))
			setNodeColor(acceptor, node, SpaceTextHighlightingConfiguration.HEADER_ID);
		if(name.equals("TestCaseTableHeader"))
			setNodeColor(acceptor, node, SpaceTextHighlightingConfiguration.HEADER_ID);
		if(name.equals("KeywordTableHeader"))
			setNodeColor(acceptor, node, SpaceTextHighlightingConfiguration.HEADER_ID);
		if(name.equals("VariablesTableHeader"))
			setNodeColor(acceptor, node, SpaceTextHighlightingConfiguration.HEADER_ID);
		if(name.equals("ScalarName"))
			setNodeColor(acceptor, node, SpaceTextHighlightingConfiguration.VARIABLE_NAME_ID);
		if(name.equals("ListName"))
			setNodeColor(acceptor, node, SpaceTextHighlightingConfiguration.VARIABLE_NAME_ID);
	}

	private void setNodeColor(IHighlightedPositionAcceptor acceptor, INode node, String colorId) {
		acceptor.addPosition(node.getOffset(), node.getLength(), colorId);
	}

}
