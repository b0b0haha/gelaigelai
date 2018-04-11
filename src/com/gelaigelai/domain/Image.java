package com.gelaigelai.domain;

/**
 * Image entity. @author MyEclipse Persistence Tools
 */
public class Image extends AbstractImage implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Image() {
	}

	/** full constructor */
	public Image(Poem poem, String filepath) {
		super(poem, filepath);
	}

}
