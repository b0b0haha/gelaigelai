package com.gelaigelai.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Integer idUser;
	private Type type;
	private String username;
	private String password;
	private Date birth;
	private String sex;
	private Date regdate;
	private String email;
	private String phone;
	private String info;
	private Integer ufunsNum;
	private Integer ulikeNum;
	private String headImg;
	private Set collectionPoems = new HashSet(0);
	private Set collectionArticles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(String username, String password, Date birth,
			String sex, Date regdate) {
		this.username = username;
		this.password = password;
		this.birth = birth;
		this.sex = sex;
		this.regdate = regdate;
	}

	/** full constructor */
	public AbstractUser(Type type, String username, String password,
			Date birth, String sex, Date regdate, String email, String phone,
			String info, Integer ufunsNum, Integer ulikeNum, String headImg,
			Set collectionPoems, Set collectionArticles) {
		this.type = type;
		this.username = username;
		this.password = password;
		this.birth = birth;
		this.sex = sex;
		this.regdate = regdate;
		this.email = email;
		this.phone = phone;
		this.info = info;
		this.ufunsNum = ufunsNum;
		this.ulikeNum = ulikeNum;
		this.headImg = headImg;
		this.collectionPoems = collectionPoems;
		this.collectionArticles = collectionArticles;
	}

	// Property accessors

	public Integer getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getRegdate() {
		return this.regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getUfunsNum() {
		return this.ufunsNum;
	}

	public void setUfunsNum(Integer ufunsNum) {
		this.ufunsNum = ufunsNum;
	}

	public Integer getUlikeNum() {
		return this.ulikeNum;
	}

	public void setUlikeNum(Integer ulikeNum) {
		this.ulikeNum = ulikeNum;
	}

	public String getHeadImg() {
		return this.headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public Set getCollectionPoems() {
		return this.collectionPoems;
	}

	public void setCollectionPoems(Set collectionPoems) {
		this.collectionPoems = collectionPoems;
	}

	public Set getCollectionArticles() {
		return this.collectionArticles;
	}

	public void setCollectionArticles(Set collectionArticles) {
		this.collectionArticles = collectionArticles;
	}

}