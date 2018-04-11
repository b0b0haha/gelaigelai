package com.gelaigelai.domain;

import java.util.Date;

/**
 * Msg entity. @author MyEclipse Persistence Tools
 */
public class Msg extends AbstractMsg implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Msg() {
	}

	/** full constructor */
	public Msg(Date msgTime, Integer msgFrom, Integer msgTo, String msgInfo) {
		super(msgTime, msgFrom, msgTo, msgInfo);
	}

}
