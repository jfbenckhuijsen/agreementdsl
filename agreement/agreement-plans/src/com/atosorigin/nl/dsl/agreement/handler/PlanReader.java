package com.atosorigin.nl.dsl.agreement.handler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import com.atosorigin.nl.dsl.agreement.AgreementPackage;
import com.atosorigin.nl.dsl.agreement.Plan;
import com.atosorigin.nl.dsl.agreement.parser.AgreementLexer;
import com.atosorigin.nl.dsl.agreement.parser.AgreementParser;

/**
 * Class to read an instance of the Agreement DSL.
 * 
 * @author Meinte Boersma
 */
public class PlanReader {

	private Plan plan;

	public Plan getPlan() {
		return plan;
	}

	public PlanReader(Reader reader) throws IOException {
		try {
			doInit(reader);
		} catch (RecognitionException e) {
			throw new IllegalArgumentException("could not parse .plan file without parse errors", e);
		}
	}

	public PlanReader(String path) {
		// invoke Parser:
		try {
			Reader reader = new BufferedReader(new FileReader(path));
			doInit(reader);
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException(".plan file not found: path=" + path, e);
		}catch (IOException e) {
			throw new IllegalArgumentException("could not access .plan file: path="+ path, e);
		} catch (RecognitionException e) {
			throw new IllegalArgumentException("could not parse .plan file without parse errors"+ path, e);
		}
	}
	
	private void doInit (Reader reader) throws IOException, RecognitionException {
		// switch from dynamic EMF to statically compiled:
		EPackage agreementPackage = AgreementPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(agreementPackage.getNsURI(),
				agreementPackage);

		this.plan = (Plan) parse(reader);
	}

	private EObject parse(Reader reader) throws IOException,
			RecognitionException {
		ANTLRReaderStream input = new ANTLRReaderStream(reader);
		AgreementLexer lexer = new AgreementLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		AgreementParser parser = new AgreementParser(tokens, null);
		Node root = parser.parse();
		return root.getModelElement();
	}

}
