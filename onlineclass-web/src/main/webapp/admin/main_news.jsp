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
<script type="text/javascript" src="<%=path%>/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/bootstrap-datepicker.min.css" />
<style>
body {
	overflow-x: hidden;
	background: #f2f0f5;
	padding: 15px 0px 10px 5px;
}

#searchmain {
	font-size: 12px;
}

#search {
	font-size: 12px;
	background: #548fc9;
	margin: 10px 10px 0 0;
	display: inline;
	width: 100%;
	color: #FFF;
	float: left
}

#search form span {
	height: 40px;
	line-height: 40px;
	padding: 0 0px 0 10px;
	float: left;
}

#search form input.text-word {
	height: 24px;
	line-height: 24px;
	width: 180px;
	margin: 8px 0 6px 0;
	padding: 0 0px 0 10px;
	float: left;
	border: 1px solid #FFF;
}

#search form input.text-but {
	height: 24px;
	line-height: 24px;
	width: 55px;
	background: url(<%=path%>/images/main/list_input.jpg) no-repeat left top;
	border: none;
	cursor: pointer;
	font-family: "Microsoft YaHei", "Tahoma", "Arial", '宋体';
	color: #666;
	float: left;
	margin: 8px 0 0 6px;
	display: inline;
}

#search a.add {
	background: url(<%=path%>/images/main/add.jpg) no-repeat -3px 7px
		#548fc9;
	padding: 0 10px 0 26px;
	height: 40px;
	line-height: 40px;
	font-size: 14px;
	font-weight: bold;
	color: #FFF;
	float: right
}

#search a:hover.add {
	text-decoration: underline;
	color: #d2e9ff;
}

#main-tab {
	border: 1px solid #eaeaea;
	background: #FFF;
	font-size: 12px;
}

#main-tab th {
	font-size: 12px;
	background: url(<%=path%>/images/main/list_bg.jpg) repeat-x;
	height: 32px;
	line-height: 32px;
}

#main-tab td {
	font-size: 12px;
	line-height: 40px;
}

#main-tab td a {
	font-size: 12px;
	color: #548fc9;
}

#main-tab td a:hover {
	color: #565656;
	text-decoration: underline;
}

.bordertop {
	border-top: 1px solid #ebebeb
}

.borderright {
	border-right: 1px solid #ebebeb
}

.borderbottom {
	border-bottom: 1px solid #ebebeb
}

.borderleft {
	border-left: 1px solid #ebebeb
}

.gray {
	color: #dbdbdb;
}

td.fenye {
	padding: 10px 0 0 0;
	text-align: right;
}

.bggray {
	background: #f9f9f9
}
</style>
</head>
<body>

	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">
		<tr>
			<td width="99%" align="left" valign="top">您的位置：资讯信息管理</td>
		</tr>
		<tr>
			<td align="left" valign="top">
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					id="search">
					<tr>
						<td width="90%" align="left" valign="middle">
							<form method="post" action="<%=path %>/newsInfoLike">
								<div id="contu-order1">
									<span>资讯信息：</span>	<input type="text" name="news"
									 value="" placeholder="请输入关键字"	class="text-word"> 
									<span>日期：</span><input type="text" class="number-small  
									date start text-word" name="newsStartTime" placeholder="请输入起始日期"/><span class="padding-hor-sm">至&nbsp;
									&nbsp;</span><input type="text" class="number-small date end text-word" placeholder="请输入终止 日期"
									 name="newsEndTime"/>
									<input name="newsInfo" type="submit" value="查询" class="text-but">
								</div>	
							</form>
						</td>
						<td width="10%" align="center" valign="middle"
							style="text-align:right; width:150px;"><a href="<%=path %>/admin/main_add_news.jsp"
							target="mainFrame" onFocus="this.blur()" class="add">新增资讯信息</a></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td align="left" valign="top">

				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					id="main-tab">
					<tr>
						<th align="center" valign="middle" class="borderright">编号</th>
						<th align="center" valign="middle" class="borderright">资讯标题</th>
						<th align="center" valign="middle" class="borderright">图片</th>
						<th align="center" valign="middle" class="borderright">作者</th>
						<th align="center" valign="middle" class="borderright">内容</th>
						<th align="center" valign="middle" class="borderright">发布时间</th>
						<th align="center" valign="middle" class="borderright">资讯类型</th>
						<th align="center" valign="middle">操作</th>
					</tr>
					<tbody>
						<c:forEach items="${newsDtos}" var="item">

							<tr onMouseOut="this.style.backgroundColor='#ffffff'"
								onMouseOver="this.style.backgroundColor='#edf5ff'">
								<td align="center" valign="middle"
									class="borderright borderbottom">${item.id }</td>
								<td align="center" valign="middle"
									class="borderright borderbottom">${item.title }</td>
								<td align="center" valign="middle"
									class="borderright borderbottom">${item.picture }</td>
								<td align="center" valign="middle"
									class="borderright borderbottom">${item.author }</td>
								<td align="center" valign="middle"
									class="borderright borderbottom">${item.content }</td>
								<td align="center" valign="middle"
									class="borderright borderbottom">${item.postTime }</td>
								<td align="center" valign="middle"
									class="borderright borderbottom">${item.newsType.type }</td>
								<td align="center" valign="middle" class="borderbottom"><a
									href="add.html" target="mainFrame" onFocus="this.blur()"
									class="add">编辑</a><span class="gray">&nbsp;|&nbsp;</span><a
									href="add.html" target="mainFrame" onFocus="this.blur()"
									class="add">删除</a></td>
							</tr>
						</c:forEach>
					</tbody>
					
					<!-- <tr class="bggray" onMouseOut="this.style.backgroundColor='#f9f9f9'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="center" valign="middle" class="borderright borderbottom">2</td>
        <td align="center" valign="middle" class="borderright borderbottom">admin</td>
        <td align="center" valign="middle" class="borderright borderbottom">创始人</td>
        <td align="center" valign="middle" class="borderright borderbottom">已锁定</td>
        <td align="center" valign="middle" class="borderright borderbottom">2013-04-26 11:00:59</td>
        <td align="center" valign="middle" class="borderbottom"><a href="add.html" target="mainFrame" onFocus="this.blur()" class="add">编辑</a><span class="gray">&nbsp;|&nbsp;</span><a href="add.html" target="mainFrame" onFocus="this.blur()" class="add">删除</a></td>
      </tr> -->

				</table>
			</td>
		</tr>
		<tr>
			<td align="left" valign="top" class="fenye">11 条数据 1/1
				页&nbsp;&nbsp;<a href="#" target="mainFrame" onFocus="this.blur()">首页</a>&nbsp;&nbsp;<a
				href="#" target="mainFrame" onFocus="this.blur()">上一页</a>&nbsp;&nbsp;<a
				href="#" target="mainFrame" onFocus="this.blur()">下一页</a>&nbsp;&nbsp;<a
				href="#" target="mainFrame" onFocus="this.blur()">尾页</a>
			</td>
		</tr>
	</table>

</body>
<script type="text/javascript">
	    $('#contu-order1 .date ,#contu-order2 .date ,#contu-order3 .date ,#contu-order4 .date ,#contu-order5 .date').datepicker({
	        'format': 'yyyy-mm-dd',
	        'autoclose': true
	    });
</script>
<%-- <script type="text/javascript">
			$(function(){
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
 //         })
  </script> --%>
</html>