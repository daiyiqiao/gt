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
import com.gt.model.Trestype;
import com.gt.service.D_MetaDataInfoService;
import com.gt.service.D_ResTypeInfoService;
import com.gt.util.TmetaitmJson;
import com.gt.util.TrestypeJson;

@Controller
@RequestMapping("/resType")
public class D_ResTypeController {

	@Resource(name = "d_resTypeInfoService")
	private D_ResTypeInfoService d_resTypeInfoService;

	@RequestMapping(value = "/resTypeInfo", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String metaDataInfo() {

		List<TrestypeJson> trestypeJsonRes = new ArrayList<TrestypeJson>();
		List<Trestype> allTrestype = d_resTypeInfoService.findAllResType();

		for (Trestype trestype : allTrestype) {
			TrestypeJson trestypeJson = new TrestypeJson();

			String tcd = trestype.getTcd();
			String tnm = trestype.getTnm();

			trestypeJson.setTcd(tcd);
			trestypeJson.setTnm(tnm);

			trestypeJsonRes.add(trestypeJson);

		}
		String tjson = JSON.toJSONString(trestypeJsonRes);
		System.out.println();
		System.out.println(tjson);
		return tjson;

	}

}
