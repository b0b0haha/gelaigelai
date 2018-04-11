package com.gelaigelai.service;

import com.gelaigelai.common.Global;
import com.gelaigelai.domain.PoemCommentDAO;

public class CommentService {
private PoemCommentDAO poemCommentDAO=(PoemCommentDAO)Global.getDAO("PoemCommentDAO");

public PoemCommentDAO getPoemCommentDAO() {
	return poemCommentDAO;
}

public void setPoemCommentDAO(PoemCommentDAO poemCommentDAO) {
	this.poemCommentDAO = poemCommentDAO;
}

}
