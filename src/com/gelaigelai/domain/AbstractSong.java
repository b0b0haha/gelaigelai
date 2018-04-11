package com.gelaigelai.domain;

/**
 * AbstractSong entity provides the base persistence definition of the Song
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSong implements java.io.Serializable {

	// Fields

	private Integer idsong;
	private Type type;
	private String sname;
	private String info;

	// Constructors

	/** default constructor */
	public AbstractSong() {
	}

	/** minimal constructor */
	public AbstractSong(Type type, String sname) {
		this.type = type;
		this.sname = sname;
	}

	/** full constructor */
	public AbstractSong(Type type, String sname, String info) {
		this.type = type;
		this.sname = sname;
		this.info = info;
	}

	// Property accessors

	public Integer getIdsong() {
		return this.idsong;
	}

	public void setIdsong(Integer idsong) {
		this.idsong = idsong;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}