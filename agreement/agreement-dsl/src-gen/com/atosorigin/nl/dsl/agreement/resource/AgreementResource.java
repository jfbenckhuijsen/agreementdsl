package com.atosorigin.nl.dsl.agreement.resource;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.xtext.parser.IXtextParser;
import org.openarchitectureware.xtext.resource.AbstractXtextResource;

import com.atosorigin.nl.dsl.agreement.parser.XtextParser;

public class AgreementResource extends AbstractXtextResource {
	public AgreementResource(URI uri) {
		super(uri);
		setFormattingExtension("com::atosorigin::nl::dsl::agreement::Formatting");
		setResourceLoader(new ResourceLoaderImpl(XtextParser.class.getClassLoader()));
	}

	@Override
	protected IXtextParser createParser(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

}

