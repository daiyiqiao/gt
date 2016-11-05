package com.gt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.gt.model.Tmetadata;
import com.gt.model.Torg;
import com.gt.service.W_CDOIService;
import com.gt.service.W_OrgInfoService;
import com.gt.util.D_MessageState;

/**
 * 机构唯一标示符解析模块控制层类
 * @author Nebor
 *
 */
@Controller
@RequestMapping("/CDOI")
public class W_CDOIController {

	
	
	/**
	 * 唯一标识符解析服务层
	 */
	@Resource(name = "cdoiService")
	private W_CDOIService cdoiService ;
	
	/**
	 * 机构信息服务层
	 */
	@Resource(name = "orgService")
	private W_OrgInfoService orgService;

	/**
	 * 正向解析
	 * 
	 * @param cdoiCd 唯一标识符
	 * @return
	 */
	@RequestMapping("/analysis")
	public D_MessageState analysis(String cdoiCd){
		Tmetadata metaData = cdoiService.geTmetadata(cdoiCd);//获取元数据实体
		String jsonString;
		D_MessageState rtnMS = new D_MessageState();//返回对象实体
		if(metaData==null){
			rtnMS.setStatus(false);
			rtnMS.setMessage("元数据不存在");
			return rtnMS;
		}
		jsonString = JSON.toJSONString(metaData);//转为json字符串
		rtnMS.setStatus(true);
		rtnMS.setMessage(jsonString);
		return rtnMS;
	}
	
	/**
	 * 逆向解析
	 * @return
	 */
	@RequestMapping("/reverseAnalysis")
	public D_MessageState reverseAnalysis(){
		D_MessageState rtnMS  = new D_MessageState();//返回对象实体
		
		return rtnMS;
	}
	
	/**
	 * 根据机构编号获取机构信息
	 * 
	 * @param orgCd
	 * @return
	 */
	@RequestMapping("/orgInfo")
	public D_MessageState geTorgInfo(String orgCd){
		D_MessageState rtnMS = new D_MessageState();//返回对象实体
		Torg org = orgService.geTorgInfo(orgCd);
		if(org == null){
			rtnMS.setStatus(false);
			rtnMS.setMessage("机构编号不存在");
			return rtnMS;
		}
		String jsonString = JSON.toJSONString(org);
		rtnMS.setStatus(true);
		rtnMS.setMessage(jsonString);
		return rtnMS;
	}
}
