<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>元数据注册</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<!-- easyui资源文件 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/plug/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/plug/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/plug/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/plug/jquery.easyui.min.js"></script>
<!-- 本页面js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/w_regPage.js"></script>
<!-- 本页面css -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/w_regPage.css">
</head>

<body>
	<form name="regform" id="regform" method="post"  
		enctype="application/x-www-form-urlencoded" target="framename"
		>
		<table cellspacing="10" cellpadding="0" class="tabs-tool">
			<tr>
				<td align="right" id="tcdnm">资源类型</td>
				<td align="left"><input id="tcd" name="trestype.tcd" value="请选择">
					<font class="iflg" id="tcdflg" color="red"></font><font id="tcdmsg"
					class="msg" face="verdana" color="red"></font></td>
				<td align="right" id="sysinidnm">系统号</td>
				<td align="left"><input id="sysinid" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,16]'"
					onblur="checks()" type="text" name="sysinid"><font
					class="iflg" id="sysinidflg" color="red"></font><font
					id="sysinidmsg" class="msg" face="verdana" color="red"></font></td>
			</tr>
			<tr>
				<td align="right" id="fcdnm">文件格式</td>
				<td align="left"><input id="fcd" name="tfileformat.fcd" value="请选择">
					<font class="iflg" id="fcdflg" color="red"></font><font id="fcdmsg"
					class="msg" face="verdana" color="red"></font></td>
				<td align="right" id="titlenm">标题(资源名称)</td>
				<td align="left"><input id="title" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,256]'" type="text"
					onblur="checkt()" name="title"> <font class="iflg"
					id="titleflg" color="red"></font><font id="titlemsg" class="msg"
					face="verdana" color="red"></font></td>
			</tr>
			<tr class='granule' id="gu1">
				<td align="right" id="granule1nm">颗粒度K1</td>
				<td align="left"><input id="granule1" name="granule1"
					value="请选择"> <font class="iflg" id="granule1flg"
					color="red"></font><font id="granule1msg" class="msg"
					face="verdana" color="red"></font></td>
				<td align="right" id="granule1valnm">颗粒度K1值</td>
				<td align="left"><input id="granule1val"
					class="easyui-validatebox easyui-textbox" 
					data-options="disabled:true,required:false,validType:['gran','length[0,1024]']"					
					name="granule1val" type="text" autocomplete="off"> <font
					class="iflg" id="granule1valflg" color="red"></font><font
					id="granule1valmsg" class="msg" face="verdana" color="red"></font></td>
			</tr>
			<tr class='granule' id="gu2">
				<td align="right" id="granule2nm">颗粒度K2</td>
				<td align="left"><input id="granule2" name="granule2"
					value="请选择"> <font class="iflg" id="granule2flg"
					color="red"></font><font id="granule2msg" class="msg"
					face="verdana" color="red"></font></td>
				<td align="right" id="granule2valnm">颗粒度K2值</td>
				<td align="left"><input id="granule2val"
					class="easyui-validatebox easyui-textbox"
					data-options="disabled:true,required:false,validType:['gran','length[0,1024]']"
					name="granule2val" type="text"> <font class="iflg"
					id="granule2valflg" color="red"></font><font id="granule2valmsg"
					class="msg" face="verdana" color="red"></font></td>
			</tr>
			<tr class='granule' id="gu3">
				<td align="right" id="granule3nm">颗粒度K3</td>
				<td align="left"><input id="granule3" name="granule3"
					value="请选择"> <font class="iflg" id="granule3flg"
					color="red"></font><font id="granule3" face="verdana" color="red"></font></td>
				<td align="right" id="granule3valnm">颗粒度K3值</td>
				<td align="left"><input id="granule3val"
					class="easyui-validatebox easyui-textbox"
					data-options="disabled:true,required:false,validType:['gran','length[0,1024]']"
					name="granule3val" type="text"> <font class="iflg"
					id="granule3valflg" color="red"></font><font id="granule3valmsg"
					class="msg" face="verdana" color="red"></font></td>
			</tr>
			<tr>
				<td align="right" id="marccdnm">MARC记录001标识号</td>
				<td align="left"><input id="marccd" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,16]'"
					name="marccd" type="text"> <font class="iflg"
					id="marccdflg" color="red"></font><font id="marccdmsg" class="msg"
					face="verdana" color="red"></font></td>
				<td align="right" id="creatornm">作者</td>
				<td align="left"><input id="creator" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,256]'" type="text"
					name="creator"> <font class="iflg" id="creatorflg"
					color="red"></font><font id="" face="verdana" color="red"></font></td>
			</tr>
			<tr>
				<td align="right" id="isbnnm">ISBN</td>
				<td align="left"><input id="isbn" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,256]'" type="text"
					name="isbn"> <font class="iflg" id="isbnflg" color="red"></font><font
					id="isbnmsg" class="msg" face="verdana" color="red"></font></td>
				<td align="right" id="issnnm">ISSN</td>
				<td align="left"><input id="issn" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,256]'" type="text"
					name="issn"> <font class="iflg" id="issnflg" color="red"></font><font
					id="issnmsg" class="msg" face="verdana" color="red"></font></td>
			</tr>
			<tr>
				<td align="right" id="themenm">主题词</td>
				<td align="left"><input id="theme" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,256]'" type="text"
					name="theme"> <font class="iflg" id="themeflg" color="red"></font><font
					id="thememsg" class="msg" face="verdana" color="red"></font></td>
				<td align="right" id="langnm">语种</td>
				<td align="left"><input id="lang" name="lang" value="中文(简体)">
					<font class="iflg" id="langflg" color="red"></font><font
					id="langflg" face="verdana" color="red"></font></td>

			</tr>
			<tr>
				<td align="right" id="pubnm">出版者</td>
				<td align="left"><input id="pub" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,256]'" type="text"
					name="pub"> <font class="iflg" id="pubflg" color="red"></font><font
					id="pubmsg" class="msg" face="verdana" color="red"></font></td>
				<td align="right" id="pubdatenm">出版时间</td>
				<td align="left"><input id="pubdate" class="easyui-validatebox"
					data-options="required:false,validType:['Number','length[0,8]']" type="text"
					name="pubdate"> <font class="iflg" id="pubdateflg"
					color="red"></font><font id="pubdatemsg" class="msg" face="verdana"
					color="gray" size="12px">格式：YYYYMMDD</font></td>
			</tr>
			<tr>
				<td align="right" id="versionnm">版本信息</td>
				<td align="left"><input id="version" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,256]'" type="text"
					name="version"> <font class="iflg" id="versionflg"
					color="red"></font><font id="versionmsg" class="msg" face="verdana"
					color="red"></font></td>
				<td align="right" id="copyrightnm">版权信息</td>
				<td align="left"><input id="copyright"
					class="easyui-validatebox"
					data-options="required:false,validType:'length[0,256]'" type="text"
					name="copyright"> <font class="iflg" id="copyrightflg"
					color="red"></font><font id="copyrightmsg" class="msg"
					face="verdana" color="red"></font></td>
			</tr>
			<tr id="addtr">
				<td width="15%" align="right" id="syscdnm">数据来源系统</td>
				<td width="35%" align="left"><input id="syscd" name="tlinksys.syscd"
					value="请选择"> <font class="iflg" id="syscdflg" color="red"></font><font
					id="syscdmsg" class="msg" face="verdana" color="red"></font></td>

				<td width="15%" align="right" class='granule' id='sys1'>二级目录</td>
				<td width="35%" align="left" class='granule' id='sys2'><input
					id="syscd2" name="syscd2" value="请选择"> <font class="iflg"
					id="syscd2flg" color="red"></font><font id="syscd2msg" class="msg"
					face="verdana" color="red"></font></td>
			</tr>
			<tr>
				<td align="right" id="assinfonm">关联信息</td>
				<td align="left" colspan="3"><input id="assinfo"
					class="easyui-textbox" multiline="true" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,380]'"
					style="width:77%;height:60px" type="text" name="assinfo"> <font
					class="iflg" id="assinfoflg" color="red"></font><font
					id="assinfomsg" class="msg" face="verdana" color="red"></font></td>
			</tr>
			<tr>
				<td align="right" id="objsourcenm">来源信息</td>
				<td align="left" colspan="3"><input id="objsource"
					class="easyui-textbox" multiline="true" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,380]'"
					style="width:77%;height:60px" type="text" name="objsource">
					<font class="iflg" id="objsourceflg" color="red"></font><font
					id="objsourcemsg face=" verdana"
					color="red"></font></td>
			</tr>
			<tr id="addtr2">
				<td align="right" id="objdescnm">描述信息</td>
				<td align="left" colspan="3"><input id="objdesc"
					class="easyui-textbox" multiline="true" class="easyui-validatebox"
					data-options="required:false,validType:'length[0,4000]'"
					style="width:77%;height:60px" type="text" name="objdesc"> <font
					class="iflg" id="objdescflg" color="red"></font><font
					id="objdescmsg" class="msg" face="verdana" color="red"></font></td>
			</tr>
			<tr>
				<td align="right">URL</td>
				<td colspan="3" class="my_tab">
					<ul id="url_ul">
						<li><input type="text" name="url1" id="url1" value=""
							style="width:76%;height:22px" /> <img
							src="${pageContext.request.contextPath}/plug/themes/icons/edit_add.png"
							id="addurl"></li>
					</ul> <input type="hidden" id="urlnum" name="urlnum" />
				</td>

			</tr>
			<tr>
				<td colspan="4" align="center"><input type="submit" value="确定"
					id="reg" style="width:20%;height:30px"></td>
			</tr>
		</table>
	</form>
</body>

</html>