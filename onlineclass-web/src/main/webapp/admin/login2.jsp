<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>后台管理登录错误界面</title>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
</head>
<body>
    <div>
   		<h3>错误提示：用户名或密码错误！</h3>
   		点击返回，重新登录
    	<button id="btn1" type="button">返回</button>
    </div>
</body>
<script type="text/javascript">
	$(function(){
		$("#btn1").click(function(){
			window.location="<%=path%>/admin/login.jsp";
		});
	})
</script>
</html>
