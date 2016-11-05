package com.gt.dao;

import java.util.List;
import java.util.Map;
import com.gt.model.Tlinksys;

public interface D_DataSourceDao {
	/**
	 * 根据机构系统编号，查询默认数据来源系统
	 * @param orgCd 机构代码
	 * @return List<Tlinksys> 数据来源集合
	 * */
	public List<Tlinksys> getTlinksysByOrgCd(String orgCd);

	/**
	 * 根据系统编号或系统名称，查询数据来源
	 * @param Map<String, String>
	 * @return Tlinksys
	 * */
	public Tlinksys getTlinksys(Map<String, String> condition);
	
	/**
	 * 根据父级系统编码查询子级数据来源系统列表
	 * @param syscd
	 * @return
	 */
	public List<Tlinksys> getChildTlinksys(String syscd);
}
