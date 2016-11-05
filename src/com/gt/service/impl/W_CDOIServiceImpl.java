package com.gt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.gt.controller.HttpRequestor;
import com.gt.dao.W_MetaDataDao;
import com.gt.model.Tmetadata;
import com.gt.service.W_CDOIService;
import com.gt.util.Constants;

/**
 * CDOI解析服务层
 * 
 * @author Nebor
 *
 */
@Service("cdoiService")
public class W_CDOIServiceImpl implements W_CDOIService {

	@Resource(name = "metaDataDao")
	private W_MetaDataDao metaDataDao;


	/**
	 * 根据唯一标识符查询URL信息
	 * 
	 */
	@Override
	public Tmetadata geTmetadata(String cdoiCd) {
		// cdoiCd格式检验（前端校验）
		Tmetadata metaData = metaDataDao.geTmetadata(cdoiCd);// 根据cdoi查询元数据
		if (metaData != null) {
			return metaData;
		} else {
			// 本地数据库没有对应url信息，到中心节点查询；发送网络请求
			String jsonMetaData = HttpRequestor.sendPost(Constants.ANALYSIS_URL, cdoiCd);
			metaData = JSON.parseObject(jsonMetaData, Tmetadata.class);
			if(metaData!=null){
				return metaData;
			}else{
				//没有对应数据：元数据不存在
				return null;
			}
		}

	}

}
