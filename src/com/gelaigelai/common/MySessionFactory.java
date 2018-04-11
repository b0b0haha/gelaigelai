package com.gelaigelai.common;

import org.hibernate.SessionFactory;

public class MySessionFactory {
	private static SessionFactory sessionFactory;
	private MySessionFactory(){
		
	}
	static {
		sessionFactory=(SessionFactory)Global.getDAO("sessionFactory");
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
