package com.gelaigelai.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPoet entity provides the base persistence definition of the Poet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPoet implements java.io.Serializable {

	// Fields

	private Integer idpoet;
	private String poetname;
	private String peinfo;
	private String poetImg;
	private Set poems = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPoet() {
	}

	/** minimal constructor */
	public AbstractPoet(String poetname) {
		this.poetname = poetname;
	}

	/** full constructor */
	public AbstractPoet(String poetname, String peinfo, String poetImg,
			Set poems) {
		this.poetname = poetname;
		this.peinfo = peinfo;
		this.poetImg = poetImg;
		this.poems = poems;
	}

	// Property accessors

	public Integer getIdpoet() {
		return this.idpoet;
	}

	public void setIdpoet(Integer idpoet) {
		this.idpoet = idpoet;
	}

	public String getPoetname() {
		return this.poetname;
	}

	public void setPoetname(String poetname) {
		this.poetname = poetname;
	}

	public String getPeinfo() {
		return this.peinfo;
	}

	public void setPeinfo(String peinfo) {
		this.peinfo = peinfo;
	}

	public String getPoetImg() {
		return this.poetImg;
	}

	public void setPoetImg(String poetImg) {
		this.poetImg = poetImg;
	}

	public Set getPoems() {
		return this.poems;
	}

	public void setPoems(Set poems) {
		this.poems = poems;
	}

}