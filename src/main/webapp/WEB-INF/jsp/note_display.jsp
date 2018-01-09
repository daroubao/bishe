<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

    <title>便签</title>
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
            <div class="wrapper wrapper-content animated fadeInUp">
                <ul class="notes">
                
              
                	<c:if test="${!empty list }">
					<c:forEach items="${list}" var="n">
                    <li>
                        <div >
                        <form method="post" action="<%= request.getContextPath()%>/note/del">
                            <small id="">${n.noteDate }</small>
                            <h4>${n.noteTitle }</h4>
                            <p>${n.noteDesc }</p>
                            <input type="hidden" name="noteid" value="${n.id }">
                            
                           <a><button type="submit"> <i class=" glyphicon glyphicon-trash"  type="submit" ></i></button></a>
                            
                            </form>
                        </div>
                    </li>
                    </c:forEach>
                    </c:if>
                    
                    <li>
                   		<a href="<%= request.getContextPath()%>/notea">
                      	  <div>
                            <center><h3>新增便签</h3></center>
                      	  </div>
                        </a>
                    </li>

                    
                </ul>
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
