/**
 * 
 */
package com.atosorigin.nl.jspring2008.xtext.servlets;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atosorigin.nl.jspring2008.xtext.services.PlanStore;

/**
 * @author a108600
 *
 */
public class PlanUploadServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8638689020709631332L;

	/**
	 * 
	 */
	public PlanUploadServlet() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		InputStream stream = req.getInputStream();
		PlanStore.getInstance().storePlan(stream);
	}

}
