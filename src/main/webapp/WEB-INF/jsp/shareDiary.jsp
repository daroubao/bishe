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


    <title>H+ 后台主题UI框架 - 富文本编辑器</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">
	<base href="<%=basePath%>/resources/">
    <link rel="shortcut icon" href="favicon.ico"> 
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/summernote.css" rel="stylesheet">
    <link href="css/summernote-bs3.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content">
    
    <form class="m-t" role="form" method="post" action="<%=request.getContextPath()%>/diary/add">

        <div class="row">
                <div class="ibox float-e-margins" style="height:1000px;">
                    <div class="ibox-title">
                        <h5>日记编辑</h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="dropdown-toggle" data-toggle="dropdown" href="form_editors.html#">
                                <i class="fa fa-wrench"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-user">
                                <li><a href="form_editors.html#">仅自己可见</a>
                                </li>
                                <li><a href="form_editors.html#">仅双方可见</a>
                                </li>
                            </ul>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content no-padding">

                        <div class="summernote" style="width:400px;margin:0 auto;">
                            <p><b>日记标题：</b><input type="text" value="" name="title" required="" style="width:300px;"></h2>
                            <p><b>日记内容：</b><textarea type="text" value="" name="body" required="" style="width:300px;height:200px;"></textarea></p>
                            <p>
                                <b>情感阶段：</b><input type="text" value="" name="stage" required=""style="width:300px;">
                            </p>
                           <!--  <p>
                                <b>定价：</b><span class="label label-warning">&yen;988（不开发票）</span>
                            </p> -->

                        
	                        <div>
		                        <label><input name="rights" value="1" checked="" type="radio"> 仅自己可见</label>
		                   		<label><input name="rights" value="2" checked="" type="radio"> 仅双方可见</label>
		                    	<label><input name="rights" value="3" checked="" type="radio"> 所有人可见</label>
		                        <button id="save" class="btn btn-primary  btn-xs" onclick="save()" type="submit">保存</button>
	                        </div>
						</div>

                    </div>
                </div>
        </div>
        </form>

    </div>
    <div class="gohome"><a class="animated bounceInUp" href="index.html?v=4.0" title="返回首页"><i class="fa fa-home"></i></a></div>

    <!-- 全局js -->
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>



    <!-- 自定义js -->
    <script src="js/content.js?v=1.0.0"></script>


    <!-- SUMMERNOTE -->
    <!-- <script src="js/summernote.min.js"></script>
    <script src="js/summernote-zh-CN.js"></script> -->
    <script src="js/plugins/summernote/summernote.min.js"></script>
	<script src="js/plugins/summernote/summernote-zh-CN.js"></script>

    <script>
        $(document).ready(function () {

            $('.summernote').summernote({
                lang: 'zh-CN'
            });

        });
        var edit = function () {
            $("#eg").addClass("no-padding");
            $('.click2edit').summernote({
                lang: 'zh-CN',
                focus: true
            });
        };
        var save = function () {
            $("#eg").removeClass("no-padding");
            var aHTML = $('.click2edit').code(); //save HTML If you need(aHTML: array).
            $('.click2edit').destroy();
        };
    </script>

    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    <!--统计代码，可删除-->
</body>

</html>