<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plug/themes/metro-blue/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plug/themes/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/plug/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/plug/jquery.easyui.min.js"></script>
	<script src="http://cdn.bootcss.com/json2/20160511/json2.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/umInfo.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/D_umInfo.css">	
	
  </head>
  
  <body>
  
  
    <a href="./jsp/D_umInfo.jsp" target="_blank">用户管理</a></br>
    <a href="http://localhost:8080/gt/jsp/D_fileFormatInfo.jsp" target="_blank">文件格式管理</a></br>
    <a href="http://localhost:8080/gt/jsp/D_metaData.jsp" target="_blank"> 元数据项配置</a></br>
    <a href="http://localhost:8080/gt/jsp/D_resTypeInfo.jsp" target="_blank">资源类型管理</a></br>
    <a href="http://localhost:8080/gt/jsp/D_resLinkSys.jsp" target="_blank">数据来源系统管理</a>
    </br></br>
    <span><font size="6" color="red"><h2>后台管理</h2></font></span></br>
    <a href="http://localhost:8080/gt/jsp/D_fileFormatManage.jsp" target="_blank">文件格式管理</a></br>
    <a href="http://localhost:8080/gt/jsp/D_metaDataManage.jsp" target="_blank"> 元数据项配置</a></br>
    <a href="http://localhost:8080/gt/jsp/D_resTypeManage.jsp" target="_blank">资源类型管理</a></br>

  </body>
</html>
