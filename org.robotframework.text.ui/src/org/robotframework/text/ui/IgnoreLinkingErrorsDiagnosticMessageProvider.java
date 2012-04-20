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
