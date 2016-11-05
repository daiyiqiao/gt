package com.gt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.gt.model.Tfileformat;
import com.gt.service.D_FileFormatInfoService;
import com.gt.util.TfileformatJson;

@Controller
@RequestMapping("/file")
public class D_FileFormatInfoController {

	@Resource(name = "d_fileFormatInfoService")
	private D_FileFormatInfoService d_fileFormatInfoService;

	@RequestMapping(value = "/fileInfo", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String fileInfo() {
		
		List<TfileformatJson> fileformatJsonRes = new ArrayList<TfileformatJson>();

		List<Tfileformat> allFileFormat = d_fileFormatInfoService.findAllFileFormat();
		for (Tfileformat fileformats : allFileFormat) {
			TfileformatJson fileformatJson = new TfileformatJson();

			String fcd = fileformats.getFcd();
			String fnm = fileformats.getFnm();

			fileformatJson.setFcd(fcd);
			fileformatJson.setFnm(fnm);

			fileformatJsonRes.add(fileformatJson);
		}

		String fjson = JSON.toJSONString(fileformatJsonRes);
		System.out.println(fjson);
		return fjson;

	}

}
