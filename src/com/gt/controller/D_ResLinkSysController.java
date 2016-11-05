package com.gt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.gt.model.Tlinksys;
import com.gt.model.Torg;
import com.gt.service.D_ResLinkSysService;
import com.gt.util.TlinksysJson;

@Controller
@RequestMapping("/res")
public class D_ResLinkSysController {

	@Resource(name = "d_resLinkSysService")
	private D_ResLinkSysService d_resLinkSysService;

	// 条件查询
	@RequestMapping(value = "/findResLink", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String findResLink(@RequestParam String syscd, @RequestParam String sysnm) {
		//System.out.println(syscd + "-------" + sysnm);
		List<Tlinksys> tlinksysList = d_resLinkSysService.findResLink(syscd, sysnm);
		String tlinksysJson = JSON.toJSONString(tlinksysList);
		return tlinksysJson;

	}

	// 编辑
	@RequestMapping(value = "/editResSys", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String editResLink(Tlinksys tlinksys) {
		Map<String, String> mesMap = new HashMap<String, String>();
		try {
			//Torg t= ((Tuser)request.getSession().getAttribute("loginuser")).getTorg();
			Torg t = new Torg();
			t.setOrgcd("1");
		
			tlinksys.setDelflg("0");
			tlinksys.setUpdtusrid(1);
			tlinksys.setCrtusrid(1);
			tlinksys.setUpsyscd("3");
			System.out.println(tlinksys.toString());
			d_resLinkSysService.updRseSys(tlinksys);
			mesMap.put("state", "true");
		} catch (Exception e) {
			mesMap.put("state", "false");
			e.printStackTrace();
		}
		return JSON.toJSONString(mesMap);

	}

	// 添加
	@RequestMapping(value = "/addResSys", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String addResSys(Tlinksys tlinksys) {

		Map<String, String> mesMap = new HashMap<String, String>();
		
		try {
			//Torg t=((Tuser)request.getSession().getAttribute("loginuser")).getTorg();
			Torg t = new Torg();
			t.setOrgcd("1");
			
			tlinksys.setDelflg("0");
			tlinksys.setUpdtusrid(1);
			tlinksys.setCrtusrid(1);
			int resultNum = d_resLinkSysService.addRseSys(tlinksys);
			if (resultNum > 0) {
				mesMap.put("state", "true");
			}
		} catch (Exception e) {
			mesMap.put("state", "false");
			e.printStackTrace();
		}
		return JSON.toJSONString(mesMap);
	}

	// 显示数据
	@RequestMapping(value = "/resLink", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String resLink() {

		List<TlinksysJson> jsonLinksysRes = new ArrayList<TlinksysJson>();
		List<Tlinksys> allTlinksys = d_resLinkSysService.findAllLinksys();

		for (Tlinksys linkSys : allTlinksys) {
			TlinksysJson tlinksysJson = new TlinksysJson();

			String syscd = linkSys.getSyscd();
			String sysnm = linkSys.getSysnm();
		

			tlinksysJson.setSyscd(syscd);
			tlinksysJson.setSysnm(sysnm);

			jsonLinksysRes.add(tlinksysJson);
		}
		String ljson = JSON.toJSONString(jsonLinksysRes);
		//System.out.println(ljson);
		return ljson;

	}

}
