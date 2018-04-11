package com.gelaigelai.domain;

/**
 * CollectionArticle entity. @author MyEclipse Persistence Tools
 */
public class CollectionArticle extends AbstractCollectionArticle implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CollectionArticle() {
	}

	/** minimal constructor */
	public CollectionArticle(User user) {
		super(user);
	}

	/** full constructor */
	public CollectionArticle(User user, Integer idarticle) {
		super(user, idarticle);
	}

}
