package com.gelaigelai.domain;

import java.util.Date;
import java.util.Set;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */
public class Article extends AbstractArticle implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** minimal constructor */
	public Article(String aauthor, String title, String ainfo) {
		super(aauthor, title, ainfo);
	}

	/** full constructor */
	public Article(String aauthor, String title, String ainfo, Date adate,
			Integer alike, Set articleComments, Set articleimgs) {
		super(aauthor, title, ainfo, adate, alike, articleComments, articleimgs);
	}

}
