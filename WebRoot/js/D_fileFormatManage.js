//工具栏
var toolbar = [ {
	id : 'button-add',
	text : '增加',
	iconCls : 'icon-add',
	handler : function doAdd() {
		//alert("增加...");
		$('#addFileWindow').window('open');
	}
}, {
	id : 'button-delete',
	text : '删除',
	iconCls : 'icon-cancel',
	handler : function doDelete() {
		//获取选中条数
		//alert("删除...");
		// 返回被选中的行 然后集成的其实是 对象数组  
		var row = $('#fileInfoTb').datagrid('getSelections');
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
						url : "./file/delFile.do",
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


$(function() {
	$("#fileInfoTb").datagrid({
		columns : [ [
			{
				field : '',
				title : '',
				align : 'center',
				width : '200px',
				checkbox : true
			},
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
			},
			{
				field : 'chakan',
				title : '基本操作',
				width : 200,
				align : 'center',
				formatter : function(value, rowData, rowIndex) {

					//function里面的三个参数代表当前字段值，当前行数据对象，行号（行号从0开始）

					//alert(rowData.username);  
					var jsondata = JSON.stringify(rowData);

					return "<a href='javascript:void(0);' onclick='doEdit(" + jsondata + ");'>" +
							"<img src='./images/edt.gif' alt='编辑' />" + "</a>";
				}
			}
		] ],
		title : '文件格式信息一览',
		url : "./file/fileInfo.do",
		pagination : true, //开启/关闭分页功能，true-开启；false-关闭，默认是false
		toolbar : toolbar, //指定工具条
		striped : true,
		rownumbers : "true",
		pageList : [ 10, 50, 100 ], //配置每页查询条数的选项
		loadMsg : "正在努力加载数据，请稍后..."
	});
});

//添加窗口
$(function() {
	$('#addFileWindow').dialog({
		title : '文件格式信息添加',
		width : 800,
		height : 350,
		closed : true,
		cache : false,
		top : 50,
		modal : true
	});
	$('#addFileWindow').dialog('refresh');
});
//用户添加
function addfile() {
	$("#addFileForm").form('submit', {
		url : './file/addFile.do',
		onsubmit : function() {
			return $(this).form('validate');
		},
		success : function(data) {
			var mesmap = JSON.parse(data);
			//alert(mesmap.state);
			if (mesmap.state === "true") {

				$("#addFileWindow").window("close");
				$.messager.confirm('', '保存用户成功', function(r) {});
				$("#addFileTb").datagrid('reload');

			}
			else {
				$("#addFileWindow").window("close");
				$.messager.confirm('', '用户添加失败', function(r) {});

			//alert("用户添加失败");
			}
		}
	});
}

//编辑窗口
$(function() {
	$('#editFileWindow').dialog({
		title : '文件格式信息修改',
		width : 800,
		height : 350,
		closed : true,
		cache : false,
		top : 50,
		//href: '.do',
		modal : true
	});
	$('#editFileWindow').dialog('refresh');

});


//编辑数据回显
function doEdit(row) {
	//$("#eusrid").val(row.usrid);
	alert("编辑..");
	$("#editFileWindow").window('open');
}


//用户编辑
function fileEdit() {
	$("#editCusForm").form('submit', {
		url : './file/updateFile.do',
		onsubmit : function() {
			return $(this).form('validate');
		},
		success : function(data) {
			var mesmap = JSON.parse(data);
			//alert(mesmap.state);
			if (mesmap.state === "true") {

				$("#editFileWindow").window("close");
				$.messager.confirm('', '修改成功', function(r) {});
				$("#fileInfoTb").datagrid('reload');

			}
			else {
				$("#editFileWindow").window("close");
				$.messager.confirm('', '修改失败', function(r) {});

			//alert("用户添加失败");
			}
		}
	});
}



