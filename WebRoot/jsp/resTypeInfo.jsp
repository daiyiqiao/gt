<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>资源类型信息一览</title>
    
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
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">	

	<script type="text/javascript">
	$(function(){
		$("#resTypeInfoTb").datagrid({
		 columns:[[
		            {field:'tcd',title:'编号',align:'center',width:'200px'},
		            {field:'tnm',title:'资源类型名称',align:'center',width:'200px'},
		            {field:'plancd',title:'查重规则',align:'center',width:'200px',
		            	formatter:function(value,rowData,rowIndex){
                        return "<a href='javascript:void(0);' onclick='checkPlan();'>默认查重规则</a>";  
		      				}
                        },
		          ]],
	  		 title:'资源类型信息一览',
	  		 url:"./resType/resTypeInfo.do",
	  		 striped:true,
			 pagination:true,//开启/关闭分页功能，true-开启；false-关闭，默认是false
			 pageList:[10,50,100],//配置每页查询条数的选项
			 singleSelect:false,
			 loadMsg:"正在努力加载数据，请稍后..."
	});
	
});
	
	</script>
  </head>
  
  <body>
    <!-- 元数据项信息配置  -->
    <div >
    	<table id="resTypeInfoTb" style="width:600px;">
    	</table>
    </div>
  </body>
</html>
