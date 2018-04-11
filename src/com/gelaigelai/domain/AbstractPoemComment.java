package com.gelaigelai.domain;

import java.util.Date;

/**
 * AbstractPoemComment entity provides the base persistence definition of the
 * PoemComment entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPoemComment implements java.io.Serializable {

	// Fields

	private Integer idcomment;
	private Poem poem;
	private Date cdate;
	private String info;
	private Integer userId;

	// Constructors

	/** default constructor */
	public AbstractPoemComment() {
	}

	/** minimal constructor */
	public AbstractPoemComment(Poem poem, Date cdate, Integer userId) {
		this.poem = poem;
		this.cdate = cdate;
		this.userId = userId;
	}

	/** full constructor */
	public AbstractPoemComment(Poem poem, Date cdate, String info,
			Integer userId) {
		this.poem = poem;
		this.cdate = cdate;
		this.info = info;
		this.userId = userId;
	}

	// Property accessors

	public Integer getIdcomment() {
		return this.idcomment;
	}

	public void setIdcomment(Integer idcomment) {
		this.idcomment = idcomment;
	}

	public Poem getPoem() {
		return this.poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
	}

	public Date getCdate() {
		return this.cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}