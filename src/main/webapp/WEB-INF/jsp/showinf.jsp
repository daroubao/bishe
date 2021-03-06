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

    <title>H+ 后台主题UI框架 - 个人资料</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content">
        <div class="row animated fadeInRight">
            <div class="col-sm-4">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>个人资料</h5>
                    </div>
                    <div>
                        <div class="ibox-content no-padding border-left-right">
                            <img alt="image" class="img-responsive" src="${inf.picUrl}">
                        </div>
                        <div class="ibox-content profile-content">
                            <h4><strong>${inf.userName }</strong></h4>
                            <p>${inf.sex }</p>
                            <h5>
                                    关于我
                                </h5>
                            <p>
                                ${inf.descr }
                            </p>
                            <div class="row m-t-lg">
                                 <div class="col-sm-4">
                                   <span class="bar"></span>
                                   <h5><strong>魅力值积分</strong> ${inf.score} </h5>
                               </div> 
                                <div class="col-sm-4">
                                    <span class="line"></span>
                                    <!-- <h5><strong>6</strong> 关注</h5> -->
                                </div>
                                <div class="col-sm-4">
                                    <span class="bar"></span>
                                   <!--  <h5><strong>3</strong> 关注者</h5> -->
                                </div>
                            </div>
                            <div class="user-button">
                                <div class="row">
                                    <div class="col-sm-6">
                                        <!-- <button type="button" class="btn btn-default btn-sm btn-block"><i class="fa fa-coffee"></i> 取消关注</button> -->
                                    </div>
                                    <div class="col-sm-6">
                                    <form method="post" action="<%= request.getContextPath()%>/care/add">
                                    <input type="hidden" name="caredUserID" value="${inf.userID }">
                                        <button type="submit" class="btn btn-primary btn-sm btn-block"> 关注</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
              <div class="wrapper wrapper-content animated fadeInRight">
                <div class="row">
                  <div class="col-sm-6">
                <div class="contact-box">
                    <a href="profile.html">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="img/a2.jpg">
                                <div class="m-t-xs font-bold"></div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>奔波儿灞</strong></h3>
                            <p>女</p>
                            <address>
                            <strong>关于我</strong><br>
                            <p>喜欢旅游</p><br>
                             <p>魅力值积分&nbsp 60</p><br>
                        </address>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>
            </div>
                  <div class="col-sm-6">
                <div class="contact-box">
                    <a href="profile.html">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="img/a1.jpg">
                                <div class="m-t-xs font-bold">营销总监</div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>灞波儿奔</strong></h3>
                            <p>男</p>
                            <address>
                            <strong>关于我</strong><br>
                            <p>喜欢打篮球，唱歌</p><br>
                             <p>魅力值积分&nbsp 20</p><br>
                        </address>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>
            </div>
        
                  <div class="col-sm-6">
                <div class="contact-box">
                    <a href="profile.html">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="img/a3.jpg">
                                <div class="m-t-xs font-bold">市场总监</div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>范爷</strong></h3>
                            <p>女</p>
                            <address>
                            <strong>关于我</strong><br>
                            <p>喜欢旅游</p><br>
                             <p>魅力值积分&nbsp 60</p><br>
                        </address>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>
            </div>
                  <div class="col-sm-6">
                <div class="contact-box">
                    <a href="profile.html">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="img/a4.jpg">
                                <div class="m-t-xs font-bold">攻城师</div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>李彦宏</strong></h3>
                            <p>男</p>
                            <address>
                            <strong>关于我</strong><br>
                            <p>幽默风趣</p><br>
                             <p>魅力值积分&nbsp 60</p><br>
                        </address>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>
            </div>
                  <div class="col-sm-6">
                <div class="contact-box">
                    <a href="profile.html">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="img/a5.jpg">
                                <div class="m-t-xs font-bold">射鸡师</div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>小马哥</strong></h3>
                            <p>女</p>
                            <address>
                            <strong>关于我</strong><br>
                            <p>喜欢旅游</p><br>
                             <p>魅力值积分&nbsp 60</p><br>
                        </address>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>
            </div>
                  <div class="col-sm-6">
                <div class="contact-box">
                    <a href="profile.html">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="img/a6.jpg">
                                <div class="m-t-xs font-bold">射鸡师</div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>乔峰</strong></h3>
                             <p>女</p>
                            <address>
                            <strong>关于我</strong><br>
                            <p>喜欢旅游</p><br>
                             <p>魅力值积分&nbsp 60</p><br>
                        </address>
                        </div>
                        <div class="clearfix"></div>
                    </a>

                </div>
            </div>
                  <div class="col-sm-6">
                <div class="contact-box">
                    <a href="profile.html">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="img/a1.jpg">
                                <div class="m-t-xs font-bold">CEO</div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>慕容晓晓</strong></h3>
                             <p>女</p>
                            <address>
                            <strong>关于我</strong><br>
                            <p>喜欢旅游</p><br>
                             <p>魅力值积分&nbsp 60</p><br>
                        </address>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>
            </div>
                  <div class="col-sm-6">
                <div class="contact-box">
                    <a href="profile.html">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="img/a2.jpg">
                                <div class="m-t-xs font-bold">射鸡师</div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>高圆圆</strong></h3>
                            <p>女</p>
                            <address>
                            <strong>关于我</strong><br>
                            <p>喜欢旅游</p><br>
                             <p>魅力值积分&nbsp 60</p><br>
                        </address>
                        </div>
                        <div class="clearfix"></div>
                    </a>
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


    <!-- Peity -->
    <script src="js/plugins/peity/jquery.peity.min.js"></script>

    <!-- Peity -->
    <script src="js/demo/peity-demo.js"></script>

    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    <!--统计代码，可删除-->

</body>

</html>
