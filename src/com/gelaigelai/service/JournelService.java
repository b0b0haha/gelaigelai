package com.gelaigelai.service;

import java.util.List;

import com.gelaigelai.common.Global;
import com.gelaigelai.domain.Journel;
import com.gelaigelai.domain.JournelDAO;

public class JournelService {
private JournelDAO journelDAO=(JournelDAO)Global.getDAO("JournelDAO");

public JournelDAO getJournelDAO() {
	return journelDAO;
}

public void setJournelDAO(JournelDAO journelDAO) {
	this.journelDAO = journelDAO;
}
public List<Journel> getJourel(){
	return journelDAO.findAll();
}

}
