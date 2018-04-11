package com.gelaigelai.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gelaigelai.common.Global;
import com.gelaigelai.common.HibernateUtil;
import com.gelaigelai.domain.Poet;
import com.gelaigelai.domain.PoetDAO;
import com.gelaigelai.domain.Type;


public class PoetService {
private  PoetDAO poetDAO=(PoetDAO)Global.getDAO("PoetDAO");

public PoetDAO getPoetDAO() {
	return poetDAO;
}

public void setPoetDAO(PoetDAO poetDAO) {
	this.poetDAO = poetDAO;
}
public List getPoets(){
	return poetDAO.findAll();
}

}
