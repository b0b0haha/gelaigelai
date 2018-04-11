package com.gelaigelai.service;

import java.util.List;

import com.gelaigelai.common.Global;
import com.gelaigelai.domain.News;
import com.gelaigelai.domain.NewsDAO;

public class NewsService {
private NewsDAO newsDAO=(NewsDAO)Global.getDAO("NewsDAO");

public NewsDAO getNewsDAO() {
	return newsDAO;
}

public void setNewsDAO(NewsDAO newsDAO) {
	this.newsDAO = newsDAO;
}
public List<News> getNews(){
	return newsDAO.findAll();
}
}
