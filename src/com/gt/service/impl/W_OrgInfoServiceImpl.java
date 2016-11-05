package com.gt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gt.dao.W_OrgInfoDao;
import com.gt.model.Torg;
import com.gt.service.W_OrgInfoService;
/**
 * 机构信息服务层
 * 
 * @author Nebor
 *
 */
@Service("orgService")
public class W_OrgInfoServiceImpl implements W_OrgInfoService {

	@Resource(name="orgDao")
	private W_OrgInfoDao orgDao;
	
	/**
	 * 根据机构代码查询机构信息
	 * 
	 */
	@Override
	public Torg geTorgInfo(String orgCd) {
		
		return orgDao.geTorgInfo(orgCd);
	}

}
