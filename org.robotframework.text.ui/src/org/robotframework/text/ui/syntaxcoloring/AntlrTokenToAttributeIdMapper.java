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