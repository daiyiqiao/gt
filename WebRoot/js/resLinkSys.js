 	
	//工具栏
	var toolbar = [{
		id : 'button-add',
		text : '增加',
		iconCls : 'icon-add' ,
		handler : function doAdd() {
			//alert("增加...");
			$('#addSysNmWindow').window('open');
		 }
	},{
		id : 'button-delete',
		text : '删除',
		iconCls : 'icon-cancel',
		handler :  function doDelete() {
			//获取选中条数
			 //alert("删除...");
			 // 返回被选中的行 然后集成的其实是 对象数组  
		        var row = $('#resLinkInfoTb').datagrid('getSelections');  
		        var i = 0;  
		        var ids = "";  
		        for(i;i<row.length;i++){  
		        	ids += row[i].usrid;  
		            if(i < row.length-1){  
		            	ids += ',';  
		            }else{  
		                break;  
		            }  
		        }  
		        alert(ids);  
		        //var row = $('#userInfoTb').datagrid('getSelected');  
		       // alert(row.usrid);  
		        if (row.length== 0) {  
		            alert("请选择要删除的行");  
		        }  
		        if (row.length>0) {  
		            $.messager.confirm('Confirm', '确定删除数据来源?', function(r) {  
		                if (r) {  
		                	
		                	$.ajax({
		            			type:"post",
		            			url:"./res/delResLink.do",
		            			dataType:"json",
		            			data:{"syscd":syscd},
		            			success:function(res){
		            				$('#resLinkInfoTb').datagrid('reload');
		            				
		            			}
		            		});
		                }  
		            });  
		        }  
			}	 
	}];
	//数据来源系统信息一览
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility : "visible"});
		$("#resLinkInfoTb").datagrid({
		    columns:[[
		            {field:'syscd',title:'系统编号',width:250,align:'center',checkbox : true},
		      		{field:'sysnm',title:'系统名称',width:250,align:'center'},
		      		{field:'orgnm',title:'机构名称',width:250,align:'center'},
		      		{field:'chakan',title:'基本操作',width:200,align:'center',
		      			formatter:function(value,rowData,rowIndex){
		      			var jsondata=JSON.stringify(rowData);
                        return "<a href='javascript:void(0);' onclick='doEdit("+jsondata+");'>编辑</a>";  
		      				}
                        }
		          ]],
	  		 title:'数据来源系统信息一览',
	  		 idField : 'syscd',
			 url:"./res/resLink.do",
			 toolbar:toolbar,//指定工具条
			 striped:true,
			 pagination:true,//开启/关闭分页功能，true-开启；false-关闭，默认是false
			 pageList:[10,50,100],//配置每页查询条数的选项
			 singleSelect:false,//开启单选功能，true-开启；false-关闭，默认是false
			 rownumbers : true,
			// onDblClickRow : doDblClickRow,
			 loadMsg:"正在努力加载数据，请稍后..."
  		});
	});
	
	//添加窗口
	$(function(){
		$('#addSysNmWindow').dialog({
			title:'数据来源信息添加',
	        width: 500,
	        height: 300,
	        closed: true,
	        cache: false,
	        top:50,
	       // href: 'addUser.do',
	        modal: true
	    });
	    $('#addSysNmWindow').dialog('refresh');
	});
	
	function addSys(){
		$("#addSysForm").form('submit',{
			url:'./res/addResSys.do',
			onsubmit : function() {
				return $(this).form('validate');
			},
			success : function(data) {
				var mesmap=JSON.parse(data);
				//alert(mesmap.state);
				if(mesmap.state==="true"){
					 
					$("#addSysNmWindow").window("close");
					$.messager.confirm('','保存数据来源成功',function(r){    
					});
					$("#resLinkInfoTb").datagrid('reload');
					
				}else{
					$("#addSysNmWindow").window("close");
					$.messager.confirm('','保存数据来源失败',function(r){    
					}); 
					
					//alert("用户添加失败");
				}
			}
		});
	}
	
	
	
	
	
	
	
	//编辑窗口
	$(function(){
		$('#eidtSysNmWindow').dialog({
			title:'数据来源系统信息修改',
	        width: 500,
	        height: 300,
	        closed: true,
	        cache: false,
	        top:50,
	        //href: '.do',
	        modal: true
	    });
	    $('#eidtSysNmWindow').dialog('refresh');
	});
	
	//用户编辑
	function doEdit(row){
		//alert(row.sysnm);
		$("#ssyscd").val(row.syscd);
		$("#esysnm").val(row.sysnm);
		//alert("编辑..");
		$("#eidtSysNmWindow").window('open');
	}
	
	
	function editSys(){
		$("#eidtSysNmForm").form('submit',{
			url:'./res/editResSys.do',
			onsubmit : function() {
				return $(this).form('validate');
			},
			success : function(data) {
				var mesmap=JSON.parse(data);
				//alert(mesmap.state);
				if(mesmap.state==="true"){
					 
					$("#eidtSysNmWindow").window("close");
					$.messager.confirm('','修改数据来源成功',function(r){    
					});
					$("#resLinkInfoTb").datagrid('reload');
					
				}else{
					$("#eidtSysNmWindow").window("close");
					$.messager.confirm('','修改数据来源失败',function(r){    
					}); 
					
					//alert("用户添加失败");
				}
			}
		});
	}
	
	
	
	
	