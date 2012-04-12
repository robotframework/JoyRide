package org.robotframework.text.ui;

import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.linking.impl.IllegalNodeException;

public class IgnoreLinkingErrorsDiagnosticMessageProvider implements org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider.Extended {

	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {
		return null;
	}

	@Override
	public DiagnosticMessage getIllegalNodeMessage(ILinkingDiagnosticContext context, IllegalNodeException ex) {
		return null;
	}

	@Override
	public DiagnosticMessage getIllegalCrossReferenceMessage(ILinkingDiagnosticContext context, CrossReference reference) {
		return null;
	}

	@Override
	public DiagnosticMessage getViolatedBoundsConstraintMessage(ILinkingDiagnosticContext context, int size) {
		return null;
	}

	@Override
	public DiagnosticMessage getViolatedUniqueConstraintMessage(ILinkingDiagnosticContext context) {
		return null;
	}
}
