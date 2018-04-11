package com.gelaigelai.domain;

import java.util.Date;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, String password, Date birth, String sex,
			Date regdate) {
		super(username, password, birth, sex, regdate);
	}

	/** full constructor */
	public User(Type type, String username, String password, Date birth,
			String sex, Date regdate, String email, String phone, String info,
			Integer ufunsNum, Integer ulikeNum, String headImg,
			Set collectionPoems, Set collectionArticles) {
		super(type, username, password, birth, sex, regdate, email, phone,
				info, ufunsNum, ulikeNum, headImg, collectionPoems,
				collectionArticles);
	}

}
