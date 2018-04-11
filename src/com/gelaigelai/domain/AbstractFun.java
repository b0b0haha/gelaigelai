package com.gelaigelai.domain;

/**
 * AbstractFun entity provides the base persistence definition of the Fun
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFun implements java.io.Serializable {

	// Fields

	private FunId id;

	// Constructors

	/** default constructor */
	public AbstractFun() {
	}

	/** full constructor */
	public AbstractFun(FunId id) {
		this.id = id;
	}

	// Property accessors

	public FunId getId() {
		return this.id;
	}

	public void setId(FunId id) {
		this.id = id;
	}

}