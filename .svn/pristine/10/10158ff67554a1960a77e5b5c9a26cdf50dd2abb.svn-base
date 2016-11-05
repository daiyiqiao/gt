$(function() {
	/*
	 * 数据加载部分 
	 */

	var metas = '';
	//获取元数据属性项
	$.ajax({
		//请求地址
		url : "reg/loadAttr.do",
		//请求方式
		type : "post",
		//请求参数值
		data : {},
		//返回参数类型
		dataType : "json",
		//请求成功回调函数
		success : function(result) {

			//result服务器返回的元数据集合
			metas = result;
			for (var i = 0; i < result.length; i++) {
				var metaItm = result[i];
				var itemfield = metaItm['itemfield']; //字段				
				var mustflg = metaItm['mustflg']; //必填标志
				if (mustflg == '1') {
					$('#' + itemfield + 'flg').text('*');
					$('#' + itemfield).validatebox({
					    required: true
					});
				}
				var useflg = metaItm['useflg']; //使用标志
				var delflg = metaItm['delflg']; //删除标志
				if (useflg == '1' || delflg == '1') {
					$('#' + itemfield).val('该字段已不再使用');
					$('#' + itemfield).textbox({
						disabled : true
					});
				}
			}
			for (var i = 24; i < result.length; i++) { //现有字段数24个
				var metaItm = result[i];
				var itemfield = metaItm['itemfield']; //字段
				var itemnm = metaItm['itemnm']; //字段名
				var inputflg = metaItm['inputflg']; //输入类型
				if (inputflg == '2') {
					var str = '<tr><td align="right" id=' + itemfield + '"nm">' + itemnm +
						'</td><td align="left" colspan="3"><input id=' + itemfield + ' class="easyui-textbox"' +
						'multiline="true" style="width:77%;height:60px" type="text" name="dept">' +
						'<font class="iflg" id=' + itemfield + '"flg" color="red"></font>' +
						'<font id=' + itemfield + '"msg" face="verdana"color="red"></font></td></tr>';
					var $tr = $(str);
					$('#addtr2').after($tr);
				}
				else {
					var str = '<tr><td align="right" id=' + itemfield + '"nm">' + itemnm +
						'</td><td align="left"><input id=' + itemfield + ' class="textbox" type="text" name="dept">' +
						'<font class="iflg" id=' + itemfield + '"flg" color="red"></font>' +
						'<font id=' + itemfield + '"msg" face="verdana" color="red"></font></td></tr>';
					var $tr = $(str);
					$('#addtr').after($tr);
				}

			}

		},
		//请求失败回调函数
		error : function() {
			alert("服务器繁忙，请稍后再试。。。");
		}
	});
	/*
	 * 获取资源类型
	 */
	$('#tcd').combobox({
		url : 'reg/getTcd.do',
		valueField : 'tcd',
		textField : 'tnm',
		onSelect : function(parm) {
			if (parm == '') {
				$('#tcdmsg').text("请选择资源类型");
				return;
			}
			else {
				var tcd = parm.tcd;
				//颗粒度请求地址
				var jsondata1;
				var jsondata2;
				var jsondata3;
				//颗粒度1显示
				$('#gu1').removeClass('granule')
				switch (tcd) {
				case 'T1':
					//图书，颗粒度1	
					jsondata1 = [ {
						"g1" : "单卷/册",
						"g1num" : "T1K1V1"
					}, {
						"g1" : "多卷/册",
						"g1num" : "T1K1V2"
					} ];
					//颗粒度2
					$('#gu2').removeClass('granule');
					jsondata2 = [ {
						"g2" : "前封",
						"g2num" : "T1K2V1"
					}, {
						"g2" : "目录之前的前附页",
						"g2num" : "T1K2V2"
					}, {
						"g2" : "目录之前的后附页",
						"g2num" : "T1K2V3"
					}, {
						"g2" : "目录页",
						"g2num" : "T1K2V4"
					}, {
						"g2" : "正文",
						"g2num" : "T1K2V5"
					}, {
						"g2" : "后附页",
						"g2num" : "T1K2V6"
					}, {
						"g2" : "后封",
						"g2num" : "T1K2V7"
					} ];
					//颗粒度3
					$('#gu3').removeClass('granule');
					jsondata3 = [ {
						"g3" : "插图",
						"g3num" : "T1K3V1"
					}, {
						"g3" : "公式",
						"g3num" : "T1K3V2"
					} ];
					break;
				case 'T2':
					//期刊，颗粒度1					
					jsondata1 = [ {
						"g1" : "全年",
						"g1num" : "T2K1V1"
					}, {
						"g1" : "期刊",
						"g1num" : "T2K1V2"
					}, {
						"g1" : "增刊",
						"g1num" : "T2K1V3"
					}, {
						"g1" : "合订本",
						"g1num" : "T2K1V4"
					} ];
					//颗粒度2
					$('#gu2').removeClass('granule');
					jsondata2 = [ {
						"g2" : "前封",
						"g2num" : "T2K2V1"
					}, {
						"g2" : "目录之前的前附页",
						"g2num" : "T2K2V2"
					}, {
						"g2" : "目录之前的后附页",
						"g2num" : "T2K2V3"
					}, {
						"g2" : "目录页",
						"g2num" : "T2K2V4"
					}, {
						"g2" : "正文",
						"g2num" : "T2K2V5"
					}, {
						"g2" : "后附页",
						"g2num" : "T2K2V6"
					}, {
						"g2" : "后封",
						"g2num" : "T2K2V7"
					} ];
					//颗粒度3
					$('#gu3').removeClass('granule');
					jsondata3 = [ {
						"g3" : "插图",
						"g3num" : "T2K3V1"
					}, {
						"g3" : "公式",
						"g3num" : "T2K3V2"
					} ];
					break;
				case 'T3':
					//论文，颗粒度1
					jsondata1 = [ {
						"g1" : "前封",
						"g1num" : "T3K3V1"
					}, {
						"g1" : "目录之前的前附页",
						"g1num" : "T3K3V2"
					}, {
						"g1" : "目录之前的后附页",
						"g1num" : "T3K3V3"
					}, {
						"g1" : "目录页",
						"g1num" : "T3K3V4"
					}, {
						"g1" : "正文",
						"g1num" : "T3K3V5"
					}, {
						"g1" : "后附页",
						"g1num" : "T3K3V6"
					}, {
						"g1" : "后封",
						"g1num" : "T3K3V7"
					} ];
					//颗粒度2
					$('#gu2').removeClass('granule');
					jsondata2 = [ {
						"g2" : "插图",
						"g2num" : "T3K2V1"
					}, {
						"g2" : "公式",
						"g2num" : "T3K2V2"
					} ];
					//颗粒度3
					$('#gu3').addClass('granule');
					break;
				case 'T4':
					//报纸，颗粒度1
					jsondata1 = [ {
						"g1" : "全年",
						"g1num" : "T4K1V1"
					}, {
						"g1" : "期刊",
						"g1num" : "T4K1V2"
					} ];
					//颗粒度2
					$('#gu2').removeClass('granule');
					jsondata2 = [ {
						"g2" : "版面",
						"g2num" : "T4K2V1"
					} ];
					//颗粒度3
					$('#gu3').removeClass('granule');
					jsondata3 = [ {
						"g3" : "插图",
						"g3num" : "T4K3V1"
					}, {
						"g3" : "文章",
						"g3num" : "T4K3V2"
					} ];
					break;
				case 'T5':
					//图片，颗粒度1
					jsondata1 = [ {
						"g2" : "图片",
						"g2num" : "T5K1V1"
					} ];
					//颗粒度2
					$('#gu2').addClass('granule');
					//颗粒度3
					$('#gu3').addClass('granule');
					break;
				case 'T6':
					//音频，颗粒度1
					jsondata1 = [ {
						"g1" : "单曲",
						"g1num" : "T6K1V1"
					}, {
						"g1" : "多曲",
						"g1num" : "T6K1V2"
					} ];
					//颗粒度2
					$('#gu2').removeClass('granule');
					jsondata2 = [ {
						"g2" : "开始时间",
						"g2num" : "T6K2V1"
					} ];
					//颗粒度3
					$('#gu3').addClass('granule');
					break;
				case 'T7':
					//视频，颗粒度1
					jsondata1 = [ {
						"g1" : "单场次",
						"g1num" : "T7K1V1"
					}, {
						"g1" : "多场次",
						"g1num" : "T7K1V2"
					} ];
					//颗粒度2
					$('#gu2').removeClass('granule');
					jsondata2 = [ {
						"g2" : "开始时间",
						"g2num" : "T7K2V1"
					} ];
					//颗粒度3
					$('#gu3').addClass('granule');
					break;
				case 'T8':
					//网页采集，颗粒度1
					jsondata1 = [ {
						"g2" : "页面",
						"g2num" : "T8K1V1"
					} ];
					//颗粒度2
					$('#gu2').addClass('granule');
					//颗粒度3
					$('#gu3').addClass('granule');
					break;
				default:
					$('#granule1msg').text("颗粒度配置文件出错，请联系机构管理员解决！")

					break;
				}
				//颗粒度一
				$('#granule1').combobox({
					valueField : 'g1num',
					textField : 'g1',
					data : jsondata1,
					onSelect : function(pa) {
						//单卷册
						var gu = pa.g1;
						if (gu === '单卷/册' || gu === '单曲' || gu === '单场次') {
							//颗粒度值不需要输入
							$('#granule1val').textbox({
								disabled : true
							});
						}
						else {
							//解除锁定
							$('#granule1val').textbox({
								disabled : false
							});
						}
					}
				});
				//颗粒度二
				$('#granule2').combobox({
					data : jsondata2,
					valueField : 'g2num',
					textField : 'g2',
					onSelect : function() {
						//解除锁定
						$('#granule2val').textbox({
							disabled : false
						});
					}
				});
				//颗粒度三
				$('#granule3').combobox({
					data : jsondata3,
					valueField : 'g3num',
					textField : 'g3',
					onSelect : function() {
						//解除锁定
						$('#granule3val').textbox({
							disabled : false
						});
					}
				});

			}

		}
	});

	/*
	 * 获取文件类型
	 */
	$('#fcd').combobox({
		url : 'reg/getFcd.do',
		valueField : 'fcd',
		textField : 'fnm',
		onSelect : function() {
			$('#fcdmsg').text(''); //清空提示信息
		}
	});

	/*
	 * 语言种类
	 */
	$('#lang').combobox({
		data : [ {
			"lang" : "中文(简体)",
			"lid" : "中文(简体)"
		}, {
			"lang" : "中文(繁体)",
			"lid" : "中文(繁体)"
		}, {
			"lang" : "英语",
			"lid" : "英语"
		}, {
			"lang" : "俄语",
			"lid" : "俄语"
		}, {
			"lang" : "德语",
			"lid" : "德语"
		}, {
			"lang" : "法语",
			"lid" : "法语"
		}, {
			"lang" : "日语",
			"lid" : "日语"
		}, {
			"lang" : "韩语",
			"lid" : "韩语"
		}, {
			"lang" : "西班牙语",
			"lid" : "西班牙语"
		}, {
			"lang" : "意大利语",
			"lid" : "意大利语"
		}, {
			"lang" : "少数民族语",
			"lid" : "少数民族语"
		}, {
			"lang" : "其他",
			"lid" : "其他"
		} ],
		valueField : 'lid',
		textField : 'lang',
		onSelect : function() {
			$('#langmsg').text(''); //清空提示信息
		}
	});

	/*
	 * 数据来源系统
	 */
	$('#syscd').combobox({
		url : 'reg/getSys.do',
		valueField : 'syscd',
		textField : 'sysnm',
		onSelect : function(parm) {
			$('#syscdmsg').text(''); //清空提示信息
			//二级来源系统
			$('#syscd2').combobox({
				url : 'reg/getChildSys.do?upsyscd=' + parm.syscd,
				valueField : 'syscd',
				textField : 'sysnm',
				onLoadSuccess : function() {
					if ('' != $('#syscd2').combobox('getData') && null != $('#syscd2').combobox('getData')) {
						$('#sys1').removeClass('granule');
						$('#sys2').removeClass('granule');
					}
					else {
						$('#sys1').addClass('granule');
						$('#sys2').addClass('granule');
					}
				}
			});
		}
	});

	/*
	 * 添加URL输入框
	 */
	var urlnum = 1;
	$('#addurl').click(function() {
		urlnum++;
		var inid = 'url' + urlnum;
		var str = '<li><p class="left" style="padding-top:4px;">' +
			'<input type="text" name=' + inid + ' id=' + inid + ' value="" style="width:76%;height:22px" /> ' +
			'<img src="plug/themes/icons/cancel.png" class="delurl" >' +
			'</p></li>';
		$('#url_ul').append($(str));
	});
	/*
	 * 删除URL输入框
	 */
	$('#url_ul').on("click", ".delurl", function() {
		$(this).parent().parent().remove();
	});


	/*
	 * 页面提交
	 */
	
	$('#regform').form({
		url:'reg/regData.do',
		onSubmit:function(){
			$('#urlnum').val(urlnum);
			var flag = formSub();
			if(!flag){
				return $(this).form('请填写信息');
			}
			return $(this).form('validate');
		},
		//成功
		success:function(data){
			alert(data);
		},
		//请求失败回调函数
		error : function() {
			alert("注册失败，请稍后再试。。。");''
		}
		
	});

	function formSub(){
		$('.msg').text(''); //清空提示信息		
		for (var i = 0; i < metas.length; i++) {
			var metaItm = metas[i];
			var itemnm = metaItm['itemnm']; //字段名
			var itemfield = metaItm['itemfield']; //字段			
			var $itemfield; //对应的值
			var mustflg = metaItm['mustflg']; //必填标志
			var inputflg = metaItm['inputflg']; //输入类型
			if (inputflg == '3') {
				$itemfield = $('#' + itemfield).combobox('getValue');
				var text = $('#' + itemfield).combobox('getText');
			}
			else {
				$itemfield = $('#' + itemfield).val().trim();
			}
			if (mustflg == '1') {
				if ($itemfield == '' || null == $itemfield || '请选择' == $itemfield) {
					if (inputflg == '3') {
						$('#' + itemfield + "msg").text('请选择' + itemnm);
					}
					else {
						$('#' + itemfield + "msg").text('请填写' + itemnm);
					}
					return false;
				}
			}
			else {
				$('#' + itemfield + "msg").text('');
			}			
		}		
		return true;
	}

});

//格式验证
$.extend($.fn.validatebox.defaults.rules, {
	 //数字  
    Number: {  
        validator: function (value) {  
            var reg =/^[0-9]*$/;  
            return reg.test(value);  
        },  
        message: '请输入指定格式，例：20161024'  
    }, 
    //验证颗粒度
    gran: {  
        validator: function (value) {  
            return /^([0-9]+,?-?[0-9]*$)+/.test(value);  
        },  
        message: '请输入指定格式，例："1,2" "1-2" "1,2-3" "1-2,3-4" '  
    },  
});


