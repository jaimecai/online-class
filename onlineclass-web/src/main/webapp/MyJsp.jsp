<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'MyJsp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
</head>

<body>
	This is my JSP page.
	<br> mqq:${mqq}
	<form>
		<button type="button" id="btn">你是最棒的！</button>
		<%-- <a id="btn" href="<%=path%>/notice">你是最棒的！</a> --%>
    <ul id="con"></ul>
	</form>
</body>
<script type="text/javascript">
$(function(){
              $("#btn").on('click', function(){
                 $.ajax({
                      type: "POST", //请求的方式，也有get请求
                        url: "<%=path%>/notice", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
               //       data: {name:name},//data是传给后台的字段，后台需要哪些就传入哪些
                      dataType: "json", //json格式，后台返回的数据为json格式的。
                      success: function(result){
                          var dataObj = result, //返回的result为json格式的数据
                          con = "";
                          $.each(dataObj, function(index, item){
                              con += "<li>id:"+item.id+"</li>";
  								con += "<li>类型:"+item.type+"</li>";
                          });
                          console.log(con);    //可以在控制台打印一下看看，这是拼起来的标签和数据
                          $("#con").html(con); //把内容入到这个div中即完成
                      }    
                  })
              })
          })
  </script>
</html>
