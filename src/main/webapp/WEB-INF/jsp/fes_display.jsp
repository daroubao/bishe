<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
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

    <title>纪念日</title>

    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="row">
        <div class="col-sm-12">
            <div class="wrapper wrapper-content">
                <div class="row animated fadeInRight">
                    <div class="col-sm-12">
                        <div class="ibox float-e-margins">
                          
                            <div class="" id="ibox-content">

                                <div id="vertical-timeline" class="vertical-container light-timeline">
                                	 <div class="vertical-timeline-block">
                                    	<a href="form_simditor.html">
                                    		<div class="vertical-timeline-icon navy-bg">
                                         <i class="glyphicon glyphicon-plus" ></i>                              	
                                        </div>
                                    	</a>
                                    	<form class="m-t" role="form" method="post" action="<%=request.getContextPath()%>/fes/add">
                                        <div class="vertical-timeline-content">
                                            <h2><input type="text" style="width:10%;height:40px;" maxlength="100" name="fesTitle"></h2>
                                            <p><input type="text" style="width:50%;height:40px;" maxlength="100" name="fesDesc"></p>  
                                            <span class="vertical-date"> 
                                         <small><input type="date" style="width:100%;height:40px;" maxlength="100" name="fesDate"></small>
                                      </span>
                                    <button class="btn btn-sm btn-primary" type="submit">新增</button>
                                        </div>
                                        </form>
                                    </div>
                                    
									<c:if test="${!empty list }">
                                        <c:forEach items="${list}" var="f"><li>
                                         <div id="vertical-timeline" class="light-timeline">
                                        <div class="vertical-timeline-block">
                                        <div class="vertical-timeline-content">
                                            <h2>${f.fesTitle }</h2>
                                            <p>${f.fesDesc }</p>
                                            <form method="post" action="<%= request.getContextPath()%>/fes/del">
											<input type="hidden" name="fesid" value="${f.id }">
                                            <button class="btn btn-sm btn-primary" type="submit">删除</button> 
                                            <span class="vertical-date"> 
                                            <fmt:formatDate value="${f.fesDate }" pattern="yyyy-MM-dd"/>
                                        </div></div></div></li>
                                        </c:forEach>
                                        </c:if>
									
                                    </div>
                                </div>

                            </div>
                        </div>
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


    <script>
        $(document).ready(function () {

            // Local script for demo purpose only
            $('#lightVersion').click(function (event) {
                event.preventDefault()
                $('#ibox-content').removeClass('ibox-content');
                $('#vertical-timeline').removeClass('dark-timeline');
                $('#vertical-timeline').addClass('light-timeline');
            });

            $('#darkVersion').click(function (event) {
                event.preventDefault()
                $('#ibox-content').addClass('ibox-content');
                $('#vertical-timeline').removeClass('light-timeline');
                $('#vertical-timeline').addClass('dark-timeline');
            });

            $('#leftVersion').click(function (event) {
                event.preventDefault()
                $('#vertical-timeline').toggleClass('center-orientation');
            });


        });
    </script>

    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    <!--统计代码，可删除-->
</body>

</html>
