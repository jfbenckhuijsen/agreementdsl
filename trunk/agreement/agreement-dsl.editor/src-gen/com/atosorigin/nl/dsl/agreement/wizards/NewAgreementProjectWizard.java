package com.atosorigin.nl.dsl.agreement.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import com.atosorigin.nl.dsl.agreement.AgreementEditorPlugin;

public class NewAgreementProjectWizard extends AbstractNewProjectWizard {

	public NewAgreementProjectWizard() {
		super();
		setLangName("Agreement");
		setGeneratorProjectName("agreement-dsl.generator");
		setDslProjectName("agreement-dsl");
		setFileExtension("plan");
		setPackageName("com/atosorigin/nl/dsl/agreement/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return AgreementEditorPlugin.getDefault().getUtilities();
	}
}

