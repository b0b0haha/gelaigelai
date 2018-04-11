package com.gelaigelai.domain;

/**
 * AbstractNewsimg entity provides the base persistence definition of the
 * Newsimg entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNewsimg implements java.io.Serializable {

	// Fields

	private Integer idnewsImg;
	private News news;
	private String imgPath;

	// Constructors

	/** default constructor */
	public AbstractNewsimg() {
	}

	/** full constructor */
	public AbstractNewsimg(News news, String imgPath) {
		this.news = news;
		this.imgPath = imgPath;
	}

	// Property accessors

	public Integer getIdnewsImg() {
		return this.idnewsImg;
	}

	public void setIdnewsImg(Integer idnewsImg) {
		this.idnewsImg = idnewsImg;
	}

	public News getNews() {
		return this.news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}