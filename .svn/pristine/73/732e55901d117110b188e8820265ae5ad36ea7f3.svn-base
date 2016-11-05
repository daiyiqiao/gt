package com.gt.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gt.dao.D_DataSourceDao;
import com.gt.model.Tlinksys;
import com.gt.service.D_DataSourceService;

@Service("d_dataSourceService")
public class D_DataSourceServiceImpl implements D_DataSourceService {
	@Resource(name = "d_dataSourceDao")
	private D_DataSourceDao d_dataSourceDao;

	@Override
	public Tlinksys getTlinksys(Map<String, String> condition) {
		return d_dataSourceDao.getTlinksys(condition);
	}


}
