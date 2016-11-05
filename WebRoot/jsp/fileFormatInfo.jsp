<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>文件格式一览</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- easyui资源文件 -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plug/themes/metro-blue/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plug/themes/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/plug/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/plug/jquery.easyui.min.js"></script>
	<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/fileFormatInfo.js"></script> --%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">

<script type="text/javascript">
	$(function() {
		$("#fileInfoTb").datagrid({
			columns : [ [
				{
					field : 'fcd',
					title : '编号',
					width : 200,
					align : 'center'
				},
				{
					field : 'fnm',
					title : '格式名称',
					width : 200,
					align : 'center'
				}
			] ],
			title : '文件格式信息一览',
			url : "./file/fileInfo.do",
			pagination : true, //开启/关闭分页功能，true-开启；false-关闭，默认是false
			striped : true,
			rownumbers:"true",
			pageList : [ 10, 50, 100 ], //配置每页查询条数的选项
			loadMsg : "正在努力加载数据，请稍后..."
		});
	});
</script>
</head>
  
  <body>
    <!-- 文件格式一览 -->
    <div class="fileInfoWin" >
    		<table id="fileInfoTb" style="width:550px;">
				
    		</table>
    	</div>
    
  </body>
</html>
