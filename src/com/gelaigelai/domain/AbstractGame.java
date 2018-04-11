package com.gelaigelai.domain;

/**
 * AbstractGame entity provides the base persistence definition of the Game
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGame implements java.io.Serializable {

	// Fields

	private Integer idgame;
	private String ginfo;

	// Constructors

	/** default constructor */
	public AbstractGame() {
	}

	/** full constructor */
	public AbstractGame(String ginfo) {
		this.ginfo = ginfo;
	}

	// Property accessors

	public Integer getIdgame() {
		return this.idgame;
	}

	public void setIdgame(Integer idgame) {
		this.idgame = idgame;
	}

	public String getGinfo() {
		return this.ginfo;
	}

	public void setGinfo(String ginfo) {
		this.ginfo = ginfo;
	}

}