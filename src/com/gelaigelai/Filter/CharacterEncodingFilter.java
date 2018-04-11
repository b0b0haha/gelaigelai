package com.gelaigelai.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class CharacterEncodingFilter extends HttpServlet implements Filter {
	 private static final long serialVersionUID = 1L;  
	private String encoding; 
	   public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws java.io.IOException, javax.servlet.ServletException { 
	         // TODO Auto-generated method stub
	           arg0.setCharacterEncoding("utf-8");
	           arg2.doFilter(arg0, arg1);
	    }

	    public void init(FilterConfig arg0) throws javax.servlet.ServletException { 
	         // TODO Auto-generated method stub
	         encoding=arg0.getInitParameter("encoding");
	    }

}
