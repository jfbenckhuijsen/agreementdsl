/**
 * 
 */
package com.atosorigin.nl.jspring2008.xtext.transfer;

import java.io.Serializable;

/**
 * @author a108600
 *
 */
public class CustomerTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7355276698585933578L;
	private String name;
	private String photo;

	/**
	 * 
	 */
	public CustomerTO() {
		super();
	}

	/**
	 * @param name
	 * @param photo
	 */
	public CustomerTO(String name, String photo) {
		super();
		this.name = name;
		this.photo = photo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
