<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <base href="<%=basePath%>">
    
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	
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
			<h1><a href="myaccount.html">Privy</a></h1>
		</div>
		<div id="menu">
			<ul>
				<li><a href="/new/personal.do?userId=${userId }&page=1" accesskey="1" title="">我的诗歌</a></li>
				<li><a href="fans.jsp?userId=${userId }" accesskey="2" title="">我的粉丝</a></li>
				<li class="current_page_item"><a href="follow.jsp?userId=${userId }" accesskey="3" title="">我关注的</a></li>
				<li><a href="like.jsp?userId=${userId }" accesskey="4" title="">我收藏的</a></li>
				<li><a href="change.jsp?userId=${userId }" accesskey="4" title="">修改信息</a></li>
			
			</ul>
		</div>
	</div>
	<div id="main">
		<!-- <div id="banner">
			<img src="images/pic01.jpg" alt="" class="image-full" />
		</div> -->
		<div id="welcome">
			<div class="title">
				<h3>我的关注：</h3>
			</div>
			
		</div>
		<div id="featured">		
			<ul class="style1">
				<li style="background: url(tx/3.jpg) no-repeat; padding-left:100px;"><a href="#" style="font-size:20px;
	color:#6B8FA8;font-style:微软雅黑;">天黑黑</a>
				</li>
					<li style="background: url(tx/4.jpg) no-repeat; padding-left:100px;"><a href="#">Doris</a>
				</li>
					<li style="background: url(tx/5.jpg) no-repeat; padding-left:100px;"><a href="#">Doris</a>
				</li>
					<li style="background: url(tx/6.jpg) no-repeat; padding-left:100px;"><a href="#">Doris</a>
				</li>
				<li style="background: url(tx/7.jpg) no-repeat; padding-left:100px;"><a href="#">Doris</a>
				</li>
				<li style="background: url(tx/9.jpg) no-repeat; padding-left:100px;"><a href="#">Doris</a>
				</li>
				
			</ul>
		</div>
		<span class="disabled" style="float:center;"><<</span><span class="current">1</span>&ensp; <a href="#?page=2">2</a>&ensp; <a href="#?page=3">3</a>&ensp; …&ensp; <a href="#?page=199">10</a>&ensp; <a href="#?page=200">11</a>&ensp; <a href="#?page=2">>></a>
</div>
</body>

</html>
