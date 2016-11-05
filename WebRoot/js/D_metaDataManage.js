//工具栏
var toolbar = [ {
	id : 'button-save',
	text : '保存',
	iconCls : 'icon-save',
	handler : function doSave() {
		alert("保存...");
	}
} ];


$(function() {
	$("#metaDataInfoTb").datagrid({
		columns : [ [
			{
				field : 'metaitemno',
				title : '序号',
				align : 'center',
				width : '200px'
			},
			{
				field : 'itemnm',
				title : '属性项名',
				align : 'center',
				width : '200px'
			},
			{
				field : 'useflg',
				title : '使用',
				align : 'center',
				width : '200px',
				formatter : function(value, rowData, rowIndex) {
					var jsondata = JSON.stringify(rowData);console.log(rowData);
//					if(rowData.useflg!=0){return "<a href='javascript:void(0);' onclick='useflg(" + jsondata + ");'>useflg</a>";}
					if(rowData.useflg==0){return "<input type='checkbox' name='metaitemno' value='0' checked='checked' />";}

				}
			},
			{
				field : 'mustflg',
				title : '必填',
				align : 'center',
				width : '200px',
				//checkbox : true
				formatter : function(value, rowData, rowIndex) {
					var jsondata = JSON.stringify(rowData);
					return "<a href='javascript:void(0);' onclick='mustflag(" + jsondata + ");'>mustflg</a>";
				}
			},
		] ],
		title : '元数据项信息配置',
		url : "./meta/metaDataInfo.do",
		striped : true,
		toolbar : toolbar,
		selectOnCheck : true,
		pagination : true, //开启/关闭分页功能，true-开启；false-关闭，默认是false
		pageList : [ 10, 50, 100 ], //配置每页查询条数的选项
		loadMsg : "正在努力加载数据，请稍后..."
	});
});

useflg
//编辑数据回显
function mustflag(row) {
	alert(row.mustflg);
//alert("编辑..");
}


function useflg(row) {
	alert(row.useflg);
//alert("编辑..");
}