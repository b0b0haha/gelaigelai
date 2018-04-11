package com.gelaigelai.service;

import java.util.List;

import com.gelaigelai.common.Global;
import com.gelaigelai.domain.Msg;
import com.gelaigelai.domain.MsgDAO;

public class MsgService {
private MsgDAO msgDAO=(MsgDAO)Global.getDAO("MsgDAO");

public MsgDAO getMsgDAO() {
	return msgDAO;
}

public void setMsgDAO(MsgDAO msgDAO) {
	this.msgDAO = msgDAO;
}

public List<Msg> showMsg(){
	return msgDAO.findAll();
}
public void save(Msg m){
	msgDAO.save(m);
}

}
