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
$(function() {
	$("#resTypeInfoTb").datagrid({
		columns : [ [
			{
				field : '',
				title : 'dd',
				align : 'center',
				width : '200px',
				checkbox : true
			},
			{
				field : 'tcd',
				title : '编号',
				align : 'center',
				width : '200px'
			},
			{
				field : 'tnm',
				title : '资源类型名称',
				align : 'center',
				width : '200px'
			},
			{
				field : 'plancd',
				title : '基本操作',
				align : 'center',
				width : '200px',
				formatter : function(value, rowData, rowIndex) {
					return "<a href='javascript:void(0);' onclick='checkPlan();'>编辑</a>";
				}
			},
		] ],
		title : '资源类型信息一览',
		url : "./resType/resTypeInfo.do",
		striped : true,
		toolbar : toolbar,
		singleSelect : false, //开启单选功能，true-开启；false-关闭，默认是false
		rownumbers : true,
		pagination : true, //开启/关闭分页功能，true-开启；false-关闭，默认是false
		pageList : [ 10, 50, 100 ], //配置每页查询条数的选项
		singleSelect : false,
		loadMsg : "正在努力加载数据，请稍后..."
	});
});