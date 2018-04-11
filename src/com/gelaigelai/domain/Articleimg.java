package com.gelaigelai.domain;

/**
 * Articleimg entity. @author MyEclipse Persistence Tools
 */
public class Articleimg extends AbstractArticleimg implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Articleimg() {
	}

	/** full constructor */
	public Articleimg(Article article, String imgPath) {
		super(article, imgPath);
	}

}
