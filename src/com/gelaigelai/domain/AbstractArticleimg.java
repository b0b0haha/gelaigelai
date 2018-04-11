package com.gelaigelai.domain;

/**
 * AbstractArticleimg entity provides the base persistence definition of the
 * Articleimg entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArticleimg implements java.io.Serializable {

	// Fields

	private Integer idarticleImg;
	private Article article;
	private String imgPath;

	// Constructors

	/** default constructor */
	public AbstractArticleimg() {
	}

	/** full constructor */
	public AbstractArticleimg(Article article, String imgPath) {
		this.article = article;
		this.imgPath = imgPath;
	}

	// Property accessors

	public Integer getIdarticleImg() {
		return this.idarticleImg;
	}

	public void setIdarticleImg(Integer idarticleImg) {
		this.idarticleImg = idarticleImg;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}