<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>Single</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Walk Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/component.css" rel="stylesheet" type="text/css"  />
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<!-- //js -->

<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<script src="js/audiojs/audio.min.js"></script>
<script type="text/javascript">
  audiojs.events.ready(function() {
    var as = audiojs.createAll();
  });
</script>
<!-- start-smoth-scrolling -->

  </head>
  
  <body class="cbp-spmenu-push">
<!-- banner -->
	<div class="banner1">
		<div class="container">
			<div class="header">
				<div class="header-left">
					<form>
						<input type="text" value="Search Here..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search Here...';}" required="">
						<input type="submit" value="" >
						<div class="clearfix"> </div>
					</form>
				</div>
				<div class="header-left1">
					<h1><a href="index.jsp">gelaigelai</a></h1>
				</div>
				<!-- #push_sidebar -->
				<div class="top-nav">
					 <nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-right" id="cbp-spmenu-s2">
						<h3>Menu</h3>
						<ul>
							<li><a href="/new/poemshow.do?action=tiaozhuan&type=5&userId=${userId }"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>主页</a></li>
							<li><a href="about.html"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>关于我们</a></li>
							<li><a href="/new/poemshow.do?action=tiaozhuan&type=2&userId=${userId }"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span>诗歌</a></li>
							<li><a href="poet.html"><span class="glyphicon glyphicon-picture" aria-hidden="true"></span>诗人</a></li>
							<li><a href="poetics.html"><span class="glyphicon glyphicon-text-size" aria-hidden="true"></span>诗学</a></li>
							<li><a href="news.html"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>诗讯</a></li>
						</ul>
					</nav>
					 <div class="main buttonset">	
					<!-- Class "cbp-spmenu-open" gets applied to menu and "cbp-spmenu-push-toleft" or "cbp-spmenu-push-toright" to the body -->
						<button id="showRightPush"><img src="images/menu.png" alt=""/></button>
					</div>
				<!-- Classie - class helper functions by @desandro https://github.com/desandro/classie -->
						<script src="js/classie.js"></script>
						<script>
							var menuRight = document.getElementById( 'cbp-spmenu-s2' ),
							showRightPush = document.getElementById( 'showRightPush' ),
							body = document.body;

							showRightPush.onclick = function() {
								classie.toggle( this, 'active' );
								classie.toggle( body, 'cbp-spmenu-push-toleft' );
								classie.toggle( menuRight, 'cbp-spmenu-open' );
								disableOther( 'showRightPush' );
							};

							function disableOther( button ) {
								if( button !== 'showRightPush' ) {
									classie.toggle( showRightPush, 'disabled' );
								}
							}
						</script>
						<!-- /script-for-menu -->
				</div>
				<!-- /#push_sidebar -->
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //banner -->
<!-- single -->
	<div class="single">
		<div class="container">
			<div class="col-md-4 single-right">
				<div class="blog-right1">
					
					<div class="categories">
						<h3>Categories</h3>
						<ul>
							<li><a href="/new/poemshow.do?action=tiaozhuan&type=1&userId=${userId }">古诗</a></li>
							<li><a href="/new/poemshow.do?action=tiaozhuan&type=2&userId=${userId }">现代诗</a></li>
							<li><a href="/new/poemshow.do?action=tiaozhuan&type=3&userId=${userId }">原创诗</a></li>
						</ul>
					</div>
					<div class="categories categories-mid">
						<!-- <h3>Archives</h3>
						<ul>
							<li><a href="#">May 20,2009</a></li>
							<li><a href="#">July 31,2010</a></li>
							<li><a href="#">January 20,2012</a></li>
							<li><a href="#">November 2,2012</a></li>
							<li><a href="#">December 25,2014</a></li>
							<li><a href="#">January 14,2015</a></li>
						</ul> -->
					</div>
					<div class="related-posts">
						<h3>猜你喜欢</h3>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="imgs/xr1.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html">胡亮：窥豹录·海子</a></h4>
								<p>“瘦哥哥梵高，梵高啊，”海子呼叫着，呼叫着，好像梵高（Vincent Willem van Gogh）已经借用了他的肉体。
									<span>在海子看来，梵高，还有荷尔德林、雪莱、韩波和叶赛宁，当然还有他自己，都属于同一个序列。这个序列可称为朝霞序列、深渊圣徒序列、王子或太阳神之子序列、半神序列。</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="images/4_.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html">李以亮：谈论诗歌与人已经变得越来越困难</a></h4>
								<p>因为“艺术中的真实是，其对立面也同样真实”（王尔德语）。这就极易滑入廉价的相对主义泥淖，但是在这里我们还是只能“换脚站”，只能是在矛盾之中寻找立足点，别无他途；也是因为，我们根本不能分割诗歌与人二者来谈。 
									<span>事实上，没有一个写作者的生活最终不会影响到他的写作；也没有一个人写作中的问题，不会在他的生活中露出蛛丝马迹。</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="imgs/xr3.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html">王东东：谐隐诗人与讽刺的未来——序夏汉诗集《街头的证词》</a></h4>
								<p>朱光潜先生在《诗与谐隐》中说：“穆罕默德自夸能用虔诚祈祷使山移到他面前来。有一大群信徒围着来看他显这副本领。他尽管祈祷，山仍是岿然不动。 
									<span>他于是说：‘好，山不来就穆罕默德，穆罕默德就走去就山罢。’</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="imgs/xr4.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html">才华需要庇护和温暖——读诗选《我听见了时间》</a></h4>
								<p>10年来，诗坛对“90后”诗人的扶持就像尼采在《论我们教育机构的未来》中说的“给天才以正确的教育和爱护”。
									<span>虽然“天才的真正来源并不在教育之中”，但“如果没有这个庇护和温暖他的故乡，他将永不能展翅作他永恒的飞翔，而会被悲惨地困在时间之中，像一个流落在冬日荒原的异乡人，从贫瘠的土地上蹒跚离去”。</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-8 single-left">
				<div class="comments">
					<ul>
						<li><span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>${date }</li>&nbsp;&nbsp;&nbsp;&nbsp;
						<li><span class="glyphicon glyphicon-user" aria-hidden="true"></span><a href="bai.html">${author}</a></li>
						<!-- <li><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span><a href="#">5 Comments</a></li>
						<li><span class="glyphicon glyphicon-tags" aria-hidden="true"></span><a href="#">5 Tags</a></li> -->
					</ul>
				</div>
<!-- 				<audio src="#" preload="auto" ></audio> -->
				<div class="single-left1">
					<h5>${title}</h5>
					<div class="single-left1-grids">
						<div class="col-md-8 single-left1-grid">
							<p>${info}</p>
						</div>
						<div class="col-md-4 single-left1-grid">
							<img src="${images[0].imgPath}" alt=" " class="img-responsive" />
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="single-left2">
					<h4></h4>
					<div class="col-md-4 single-left1-grid">
						<img src="${images[1].imgPath}" alt=" " class="img-responsive" />
					</div>
					<div class="col-md-8 single-left1-grid">
						<p></span></p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="single-left3">
					<p></p>
					
				</div>
				<c:if test="${flag==1 }">
				<a href=""><img src="tx/like.jpg" style="width:30px;height:30px;float: right;" alt="我喜欢"></a>
				</c:if>
	<c:if test="${flag==null||flag==0 }">
				<a href=""><img src="tx/like2.jpg" style="width:30px;height:30px;float: right;" alt="我喜欢"></a>
				</c:if>
				<br/><br/>
				<div class="comments-admin">
					<h4>3 Comments</h4>
					<c:forEach items="${image }" var="comment">
						<div class="comments-admin-grid">
							<div class="comments-admin-grid-left">
								<img src="" alt=" " class="img-responsive" />
							</div>
							<div class="comments-admin-grid-right">
								<p>In a free hour, when our power of 
									choice is untrammelled and when nothing prevents our being able 
									to do what we like best, every pleasure is to be welcomed and 
									every pain avoided. But in certain circumstances and owing to 
									the claims of duty or the obligations of business 
									it will frequently occur.</p>
								<div class="reply">
									<a href="#">Reply</a>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="comments-admin-grid">
							<div class="comments-admin-grid-left">
								<img src="images/5.png" alt=" " class="img-responsive" />
							</div>
							<div class="comments-admin-grid-right">
								<p>In a free hour, when our power of 
									choice is untrammelled and when nothing prevents our being able 
									to do what we like best, every pleasure is to be welcomed and 
									every pain avoided. But in certain circumstances and owing to 
									the claims of duty or the obligations of business 
									it will frequently occur.</p>
								<div class="reply">
									<a href="#">Reply</a>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
					</c:forEach>
					</div>
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="leave-a-comment">
				<h3>Leave your comment here</h3> 
				<form>
					<input type="text" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" required="">
					<input type="email" value="Email..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email...';}" required="">
					<input type="text" value="Phone Number" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Phone Number';}" required="">
					<textarea type="text" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Type Your Comment here...';}" required="">Type Your Comment here...</textarea>
					<input type="submit" value="Add Comment">
				</form>
			</div>
		</div>
	</div>
<!-- //single -->
<!-- footer -->
<!-- 	<div class="footer"> -->
		<!-- <div class="container"> -->
			<!-- <div class="col-md-3 footer-grid">
				<img src="images/8.jpg" alt=" " class="img-responsive" />
			</div> -->
		<!-- 	<div class="col-md-3 footer-grid">
				<h2><a href="index.html">Walk<span>Where To Go This Summer?</span></a></h2>
				<p>But I must explain to you how all this mistaken idea of denouncing pleasure 
					and praising pain was born.</p>
				<ul>
					<li><span class="glyphicon glyphicon-home" aria-hidden="true"></span> 738 Diamond Road, New York City, USA.</li>
					<li><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span><a href="mailto:info@example.com">info@example.com</a></li>
					<li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span> +7683 928 829</li>
				</ul>
			</div> -->
			<!-- <div class="col-md-3 footer-grid">
				<h4>Flickr Photos</h4>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/5.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/6.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/7.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/6.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/7.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/5.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/7.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/5.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="footer-grid1">
					<a href="single.html"><img src="images/6.jpg" alt=" " class="img-responsive" /></a>
				</div>
				<div class="clearfix"> </div>
			</div> -->
			<!-- <div class="col-md-3 footer-grid">
				<h4>Booking Hours</h4>
				<div class="footer-grid2">
					<ul class="timings">
						<li>Monday <i>.....</i> 10AM to 7PM</li>
						<li>Friday <i>.....</i> 9AM to 5PM</li>
						<li>Sunday <i>.....</i> 10AM to 2PM</li>
					</ul>
					<div class="social-icons social-icons1">
						<ul>
							<li><a href="#" class="twitter"></a></li>
							<li><a href="#" class="facebook"></a></li>
							<li><a href="#" class="google"></a></li>
							<li><a href="#" class="p"></a></li>
						</ul>
					</div>
				</div>
			</div> -->
			<!-- <div class="clearfix"> </div> -->
		<!-- </div> -->
	<!-- </div> -->
	<!-- <div class="footer-copy">
		<div class="container">
			<p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
		</div>
	</div> -->
<!-- //footer -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
</body>

</html>
 