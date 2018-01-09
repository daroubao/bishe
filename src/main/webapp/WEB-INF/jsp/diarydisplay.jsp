<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<base href="<%=basePath%>/resources/">

    <title>H+ 后台主题UI框架 - 文章页面</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="favicon.ico"> 
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight article">
        <div class="row">
            <div class="col-lg-10 col-lg-offset-1">
                <div class="ibox">
                    <div class="ibox-content">
                        <div class="pull-right">
                            
                        </div>
                        <div class="text-center article-title">
                            <h2>
                                    ${diadetail.title }
                                </h2>
                                <h5 style="float:right">用户名：<a href="<%= request.getContextPath()%>/sign/showInf?id=${diadetail.diaUserID}">${diadetail.userName}</a></h5><br>
                                <button class="btn btn-primary btn-xs" type="button" style="float:right">${diadetail.stage }</button>
                        </div>
                        ${diadetail.body }
                        <hr>
					<form class="m-t" role="form" method="post" action="<%=request.getContextPath()%>/comment/add">
                        <div class="row">
                            <div class="col-lg-12">
								<div style="height:150px;">
	                               	<h2 class="col-lg-10">评论：</h2>
	                               	<input type="text" style="width:100%;height:40px;" maxlength="100" name="comDesc">
	                               	<input type="hidden" name="comDiaryID" value="${diadetail.id }">
	                               	<div>
	                               		<button type="submit" class="btn btn-primary" style="float:right;margin-top:10px;">提交</button>
	                               		<span style="float:right;font-size:10px;margin-right:10px;margin-top:10px;">评论最高不超过100字</span>
	                               	</div>
                               	</div>
                             <c:if test="${!empty comdis }">
					<c:forEach items="${comdis}" var="c">
                                <div class="social-feed-box">
                                    <div class="social-avatar">
                                        <!-- <a href="" class="pull-left">
                                            <img alt="image" src="img/a1.jpg">
                                        </a> -->
                                        <div class="media-body">
                                            <a href="<%= request.getContextPath()%>/sign/showInf?id=${c.comUserID}">
                                                    ${c.comName }
                                                </a>
                                            <small class="text-muted">${c.comTime }</small>
                                        </div>
                                    </div>
                                    <div class="social-body">
                                        <p>
                                            ${c.comDesc }
                                        </p>
                                    </div>
                                </div>
                                </c:forEach>
                                </c:if>
                                <!-- <div class="social-feed-box">
                                    <div class="social-avatar">
                                        <a href="" class="pull-left">
                                            <img alt="image" src="img/a2.jpg">
                                        </a>
                                        <div class="media-body">
                                            <a href="#">
                                                    避雷范儿
                                                </a>
                                            <small class="text-muted"> 16 小时前</small>
                                        </div>
                                    </div>
                                    <div class="social-body">
                                        <p>
                                            第一个真的好美 就是噪音太大了 挺唯美的意境瞬间变成工厂了
                                        </p>
                                    </div>
                                </div>
                                <div class="social-feed-box">
                                    <div class="social-avatar">
                                        <a href="" class="pull-left">
                                            <img alt="image" src="img/a3.jpg">
                                        </a>
                                        <div class="media-body">
                                            <a href="#">
                                                    kamppi
                                                </a>
                                            <small class="text-muted"> 6 小时前</small>
                                        </div>
                                    </div>
                                    <div class="social-body">
                                        <p>
                                            好美的装置艺术，第二个让我想起了海中缓缓游动的鲸鱼。
                                        </p>
                                    </div>
                                </div>
                                <div class="social-feed-box">
                                    <div class="social-avatar">
                                        <a href="" class="pull-left">
                                            <img alt="image" src="img/a5.jpg">
                                        </a>
                                        <div class="media-body">
                                            <a href="#">
                                                    kamppi
                                                </a>
                                            <small class="text-muted">6 小时前</small>
                                        </div>
                                    </div>
                                    <div class="social-body">
                                        <p>
                                            “Flylight 的灯管并不固定，由一套软件控制：每一个灯管都根据与其它灯管的互动进行移动，就像一群真正的鸟群一样。” 好像介绍的描述不对，灯管是固定的，控制的只是点亮和熄灭的时间，模拟成一团亮点移动
                                        </p>
                                    </div>
                                </div> -->


                            </div>
                        </div>
						</form>

                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- 全局js -->
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>



    <!-- 自定义js -->
    <script src="js/content.js?v=1.0.0"></script>


    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    <!--统计代码，可删除-->

</body>

</html>
