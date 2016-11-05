<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>数据来源系统信息一览</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<!-- easyui资源文件 -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plug/themes/metro-blue/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plug/themes/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/plug/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/plug/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/resLinkSys.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/D_umInfo.css">	
	<style type="text/css">
		.table-add td span.required {
			color: red;
		}
		
		.table-add tr td{
		text-align: right;
		}
	</style>

  </head>
  
  <body>
  
  <!-- 数据来源系统信息一览-->
	<div class="easyui-layout" fit="true">
		<table id="resLinkInfoTb" style="width:800px;height:400px;margin:0px,auto">
		 <div border="false" class="p-search" style="padding:3px">
			<span>系统编号: </span><input type="text" id="syscd" name="syscd"></input>
			<span>系统名称: </span><input type="text" id="sysnm" name="esysnm"></input>
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search" onclick="doSearch()">查询</a>
		 </div>
		</table>
	 </div>
	
   
   <!-- 添加窗口 -->
	<div id="addSysNmWindow" style="overflow:hidden;display:none;margin:0 auto;">
			<form id="addSysForm" method="post">
			<table id="sysInfoTb" class="table-edit" border="0" align="center" cellspacing="1"">
				<tr>
						<caption>数据来源系统信息添加</caption>
				</tr>
				<tr>
					<td width="20%" align="right">系统名称</td>
					<td width="30%" align="left">
						<input id="sysnm" type="text" name="sysnm" class="easyui-validatebox" required="true" /> 
						<span class="required" style="color:red">*</span>
					</td>
				<tr>
					<td height="35" colspan="4" align="center" nowrap="nowrap" class="style1">
						<input class="button" type="button" name="confirm" value="确定" onclick="addSys()">
						&nbsp;&nbsp;
						<input class="button" type="button" name="cancle" value="取消" onClick="javascript:location.href='#'"/></td>
						<p><br></p>
					</td>					
				</tr>
			</table>
		</form>
	</div>
	
	
	 <!-- 编辑窗口 -->
	 
	<div id="eidtSysNmWindow" style="overflow:hidden;display:none;margin:0 auto;">
		<form id="eidtSysNmForm" method="post" >
			<input type="hidden" id="ssyscd" name="syscd">
			<table id="editSysInfoTb" class="table-edit" border="0" align="center" cellspacing="1"">
				<tr>
						<caption>数据来源系统信息修改</caption>
				</tr>
				<tr>
					<td width="20%" align="right">系统名称</td>
					<td width="30%" align="left">
						<input id="esysnm" type="text" name="sysnm" class="easyui-validatebox" required="true" /> 
						<span class="required" style="color:red">*</span>
					</td>
				<tr>
					<td height="35" colspan="4" align="center" nowrap="nowrap" class="style1">
						<input class="button" type="button" name="confirm" value="确定" onclick="editSys()" >
						&nbsp;&nbsp;
						<input class="button" type="button" name="cancle" value="取消" onClick="javascript:location.href='./jsp/resLinkSys.jsp'"/></td>
						<p><br></p>
					</td>					
				</tr>
			</table>
		</form>
	</div>
	 
  </body>
  
</html>






