package com.gelaigelai.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractArticle entity provides the base persistence definition of the
 * Article entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArticle implements java.io.Serializable {

	// Fields

	private Integer idarticle;
	private String aauthor;
	private String title;
	private String ainfo;
	private Date adate;
	private Integer alike;
	private Set articleComments = new HashSet(0);
	private Set articleimgs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractArticle() {
	}

	/** minimal constructor */
	public AbstractArticle(String aauthor, String title, String ainfo) {
		this.aauthor = aauthor;
		this.title = title;
		this.ainfo = ainfo;
	}

	/** full constructor */
	public AbstractArticle(String aauthor, String title, String ainfo,
			Date adate, Integer alike, Set articleComments, Set articleimgs) {
		this.aauthor = aauthor;
		this.title = title;
		this.ainfo = ainfo;
		this.adate = adate;
		this.alike = alike;
		this.articleComments = articleComments;
		this.articleimgs = articleimgs;
	}

	// Property accessors

	public Integer getIdarticle() {
		return this.idarticle;
	}

	public void setIdarticle(Integer idarticle) {
		this.idarticle = idarticle;
	}

	public String getAauthor() {
		return this.aauthor;
	}

	public void setAauthor(String aauthor) {
		this.aauthor = aauthor;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAinfo() {
		return this.ainfo;
	}

	public void setAinfo(String ainfo) {
		this.ainfo = ainfo;
	}

	public Date getAdate() {
		return this.adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}

	public Integer getAlike() {
		return this.alike;
	}

	public void setAlike(Integer alike) {
		this.alike = alike;
	}

	public Set getArticleComments() {
		return this.articleComments;
	}

	public void setArticleComments(Set articleComments) {
		this.articleComments = articleComments;
	}

	public Set getArticleimgs() {
		return this.articleimgs;
	}

	public void setArticleimgs(Set articleimgs) {
		this.articleimgs = articleimgs;
	}

}