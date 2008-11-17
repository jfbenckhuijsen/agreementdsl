package com.atosorigin.nl.dsl.agreement.handler;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.emf.ecore.EPackage;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import com.atosorigin.nl.dsl.agreement.AgreementPackage;
import com.atosorigin.nl.dsl.agreement.Plan;
import com.atosorigin.nl.dsl.agreement.parser.XtextParser;
import com.atosorigin.nl.dsl.agreement.resource.AgreementResourceFactory;

/**
 * Class to read an instance of the Agreement DSL.
 * 
 * @author Meinte Boersma
 */
public class PlanReader {

	private static boolean switched = false;
	private Plan plan;

	public PlanReader(InputStream in) {
		synchronized (PlanReader.class) {
			if (!switched) {
				// Switch to static EMF
				AgreementResourceFactory.register();
				EPackage agreementPackage = AgreementPackage.eINSTANCE;
				EPackage.Registry.INSTANCE.put(agreementPackage.getNsURI(),
						agreementPackage);
				switched = true;
			}
		}
		
		// Parse the input stream
		XtextParser parser = new XtextParser(in);
		Node node = parser.getRootNode();
		this.plan = (Plan) node.getModelElement();
	}

	public PlanReader(String path) throws FileNotFoundException {
		this(new BufferedInputStream(new FileInputStream(path)));
	}
	
	public Plan getPlan() {
		return plan;
	}

}
