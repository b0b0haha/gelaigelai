package com.gelaigelai.domain;

/**
 * CollectionPoem entity. @author MyEclipse Persistence Tools
 */
public class CollectionPoem extends AbstractCollectionPoem implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CollectionPoem() {
	}

	/** full constructor */
	public CollectionPoem(User user, Integer idpoem) {
		super(user, idpoem);
	}

}
