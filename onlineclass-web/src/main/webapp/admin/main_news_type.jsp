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
<link href="<%=path%>/css/bootstrap.min.css" type="text/css"
	rel="stylesheet" />
<link href="<%=path%>/css/css.css" type="text/css" rel="stylesheet" />
<link href="<%=path%>/css/main.css" type="text/css" rel="stylesheet" />

<link rel="shortcut icon" href="<%=path%>/images/main/favicon.ico" />
<script type="text/javascript" src="<%=path%>/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=path%>/js/bootstrap.js"></script>
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
							<form method="post" action="<%=path%>/noticeLike">
								<span>资讯类型：</span> <input type="text" name="newsType" value="" placeholder="请输入类型名称"
									class="text-word"> <input name="" type="submit"
									value="查询" class="text-but">
							</form>
						</td>
						<td width="10%" align="center" valign="middle"
							style="text-align:right; width:150px;"><a
							href="<%=path%>/admin/main_add_news_type.jsp" target="mainFrame"
							onFocus="this.blur()" class="add">新增资讯类型</a></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td align="left" valign="top">

				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					id="main-tab">
					<tr>
						<th style="text-align: center" valign="middle" class="borderright">编号</th>
						<th style="text-align: center" valign="middle" class="borderright">资讯类型名称</th>
						<th style="text-align: center" valign="middle" class="borderright">操作</th>
					</tr>
					<tbody id="typeList">
						<c:forEach items="${newsTypeDtos}" var="item">

							<tr onMouseOut="this.style.backgroundColor='#ffffff'"
								onMouseOver="this.style.backgroundColor='#edf5ff'">
								<td align="center" valign="middle"
									class="borderright borderbottom">${item.id }</td>
								<td align="center" valign="middle"
									class="borderright borderbottom">${item.type }</td>

								<td align="center" valign="middle" class="borderbottom"><a
									data-toggle="modal"
									onclick="editNewsTypeBefore('${item.id }','${item.type }')"
									href="" target="mainFrame" onFocus="this.blur()" class="add">编辑</a><span
									class="gray">&nbsp;|&nbsp;</span><a href="" onclick="delNewsTypeBefore('${item.id }','${item.type }')"
									data-toggle="modal" target="mainFrame" onFocus="this.blur()" class="add">删除</a></td>
							</tr>
						</c:forEach>
					</tbody>
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
	<!-- Modal 修改资讯类型的模态框-->
	<div class="modal fade" id="update" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header bg-primary">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel" style="color:white; font-weight: bold;">资讯类型修改</h4>
				</div>
				<div class="modal-body">
					<div class="modal-body">
						<div class="input-group">
							<span class="input-group-addon" id="sizing-addon2" style="font-weight: bold;">资讯类型：</span>
								<input type="text" class="form-control" placeholder="请输入类型名称"
								aria-describedby="sizing-addon2" type="text" name="MType" id="MType">
						</div>
						<input type="hidden" name="cid" id="cid" value="" />
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" onclick="updateNow()">确认修改</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				</div>
			</div>
		</div>
	</div>
	<!-- Modal 信息提示的模态框-->
	<div class="modal fade" id="mess" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header bg-primary">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel" style="color:white; font-weight: bold;">信息提示</h4>
				</div>
				<div class="modal-body">
					<div class="modal-body">
						<div>
							<span id="message" style="text-align: center; font-weight: bold;"></span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<!-- Modal 删除提示的模态框-->
	<div class="modal fade" id="delMess" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header bg-primary">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel" style="color:white; font-weight: bold;">删除信息提示</h4>
				</div>
				<div class="modal-body">
					<div class="modal-body">
						<div class="input-group">
							<span>是否删除<span id="del" style="color: red"></span>类型？</span>
						</div>
						<input type="hidden" name="id" id="id" value="" />
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" onclick="delAction()">确认删除</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	//点击修改后执行（向模态框中传值 ）
	 function editNewsTypeBefore(id,type){
    //向模态框中传值  
    $('#MType').val(type);  
    $('#cid').val(id);
    $('#update').modal('show');
	}
	//弹出修改信息框
	function updateNow(){
		//获取模态框数据  
	    var type = $('#MType').val();  
	    var cid =$('#cid').val();
	    console.log(type);
	    //向后台发送请求
	    $.getJSON("<%=path%>/editNewsType",{type:type,cid:cid},function(data){
	    	$('#update').modal('hide');
	    	$('#mess').modal('show');//显示信息提示框（提示是否修改成功）
	    	console.log(data.code);
	    	console.log(data.message);
	    	$('#message').text(data.message);//将提示信息传入提示框
	    	setTimeout(function(){
	    		$('#mess').modal('hide');//隐藏模态框
	    		//回到原来界面
	    		window.location.href="<%=path%>/noticeInfo";
	    	},800);
	    });
	}
	//点击删除执行
	function delNewsTypeBefore(id,type){
	//向模态框传值
		$('#del').text(type);
		$('#id').val(id);
		$('#delMess').modal('show');//显示模态框
	}
	//执行删除
	function delAction(){
		var id =$('#id').val();//向后台发送请求
		$('#delMess').modal('hide');//隐藏模态框
		$.getJSON("<%=path%>/delNewsType",{id:id},function(data){
			$('#message').text(data.message);
			$('#mess').modal('show');
			setTimeout(function(){
	    		$('#mess').modal('hide');
	    		//回到原来界面
	    		window.location.href="<%=path%>/noticeInfo";
	    	},800);
		});
	}
  </script>
</html>