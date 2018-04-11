package com.gelaigelai.domain;

/**
 * AbstractCollectionPoem entity provides the base persistence definition of the
 * CollectionPoem entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCollectionPoem implements java.io.Serializable {

	// Fields

	private Integer idcollectionPoem;
	private User user;
	private Integer idpoem;

	// Constructors

	/** default constructor */
	public AbstractCollectionPoem() {
	}

	/** full constructor */
	public AbstractCollectionPoem(User user, Integer idpoem) {
		this.user = user;
		this.idpoem = idpoem;
	}

	// Property accessors

	public Integer getIdcollectionPoem() {
		return this.idcollectionPoem;
	}

	public void setIdcollectionPoem(Integer idcollectionPoem) {
		this.idcollectionPoem = idcollectionPoem;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getIdpoem() {
		return this.idpoem;
	}

	public void setIdpoem(Integer idpoem) {
		this.idpoem = idpoem;
	}

}