<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%	
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>主要内容区main</title>
<link href="<%=path%>/css/css.css" type="text/css" rel="stylesheet" />
<link href="<%=path%>/css/main.css" type="text/css" rel="stylesheet" />
<link rel="shortcut icon" href="<%=path%>/images/main/favicon.ico" />
<script type="text/javascript" src="<%=path%>/js/jquery-3.2.1.js"></script>

</head>

<script type="text/javascript">
	$(function(){
		a();
	
		function a(){
			 $.ajax({
                      type: "POST", //请求的方式，也有get请求
                        url: "<%=path%>/noticeInfo", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
               //       data: {name:name},//data是传给后台的字段，后台需要哪些就传入哪些
                      dataType: "json", //json格式，后台返回的数据为json格式的。
                      success: function(result){
                          window.location.href="";
                      }    
                  })
		}
	
	})
	<%-- $(function(){
		window.location="<%=path%>/noticeInfo";
	}) --%>
	<%-- 		$(function(){
       //       $("#btn").on('click', function(){
                 $.ajax({
                      type: "POST", //请求的方式，也有get请求
                        url: "<%=path%>/noticeInfo", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
               //       data: {name:name},//data是传给后台的字段，后台需要哪些就传入哪些
                      dataType: "json", //json格式，后台返回的数据为json格式的。
                      success: function(result){
                          var dataObj = result, //返回的result为json格式的数据
                          con = "";
                          $.each(dataObj, function(index, item){
                          		con += "<tr onMouseOut=\"this.style.backgroundColor='#ffffff'\" onMouseOver=\"this.style.backgroundColor='#edf5ff'\">";
                          		con += "<td align='center' valign='middle' class='borderright borderbottom'>"+item.id+"</td>";
        						con += "<td align='center' valign='middle' class='borderright borderbottom'>"+item.type+"</td>";
       							con += "<td align='center' valign='middle' class='borderbottom'><a href='add.html' target='mainFrame' onFocus='this.blur()' class='add'>编辑</a><span class='gray'>&nbsp;|&nbsp;</span><a href='add.html' target='mainFrame' onFocus='this.blur()' class='add'>删除</a></td>";
                          });
                          console.log(con);    //可以在控制台打印一下看看，这是拼起来的标签和数据
                          $("#newsType").html(con); //把内容入到这个div中即完成
                      }    
                  })
              })
 //         })--%>
  </script> 
</html>