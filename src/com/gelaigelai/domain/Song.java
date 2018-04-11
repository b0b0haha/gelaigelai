package com.gelaigelai.domain;

/**
 * Song entity. @author MyEclipse Persistence Tools
 */
public class Song extends AbstractSong implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Song() {
	}

	/** minimal constructor */
	public Song(Type type, String sname) {
		super(type, sname);
	}

	/** full constructor */
	public Song(Type type, String sname, String info) {
		super(type, sname, info);
	}

}
