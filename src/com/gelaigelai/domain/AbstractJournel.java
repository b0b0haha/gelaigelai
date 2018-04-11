package com.gelaigelai.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractJournel entity provides the base persistence definition of the
 * Journel entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJournel implements java.io.Serializable {

	// Fields

	private Integer idjournel;
	private String jname;
	private Date jdate;
	private String jinfo;
	private Set poems = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractJournel() {
	}

	/** minimal constructor */
	public AbstractJournel(String jname, Date jdate) {
		this.jname = jname;
		this.jdate = jdate;
	}

	/** full constructor */
	public AbstractJournel(String jname, Date jdate, String jinfo, Set poems) {
		this.jname = jname;
		this.jdate = jdate;
		this.jinfo = jinfo;
		this.poems = poems;
	}

	// Property accessors

	public Integer getIdjournel() {
		return this.idjournel;
	}

	public void setIdjournel(Integer idjournel) {
		this.idjournel = idjournel;
	}

	public String getJname() {
		return this.jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public Date getJdate() {
		return this.jdate;
	}

	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}

	public String getJinfo() {
		return this.jinfo;
	}

	public void setJinfo(String jinfo) {
		this.jinfo = jinfo;
	}

	public Set getPoems() {
		return this.poems;
	}

	public void setPoems(Set poems) {
		this.poems = poems;
	}

}