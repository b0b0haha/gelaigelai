package com.gelaigelai.domain;

import java.util.Date;
import java.util.Set;

/**
 * Journel entity. @author MyEclipse Persistence Tools
 */
public class Journel extends AbstractJournel implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Journel() {
	}

	/** minimal constructor */
	public Journel(String jname, Date jdate) {
		super(jname, jdate);
	}

	/** full constructor */
	public Journel(String jname, Date jdate, String jinfo, Set poems) {
		super(jname, jdate, jinfo, poems);
	}

}
