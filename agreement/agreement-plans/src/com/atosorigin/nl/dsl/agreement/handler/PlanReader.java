package com.atosorigin.nl.dsl.agreement.handler;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.openarchitectureware.xtext.parser.parsetree.Node;

import com.atosorigin.nl.dsl.agreement.Plan;
import com.atosorigin.nl.dsl.agreement.parser.XtextParser;

/**
 * Class to read an instance of the Agreement DSL.
 * 
 * @author Meinte Boersma
 */
public class PlanReader {

	private Plan plan;

	public PlanReader(InputStream in) {
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
