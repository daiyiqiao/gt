package com.gt.service;

import java.util.List;

import com.gt.model.Tlinksys;

public interface D_ResLinkSysService {

	// 查詢
	public List<Tlinksys> findAllLinksys();

	// 条件查询
	public List<Tlinksys> findResLink(String syscd, String sysnm);

	// 添加
	public int addRseSys(Tlinksys tlinksys);

	// 更新
	public void updRseSys(Tlinksys tlinksys);

}
