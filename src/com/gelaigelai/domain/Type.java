package com.gelaigelai.domain;

import java.util.Set;

/**
 * Type entity. @author MyEclipse Persistence Tools
 */
public class Type extends AbstractType implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** minimal constructor */
	public Type(String info) {
		super(info);
	}

	/** full constructor */
	public Type(String info, Set songs, Set users, Set poems) {
		super(info, songs, users, poems);
	}

}
