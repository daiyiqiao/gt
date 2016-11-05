<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>元数据项信息配置</title>
    
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
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/fileFormatInfo.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">	

	<script type="text/javascript">
	$(function(){
		$("#metaDataInfoTb").datagrid({
		 columns:[[
		            {field:'metaitemno',title:'序号',align:'center',width:'200px'},
		            {field:'itemnm',title:'属性项名',align:'center',width:'200px'},
		            {field:'useflg',title:'使用',align:'center',width:'200px'},
		      		{field:'mustflg',title:'必填',align:'center',width:'200px'}
		          ]],
	  		 title:'元数据项信息配置',
	  		 url:"./meta/metaDataInfo.do",
	  		 striped:true,
			 pagination:true,//开启/关闭分页功能，true-开启；false-关闭，默认是false
			 pageList:[10,50,100],//配置每页查询条数的选项
			 loadMsg:"正在努力加载数据，请稍后..."
	});
	
});
	
	</script>
  </head>
  
  <body>
    <!-- 元数据项信息配置  -->
    <div >
    	<table id="metaDataInfoTb" style="width:800px;">
    	</table>
    </div>
  </body>
</html>
