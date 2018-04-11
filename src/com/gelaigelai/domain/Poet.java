package com.gelaigelai.domain;

import java.util.Set;

/**
 * Poet entity. @author MyEclipse Persistence Tools
 */
public class Poet extends AbstractPoet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Poet() {
	}

	/** minimal constructor */
	public Poet(String poetname) {
		super(poetname);
	}

	/** full constructor */
	public Poet(String poetname, String peinfo, String poetImg, Set poems) {
		super(poetname, peinfo, poetImg, poems);
	}

}
