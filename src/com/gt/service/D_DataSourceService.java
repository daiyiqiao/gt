package com.gt.service;


import java.util.Map;

import com.gt.model.Tlinksys;


public interface D_DataSourceService {

	
	/**
	 * 根据系统编号或系统名称，查询数据来源
	 * @param Map<String, String>
	 * @return Tlinksys
	 * 
	 * */
	Tlinksys getTlinksys(Map<String, String> condition);
	//public Tlinksys getTlinksys(Model<String, String> conditionModel);
	//public List<Tlinksys> getTlinksysByOrgCd(String orgCd);
}
