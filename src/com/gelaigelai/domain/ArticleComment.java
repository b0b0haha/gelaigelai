package com.gelaigelai.domain;

import java.util.Date;

/**
 * ArticleComment entity. @author MyEclipse Persistence Tools
 */
public class ArticleComment extends AbstractArticleComment implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ArticleComment() {
	}

	/** full constructor */
	public ArticleComment(Article article, Date cdate, String info) {
		super(article, cdate, info);
	}

}
