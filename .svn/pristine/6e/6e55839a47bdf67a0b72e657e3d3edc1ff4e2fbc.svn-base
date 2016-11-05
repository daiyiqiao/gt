package com.gt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.gt.model.Tmetaitm;
import com.gt.service.D_MetaDataInfoService;
import com.gt.util.TmetaitmJson;

@Controller
@RequestMapping("/meta")
public class D_MetaDataInfoController {

	@Resource(name = "d_metaDataInfoService")
	private D_MetaDataInfoService d_metaDataInfoService;

	@RequestMapping(value = "/metaDataInfo", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String metaDataInfo() {

		List<TmetaitmJson> tmetaitmJsonRes = new ArrayList<TmetaitmJson>();
		List<Tmetaitm> allTmetaitm = d_metaDataInfoService.findAllMetaData();

		for (Tmetaitm tmetaitm : allTmetaitm) {
			TmetaitmJson tmetaitmJson = new TmetaitmJson();

			Integer metaitemno = tmetaitm.getMetaitemno();
			String itemnm = tmetaitm.getItemnm();
			String useflg = tmetaitm.getUseflg();
			String mustflg = tmetaitm.getMustflg();

			tmetaitmJson.setItemnm(itemnm);
			tmetaitmJson.setMetaitemno(metaitemno);
			tmetaitmJson.setUseflg(useflg);
			tmetaitmJson.setMustflg(mustflg);

			tmetaitmJsonRes.add(tmetaitmJson);
		}
		String mjson = JSON.toJSONString(tmetaitmJsonRes);
		System.out.println(mjson);
		return mjson;

	}

}
