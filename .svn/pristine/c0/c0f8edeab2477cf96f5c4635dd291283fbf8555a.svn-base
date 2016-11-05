package com.gt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.gt.model.Tchkplanitm;
import com.gt.model.Tmetadata;
import com.gt.model.Tmetadataurl;
import com.gt.model.Tuser;
import com.gt.service.W_MetaRegService;
import com.gt.util.D_MessageState;
import com.gt.util.FormatValidata;

/**
 * 机构唯一标示符注册模块控制层类
 * 
 * @author Nebor
 *
 */
@Controller
@RequestMapping(value = "/reg", produces = "application/json; charset=utf-8")
public class W_MetaRegController {

	@Autowired
	private HttpServletRequest request;

	/**
	 * 元数据注册服务层
	 */
	@Resource(name = "metaRegService")
	private W_MetaRegService metaRegService;

	/**
	 * 加载注册页面属性项
	 * 
	 * @return 元数据属性项
	 */
	@RequestMapping("/loadAttr")
	@ResponseBody
	public String metaReg() {
		String jsonString = metaRegService.getMetaItm();
		return jsonString;
	}

	/**
	 * 加载文件格式列表
	 * 
	 * @return 文件格式列表
	 */
	@RequestMapping("/getFcd")
	@ResponseBody
	public String getFcds() {
		String jsonString = metaRegService.getFcds();
		return jsonString;
	}

	/**
	 * 加载资源类型列表
	 * 
	 * @return 资源类型列表
	 */
	@RequestMapping("/getTcd")
	@ResponseBody
	public String getTcds() {
		String jsonString = metaRegService.getTcds();
		return jsonString;
	}

	/**
	 * 加载默认数据来源系统列表
	 * 
	 * @return 数据来源系统列表
	 */
	@RequestMapping("/getSys")
	@ResponseBody
	public String getSys() {
		// 获取机构编码
		// String orgCd = FormatValidata.checkReg(request,"orgCd");
		String orgcd = "1100009031010001";
		String jsonString = metaRegService.getSyscd(orgcd);
		return jsonString;
	}

	/**
	 * 加载子级数据来源系统列表
	 * 
	 * @return 子级数据来源系统列表
	 */
	@RequestMapping("/getChildSys")
	@ResponseBody
	public String getChildSys(String upsyscd) {
		String jsonString = metaRegService.getChildSyscd(upsyscd);
		return jsonString;
	}

	/**
	 * 批量保存元数据
	 * 
	 * @return
	 */
	@RequestMapping("/saveDatas")
	public String saveMetaDatas() {
		HttpSession session = request.getSession();
		String jsonString = (String) session.getAttribute("list");
		List<Tmetadata> metaDatas = JSON.parseArray(jsonString, Tmetadata.class);
		metaRegService.saveMetaDatas(metaDatas);
		return "hello";
	}

	
	/**
	 * 注册元数据
	 * 
	 * @return
	 */
	@RequestMapping("/regData")
	@ResponseBody
	public D_MessageState saveMetaData(Tmetadata data) {
		D_MessageState rtn = new D_MessageState();//返回实体
		String message = null;//返回信息
		boolean state = false;//状态
		StringBuffer CDOI = new StringBuffer();
		data = FormatValidata.formatTmetadata(request, data);//特殊字段格式处理			
		Map<String, String> mustflg = metaRegService.getMustFlg();//必填标识集合
/***********************************************************************************/
		String errMsg = FormatValidata.isValidate(data,mustflg);//格式验证		
		if(StringUtils.isBlank(errMsg)){
			//格式检验正确,权重项查重处理
			//TODO
			
			
			
			
			
			
		}else{
			//格式检验错误信息
			message = errMsg;
			state = false;
		}
/***********************************************************************************/		
		if(true){//无重复数据，生成唯一标识符，保存数据
			Tuser user = (Tuser)request.getAttribute("user");//获取用户对象
			String orgcd = user.getTorg().getOrgcd();
			
			CDOI.append("108.ndlc.");
			CDOI.append("");
			message = "已生成唯一标识符";
			state = true;
		}
		
		
		
		if(state){//保存URL信息
			String url1 = FormatValidata.checkReg(request, "url1");
			String num = FormatValidata.checkReg(request, "urlnum");
			Integer urlnum = 1;
			if (null!=num && NumberUtils.isNumber(num)) {
				urlnum = Integer.parseInt(num);
			}
			if (urlnum == 1) {// URL数据量
				if (null != url1) {// 非空
					Tmetadataurl metaUrl = new Tmetadataurl();
					metaUrl.setCrturl(url1);
					// TODO
				}

			} else {
				List<Tmetadataurl> urlList = new ArrayList<Tmetadataurl>();
				for (int i = 1; i <= urlnum; i++) {
					Tmetadataurl metaUrl = new Tmetadataurl();
					String url = FormatValidata.checkReg(request, "url" + i);
					if (StringUtils.isNotBlank(url)) {
						metaUrl.setCrturl(url);
						// TODO
						urlList.add(metaUrl);
					}

				}

			}
		}
		
		
		rtn.setMessage(message);
		rtn.setStatus(state);
		return rtn;
	}
}
