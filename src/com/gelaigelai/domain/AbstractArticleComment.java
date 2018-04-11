package com.gelaigelai.domain;

import java.util.Date;

/**
 * AbstractArticleComment entity provides the base persistence definition of the
 * ArticleComment entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArticleComment implements java.io.Serializable {

	// Fields

	private Integer idarticleComment;
	private Article article;
	private Date cdate;
	private String info;

	// Constructors

	/** default constructor */
	public AbstractArticleComment() {
	}

	/** full constructor */
	public AbstractArticleComment(Article article, Date cdate, String info) {
		this.article = article;
		this.cdate = cdate;
		this.info = info;
	}

	// Property accessors

	public Integer getIdarticleComment() {
		return this.idarticleComment;
	}

	public void setIdarticleComment(Integer idarticleComment) {
		this.idarticleComment = idarticleComment;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
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

}