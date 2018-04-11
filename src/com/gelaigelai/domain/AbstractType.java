package com.gelaigelai.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractType entity provides the base persistence definition of the Type
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractType implements java.io.Serializable {

	// Fields

	private Integer idtype;
	private String info;
	private Set songs = new HashSet(0);
	private Set users = new HashSet(0);
	private Set poems = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractType() {
	}

	/** minimal constructor */
	public AbstractType(String info) {
		this.info = info;
	}

	/** full constructor */
	public AbstractType(String info, Set songs, Set users, Set poems) {
		this.info = info;
		this.songs = songs;
		this.users = users;
		this.poems = poems;
	}

	// Property accessors

	public Integer getIdtype() {
		return this.idtype;
	}

	public void setIdtype(Integer idtype) {
		this.idtype = idtype;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Set getSongs() {
		return this.songs;
	}

	public void setSongs(Set songs) {
		this.songs = songs;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getPoems() {
		return this.poems;
	}

	public void setPoems(Set poems) {
		this.poems = poems;
	}

}