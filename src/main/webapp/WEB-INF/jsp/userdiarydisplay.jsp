<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html ng-app="mainApp">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<base href="<%=basePath%>/resources/">

    <title>H+ 后台主题UI框架 - 文章列表</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="favicon.ico"> 
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight blog"  ng-controller='myCtrl'>
        <div class="row">
            <c:forEach items="${diary2list}" var="d">
            	
                <div class="ibox">
                    <div class="ibox-content">
                    <form method="post" action="<%= request.getContextPath()%>/diary/del">
            	
            			<input type="hidden" name="diaryid" value="${d.id }">
                       
                        
                            <h2>
                                    ${d.title }
                                </h2>
                        
                        
                        <div class="small m-b-xs">
                            <strong>${d.userName }</strong> <span class="text-muted"><i class="fa fa-clock-o"></i> ${d.dateline }</span>
                        </div>
                        <div style="max-height:200px;overflow:auto;'">
                      
                          ${d.body }
                      
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <h5>情感阶段：</h5>
                                <button class="btn btn-primary btn-xs" type="button">${d.stage }</button>
                                <button class="btn btn-primary btn-xs" type="submit" style="float:right;margin-top:10px;background-color:gray">删除</button>
                                <!-- <button class="btn btn-white btn-xs" type="button"></button> -->
                            </div>
                            </form>
                            <div class="col-md-6">
                                <div class="small text-right">   
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>
            
            <c:forEach items="${diary1list}" var="d">
            	
                <div class="ibox">
                    <div class="ibox-content">
                    <form method="post" action="<%= request.getContextPath()%>/diary/del">
            	
            			<input type="hidden" name="diaryid" value="${d.id }">
                        
                        
                            <h2>
                                    ${d.title }
                                </h2>
                      
                      
                        <div class="small m-b-xs">
                            <strong>高 晨</strong> <span class="text-muted"><i class="fa fa-clock-o"></i> ${d.dateline }</span>
                        </div>
                        <div style="max-height:200px;overflow:auto;'">
                      
                          ${d.body }
                      
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <h5>情感阶段：</h5>
                                <button class="btn btn-primary btn-xs" type="button">${d.stage }</button>
                                <button class="btn btn-primary btn-xs" type="submit" style="float:right;margin-top:10px;background-color:gray">删除</button>
                                <!-- <button class="btn btn-white btn-xs" type="button"></button> -->
                            </div>
                              </form>
                            <div class="col-md-6">
                                <div class="small text-right">   
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>

            <c:forEach items="${diaryalist}" var="d">
            	
                <div class="ibox">
                    <div class="ibox-content">
                    <form method="post" action="<%= request.getContextPath()%>/diary/del">
            	
            			<input type="hidden" name="diaryid" value="${d.id }">
                        
                            <h2>
                                    ${d.title }
                                </h2>
                      
                       
                        <div class="small m-b-xs">
                            <strong>高 晨</strong> <span class="text-muted"><i class="fa fa-clock-o"></i> ${d.dateline }</span>
                        </div>
                        <div style="max-height:200px;overflow:auto;'">
                      
                          ${d.body }
                      
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <h5>情感阶段：</h5>
                                <button class="btn btn-primary btn-xs" type="button">${d.stage }</button>
                                <button class="btn btn-primary btn-xs" type="submit" style="float:right;margin-top:10px;background-color:gray">删除</button>
                                <!-- <button class="btn btn-white btn-xs" type="button"></button> -->
                            </div>
                             </form>
                            <div class="col-md-6">
                                <div class="small text-right">   
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>
            
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