<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>左侧导航menu</title>
<link href="../css/css.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="../js/sdmenu.js"></script>
<script type="text/javascript">
	// <![CDATA[
	var myMenu;
	window.onload = function() {
		myMenu = new SDMenu("my_menu");
		myMenu.init();
	};
	// ]]>
</script>
<style type=text/css>
html{ SCROLLBAR-FACE-COLOR: #538ec6; SCROLLBAR-HIGHLIGHT-COLOR: #dce5f0; SCROLLBAR-SHADOW-COLOR: #2c6daa; SCROLLBAR-3DLIGHT-COLOR: #dce5f0; SCROLLBAR-ARROW-COLOR: #2c6daa;  SCROLLBAR-TRACK-COLOR: #dce5f0;  SCROLLBAR-DARKSHADOW-COLOR: #dce5f0; overflow-x:hidden;}
body{overflow-x:hidden; background:url(../images/main/leftbg.jpg) left top repeat-y #f2f0f5; width:194px;}
</style>
</head>
<body onselectstart="return false;" ondragstart="return false;" oncontextmenu="return false;">
<div id="left-top">
	<div><img src="../images/main/member.gif" width="44" height="44" /></div>
    <span>用户：admin<br>角色：超级管理员</span>
</div>
    <div style="float: left" id="my_menu" class="sdmenu">
      <div class="collapsed">
        <span>资讯信息管理</span>
        <a href="main.jsp" target="mainFrame" onFocus="this.blur()">资讯信息管理首页</a>
        <a href="<%=path%>/noticeInfo" target="mainFrame" onFocus="this.blur()" id="btn" >资讯类型管理</a>
        <a href="<%=path%>/newsInfo" target="mainFrame" onFocus="this.blur()">所有资讯信息表</a>
       <!--  <a href="main_message.jsp" target="mainFrame" onFocus="this.blur()">留言页</a>
        <a href="main_menu.jsp" target="mainFrame" onFocus="this.blur()">栏目管理</a> -->
      </div>
      <div>
        <span>系统设置</span>
        <a href="main_list.jsp" target="mainFrame" onFocus="this.blur()">级别权限</a>
        <a href="main_info.jsp" target="mainFrame" onFocus="this.blur()">角色管理</a>
        <a href="main.jsp" target="mainFrame" onFocus="this.blur()">自定义权限</a>
      </div>
      <div>
        <span>课程管理</span>
        <a href="/course/findAll" target="mainFrame" onFocus="this.blur()">课程管理</a>
        <a href="main_list.jsp" target="mainFrame" onFocus="this.blur()">级别权限</a>
        <a href="main_info.jsp" target="mainFrame" onFocus="this.blur()">角色管理</a>
        <a href="main.jsp" target="mainFrame" onFocus="this.blur()">自定义权限</a>
      </div>
      <div>
        <span>系统设置</span>
        <a href="main.jsp" target="mainFrame" onFocus="this.blur()">分组权限</a>
        <a href="main_list.jsp" target="mainFrame" onFocus="this.blur()">级别权限</a>
        <a href="main_info.jsp" target="mainFrame" onFocus="this.blur()">角色管理</a>
        <a href="main.jsp" target="mainFrame" onFocus="this.blur()">自定义权限</a>
      </div>
    </div>
</body>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			console.log(newsType.get(0).getType());
		});
	
	})

</script>
</html>