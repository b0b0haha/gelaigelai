package com.gelaigelai.domain;

/**
 * AbstractCollectionArticle entity provides the base persistence definition of
 * the CollectionArticle entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCollectionArticle implements java.io.Serializable {

	// Fields

	private Integer idcollectionArticle;
	private User user;
	private Integer idarticle;

	// Constructors

	/** default constructor */
	public AbstractCollectionArticle() {
	}

	/** minimal constructor */
	public AbstractCollectionArticle(User user) {
		this.user = user;
	}

	/** full constructor */
	public AbstractCollectionArticle(User user, Integer idarticle) {
		this.user = user;
		this.idarticle = idarticle;
	}

	// Property accessors

	public Integer getIdcollectionArticle() {
		return this.idcollectionArticle;
	}

	public void setIdcollectionArticle(Integer idcollectionArticle) {
		this.idcollectionArticle = idcollectionArticle;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getIdarticle() {
		return this.idarticle;
	}

	public void setIdarticle(Integer idarticle) {
		this.idarticle = idarticle;
	}

}