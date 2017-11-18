<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>我的课程</title>
    <link href="/css/css.css" type="text/css" rel="stylesheet"/>
    <link href="/css/main.css" type="text/css" rel="stylesheet"/>
    <link rel="shortcut icon" href="/images/main/favicon.ico"/>
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
            background: url(/images/main/list_input.jpg) no-repeat left top;
            border: none;
            cursor: pointer;
            font-family: "Microsoft YaHei", "Tahoma", "Arial", '宋体';
            color: #666;
            float: left;
            margin: 8px 0 0 6px;
            display: inline;
        }

        #search a.add {
            background: url(/images/main/add.jpg) no-repeat -3px 7px #548fc9;
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
            background: url(/images/main/list_bg.jpg) repeat-x;
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
<!--main_top-->
<table width="99%" border="0" cellspacing="0" cellpadding="0" id="searchmain">
    <tr>
        <td width="99%" align="left" valign="top">您的位置：我的课程管理</td>
    </tr>
    <tr>
        <td align="left" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0" id="search">
                <tr>
                    <td width="90%" align="left" valign="middle">
                        <form method="post" action="">
                            <span>课程：</span>
                            <input type="text" name="" value="" class="text-word">
                            <input name="" type="button" value="查询" class="text-but">
                        </form>
                    </td>
                    <td width="10%" align="center" valign="middle" style="text-align:right; width:150px;"><a
                            href="add.html" target="mainFrame" onFocus="this.blur()" class="add">添加课程</a></td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td align="left" valign="top">

            <table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab">
                <tr>
                    <th align="center" valign="middle" class="borderright">编号</th>
                    <th align="center" valign="middle" class="borderright">课程名称</th>
                    <th align="center" valign="middle" class="borderright">学分</th>
                    <th align="center" valign="middle" class="borderright">分类</th>
                    <th align="center" valign="middle" class="borderright">学习人数</th>
                    <th align="center" valign="middle" class="borderright">收藏人数</th>
                    <th align="center" valign="middle">操作</th>
                </tr>
                <tbody id="courseHeader">

                </tbody>
            </table>
        </td>
    </tr>
    <tr>
        <td align="left" valign="top" class="fenye">总共<span id="totalCount"></span>条数据 <span
                id="currentPage"></span>/<span id="totalPage"></span> 页&nbsp;&nbsp;
            <a href="javascript:firstPage()" target="mainFrame" onFocus="this.blur()">首页</a>&nbsp;&nbsp;
            <a href="javascript:prePage()" target="mainFrame" onFocus="this.blur()">上一页</a>&nbsp;&nbsp;
            <a href="javascript:nextPage()" target="mainFrame" onFocus="this.blur()">下一页</a>&nbsp;&nbsp;
            <a href="javascript:lastPage()" target="mainFrame" onFocus="this.blur()">尾页</a></td>
    </tr>
</table>
<script src="../bower_components/jquery/dist/jquery.min.js"></script>
<script>
    $(function () {
        //首次加载
        firstPage();
    })
    var currentPage = 1;
    var pageSize = 8;
    var totalPage;
    var totalCount;

    function findByPage(pageNum, pageSize) {
        $.getJSON("/course/findByPage", {pageNum: pageNum, pageSize: pageSize}, function (data) {
            var courses = $("#courseHeader");
            if (data !== null) {
                courses.empty();
                for (var i = 0; i < data.length; i++) {
                    var course = " <tr onMouseOut=\"this.style.backgroundColor='#ffffff'\" onMouseOver=\"this.style.backgroundColor='#edf5ff'\"> <td align=\"center\" valign=\"middle\" class=\"borderright borderbottom\">" + data[i].id + "</td>"
                        + "<td align=\"center\" valign=\"middle\" class=\"borderright borderbottom\">" + data[i].subject + "</td>"
                        + "<td align=\"center\" valign=\"middle\" class=\"borderright borderbottom\">" + data[i].credit + "</td>"
                        + "<td align=\"center\" valign=\"middle\" class=\"borderright borderbottom\">" + data[i].type + "</td>"
                        + "<td align=\"center\" valign=\"middle\" class=\"borderright borderbottom\">" + data[i].favorite + "</td>"
                        + "<td align=\"center\" valign=\"middle\" class=\"borderright borderbottom\">" + data[i].studentCount + "</td>"
                        + "<td align=\"center\" valign=\"middle\" class=\"borderright borderbottom\"><a>编辑</a>|<a>删除</a></td>"
                        + "</tr>";
                    courses.append(course);
                }
                //获取总页数和总条数
                totalPage = data[0].pageInfo.totalPage;
                totalCount = data[0].pageInfo.totalCount;
                $("#totalPage").text(totalPage);
                $("#totalCount").text(totalCount);
                $("#currentPage").text(currentPage);
            } else {
                alert("获取数据失败！");
            }
        });
    };

    function firstPage() {
        findByPage(1, pageSize);
        currentPage = 1;
    }

    function nextPage() {
        if (++currentPage > totalPage)
            alert("已经是最后一页了！");
        else
            findByPage(currentPage, pageSize);
    }

    function prePage() {
        if (--currentPage < 1)
            alert("已经是第一页了！")
        else
            findByPage(currentPage, pageSize);
    }

    function lastPage() {
        findByPage(totalPage, pageSize);
        currentPage = totalPage;
    }

</script>
</body>
</html>
