package com.gelaigelai.domain;

import java.util.Date;
import java.util.Set;

/**
 * News entity. @author MyEclipse Persistence Tools
 */
public class News extends AbstractNews implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public News() {
	}

	/** minimal constructor */
	public News(String ninfo, Date ndate, String ntitle, String nauthor) {
		super(ninfo, ndate, ntitle, nauthor);
	}

	/** full constructor */
	public News(String ninfo, Date ndate, Integer ntype, String ntitle,
			String nauthor, Set newsimgs) {
		super(ninfo, ndate, ntype, ntitle, nauthor, newsimgs);
	}

}
