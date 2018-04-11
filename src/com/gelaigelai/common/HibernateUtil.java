package com.gelaigelai.common;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateUtil {
	   private static SessionFactory sessionFactory;
	    // 创建线程局部变量threadLocal，用来保存Hibernate的Session
	    private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	    // 使用静态代码块初始化Hibernate
	    static {
	        try {
	           
	            sessionFactory = MySessionFactory.getSessionFactory();
	        } catch (Throwable ex) {
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    // 获得SessionFactory的实例
	    public static SessionFactory getsSessionFactory() {
	        return sessionFactory;
	    }

	    // 获得ThreadLocal对象管理的Session
	    public static Session getsSession() throws HibernateException {
	        Session session = (Session) threadLocal.get();
	        if (session == null || !session.isOpen()) {
	            if (sessionFactory == null) {
	                rebuildSessionFactory();
	            }
	            // 通过SessionFactory对象创建Session对象
	            session = (sessionFactory != null) ? sessionFactory.openSession() : null;
	            // 将Session对象保存到线程局部变量threadLocal中
	            threadLocal.set(session);
	        }
	        return session;
	    }

	    // 关闭Session实例
	    public static void closeSession() {
	        // 从线程局部变量threadLocal中获取之前存入的Session实例
	        Session session = (Session) threadLocal.get();
	        threadLocal.set(null);
	        if (session != null) {
	            session.close();
	        }
	    }

	    // 重建SessionFactory
	    public static void rebuildSessionFactory() {
	       
	    	  sessionFactory = MySessionFactory.getSessionFactory();
	    }

	    // 关闭缓存和连接池
	    public static void shutdown() {
	        getsSessionFactory().close();
	    }
}
