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
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <title>Poem</title>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800" rel="stylesheet" type="text/css" />
        <!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="js/skel.min.js"></script>
        <script src="js/skel-panels.min.js"></script>
        <script src="js/init.js"></script>
        <noscript>
            <link rel="stylesheet" href="css/skel-noscript.css" />
            <link rel="stylesheet" href="css/style.css" />
            <link rel="stylesheet" href="css/style-desktop.css" />
        </noscript>

  </head>
  <style>


abbr,address,article,aside,audio,b,blockquote,canvas,caption,cite,code,dd,del,details,dfn,div,dl,dt,em,fieldset,figcaption,figure,footer,form,h1,h2,h3,h4,h5,h6,header,hgroup,html,i,iframe,img,ins,kbd,label,legend,li,mark,menu,object,ol,p,pre,q,samp,section,small,span,strong,sub,summary,sup,table,tbody,td,tfoot,th,thead,time,tr,ul,var,video{margin:0;padding:0;border:0;outline:0;font-size:100%;background:0 0;font-weight:400;font-style:inherit;font-family:inherit;vertical-align:top}article,aside,details,figcaption,figure,footer,header,hgroup,hr,menu,section{display:block}/*nav ul,ol,ul{list-style:none}:focus,*//*,a{outline:0}a{margin:0;*/*/*/font-size:100 %;vertical-align:baseline;background:0 0;blr:expression(this.onFocus=this.blur())}a,ins{text-decoration:none}a,hr{padding:0}*/*/ins,mark{background-color:#ff9;color:#000}mark{font-style:italic;font-weight:700}blockquote,q{quotes:none}blockquote:after,blockquote:before,q:after,q:before{content:'';content:none}del{text-decoration:line-through}abbr[title],dfn[title]{border-bottom:1px dotted;cursor:help}table{border-collapse:collapse;border-spacing:0}caption,td,th{text-align:left;font-weight:400}hr{height:1px;border:0;border-top:1px solid #cccccc;margin:1em 0}input,select{vertical-align:middle;border:0} 

.demo {width: 800px;height: 450px;font-size: 14px;position:relative;}
.demo a.control {position:absolute;display: block;top: 50%;margin-top: -78px;width: 76px;height: 112px;cursor: pointer;z-index: 2;background: url(../images/buttons.png) no-repeat}
.demo a.prev {left: 0;background-position: 0 0}
.demo a.next {right: 0;background-position: -76px 0}
.demo a.prev:hover {background-position: 0 -112px}
.demo a.next:hover {background-position: -76px -112px}
/*----------------------------为保证最佳效果，建议设置如下样式------------------------*/
.slider {display: none}
</style>
  
 <body class="homepage">

        <!-- Header -->
        <div id="header-wrapper">
        
            <div id="header" class="container">
            
                <div id="logo"><h1><a href="#">POEM</a></h1></div>
                <nav id="nav">
                   
                    <ul>
                         
                        <li ><a href="/new/oldPoem.do?type=3&userId=${userId }">原创诗</a></li>
                        <li class="current_page_item"><a href="/new/oldPoem.do?type=1&userId=${userId }">古诗</a></li>
                        <li><a href="/new/oldPoem.do?type=2&userId=${userId}">现代诗</a></li>
                        <li><a href="/new/oldPoem.do?type=4&userId=${userId}">我要写诗</a></li>  
                    </ul>          
                </nav>            
            </div>
        </div>
        <div id="page">
                <div class="container">
                    <div class="row">
                    
                        <div id="content" class="8u">   

        <div class="demo">
    <a class="control prev"></a><a class="control next abs"></a><!--自定义按钮，移动端可不写-->
    <div class="slider"><!--主体结构，请用此类名调用插件，此类名可自定义-->
        <ul>
       <c:forEach items="${reco}" var="image">
            <li><a href="/new/olddisplay.do?poemId=${image.poemId}&userId=${userId }"><img src="${image. filepath}" alt="${image.title }" /></a></li>
            </c:forEach>
        </ul>
    </div>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/YuxiSlider.jQuery.min.js"></script>
<script>
$(".slider").YuxiSlider({
    width:800, //容器宽度
    height:450, //容器高度
    control:$('.control'), //绑定控制按钮
    during:4000, //间隔4秒自动滑动
    speed:800, //移动速度0.8秒
    mousewheel:true, //是否开启鼠标滚轮控制
    direkey:true //是否开启左右箭头方向控制
});
</script>
<!--     <div id="two-column">
        <div class="row">
                  </div>
                            </div> -->
                              <div id="two-column">
                                <div class="row"> 
                                    <section class="6u">
                                        <p style="font-size: 15px;">叙事诗</p>
                                        <ul>
                                        <c:forEach items="${pl1}" var="poem">
                                        <li>
                                                <a href="/new/olddisplay.do?poemId=${poem.idpoem}&userId=${userId }">${poem.ptitle}</a>
                                                
                                            </li>
                                        </c:forEach>
                                          
                                        </ul>
                                    </section>
                                    
                                    <section class="6u">
                                        <p style="font-size: 15px;">抒情诗</p>
                                        <ul>
                                           <c:forEach items="${pl2}" var="poem">
                                        <li>
                                                <a href="/new/olddisplay.do?poemId=${poem.idpoem}&userId=${userId }">${poem.ptitle}</a>
                                                
                                            </li>
                                        </c:forEach> 
                                        </ul>
                                    </section>
                                    <br/>
                                    <section class="6u">
                                        <p style="font-size: 15px;">送别诗</p>
                                        <ul>
                                          
                                            <c:forEach items="${pl3}" var="poem">
                                        <li>
                                                <a href="/new/olddisplay.do?poemId=${poem.idpoem}&userId=${userId }">${poem.ptitle}</a>
                                                
                                            </li>
                                        </c:forEach> 
                                        </ul>
                                    </section>

                                    <section class="6u">
                                        <p style="font-size: 15px;">边塞诗</p>
                                        <ul>
                                           <c:forEach items="${pl4}" var="poem">
                                        <li>
                                                <a href="/new/olddisplay.do?poemId=${poem.idpoem}&userId=${userId }">${poem.ptitle}</a>
                                                
                                            </li>
                                        </c:forEach> 
                                        </ul>
                                    </section>
                                    <br/>
                                     <section class="6u">
                                        <p style="font-size: 15px;">山水田园诗</p>
                                        <ul>
                                          <c:forEach items="${pl5}" var="poem">
                                        <li>
                                                <a href="/new/olddisplay.do?poemId=${poem.idpoem}&userId=${userId }">${poem.ptitle}</a>
                                                
                                            </li>
                                        </c:forEach> 
                                        </ul>
                                    </section>
                                    <section class="6u">
                                        <p style="font-size: 15px;">怀古诗</p>
                                        <ul>
                                         <c:forEach items="${pl6}" var="poem">
                                        <li>
                                                <a href="/new/olddisplay.do?poemId=${poem.idpoem}&userId=${userId }">${poem.ptitle}</a>
                                                
                                            </li>
                                        </c:forEach> 
                                        </ul>
                                    </section>
                                    <br/>
                                    <section class="6u">
                                        <p style="font-size: 15px;">咏物诗</p>
                                        <ul>
                                           <c:forEach items="${pl7}" var="poem">
                                        <li>
                                                <a href="/new/olddisplay.do?poemId=${poem.idpoem}&userId=${userId }">${poem.ptitle}</a>
                                                
                                            </li>
                                        </c:forEach>
                                        </ul>
                                    </section>
                                     <section class="6u">
                                        <p style="font-size: 15px;">羁旅诗</p>
                                        <ul>
                                          <c:forEach items="${pl10}" var="poem">
                                        <li>
                                                <a href="/new/olddisplay.do?poemId=${poem.idpoem}&userId=${userId }">${poem.ptitle}</a>
                                                
                                            </li>
                                        </c:forEach>
                                        </ul>
                                    </section>
                                </div>
                            </div>
                             
                        </div>
                        
                
                        <div id="sidebar" class="4u">
                            <div class="row">
                                <section id="box1" class="6u">
                                    <h3>最热诗歌</h3>
                                    <ul class="style4">
                                       <c:forEach items="${hotPoems}" var="poem">
                                        <li><a href="/new/olddisplay.do?poemId=${poem.idpoem}&userId=${userId }">${ poem.ptitle}</a></li>
                                        </c:forEach>
                                    </ul>
                                </section>
                                <section class="6u">
                                    <h3>最新诗歌</h3>
                                    <ul class="style4">
                                        <c:forEach items="${newPoems}" var="poem">
                                        <li><a href="/new/olddisplay.do?poemId=${poem.idpoem}&userId=${userId }">${ poem.ptitle}</a></li>
                                        </c:forEach>
                                    </ul>
                                </section>
                            </div>
                            <section id="box2">
                                <h2>好诗速览</h2>
                                <ul class="style2">
                                  <c:forEach items="${random }" var="poem">
                                    <li>
                                        <p><a href="/new/olddisplay.do?poemId=${poem.poemId}&userId=${userId }"><img src="${poem.filepath }" alt="">${poem.title }</a></p>
                                    </li>
                                   </c:forEach>
                                 </ul>
                                    <br>
                                <a href="#" class="button button-style1">Read More</a>
                            </section>
                        </div>
                    
                    </div>
                </div>
            </div>
            
        <!-- /Page -->

                    
                    
                
                                
                           
        <!-- Copyright -->
            <div id="copyright" class="container">
                Design: <a href="http://templated.co">TEMPLATED</a> Images: <a href="http://unsplash.com">Unsplash</a> (<a href="http://unsplash.com/cc0">CC0</a>)
            </div>


    </body>

</html>
