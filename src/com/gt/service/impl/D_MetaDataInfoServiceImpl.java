package com.gt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gt.dao.D_MetaDataInfoDao;
import com.gt.model.Tmetaitm;
import com.gt.service.D_MetaDataInfoService;
@Service("d_metaDataInfoService")
public class D_MetaDataInfoServiceImpl implements D_MetaDataInfoService {

	@Resource(name="d_metaDataInfoDao")
	private D_MetaDataInfoDao d_metaDataInfoDao;
	@Override
	public List<Tmetaitm> findAllMetaData() {
		return d_metaDataInfoDao.findAllMetaData();
	}

}
