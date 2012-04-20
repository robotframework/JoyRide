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

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class AntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if(tokenName.equals("RULE_SEPARATOR")){
			return SpaceTextHighlightingConfiguration.SEPARATOR_ID;
		}
		if(tokenName.equals("RULE_COMMENT")){
			return SpaceTextHighlightingConfiguration.COMMENT_ID;
		}
		return SpaceTextHighlightingConfiguration.DEFAULT_ID;
	}

}