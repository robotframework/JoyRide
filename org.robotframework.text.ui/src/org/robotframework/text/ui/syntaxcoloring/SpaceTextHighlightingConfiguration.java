package org.robotframework.text.ui.syntaxcoloring;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class SpaceTextHighlightingConfiguration extends
		DefaultHighlightingConfiguration {
	public final static String SEPARATOR_ID = "SEPARATOR_ID";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(SEPARATOR_ID, "Separator", separatorTextStyle());
	}

	public TextStyle separatorTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 200));
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}
}
