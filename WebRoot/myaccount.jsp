<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 这是个人主页部分
 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'myaccount.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />


  </head>
  
 <body>
<div id="page" class="container">
	<div id="header">
		<div id="logo">
			<img src="images/gelai.jpg" alt="" width='200px' height='200px'/>
			<h1><a href="#">徐怀静</a></h1>
		</div>
		<div id="menu">
			<ul>
				<li class="current_page_item"><a href="/new/personal.do?userId=${userId }&page=1" accesskey="1" title="">我的诗歌</a></li>
				<li><a href="fans.jsp" accesskey="2" title="">我的粉丝</a></li>
				<li><a href="follow.jsp" accesskey="3" title="">我关注的</a></li>
				<li><a href="like.jsp" accesskey="4" title="">我收藏的</a></li>
				<li><a href="change.jsp" accesskey="4" title="">修改信息</a></li>
			</ul>
		</div>
	</div>
	<div id="main">
		<div id="welcome">
			<div class="title">
			<ul class="style1">
			   <c:forEach items="${poemlist}" var="poem">
                           <li>
					<p class="date"><a href="#">${poem.ptime}</a></p>
					<h3>${poem.ptitle }</h3>
					<p style="font-size: 13px;"><a href="/new/orgindisplay.do?poemId=${poem.idpoem}&userId=${userId }">${poem.pinfo}</a></p>
				</li>
                                   </c:forEach>
				
				
			</ul>
		</div>
		<span class="disabled" style="float:center;"><<</span><span class="current">1</span>&ensp; <a href="/new/personal.do?userId=${userId }&page=2">2</a>&ensp; <a href="/new/personal.do?userId=${userId }&page=3">3</a>&ensp; …&ensp; <a href="#?page=199">10</a>&ensp; <a href="#?page=200">11</a>&ensp; <a href="#?page=2">>></a>
	</div>
</div>
</body>

</html>
