<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
	<base href="<%=basePath%>/resources/">
    <title>爱之谷</title>

    <meta name="keywords" content="爱之谷">
    <meta name="description" content="爱之谷">

    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->

    <link rel="shortcut icon" href="favicon.ico"> 
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
</head>

<body class="fixed-sidebar full-height-layout gray-bg skin-1" style="overflow:hidden">
    <div id="wrapper">
        <!--左侧导航开始-->
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="nav-close"><i class="fa fa-times-circle"></i>
            </div>
            <div class="sidebar-collapse">
                <ul class="nav" id="side-menu">
                    <li class="nav-header">
                        <div class="dropdown profile-element">
                            <span><a href="javascript:;"><img alt="image" class="img-circle" style="width: 64px; height: 64px;" src="${pro.picUrl }" /></a></span>
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear">
                               <a href="<%= request.getContextPath()%>/sign/showpro" ><span class="block m-t-xs"><strong class="font-bold">${pro.userName }</strong></span></a>
                              
                          <!--
                              <span class="text-muted text-xs block">资料<b class="caret"></b></span>
                                </span>
                            </a>
                            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                <li><a class="J_menuItem" href="form_avatar.html">修改头像</a>
                                </li>
                                <li><a class="J_menuItem" href="profile.html">个人资料</a>
                                </li>                           
                                <li class="divider"></li>
                                <li><a href="login.html">安全退出</a>
                                </li>
                            </ul>
                             
                        </div>
                        <div class="logo-element">
                        </div> 
                    </li>   
                  --> 
                     <li>
                        <a class="J_menuItem" href="<%=request.getContextPath()%>/fes/display"><i class="glyphicon glyphicon-calendar"></i> <span class="nav-label">纪念日</span></a>
                    </li>
                    <li>
                        <a class="J_menuItem" href="<%=request.getContextPath()%>/album/display"><i class="fa fa-picture-o"></i> <span class="nav-label">甜蜜留影</span></a>
                    </li>
                    <li>
                        <a href="###.html"><i class="glyphicon glyphicon-book"></i> <span class="nav-label">爱情日记</span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="<%=request.getContextPath()%>/diaryd">写日记</a>
                            </li>
                            <li><a class="J_menuItem" href="<%= request.getContextPath()%>/diary/displayall">所有人日记</a>
                            </li>  
                            <li><a class="J_menuItem" href="<%= request.getContextPath()%>/diary/display1">私密日记</a>
                            </li> 
                            <li><a class="J_menuItem" href="<%= request.getContextPath()%>/diary/userdisplayall">我的所有日记</a>
                            </li>                          
                        </ul>
                    </li>
                    <li>
                        <a class="J_menuItem" href="<%=request.getContextPath()%>/note/display"><i class="glyphicon glyphicon-list-alt"></i> <span class="nav-label">便签</span></a>
                    </li>
                    <%-- <li>
                        <a class="J_menuItem" href="<%= request.getContextPath()%>/boundr"><i class="glyphicon glyphicon-heart"></i> <span class="nav-label">我们</span></a>
                    </li> --%>
                    
                     <li>
                        <a href="###.html"><i class="glyphicon glyphicon-heart"></i> <span class="nav-label">我们</span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="<%=request.getContextPath()%>/boundr">我要绑定</a>
                            </li>
                            <li><a class="J_menuItem" href="<%= request.getContextPath()%>/sign/unbound">我们已经恩断义绝了</a>
                            </li>                                                 
                        </ul>
                    </li>       
               </ul>
            </div>
        </nav>
        <!--左侧导航结束-->
        
        <!--右侧部分开始-->
        <div id="page-wrapper" class="gray-bg dashbard-1">           
               <div class="row content-tabs">
                <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
                </button>
                <nav class="page-tabs J_menuTabs">
                    <div class="page-tabs-content">
                        <a href="javascript:;" class="active J_menuTab" data-id="index_v1.html">情侣私密日记</a>
                        <!-- <a href="javascript:;" class="active J_menuTab" data-id="index_v1.jsp">社区</a> -->
                        <!-- <a href="javascript:;" class="active J_menuTab" data-id="index_v2.html">社区</a> -->
                    </div>
                </nav>
                <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
                </button>
                <div class="btn-group roll-nav roll-right">
                    <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                    </button>
                    <ul role="menu" class="dropdown-menu dropdown-menu-right">                      
                        <li class="divider"></li>
                        <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                        </li>
                        <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                        </li>
                    </ul>
                </div>
                <a href="###.html" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
            </div>
            <div class="row J_mainContent" id="content-main">
                <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="<%=request.getContextPath()%>/diary/display2" frameborder="0" data-id="index_v1.html" seamless></iframe>
            </div>
            

        </div>
        <!--右侧部分结束-->
   

    </div>

    <!-- 全局js -->
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>
    <script src="js/plugins/jquery.metisMenu.js"></script>
    <script src="js/plugins/jquery.slimscroll.min.js"></script>
    <script src="js/plugins/layer.min.js"></script>

    <!-- 自定义js -->
    <script src="js/hplus.js?v=4.1.0"></script>
    <script type="text/javascript" src="js/contabs.js"></script>

    

</body>

</html>
