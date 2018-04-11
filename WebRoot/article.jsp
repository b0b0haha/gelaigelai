<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>诗学</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main_poetics.css" />

  </head>
  
  <body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<span class="avatar"><a href='index.html'><img src="images/gelai.jpg" alt="" /></a></span>
						<h1><strong>Poetics &ensp; &ensp;  || &ensp; &ensp;    诗学</strong><br />
						</h1>
						<!-- <ul class="icons">
							<li><a href="#" class="icon style2 fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon style2 fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon style2 fa-instagram"><span class="label">Instagram</span></a></li>
							<li><a href="#" class="icon style2 fa-500px"><span class="label">500px</span></a></li>
							<li><a href="#" class="icon style2 fa-envelope-o"><span class="label">Email</span></a></li>
						</ul> -->
					</header>

				<!-- Main -->
					<section id="main">

						<!-- Thumbnails -->
							<section class="thumbnails">
								<div>
									<a href="/new/artilce.do?articleId=${article[0].idarticle }">
										<img src="images/thumbs/01.jpg" alt="" />
										<h3>${article[0].title }</h3>
									</a>
									<a href="/new/artilce.do?articleId=${article[1].idarticle }">
										<img src="images/thumbs/02.jpg" alt="" />
										<h3>${article[1].title }</h3>
									</a>
								</div>
								<div>
									<a href="/new/artilce.do?articleId=${article[2].idarticle }">
										<img src="images/thumbs/03.jpg" alt="" />
										<h3>${article[2].title }</h3>
									</a>
									<a href="/new/artilce.do?articleId=${article[3].idarticle }">
										<img src="images/thumbs/04.jpg" alt="" />
										<h3>${article[3].title }</h3>
									</a>
									<a href="/new/artilce.do?articleId=${article[4].idarticle }">
										<img src="images/thumbs/05.jpg" alt="" />
										<h3>${article[4].title }</h3>
									</a>
								</div>
								<div>
									<a href="/new/artilce.do?articleId=${article[5].idarticle }">
										<img src="images/thumbs/06.jpg" alt="" />
										<h3>${article[5].title }</h3>
									</a>
									<a href="/new/artilce.do?articleId=${article[6].idarticle }">
										<img src="images/thumbs/07.jpg" alt="" />
										<h3>${article[6].title }</h3>
									</a>
								</div>
							</section>
<span class="disabled"><<</span><span class="current">1</span>&ensp; <a href="#?page=2">2</a>&ensp; <a href="#?page=3">3</a>&ensp; …&ensp; <a href="#?page=199">10</a>&ensp; <a href="#?page=200">11</a>&ensp; <a href="#?page=2">>></a>
					</section>

				<!-- Footer -->
					<footer id="footer">
						
					</footer>

			</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.poptrox.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/main.js"></script>

	</body>

</html>
