<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <head>
    <base href="<%=basePath%>">
    <meta name="viewport" charset="UTF-8" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">  
    <title>注册Register</title>
    
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="style.css">
<style>
.styled-select {
   width: 302px;
   height: 44px;
  background:transparent;
color: white;
border: 1px solid rgba(255, 255, 255, .15);
font-size:14px;
}
</style>

  </head>
  
 <div class="login-container">
	<h1>格来格来 • 注册Register</h1>	
	<form action="/new/register.do" method="post" id="loginForm" enctype="multipart/form-data">
		<div>
			<input type="text" name="username" class="username" placeholder="用户名/id" required/>
		</div>
		<div>
			<input type="text" name="email" placeholder="邮箱/Email" required/>
		</div>
		<div>
			<input type="password" name="password" class="password" placeholder="密码/password" oncontextmenu="return false" onpaste="return false" required/>
		</div>
		<div>
			<input type="password" name="repassword" class="confirm_password" placeholder="再次输入密码/input the password again" oncontextmenu="return false" onpaste="return false" required/>
		</div>
                        </div>
		<div>   <tr>   
                    <td>性别：</td>
                    <td>
                        <input type="radio" name="sex"  id="man1" value="M" style='width:20px;height:20px;'/>
                        <label for="man1">男</label>
                        <input type="radio" name="sex" id="man2" value="W" style='width:20px;height:20px;'/>
                        <label for="man2">女</label>
                                            
                    </td>                
                </tr>
            </div>
           <div> 
           <label>生日:</label><input type="date" style='width:200px' name="birth" />
           </div>

		<button id="submit" type="submit">注册/register</button>
</form>
	</br>
	<a href="login.jsp">
		<button type="button" class="register-tis">已经有账号？现在登录！login now</button>
	</a>
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
