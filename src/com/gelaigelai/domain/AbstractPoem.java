package com.gelaigelai.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPoem entity provides the base persistence definition of the Poem
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPoem implements java.io.Serializable {

	// Fields

	private Integer idpoem;
	private Poet poet;
	private Type type;
	private String ptitle;
	private String pinfo;
	private Integer plikeNum;
	private Integer pcommentNum;
	private Integer userIdUser;
	private Date ptime;
	private String pannotation;
	private String ptranslation;
	private String panalys;
	private Set poemComments = new HashSet(0);
	private Set journels = new HashSet(0);
	private Set images = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPoem() {
	}

	/** minimal constructor */
	public AbstractPoem(Type type, String ptitle, String pinfo, Date ptime) {
		this.type = type;
		this.ptitle = ptitle;
		this.pinfo = pinfo;
		this.ptime = ptime;
	}

	/** full constructor */
	public AbstractPoem(Poet poet, Type type, String ptitle, String pinfo,
			Integer plikeNum, Integer pcommentNum, Integer userIdUser,
			Date ptime, String pannotation, String ptranslation,
			String panalys, Set poemComments, Set journels, Set images) {
		this.poet = poet;
		this.type = type;
		this.ptitle = ptitle;
		this.pinfo = pinfo;
		this.plikeNum = plikeNum;
		this.pcommentNum = pcommentNum;
		this.userIdUser = userIdUser;
		this.ptime = ptime;
		this.pannotation = pannotation;
		this.ptranslation = ptranslation;
		this.panalys = panalys;
		this.poemComments = poemComments;
		this.journels = journels;
		this.images = images;
	}

	// Property accessors

	public Integer getIdpoem() {
		return this.idpoem;
	}

	public void setIdpoem(Integer idpoem) {
		this.idpoem = idpoem;
	}

	public Poet getPoet() {
		return this.poet;
	}

	public void setPoet(Poet poet) {
		this.poet = poet;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getPtitle() {
		return this.ptitle;
	}

	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}

	public String getPinfo() {
		return this.pinfo;
	}

	public void setPinfo(String pinfo) {
		this.pinfo = pinfo;
	}

	public Integer getPlikeNum() {
		return this.plikeNum;
	}

	public void setPlikeNum(Integer plikeNum) {
		this.plikeNum = plikeNum;
	}

	public Integer getPcommentNum() {
		return this.pcommentNum;
	}

	public void setPcommentNum(Integer pcommentNum) {
		this.pcommentNum = pcommentNum;
	}

	public Integer getUserIdUser() {
		return this.userIdUser;
	}

	public void setUserIdUser(Integer userIdUser) {
		this.userIdUser = userIdUser;
	}

	public Date getPtime() {
		return this.ptime;
	}

	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}

	public String getPannotation() {
		return this.pannotation;
	}

	public void setPannotation(String pannotation) {
		this.pannotation = pannotation;
	}

	public String getPtranslation() {
		return this.ptranslation;
	}

	public void setPtranslation(String ptranslation) {
		this.ptranslation = ptranslation;
	}

	public String getPanalys() {
		return this.panalys;
	}

	public void setPanalys(String panalys) {
		this.panalys = panalys;
	}

	public Set getPoemComments() {
		return this.poemComments;
	}

	public void setPoemComments(Set poemComments) {
		this.poemComments = poemComments;
	}

	public Set getJournels() {
		return this.journels;
	}

	public void setJournels(Set journels) {
		this.journels = journels;
	}

	public Set getImages() {
		return this.images;
	}

	public void setImages(Set images) {
		this.images = images;
	}

}