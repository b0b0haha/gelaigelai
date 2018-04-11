package com.gelaigelai.struts.action;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.gelaigelai.common.SecureImg;

public class SecureImgAction extends Action {
	@SuppressWarnings("unused")
	  private static final String TAG = "SecureImgAction";




	  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
	      HttpServletResponse response) {
	 
	      response.setHeader("Pragma","No-cache");
	      response.setHeader("Cache-Control","no-cache");
	      response.setHeader("P3P", "CP=CAO PSA OUR");
	      response.setDateHeader("Expires", 0);       
	      HttpSession session=request.getSession();
	      SecureImg imageCode=new SecureImg();
	      try {
	ImageIO.write(imageCode.creatImage(), "JPEG", response.getOutputStream());
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	      session.setAttribute("CheckCode",imageCode.getSRand());


	    return null;
	  }
}
