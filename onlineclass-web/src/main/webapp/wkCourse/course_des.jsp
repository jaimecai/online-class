<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>企业在线学习平台</title>

<link rel="stylesheet"
	href="<%=basePath%>bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=basePath%>public_css/index.css">
<script src="<%=basePath%>bower_components/jquery/dist/jquery.min.js"></script>
<script src="<%=basePath%>bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="<%=basePath%>public_css/headerAndFooter.css">
<link rel="stylesheet" href="<%=basePath%>public_css/public.css">

</head>
<body style="background: #ebebeb">
	<header class="header">

		<div class="nav navbar-default navbar-static-top">
			<div class="container navContainer">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle " data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="../index.html"><img
						class="logoImg" src="../assets/img/logo.png"></a>
				</div>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-left">
						<li class=" headerNav"><a href="../index.html">首页</a></li>
						<li class=" headerNav active"><a
							href="../wkCourse/course.html">课程</a></li>
						<li class=" headerNav"><a href="../wkPlan/plan.html">计划</a></li>
						<li class=" headerNav"><a href="../wkTrain/train.html">培训</a></li>
						<li class="headerNav"><a href="../wkKnowledge/knowledge.html">知识</a></li>
						<li class=" headerNav"><a href="../wkLecturer/lectuer.html">讲师</a></li>
						<li class=" headerNav"><a
							href="../wkInformation/information.html">资讯</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">我的课堂</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false"> <span class="headerDropdownImg"><img
									src="../assets/img/avatar.jpg"
									class="img-circle headerDropdownImg"></span> 普通学员 <span
								class="caret"></span>
						</a>
							<ul class="dropdown-menu">
								<li><a href="#">个人中心</a></li>
								<li><a href="#">账号设置</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">退出</a></li>
							</ul></li>
						<li><a href="#"> <span
								class="glyphicon glyphicon-bullhorn hidden-lt-ie8"></span> <span
								class="badge badge-important">19</span>
						</a></li>
						<li><a href="#"><span
								class="glyphicon glyphicon-envelope hidden-lt-ie8"></span></a></li>
					</ul>
				</div>
			</div>
		</div>

	</header>

	<div class="container">
		<ol class="breadcrumb">
			<li><a href="javasript:viod(0)">所有课程</a></li>
			<li class="active">学习平台演示课程</li>
		</ol>
	</div>
	<div class="container" style="background: white">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row">
					<div class="col-md-8">
						<div class="media">
							<div class="media-left">
								<a href=""> <img src="../assets/img/course-demo-picture.jpg"
									class="media-object" alt="">
								</a>
							</div>
							<div class="media-body">
								<div class="media-heading">
									<h3>学习平台演示课程</h3>
								</div>
								<div class="course-attr">
									<table class="table">
										<tbody>
											<tr>
												<td>学习状态:</td>
												<td><span class="label label-warning">未通过</span></td>
												<td>获得学分</td>
												<td><span class="label label-success">0.00</span></td>
											</tr>
											<tr>
												<td>有效期:</td>
												<td>还剩<strong>1239</strong>天
												</td>
												<td>课程时长</td>
												<td><span>10</span>分钟</td>
											</tr>
											<tr>
												<td>学习时间:</td>
												<td>6:25:38</td>
												<td>当前进度:</td>
												<td><span>18</span>%</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>

						</div>

					</div>
					<div class="col-md-4 ">
						<div>
							<a href="javasript:void(0)" class="btn btn-success btn-lg"><i
								class="glyphicon glyphicon-play-circle"></i>开始学习</a>
						</div>

						<div class="btn-group">
							<a href="javasript:void(0)" class="btn btn-default btn-sm"> <i
								class="glyphicon glyphicon-flag"></i>
							</a> <a href="javasript:void(0)" class="btn btn-default btn-sm">
								<i class="glyphicon glyphicon-th-list"></i>
							</a> <a href="javasript:void(0)" class="btn btn-default btn-sm">
								<i class="glyphicon glyphicon-remove"></i>
							</a>
						</div>
					</div>
				</div>
			</div>

		</div>
		<div class="progress">
			<div class="progress-bar " aria-valuenow="60" aria-valuemin="0"
				aria-valuemax="100" style="width: 60%;"></div>
		</div>
		<div class="clearfix"></div>
		<div class="col-md-9">
			<ul class="nav nav-tabs">
				<li class="active"><a href="#courseOne"
					aria-controls="courseOne" data-toggle="tab" id="carousel">课程大纲&nbsp;<span
						class="badge pull-right">2</span></a></li>
				<li><a href="#testOne" aria-controls="testOne"
					data-toggle="tab" id="test1">测试&nbsp;<span
						class="badge pull-right">42</span></a></li>
				<li><a href="#testTwo" aria-controls="testTwe"
					data-toggle="tab" id="test2">考试&nbsp;<span
						class="badge pull-right">4</span></a></li>
				<li><a href="#answer" aria-controls="answer" data-toggle="tab"
					id="answer1">答疑&nbsp;<span class="badge pull-right">4</span></a></li>
				<li><a href="#">笔记&nbsp;<span class="badge pull-right">4</span></a></li>
				<li><a href="#">评价&nbsp;<span class="badge pull-right">2</span></a></li>
				<li><a href="#">资料&nbsp;<span class="badge pull-right">2</span></a></li>
				<li><a href="#">公告&nbsp;<span class="badge pull-right">42</span></a></li>

			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="courseOne">
					<div class="panel-group" id="courseOneDes">
						<div class="panel panel-default">
							<div class="panel-heading" id="headingOne">
								<h4 class="panel-title">
									<a href="#collapseOne" data-toggle="collapse"
										data-parent="#courseOneDes" aria-expanded="true"
										aria-controls="collapseOne"> 第1章 通用演示课程 </a>
								</h4>
							</div>

							<div id="collapseOne" class="panel-collapse collapse">
								<div class="panel-body">Anim pariatur cliche
									reprehenderit, enim eiusmod high life accusamus terry
									richardson ad squid. 3 wolf moon officia aute, non cupidatat
									skateboard dolor brunch. Food truck quinoa nesciunt laborum
									eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on
									it squid single-origin coffee nulla assumenda shoreditch et.
									Nihil anim keffiyeh helvetica, craft beer labore wes anderson
									cred nesciunt sapiente ea proident. Ad vegan excepteur butcher
									vice lomo. Leggings occaecat craft beer farm-to-table, raw
									denim aesthetic synth nesciunt you probably haven't heard of
									them accusamus labore sustainable VHS.</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" id="headingTwo">
								<h4 class="panel-title">
									<a href="#collapseTwo" data-toggle="collapse"
										data-parent="#courseOneDes" aria-expanded="true"
										aria-controls="collapseTwo"> 第2 章 星河湾集团演示课程 </a>
								</h4>
							</div>

							<div id="collapseTwo" class="panel-collapse collapse">
								<div class="panel-body">Anim pariatur cliche
									reprehenderit, enim eiusmod high life accusamus terry
									richardson ad squid. 3 wolf moon officia aute, non cupidatat
									skateboard dolor brunch. Food truck quinoa nesciunt laborum
									eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on
									it squid single-origin coffee nulla assumenda shoreditch et.
									Nihil anim keffiyeh helvetica, craft beer labore wes anderson
									cred nesciunt sapiente ea proident. Ad vegan excepteur butcher
									vice lomo. Leggings occaecat craft beer farm-to-table, raw
									denim aesthetic synth nesciunt you probably haven't heard of
									them accusamus labore sustainable VHS.</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" id="headingThree">
								<h4 class="panel-title">
									<a href="#collapseThree" data-toggle="collapse"
										data-parent="#courseOneDes" aria-expanded="true"
										aria-controls="collapseThree"> 第3 章 壳牌石油演示课程 </a>
								</h4>
							</div>

							<div id="collapseThree" class="panel-collapse collapse">
								<div class="panel-body">Anim pariatur cliche
									reprehenderit, enim eiusmod high life accusamus terry
									richardson ad squid. 3 wolf moon officia aute, non cupidatat
									skateboard dolor brunch. Food truck quinoa nesciunt laborum
									eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on
									it squid single-origin coffee nulla assumenda shoreditch et.
									Nihil anim keffiyeh helvetica, craft beer labore wes anderson
									cred nesciunt sapiente ea proident. Ad vegan excepteur butcher
									vice lomo. Leggings occaecat craft beer farm-to-table, raw
									denim aesthetic synth nesciunt you probably haven't heard of
									them accusamus labore sustainable VHS.</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" id="headingFour">
								<h4 class="panel-title">
									<a href="#collapseFour" data-toggle="collapse"
										data-parent="#courseOneDes" aria-expanded="true"
										aria-controls="collapseFour"> 第4 章 北京任东演示课程 </a>
								</h4>
							</div>

							<div id="collapseFour" class="panel-collapse collapse">
								<div class="panel-body">Anim pariatur cliche
									reprehenderit, enim eiusmod high life accusamus terry
									richardson ad squid. 3 wolf moon officia aute, non cupidatat
									skateboard dolor brunch. Food truck quinoa nesciunt laborum
									eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on
									it squid single-origin coffee nulla assumenda shoreditch et.
									Nihil anim keffiyeh helvetica, craft beer labore wes anderson
									cred nesciunt sapiente ea proident. Ad vegan excepteur butcher
									vice lomo. Leggings occaecat craft beer farm-to-table, raw
									denim aesthetic synth nesciunt you probably haven't heard of
									them accusamus labore sustainable VHS.</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" id="headingFive">
								<h4 class="panel-title">
									<a href="#collapseFive" data-toggle="collapse"
										data-parent="#courseOneDes" aria-expanded="true"
										aria-controls="collapseFive"> 第5 章 深圳锦鸿演示课程 </a>
								</h4>
							</div>

							<div id="collapseFive" class="panel-collapse collapse">
								<div class="panel-body">Anim pariatur cliche
									reprehenderit, enim eiusmod high life accusamus terry
									richardson ad squid. 3 wolf moon officia aute, non cupidatat
									skateboard dolor brunch. Food truck quinoa nesciunt laborum
									eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on
									it squid single-origin coffee nulla assumenda shoreditch et.
									Nihil anim keffiyeh helvetica, craft beer labore wes anderson
									cred nesciunt sapiente ea proident. Ad vegan excepteur butcher
									vice lomo. Leggings occaecat craft beer farm-to-table, raw
									denim aesthetic synth nesciunt you probably haven't heard of
									them accusamus labore sustainable VHS.</div>
							</div>
						</div>
					</div>
				</div>
				<div class="tab-pane" id="testOne">
					<table class="table table-hover">
						<thead>
							<th>测验名称</th>
							<th>答卷时间（分钟）</th>
							<th>允许次数</th>
							<th>通过分数</th>
							<th>操作</th>
						</thead>
						<tbody>
							<trc>
							<td>Demo演示课程-20</td>
							<td>60</td>
							<td>不限制</td>
							<td>60</td>
							<td><a class="btn btn-primary btn-mini" href="#">进入</a> <a
								class="btn btn-default btn-mini" href="#">详情</a></td>
							</trc>

						</tbody>


					</table>
				</div>
				<div class="tab-pane" id="testTwo">
					<div class="text-center">
						<h4>学习系统演示课程 - 考试演示2</h4>
					</div>
					<table class="table table-hover">
						<tbody>
							<tr>
								<td>可参与时间</td>
								<td>2016-04-20 18:57 至 2017-04-01 21:57</td>
							</tr>
							<tr>
								<td>通过分数</td>
								<td>35</td>

							</tr>
							<tr>
								<td>允许次数</td>
								<td>1</td>

							</tr>

						</tbody>


					</table>

				</div>
				<div class="tab-pane" id="answer">
					<div class="answer-btn">
						<div class="pull-left">
							<button class="btn btn-primary btn-sm">
								<i class="glyphicon glyphicon-pencil"></i> 我要提问
							</button>
							<button class="btn btn-default btn-sm">
								<i class="glyphicon glyphicon-align-justify"></i> 全部问题
							</button>
							<button class="btn btn-success btn-sm">
								<i class="glyphicon glyphicon-flag"></i> 常见问题
							</button>
						</div>
					</div>
				</div>


			</div>

		</div>
		<div class="col-md-3">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">课程教师</h3>
				</div>
				<div class="panel-body">
					<div class="teacher">
						<a href="javascript:void(0)" class="teacher-img"> <img
							src="../assets/img/10003.jpg" alt="" class="img-circle">
						</a>
						<div class="teacher-name">
							<div class="nickname">
								<a href="">李勇</a>
							</div>
							<div class="title">高级培训师</div>
						</div>
					</div>
					<div class="teacher-detail">
						<p>Gopher
							China社区专注于Go技术领域，作为互联网技术知识的实践者和引领者，坚持一线的Go技术分享。Go技术，目前已经在Google，阿里，腾讯，360，Apple等各大公司使用，目前最流行的云计算基石Docker也是基于Go开发的。
						</p>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<table class="table">
					<tbody>
						<tr>
							<td><a href="javasript:void(0)"> <i
									class="glyphicon glyphicon-folder-open"></i> 课后评估 <span
									class="badge pull-right">42</span>
							</a></td>
						</tr>
						<tr>
							<td><a href="javasript:void(0)"> <i
									class="glyphicon glyphicon-file"></i> 课程作业 <span
									class="badge pull-right">42</span>
							</a></td>
						</tr>
						<tr>
							<td><a href="javasript:void(0)"> <i
									class="glyphicon glyphicon-user"></i> 课程讨论 <span
									class="badge pull-right">42</span>
							</a></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">相关课程</h3>
				</div>
				<div class="panel panel-body">
					<ul class="media-list">
						<li class="media">
							<div class="media-left">
								<a href="#"> <img src="../assets/img/10003.jpg" alt=""
									class="media-object" style="width: 50px;height: 50px">
								</a>
							</div>
							<div class="media-body">
								<label> 讲师：</label>
							</div>
						</li>
						<li class="media">
							<div class="media-left">
								<a href="#"> <img src="../assets/img/10003.jpg" alt=""
									class="media-object" style="width: 50px;height: 50px">
								</a>
							</div>
							<div class="media-body">
								<label> 讲师：</label>
							</div>
						</li>

					</ul>
				</div>
			</div>


		</div>
	</div>

	<div class="footer">
		<div class="container">
			<div class="footer-links">
				<ul class="site-footer-links">
					<li><a href="#">关于我们</a></li>
					<li><a href="#">联系我们</a></li>
					<li><a href="#">帮助</a></li>
					<li><a href="#"> 下载客户端 </a></li>
				</ul>
			</div>
			<!--清除浮动-->
			<div class="clearfix"></div>
			<div class="footer-copyright">
				Powered by <a href="http://www.jingjichang.com.cn" target="_blank">在线学习平台</a>
				©2013-2017 &nbsp;
			</div>
		</div>
	</div>

</body>
</html>
