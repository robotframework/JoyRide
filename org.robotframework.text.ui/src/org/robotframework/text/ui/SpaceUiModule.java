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
package org.robotframework.text.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.robotframework.text.ui.syntaxcoloring.AntlrTokenToAttributeIdMapper;
import org.robotframework.text.ui.syntaxcoloring.SpaceTextHighlightingConfiguration;
import org.robotframework.text.ui.syntaxcoloring.SematicSpaceTextHighlightCalculator;;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SpaceUiModule extends org.robotframework.text.ui.AbstractSpaceUiModule {
	public SpaceUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return SpaceTextHighlightingConfiguration.class;
	}

	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return AntlrTokenToAttributeIdMapper.class;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindSematicSpaceTextHighlightCalculator() {
		return SematicSpaceTextHighlightCalculator.class;
	}
	
	public Class<? extends org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider.Extended> bindILinkingDiagnosticMessageProvider() {
	    return IgnoreLinkingErrorsDiagnosticMessageProvider.class;
	}
}
