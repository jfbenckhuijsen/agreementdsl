
package com.atosorigin.nl.dsl.agreement.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewFileWizard;

import com.atosorigin.nl.dsl.agreement.AgreementEditorPlugin;

public class NewAgreementFileWizard extends AbstractNewFileWizard {

	@Override
	protected LanguageUtilities getUtilities() {
		return AgreementEditorPlugin.getDefault().getUtilities();
	}
}
