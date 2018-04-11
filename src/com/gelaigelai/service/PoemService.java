package com.gelaigelai.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;






import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.mapping.Array;
import org.hibernate.sql.Update;
import org.hibernate.type.ListType;

import com.gelaigelai.common.Global;
import com.gelaigelai.common.HibernateUtil;
import com.gelaigelai.common.Random;
import com.gelaigelai.domain.Image;
import com.gelaigelai.domain.Poem;
import com.gelaigelai.domain.PoemDAO;
import com.gelaigelai.domain.Poet;
import com.gelaigelai.domain.Song;
import com.gelaigelai.domain.Type;
import com.gelaigelai.domain.User;
import com.gelaigelai.domain.UserDAO;

public class PoemService {
private PoemDAO poemDAO=(PoemDAO)Global.getDAO("PoemDAO");

public PoemDAO getPoemDAO() {
	return poemDAO;
}

public void setPoemDAO(PoemDAO poemDAO) {
	this.poemDAO = poemDAO;
}

public void save(Poem poem){
	 // 创建Session实例
    Session session = HibernateUtil.getsSession();
    // 创建Transaction实例
    Transaction tx = session.beginTransaction();

    try {
        // 使用Session的save方法将持久化对象保存到数据库
        session.save(poem);
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
public void Update(Poem poem){
	 // 创建Session实例
    Session session = HibernateUtil.getsSession();
    // 创建Transaction实例
    Transaction tx = session.beginTransaction();

    try {
        // 使用Session的save方法将持久化对象保存到数据库
        session.update(poem);
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
public void Delete(Poem poem){
	 // 创建Session实例
    Session session = HibernateUtil.getsSession();
    // 创建Transaction实例
    Transaction tx = session.beginTransaction();

    try {
        // 使用Session的save方法将持久化对象保存到数据库
        session.delete(poem);
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

/*获取最新诗歌*/
public List getNewPoem(int flag ,int num){
	 List<Poem> results=new ArrayList<Poem>();
	// 创建Session实例
    Session session = HibernateUtil.getsSession();
    // 创建Transaction实例
    Transaction tx = session.beginTransaction();
int n=0;
    try {
       String hql="FROM Poem P ORDER BY P.ptime DESC";
        Query query=session.createQuery(hql);
        List <Poem>poems=query.list();
        for(Poem p:poems){
      	  int k=checkflag(p.getType().getIdtype());
      	  if(k==flag){
      		  if(n==num)
      			  break;
      		  results.add(p);
      		  n++;
      	  }
        }
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
return results;
}
/*获取最热诗歌*/
public List getHotPoem(int flag ,int num){
	 List<Poem> results=new ArrayList<Poem>();
		// 创建Session实例
	    Session session = HibernateUtil.getsSession();
	    // 创建Transaction实例
	    Transaction tx = session.beginTransaction();
int n=0;
	    try {
	       String hql="FROM Poem P ORDER BY P.plikeNum DESC";
	        Query query=session.createQuery(hql);
	        List <Poem>poems=query.list();
  for(Poem p:poems){
	  int k=checkflag(p.getType().getIdtype());
	  if(k==flag){
		  if(n==num)
  			  break;
		  results.add(p);
		  n++;
	  }
  }
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
	return results;
}
/*按照类型获取诗歌*/
public List getPoemByType(Integer type){
	
	 List<Poem> results=new ArrayList<Poem>();
		// 创建Session实例
	    Session session = HibernateUtil.getsSession();
	    // 创建Transaction实例
	    Transaction tx = session.beginTransaction();

	    try {
	       String hql="FROM Poem P ";
	        Query query=session.createQuery(hql);
	        List<Poem> poemlist=query.list();
	        for(Poem p:poemlist){
	        	if(p.getType().getIdtype().equals(type))
	        		results.add(p);
	        }
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
	return results;

}
/*按照诗人获取诗歌*/
public List getPoemByPoet(Poet poet){
	 List<Poem> results=new ArrayList<Poem>();
		// 创建Session实例
	    Session session = HibernateUtil.getsSession();
	    // 创建Transaction实例
	    Transaction tx = session.beginTransaction();

	    try {
	       String hql="FROM Poem P ";
	        Query query=session.createQuery(hql);
	        List<Poem> poemlist=query.list();
	        for(Poem p:poemlist){
	        	if(p.getType().getIdtype().equals(poet.getIdpoet()))
	        		results.add(p);
	        }
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
	return results;
}

//判断个人删除诗歌下的评论
public boolean IsDeleteComment(Integer poemId,Integer userId){
	 
		// 创建Session实例
	    Session session = HibernateUtil.getsSession();
	    // 创建Transaction实例
	    Transaction tx = session.beginTransaction();

	    try {
	      Poem poem=poemDAO.findById(poemId);
	    if(userId.equals(poem.getUserIdUser())){
	    	return true;
	    }
	     
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
return false;

}
//获取推荐诗歌
public List getRecommendPoem(int flag){
	List <Integer>flags=new ArrayList<Integer>();
	
	List<Poem> hotList=getHotPoem(flag,7);
	List <Poem>newList=getNewPoem(flag,7);
	System.out.println(hotList.size());
	System.out.println(newList.size());
	List<Poem>recommendList=new ArrayList<Poem>();
	for(int i=0;i<5;i++){
		int num=Random.getNum(0, hotList.size()-1);
		Poem poem=hotList.get(num);
		if(checkpick(flags,poem.getIdpoem())){
			recommendList.add(poem);
			flags.add(poem.getIdpoem());
		}
	}
	for(int i=0;i<5;i++){
		int num=Random.getNum(0, newList.size()-1);
		Poem poem=newList.get(num);
		if(checkpick(flags,poem.getIdpoem())){
			recommendList.add(poem);
			flags.add(poem.getIdpoem());
		}
	}
	return recommendList ;
}
//判断诗歌是否已经被获取
public boolean checkpick(List<Integer> l,int flag){
	for(Integer k:l){
		if(k.equals(flag))
			return false;
	}
	return true;
}
//判断大类型

public int checkflag(int num){
	if(num>=1&&num<=10){
		return 1;
	}
	else if(num>=11&&num<=17){
		return 2;
	}
	else{
		return 3;
	}
}
public List<Poem> getRandomPoems(int flag){
	List<Poem>poems=poemDAO.findAll();
	List <Poem>results=new ArrayList<Poem>();
	int w=0;
	while(w!=5){
		int num=Random.getNum(0, poems.size()-1);
		Poem poem=poems.get(num);
		  int k=checkflag(poem.getType().getIdtype());
			  if(k==flag){
				  results.add(poem);
				  w++;
			  }
	}
	return results;
}
public List<Image>poemImg(Poem poem){
	List<Image>images=new ArrayList<Image>();
    	Image image=null;
    	Set<Image> set = poem.getImages();
    	Iterator<Image> it = set.iterator();
		while(it.hasNext()){
		image=it.next();
		if(image!=null)
			break;
		}
		images.add(image);
    return images;
}
public void addlike(Integer id){
	Poem poem=poemDAO.findById(id);
	int num=poem.getPlikeNum();
	num++;
	poem.setPlikeNum(num);
	Update(poem);
}
public void addComent(Integer id){
	Poem poem =poemDAO.findById(id);
	int num=poem.getPcommentNum();
	num++;
	poem.setPcommentNum(num);
	Update(poem);
}
}
