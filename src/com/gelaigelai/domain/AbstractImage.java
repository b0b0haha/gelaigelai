package com.gelaigelai.domain;

/**
 * AbstractImage entity provides the base persistence definition of the Image
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractImage implements java.io.Serializable {

	// Fields

	private Integer idimage;
	private Poem poem;
	private String filepath;

	// Constructors

	/** default constructor */
	public AbstractImage() {
	}

	/** full constructor */
	public AbstractImage(Poem poem, String filepath) {
		this.poem = poem;
		this.filepath = filepath;
	}

	// Property accessors

	public Integer getIdimage() {
		return this.idimage;
	}

	public void setIdimage(Integer idimage) {
		this.idimage = idimage;
	}

	public Poem getPoem() {
		return this.poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}