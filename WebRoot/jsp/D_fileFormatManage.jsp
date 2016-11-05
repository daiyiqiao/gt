<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>文件格式后台管理</title>
    
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
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/D_fileFormatManage.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/D_fileFormatManage.css">

</head>
  
  <body>
    <!-- 文件格式一览 -->
    <div class="fileInfoWin" >
    		<table id="fileInfoTb" style="width:700px;">
				
    		</table>
    </div>
    <!-- 添加窗口 -->
	<div id="addFileWindow" style="overflow:hidden;display:none;margin:0 auto;">
	
			<form id="addFileForm" method="post">
			<table id="addFileTb" class="table" border="0" align="center" cellspacing="1">
				<tr>
					<td width="20%" align="right">文件格式名称</td>
					<td width="30%" align="left">
						<input id="sysnm" type="text" name="fnm" class="easyui-validatebox" required="true" /> 
						<span class="required" style="color:red">*</span>
					</td>
				<tr>
					<td height="35" colspan="4" align="center" nowrap="nowrap" class="style1">
						<input class="button" type="button" name="confirm" value="确定" onclick="addfile()">
						&nbsp;&nbsp;
						<input class="button" type="button" name="cancle" value="取消" onClick="javascript:location.href='#'"/></td>
						<p><br></p>
					</td>					
				</tr>
			</table>
		</form>
	</div>
	
	 <!-- 编辑窗口 -->
	<div id="editFileWindow" style="overflow:hidden;display:none;margin:0 auto;">
		<form id="editFileForm" method="post" >
			<input type="hidden" id="ssyscd" name="syscd">
			<table id="editFileTb" class="table" border="0" align="center" cellspacing="1">
				<tr>
					<td width="20%" align="right">文件格式名称</td>
					<td width="30%" align="left">
						<input id="esysnm" type="text" name="sysnm" class="easyui-validatebox" required="true" /> 
						<span class="required" style="color:red">*</span>
					</td>
				<tr>
					<td height="35" colspan="4" align="center" nowrap="nowrap" class="style1">
						<input class="button" type="button" name="confirm" value="确定" onclick="fileEdit()" >
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
