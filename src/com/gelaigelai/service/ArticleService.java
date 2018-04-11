package com.gelaigelai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.hibernate.mapping.Array;

import com.gelaigelai.common.Global;
import com.gelaigelai.domain.Article;
import com.gelaigelai.domain.ArticleDAO;
import com.gelaigelai.domain.Articleimg;
import com.gelaigelai.domain.Image;

public class ArticleService {
private ArticleDAO articleDAO=(ArticleDAO)Global.getDAO("ArticleDAO");

public ArticleDAO getArticleDAO() {
	return articleDAO;
}

public void setArticleDAO(ArticleDAO articleDAO) {
	this.articleDAO = articleDAO;
	
}   
public List<Article>getArticle(){
	return articleDAO.findAll();
}
public List<Articleimg>getArticleImage(Integer id){
	Article article=articleDAO.findById(id);
	Set <Articleimg>images=article.getArticleimgs();
	List <Articleimg>imagelist=new ArrayList<Articleimg>();
	for(Articleimg img:images){
		imagelist.add(img);
	}
	return imagelist;
}
}
