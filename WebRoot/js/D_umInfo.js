
//工具栏
var toolbar = [ {
	id : 'button-add',
	text : '增加',
	iconCls : 'icon-add',
	handler : function doAdd() {
		//alert("增加...");
		$('#addUserWindow').window('open');
	}
}, {
	id : 'button-delete',
	text : '删除',
	iconCls : 'icon-cancel',
	handler : function doDelete() {
		//获取选中条数
		//alert("删除...");
		// 返回被选中的行 然后集成的其实是 对象数组  
		var row = $('#userInfoTb').datagrid('getSelections');
		var i = 0;
		var ids = "";
		for (i; i < row.length; i++) {
			ids += row[i].usrid;
			if (i < row.length - 1) {
				ids += ',';
			}
			else {
				break;
			}
		}
		alert(ids);
		//var row = $('#userInfoTb').datagrid('getSelected');  
		// alert(row.usrid);  
		if (row.length == 0) {
			alert("请选择要删除的行");
		}
		if (row.length > 0) {
			$.messager.confirm('Confirm', '确定删除用户?', function(r) {
				if (r) {

					$.ajax({
						type : "post",
						url : "./user/delUser.do",
						dataType : "json",
						data : {
							"ids" : ids
						},
						success : function(res) {
							$('#userInfoTb').datagrid('reload');

						}
					});
				}
			});
		}
	}
} ];
//用户信息一览
$(function() {
	// 先将body隐藏，再显示，不会出现页面刷新效果
	$("body").css({
		visibility : "visible"
	});
	$("#userInfoTb").datagrid({
		columns : [ [
			{
				field : 'usrid',
				title : 'id',
				width : 100,
				align : 'center',
				checkbox : true
			},
			{
				field : 'loginid',
				title : '用户名',
				width : 100,
				align : 'center'
			},
			{
				field : 'usrnm',
				title : '姓名',
				width : 100,
				align : 'center'
			},
			{
				field : 'orgnm',
				title : '所属机构',
				width : 100,
				align : 'center'
			},
			{
				field : 'rolenm',
				title : '角色',
				width : 100,
				align : 'center'
			},
			{
				field : 'chakan',
				title : '基本操作',
				width : 100,
				align : 'center',
				formatter : function(value, rowData, rowIndex) {

					//function里面的三个参数代表当前字段值，当前行数据对象，行号（行号从0开始）

					//alert(rowData.username);  
					var jsondata = JSON.stringify(rowData);

					return "<a href='javascript:void(0);' onclick='doCheck(" + jsondata + ");'>查看|</a>" +
						"<a href='javascript:void(0);' onclick='doEdit(" + jsondata + ");'>编辑</a>";
				}
			},
			{
				field : 'mobile',
				title : '手机',
				width : 100,
				align : 'center',
				hidden : 'true'
			},
			{
				field : 'jobpstn',
				title : '职务',
				width : 100,
				align : 'center',
				hidden : 'true'
			},
			{
				field : 'usremail',
				title : '邮箱',
				width : 100,
				align : 'center',
				hidden : 'true'
			},
			{
				field : 'telno',
				title : '办公室电话',
				width : 100,
				align : 'center',
				hidden : 'true'
			},
			{
				field : 'mobile',
				title : '手机',
				width : 100,
				align : 'center',
				hidden : 'true'
			},


		] ],
		title : '用户信息一览',
		idField : 'usrid',
		url : "./user/umInfo.do",
		//url:"./json/user.json",
		toolbar : toolbar, //指定工具条
		striped : false,
		pagination : true, //开启/关闭分页功能，true-开启；false-关闭，默认是false
		pageList : [ 10, 50, 100 ], //配置每页查询条数的选项
		singleSelect : false, //开启单选功能，true-开启；false-关闭，默认是false
		rownumbers : true,
		// onDblClickRow : doDblClickRow,
		loadMsg : "正在努力加载数据，请稍后..."
	});
});

//添加窗口
$(function() {
	$('#addUserWindow').dialog({
		title : '用户信息添加',
		width : 800,
		height : 350,
		closed : true,
		cache : false,
		top : 50,
		// href: 'addUser.do',
		modal : true
	});
	$('#addUserWindow').dialog('refresh');
	//角色下拉菜单
	$('#role').combobox({
		url : './json/role.json',
		valueField : 'id',
		textField : 'role'
	});
});
//用户添加
function useradd() {
	$("#addCusForm").form('submit', {
		url : './user/addUser.do',
		onsubmit : function() {
			return $(this).form('validate');
		},
		success : function(data) {
			var mesmap = JSON.parse(data);
			//alert(mesmap.state);
			if (mesmap.state === "true") {

				$("#addUserWindow").window("close");
				$.messager.confirm('', '保存用户成功', function(r) {});
				$("#userInfoTb").datagrid('reload');

			}
			else {
				$("#addUserWindow").window("close");
				$.messager.confirm('', '用户添加失败', function(r) {});

			//alert("用户添加失败");
			}
		}
	});
}

//编辑窗口
$(function() {
	$('#editUserWindow').dialog({
		title : '用户信息修改',
		width : 800,
		height : 350,
		closed : true,
		cache : false,
		top : 50,
		//href: '.do',
		modal : true
	});
	$('#editUserWindow').dialog('refresh');
	//角色下拉菜单
	$('#erole').combobox({
		url : './json/role.json',
		valueField : 'id',
		textField : 'role',
	});

});


//编辑数据回显
function doEdit(row) {
	$("#eusrid").val(row.usrid);
	$("#eloginid").val(row.loginid);
	$("#eloginpwd").val(row.loginpwd)
	$("#ereloginpwd").val(row.loginpwd);
	$("#eusrnm").val(row.usrnm);
	$("#emobile").val(row.mobile);
	$("#eusremail").val(row.usremail);
	$("#ejobpstn").val(row.jobpstn);
	$("#etelno").val(row.telno);
	$('#erole').combobox('select', row.rolenm);
	//alert("编辑..");
	$("#editUserWindow").window('open');
}


//用户编辑
function userEdit() {
	$("#editCusForm").form('submit', {
		url : './user/updateUser.do',
		onsubmit : function() {
			return $(this).form('validate');
		},
		success : function(data) {
			var mesmap = JSON.parse(data);
			//alert(mesmap.state);
			if (mesmap.state === "true") {

				$("#editUserWindow").window("close");
				$.messager.confirm('', '修改用户成功', function(r) {});
				$("#userInfoTb").datagrid('reload');

			}
			else {
				$("#editUserWindow").window("close");
				$.messager.confirm('', '修改用户失败', function(r) {});

			//alert("用户添加失败");
			}
		}
	});
}

//用户详情查看窗口
$(function() {
	$('#checkUserWindow').dialog({
		title : '用户信息详情',
		width : 600,
		height : 260,
		closed : true,
		cache : false,
		top : 50,
		//href: '.do',
		modal : true
	});
	$('#checkUserWindow').dialog('refresh');
});
//详情查看
function doCheck(row) {
	$("#cloginid").val(row.loginid);
	$("#crole").val(row.rolenm);
	$("#cloginpwd").val(row.loginpwd)
	$("#creloginpwd").val(row.loginpwd);
	$("#cusrnm").val(row.usrnm);
	$("#cmobile").val(row.mobile);
	$("#cusremail").val(row.usremail);
	$("#cjobpstn").val(row.jobpstn);
	$("#ctelno").val(row.telno);
	//alert("查看详情..");
	$("#checkUserWindow").window('open');

}

//查询
function doSearch() {
	var loginid = $("#loginid").val();
	var usrnm = $("#usrnm").val();
	//alert(loginid);
	//alert(usrnm);
	$.ajax({
		type : "post",
		url : "./user/findUser.do",
		dataType : "json",
		data : {
			"loginid" : loginid,
			"usrnm" : usrnm
		},
		success : function(data) {
			alert(11);
			$('#userInfoTb').datagrid('reload');

		},
		error : function(data) {
			alert(data);
		}
	});

}