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
								<a href="single.html"><img src="imgs/t1.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html">望山</a></h4>
								<p>从新居窗口，拉开窗帘<br/>

就能望见山<br/>

它压在那里，那么镇静<br/>

南风不能使它<br/>

移动一寸 <br/>
									<span>今年野花乱开时节<br/>

正是我最绝望之际<br/>

似乎一座大山<br/>

才有力气把我栓住<br/>

系在这尘世上</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="imgs/t2.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html">在梭罗墓前</a></h4>
								<p>这个新英格兰小镇<br/>

有着春天的加长版<br/>

整个世界静悄悄<br/>

沉睡谷公墓里的人们在沉睡<br/>

太阳加大了油门<br/>

这世上最亮的灯盏<br/>

也无法照进墓穴<br/>

天空蓝得虚无<br/>
									<span>云仿佛从中世纪壁画里复制<br/>

树阴、草地、花丛都安居着灵魂<br/>

坡度起伏得和缓优美<br/>

似乎死亡也可以充满感恩<br/>

背面的小山坡<br/>

梭罗和他的朋友在另一世界</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="imgs/t3.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html"></a>西黑文海滩</h4>
								<p>我浸泡在大西洋里<br/>

海水连着遥远的约旦河<br/>

浑身上下捆裹保鲜膜<br/>

以抵挡春季高纬度海水的冷<br/>

模样一定像拉撒路<br/>

只把细麻布换成了塑料<br/>

靠浮力托举，在水面滑行了一段<br/>
									<span>我仰躺，看见一大朵云<br/>

由东向西奔跑

上面隐约着慈祥的面容<br/>

船在远处鸣笛，怀抱一排巨浪<br/>

旁边栈桥上垂钓者以纤细的审慎<br/>

切割着海面</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="imgs/t4.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html"></a> 候 车</h4>
								<p>一站牌，一木质条椅，一窄形电子显示屏<br/>

一遮雨小亭，一免费报纸箱<br/>

一条延伸进地图的老铁轨<br/>

一个大太阳<br/>


									<span>双肩包被里面的一大盒巧克力麻痹着<br/>

调和着背负了上万里的悲伤<br/>

手工制作，本地产，故居旁的小店<br/>

他说：治疗爱的办法只能是更深的爱<br/>

									</span>
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
						<li><span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>25th March 2016</li>&nbsp;&nbsp;&nbsp;&nbsp;
						<c:if test="${poet!=null }">
						<li><span class="glyphicon glyphicon-user" aria-hidden="true"></span><a href="bai.html">${poet.poetname }</a></li>
						</c:if>
						<c:if test="${user!=null }">
						<li><span class="glyphicon glyphicon-user" aria-hidden="true"></span><a href="bai.html">${user.username }</a></li>
						</c:if>
						<!-- <li><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span><a href="#">5 Comments</a></li>
						<li><span class="glyphicon glyphicon-tags" aria-hidden="true"></span><a href="#">5 Tags</a></li> -->
					</ul>
				</div>
		 <bgsound src="song/送别.mp3" loop="-1" autostart="True">
				<div class="single-left1">
					<h5>${poem.ptitle}</h5>
					<div class="single-left1-grids">
						<div class="col-md-8 single-left1-grid">
							<p>${poem.pinfo}</p>
						</div>
						<div class="col-md-4 single-left1-grid">
							<img src="${image[0].filepath}" alt=" " class="img-responsive" />
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="single-left2">
				<c:if test="${poem.pannotation!=null}">
					<h4> 诗歌注释：${poem.pannotation }</h4>
					</c:if>
					<div class="col-md-4 single-left1-grid">
						<%-- <img src="${image[1].filepath}" alt=" " class="img-responsive" /> --%>
					</div>
					<div class="col-md-8 single-left1-grid">
					<c:if test="${poem.ptranslation!=null }">
						<p>诗歌翻译：${poem.ptranslation } </span></p>
					</c:if>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="single-left3">
				<c:if test="${poem.panalys!=null }">
					<p> 诗歌评析：${poem.panalys}</p>
					</c:if>
				</div>
				<c:if test="${flag==1 }">
				<a href=""><img src="tx/like.jpg" style="width:30px;height:30px;float: right;" alt="我喜欢"></a>
				</c:if>
	<c:if test="${flag==null||flag==0 }">
				<a href=""><img src="tx/like2.jpg" style="width:30px;height:30px;float: right;" alt="我喜欢"></a>
				</c:if>
				<br/><br/>
				<div class="comments-admin">
					<h4> Comments</h4>
					
						<div class="comments-admin-grid">
							<div class="comments-admin-grid-left">
								<img src="tx/5.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="comments-admin-grid-right">
								<p>诗人为什么写诗？这是写作者应该明白的一件事情。当今，诗坛浮躁，这个大奖那个大奖眼花缭乱，让多少人为虚名而不能安静下来去面对诗歌，也让多少编辑把那些晦涩抽象的诗看成好诗。翻翻当今的诗歌刊物，有几首能让读者拍手叫绝，有几首能让读者和诗人眼睛一亮的好诗？</p>
								<div class="reply">
									<a href="#">Reply</a>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="comments-admin-grid">
							<div class="comments-admin-grid-left">
								<img src="tx/6.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="comments-admin-grid-right">
								<p>言为心声，李清联老师的这首小诗，和清让的小诗《丝袜》，都是给祖国母亲的作品，表明了每个炎黄子孙都是爱国的。诗人热血澎湃，是用不同的诗句，赞美着自己深爱的祖国。记住了这首打动我的小诗后，我曾给一个诗人朋友打电话推荐这一首小诗，说这是一首伟大的爱国小诗，作者把祖国容纳在这一首小诗了，闪烁着伟大的光芒！可清让呢，还不是大诗人，因为阅读和知道这一首小诗的人太少了，这首小诗可以让每一个中国人热爱自己的祖国，这首小诗可以让每个读者记住一个叫王清让的诗人。一个诗人一生中可以写诗无数，但是若能写出一首具有爆炸性的诗篇，诗人的桂冠无疑就是读者授予他的。对于我这一个阅读者来说，每次阅读这一首十一行的小诗，我的心里，就会深深地爱上这一位换了一双肉色丝袜的妈妈，因为这一位好妈妈好伟大，她没有让她的孩子难堪，这就是这一首小诗带给我们的力量！</p>
								<div class="reply">
									<a href="#">Reply</a>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>

					</div>
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="leave-a-comment">
				<h3>Leave your comment here</h3> 
				<form>
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
 