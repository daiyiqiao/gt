package com.gt.service;

import java.util.List;
import java.util.Map;

import com.gt.model.Tchkplanitm;
import com.gt.model.Tmetadata;
import com.gt.model.Torg;

public interface W_MetaRegService {


	/**
	 * 动态加载注册页面信息_获取元属性列表
	 * 
	 */
	public String getMetaItm();
	
	/**
	 * 获取文件类型
	 * @return
	 */
	public String getFcds();
	
	/**
	 * 获取资源种类
	 * @return
	 */
	public String getTcds();
	
	/**
	 * 获取默认数据来源系统列表
	 * @return
	 */
	public String getSyscd(String orgcd);
	
	/**
	 * 根据父级来源编码获取子级数据来源系统列表
	 * @return
	 */
	public String getChildSyscd(String syscd);
	
	/**
	 * 批量保存元数据
	 * 
	 * @param metaDatas 元数据实体集合
	 * 
	 */
	public void saveMetaDatas(List<Tmetadata> metaDatas);
	
	/**
	 * 获取必填标示
	 * 
	 * @return
	 */
	public Map<String, String> getMustFlg();
	
	/**
	 * 根据资源类型获取权重查重项
	 * @param tcd
	 * @return
	 */
	public List<Tchkplanitm> getImpPlan(String tcd);
	
	/**
	 * 根据资源类型获取一般查重项
	 * @param tcd
	 * @return
	 */
	public Map<String, Object> getNorPlan(String tcd);
	
	/**
	 * 根据权重字段查询重复元数据
	 * @param impPlan
	 * @return
	 */
	public List<Tmetadata> srchWeightItem(List<Tchkplanitm> impPlan,Tmetadata data);
	
	/**
	 * 获取机构信息和服务器信息
	 * @param orgcd
	 * @return
	 */
	public Torg getTorg(String orgcd);
}
