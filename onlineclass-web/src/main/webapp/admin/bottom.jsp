<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>底部bottom</title>
<link href="../css/css.css" type="text/css" rel="stylesheet" />
<style>
#footer{font-size:12px;}
.footer_pad{padding:7px 9px 5px 9px;}
</style>
</head>
<body style="overflow-x:hidden; background:url(../images/main/bottombg.jpg) repeat-x top left;" onselectstart="return false" oncontextmenu=return(false) >
<table width="100%" border="0" cellspacing="0" cellpadding="0" id="footer">
  <tr>
    <td align="left" valign="middle" class="footer_pad">COPYRIGHT©2012    All rights
        reserved.<a href="http://www.mycodes.net/" target="_blank">源码之家</a> </td>
    <td align="right" valign="middle" class="footer_pad"><img src="../images/main/why.gif" width="12" height="12" alt="疑问图标" align="absmiddle">&nbsp;&nbsp;如有疑问请您联系TEL：010-88888888-6666</td>
  </tr>
</table>
</body>
</html>