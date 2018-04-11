package com.gelaigelai.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gelaigelai.common.Global;
import com.gelaigelai.common.HibernateUtil;
import com.gelaigelai.domain.Song;
import com.gelaigelai.domain.SongDAO;
import com.gelaigelai.domain.Type;


public class SongService {
	private SongDAO songDAO=(SongDAO)Global.getDAO("SongDAO");

	public SongDAO getSongDAO() {
		return songDAO;
	}

	public void setSongDAO(SongDAO songDAO) {
		this.songDAO = songDAO;
	}
	public SongService (){
		
	}
	public List getSongByType(Integer type){
		 List<Song> results=new ArrayList<Song>();
			// 创建Session实例
		    Session session = HibernateUtil.getsSession();
		    // 创建Transaction实例
		    Transaction tx = session.beginTransaction();
            
		    try {
		       String hql="FROM Song s";
		        Query query=session.createQuery(hql);
		     List<Song>songlist=query.list();
		        for(Song s:songlist){
		        	if(s.getType().getIdtype().equals(type))
		        		results.add(s);
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
}
