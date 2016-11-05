<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户管理</title>
    
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
	<script src="http://cdn.bootcss.com/json2/20160511/json2.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/umInfo.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/D_umInfo.css">	
	<style type="text/css">
		.table-add td span.required {
			color: red;
		}
		
		.table-add tr td{
		text-align: right;
		}
		
		#userCheckInfoTb input{
			border:none;
			background-color: #fafafa;
		}
	</style>
	
	

  </head>
  
  <body>
  

		
  
  
  <!-- 条件查询-->
  
  	<div border="false" class="p-search" style="padding:3px">
  		<form id="checkCusForm" method="post">
			<span>用户名: </span><input type="text" id="loginid" name="username"></input>
			<span>姓名: </span><input type="text" id="usrnm" name="name"></input>
			<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search" onclick="doSearch()">查询</a>
		</form>
	 </div>
  
  <!-- 用户信息一览 -->
	<div class="easyui-layout" fit="true">
		
		<table id="userInfoTb" style="width:600px;height:600px;margin:0px,auto">
		 
		</table>
	 </div>
   
   <!-- 用户添加窗口 -->
	<div id="addUserWindow" style="overflow:hidden;display:none;margin:0 auto;">
			<form id="addCusForm" method="post">
			<input type="hidden" name="usrid">
			<table class="table-edit" border="0" align="center" cellspacing="1">
				<tr>
					<td width="20%" align="right">用户名</td>
					<td width="30%" align="left">
						<input type="text" name="loginid" class="easyui-validatebox" required="true" /> 
						<span class="required" style="color:red">*</span>
					</td>
					<td width="20%" align="right">角色</td>
					<td width="30%" align="left">
						<input id="role" name="role.roleid"/>
						<span class="required" style="color:red">*</span>
					</td>
				</tr>
				<tr>
					<td align="right">密码</td>
					<td align="left">
						<input type="password" name="loginpwd" class="easyui-validatebox" required="true" />
							<span class="required" style="color:red">*</span>
					</td>
					<td align="right">确认密码</td>
					<td align="left">
						<input type="password" name="reloginpwd" class="easyui-validatebox" required="true" />
						<span class="required" style="color:red">*</span>
					</td>
				</tr>
				<tr>
					<td align="right">姓名</td>
					<td align="left">
						<input type="text" name="usrnm" class="easyui-validatebox" required="true" />
							<span class="required" style="color:red">*</span>
					</td>
					<td align="right">手机</td>
					<td align="left">
						<input type="text" name="mobile"
							class="easyui-validatebox" required="true" data-options="validType:'checkTelephoneNum'"/> 
							<script type="text/javascript">
								$(function() {
									//自己扩展手机号校验的规则
									$.extend($.fn.validatebox.defaults.rules, {
										checkTelephoneNum : {
											validator : function(value) {
												//定义手机号校验的正则表达式
												var reg = /^1[3,4,5,7,8,9][0-9]{9}$/;
												return reg.test(value);
											},
											message : '手机号不符合规范！'
										}
									});
								});
							</script>
							<span class="required" style="color:red">*</span>
					</td>					
				</tr>
				<tr>
					<td align="right">电子邮箱</td>
					<td align="left">
						<input type="text" name="usremail" class="easyui-validatebox" required="true" />
							<span class="required" style="color:red">*</span>
					</td>					
					<td align="right">职务</td>
					<td align="left">
						<input type="text" name="jobpstn" class="easyui-validatebox" required="true" />
					</td>
				</tr>
				<tr>
					<td align="right">办公电话</td>
					<td align="left">
						<input type="text" name="telno" class="easyui-validatebox" required="true" />
							<span class="required" style="color:red">*</span>
					</td>
					<td align="right">所属机构</td>
					<td align="left" colspan="3">
					<span>xqsmtest</span>
					</td>
					</td>
				</tr>
				<tr>
					<td height="35" colspan="4" align="center" nowrap="nowrap" class="style1">
						<input class="button" type="button" onclick="useradd()" name="confirm" value="确定">
						&nbsp;&nbsp;
						<input class="button" type="button" name="cancle" value="取消" onClick="javascript:location.href='./jsp/umInfo.jsp'"/></td>
						<p><br></p>
					</td>					
				</tr>
			</table>
		</form>
	
	
	 <!-- 用户编辑窗口 -->
	 
	<div id="editUserWindow" style="overflow:hidden;display:none;margin:0 auto;">
		<form id="editCusForm" method="post">
			<input id="eusrid" type="hidden" name="usrid">
			<table class="table-edit" border="0" align="center" cellspacing="1">
				<tr>
					<td width="20%" align="right">用户名</td>
					<td width="30%" align="left">
						<input id="eloginid" type="text" name="loginid" class="easyui-validatebox" required="true" value="" />
						<span class="required" style="color:red">*</span>
					</td>
					<td width="20%" align="right">角色</td>
					<td width="30%" align="left">
						<input id="erole" name="role.roleid"/>
						<span class="required" style="color:red">*</span>
					</td>
				</tr>
				<tr>
					<td align="right">密码</td>
					<td align="left">
						<input id="eloginpwd" type="password" name="loginpwd" class="easyui-validatebox" required="true" />
							<span class="required" style="color:red">*</span>
					</td>
					<td align="right">确认密码</td>
					<td align="left">
						<input id="ereloginpwd" type="password" name="reloginpwd" class="easyui-validatebox" required="true" />
						<span class="required" style="color:red">*</span>
					</td>
				</tr>
				<tr>
					<td align="right">姓名</td>
					<td align="left">
						<input id="eusrnm" type="text" name="usrnm" class="easyui-validatebox" required="true" />
							<span class="required" style="color:red">*</span>
					</td>
					<td align="right">手机</td>
					<td align="left">
						<input id="emobile" type="text" name="mobile"
							class="easyui-validatebox" required="true" data-options="validType:'checkTelephoneNum'"/> 
							<script type="text/javascript">
								$(function() {
									//自己扩展手机号校验的规则
									$.extend($.fn.validatebox.defaults.rules, {
										checkTelephoneNum : {
											validator : function(value) {
												//定义手机号校验的正则表达式
												var reg = /^1[3,4,5,7,8,9][0-9]{9}$/;
												return reg.test(value);
											},
											message : '手机号不符合规范！'
										}
									});
								});
							</script>
							<span class="required" style="color:red">*</span>
					</td>					
				</tr>
				<tr>
					<td align="right">电子邮箱</td>
					<td align="left">
						<input id="eusremail" type="text" name="usremail" class="easyui-validatebox" required="true" />
							<span class="required" style="color:red">*</span>
					</td>					
					<td align="right">职务</td>
					<td align="left">
						<input id="ejobpstn" type="text" name="jobpstn" class="easyui-validatebox" required="true" />
					</td>
				</tr>
				<tr>
					<td align="right">办公电话</td>
					<td align="left">
						<input id="etelno" type="text" name="telno" class="easyui-validatebox" required="true" />
							<span class="required" style="color:red">*</span>
					</td>
					<td align="right">所属机构</td>
					<td align="left" colspan="3">
						<span>xqsmtest</span>
				    </td>
				</tr>
				<tr>
					<td height="35" colspan="4" align="center" nowrap="nowrap" class="style1">
						<input class="button" type="button" name="confirm" value="确定" onclick="userEdit()" >
						<!-- <input class="button" type="button" onclick="useradd()" name="confirm" value="确定"> -->
						&nbsp;&nbsp;
						<input class="button"  name="cancle" type="button" class="btn3_mouseup"
							onClick="javascript:location.href='./jsp/umInfo.jsp'" value="取消" />
						<p><br></p>
					</td>					
				</tr>
			</table>
		</form>
	</div>
	 
	 
	 
	 
	 
	
	
	<!-- 用户详情查看 -->
	<div id="checkUserWindow" style="overflow:hidden;display:none;margin:0 auto;">
		<form name="userCheckForm" method="post" action="${pageContext.request.contextPath}/user/checkUser.do">
			<table id="userCheckInfoTb" class="table-edit" border="0" cellspacing="1" width="100%" height="80%">
				<tr>
					<td width="20%" align="right">用户名</td>
					<td width="30%" align="left">
						<input id="cloginid" type="text" name="cloginid" style="border:none;" />
					</td>
					<td width="20%" align="right">角色</td>
					<td width="30%" align="left">
						<input id="crole" name="rolenm"/>
					</td>
				</tr>
				<tr>
					<td align="right">姓名</td>
					<td align="left">
						<input id="cusrnm" type="text" name="cusrnm" />
					</td>
					<td align="right">手机</td>
					<td align="left">
						<input id="cmobile" type="text" name="cmobile"/> 
					</td>					
				</tr>
				<tr>
					<td align="right">电子邮箱</td>
					<td align="left">
						<input id="cusremail" type="text" name="cusremail" />
					</td>					
					<td align="right">职务</td>
					<td align="left">
						<input id="cjobpstn" type="text" name="cjobpstn" />
					</td>
				</tr>
				<tr>
					<td align="right">办公电话</td>
					<td align="left">
						<input id="ctelno" type="text" name="ctelno" />
					</td>
					<td align="right">所属机构</td>
					<td align="left" colspan="3">
					<span>xqsmtest</span>
					</td>
				</tr>
			</table>
		</form>
	</div>
  </body>
  
</html>






