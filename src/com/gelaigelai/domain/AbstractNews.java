package com.gelaigelai.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractNews entity provides the base persistence definition of the News
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNews implements java.io.Serializable {

	// Fields

	private Integer idnews;
	private String ninfo;
	private Date ndate;
	private Integer ntype;
	private String ntitle;
	private String nauthor;
	private Set newsimgs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractNews() {
	}

	/** minimal constructor */
	public AbstractNews(String ninfo, Date ndate, String ntitle, String nauthor) {
		this.ninfo = ninfo;
		this.ndate = ndate;
		this.ntitle = ntitle;
		this.nauthor = nauthor;
	}

	/** full constructor */
	public AbstractNews(String ninfo, Date ndate, Integer ntype, String ntitle,
			String nauthor, Set newsimgs) {
		this.ninfo = ninfo;
		this.ndate = ndate;
		this.ntype = ntype;
		this.ntitle = ntitle;
		this.nauthor = nauthor;
		this.newsimgs = newsimgs;
	}

	// Property accessors

	public Integer getIdnews() {
		return this.idnews;
	}

	public void setIdnews(Integer idnews) {
		this.idnews = idnews;
	}

	public String getNinfo() {
		return this.ninfo;
	}

	public void setNinfo(String ninfo) {
		this.ninfo = ninfo;
	}

	public Date getNdate() {
		return this.ndate;
	}

	public void setNdate(Date ndate) {
		this.ndate = ndate;
	}

	public Integer getNtype() {
		return this.ntype;
	}

	public void setNtype(Integer ntype) {
		this.ntype = ntype;
	}

	public String getNtitle() {
		return this.ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNauthor() {
		return this.nauthor;
	}

	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}

	public Set getNewsimgs() {
		return this.newsimgs;
	}

	public void setNewsimgs(Set newsimgs) {
		this.newsimgs = newsimgs;
	}

}