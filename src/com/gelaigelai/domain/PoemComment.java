package com.gelaigelai.domain;

import java.util.Date;

/**
 * PoemComment entity. @author MyEclipse Persistence Tools
 */
public class PoemComment extends AbstractPoemComment implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PoemComment() {
	}

	/** minimal constructor */
	public PoemComment(Poem poem, Date cdate, Integer userId) {
		super(poem, cdate, userId);
	}

	/** full constructor */
	public PoemComment(Poem poem, Date cdate, String info, Integer userId) {
		super(poem, cdate, info, userId);
	}

}
