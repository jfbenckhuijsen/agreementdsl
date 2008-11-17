package com.atosorigin.nl.dsl.agreement;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.openarchitectureware.xtext.AbstractLanguageUtilities;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.IXtextParser;

import com.atosorigin.nl.dsl.agreement.parser.XtextParser;

public class AgreementUtilities extends AbstractLanguageUtilities {

	@Override
	protected IXtextParser internalParse(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

	public String getFileExtension() {
		return "plan";
	}

	public EPackage getEPackage() {
		return com.atosorigin.nl.dsl.agreement.MetaModelRegistration.getEPackage();
	}

	List<String> r = new ArrayList<String>();
	{
		r.add("TAX");
		r.add("THEN");
		r.add("*");
		r.add("+");
		r.add(">=");
		r.add("/");
		r.add("ELSE");
		r.add("-");
		r.add("amount");
		r.add("rate");
		r.add("tax");
		r.add("plan");
		r.add("event");
		r.add("<=");
		r.add("SERVICE_CALL");
		r.add("service");
		r.add("base-usage");
		r.add("account");
		r.add("USAGE");
		r.add(">");
		r.add("IF");
		r.add("=");
		r.add("<");
	}
	public List<String> allKeywords() {
		return r;
	}

	protected ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

	public IPartitionTokenScanner getPartitionScanner() {
		return new GeneratedPartitionScanner();
	}

	@Override
	public AbstractXtextEditorPlugin getXtextEditorPlugin() {
		return AgreementEditorPlugin.getDefault();
	}
	
	@Override
	public String getPackageForExtensions() {
		return "com::atosorigin::nl::dsl::agreement";
	}
	
	public XtextFile getXtextFile() {
		return MetaModelRegistration.getXtextFile();
	}
}
