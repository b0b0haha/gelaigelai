package com.gelaigelai.service;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gelaigelai.common.Global;
import com.gelaigelai.common.HibernateUtil;
import com.gelaigelai.domain.User;
import com.gelaigelai.domain.UserDAO;



public class UserService {

private UserDAO userDAO=(UserDAO)Global.getDAO("UserDAO");
public UserDAO getUserDAO() {
	return userDAO;
}
public void setUserDAO(UserDAO userDAO) {
	this.userDAO = userDAO;
}
public UserService(){
	
}
public boolean checklogin(User u){
	String username=u.getUsername();
	String password=u.getPassword();
	List<User> users=userDAO.findByUsername(username);
	for(User k: users){
		if(k.getPassword().equals(password))
		{System.out.println(k.getPassword());
			return true;}
	}
	return false;
}
public boolean checkRename(String username){
	List<User>userList=userDAO.findByUsername(username);
	if(userList.size()==0)
		return true;
	else return false;
}
public void save(User user){
	 // 创建Session实例
    Session session = HibernateUtil.getsSession();
    // 创建Transaction实例
    Transaction tx = session.beginTransaction();

    try {
        // 使用Session的save方法将持久化对象保存到数据库
        session.save(user);
        // 提交事务
        tx.commit();
    } catch (Exception e) {
        e.printStackTrace();
        // 出现异常，回滚事务
        tx.rollback();
    } finally {
        // 关闭Session连接
        HibernateUtil.closeSession();
    }

}
public void update(User u){
	 Session session=HibernateUtil.getsSession();
     Transaction tx=session.beginTransaction();
      try {
          session.update(u);
          tx.commit();
      } catch (Exception e) {
          e.printStackTrace();
          tx.rollback();
      } finally {
          HibernateUtil.closeSession();
      }
	
}
public void delete(User user) {
    Session session = HibernateUtil.getsSession();
    Transaction tx = session.beginTransaction();
    try {
        session.delete(user);
        tx.commit();
    } catch (Exception e) {
        e.printStackTrace();
        tx.rollback();
    } finally {
        HibernateUtil.closeSession();
    }
}
public User findByIdGet(int id) {
    User user = null;
    Session session = HibernateUtil.getsSession();
    // 使用session的get方法获取指定id的用户
    user = (User) session.get(User.class, id);
    if (user == null || "".equals(user)) {
        System.out.println("查询id为：" + id + "无结果....");
    }
    session.close();
    return user;
}
public User findByIdLoad(int id) {
    User user = null;
    Session session = HibernateUtil.getsSession();
    // 使用session的方法获取指定id的用户
    user = (User) session.load(User.class, id);
    if (user == null || "".equals(user)) {
        System.out.println("查询id为：" + id + "无结果....");
    }
    session.close();
    return user;
}

public List<User> findByHQL(String hql) {
    List<User> list = new ArrayList<User>();
    Session session = HibernateUtil.getsSession();
    list = session.createQuery(hql).list();
    session.close();
    return list;
}

}
