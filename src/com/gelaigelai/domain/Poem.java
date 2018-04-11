package com.gelaigelai.domain;

import java.util.Date;
import java.util.Set;

/**
 * Poem entity. @author MyEclipse Persistence Tools
 */
public class Poem extends AbstractPoem implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Poem() {
	}

	/** minimal constructor */
	public Poem(Type type, String ptitle, String pinfo, Date ptime) {
		super(type, ptitle, pinfo, ptime);
	}

	/** full constructor */
	public Poem(Poet poet, Type type, String ptitle, String pinfo,
			Integer plikeNum, Integer pcommentNum, Integer userIdUser,
			Date ptime, String pannotation, String ptranslation,
			String panalys, Set poemComments, Set journels, Set images) {
		super(poet, type, ptitle, pinfo, plikeNum, pcommentNum, userIdUser,
				ptime, pannotation, ptranslation, panalys, poemComments,
				journels, images);
	}

}
