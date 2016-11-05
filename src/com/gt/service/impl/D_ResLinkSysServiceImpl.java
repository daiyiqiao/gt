package com.gt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gt.dao.D_ResLinkSysDao;
import com.gt.model.Tlinksys;
import com.gt.service.D_ResLinkSysService;

@Service("d_resLinkSysService")
public class D_ResLinkSysServiceImpl implements D_ResLinkSysService {
	@Resource(name = "d_resLinkSysDao")
	private D_ResLinkSysDao d_resLinkSysDao;

	//查询所有
	@Override
	public List<Tlinksys> findAllLinksys() {
		return d_resLinkSysDao.findAllLinksys();
	}
	//条件查询
	@Override
	public List<Tlinksys> findResLink(String syscd, String sysnm) {
		
		return d_resLinkSysDao.findResLink(syscd,sysnm);
	}

	//添加
	@Override
	public int addRseSys(Tlinksys tlinksys) {
		return d_resLinkSysDao.addRseSys(tlinksys);
	}

	//修改
	@Override
	public void updRseSys(Tlinksys tlinksys) {
		d_resLinkSysDao.updRseSys(tlinksys);
		
	}

	
}
