package com.gelaigelai.domain;

/**
 * Newsimg entity. @author MyEclipse Persistence Tools
 */
public class Newsimg extends AbstractNewsimg implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Newsimg() {
	}

	/** full constructor */
	public Newsimg(News news, String imgPath) {
		super(news, imgPath);
	}

}
