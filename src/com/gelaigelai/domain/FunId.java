package com.gelaigelai.domain;

/**
 * FunId entity. @author MyEclipse Persistence Tools
 */
public class FunId extends AbstractFunId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FunId() {
	}

	/** full constructor */
	public FunId(Integer fromUserId, Integer toUserId, Integer bothStatus) {
		super(fromUserId, toUserId, bothStatus);
	}

}
