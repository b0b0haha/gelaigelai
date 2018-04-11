<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-CN">
<head>
 <base href="<%=basePath%>">
<meta name="viewport" charset="UTF-8" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">  
<title>登录Login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="login-container">
	<h1>格来格来 • 登录Login</h1>	
	<form action="/new/login.do" method="post" id="loginForm">
		<div>
			<input type="text" name="username" class="username" placeholder="用户名/邮箱/id or Email" autocomplete="off" required/>
		</div>
		<div>
			<input type="password" name="password" class="password" placeholder="密码/passsword" oncontextmenu="return false" onpaste="return false" required/>
		</div>
		<button id="submit" type="submit">登 录login</button>
	</form>
	<a href="register.jsp">
		<button type="button" class="register-tis">没有账号？立即注册register</button> 
	</a>
</br>
                 
</div>
<script src="js/jquery.min.js"></script>
<script src="js/common.js"></script>
<!--背景图片自动更换-->
<script src="js/supersized.3.2.7.min.js"></script>
<script src="js/supersized-init.js"></script>
<!--表单验证-->
<script src="js/jquery.validate.min.js?var1.14.0"></script>
<script type="text/javascript">
    
    var loginError=""+'${loginError}';
    if(loginError!=""){
        alert(loginError);
        loginError="";
        }
</script>
</body>
</html>

