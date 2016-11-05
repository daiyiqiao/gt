package com.gt.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.gt.dao.D_DataSourceDao;
import com.gt.dao.W_ChkPlanItmDao;
import com.gt.dao.W_FileFormatDao;
import com.gt.dao.W_MetaDataDao;
import com.gt.dao.W_MetaItmDao;
import com.gt.dao.W_OrgInfoDao;
import com.gt.dao.W_ResTypeDao;
import com.gt.model.Tchkplanitm;
import com.gt.model.Tfileformat;
import com.gt.model.Tlinksys;
import com.gt.model.Tmetadata;
import com.gt.model.Tmetaitm;
import com.gt.model.Torg;
import com.gt.model.Trestype;

/**
 * 元数据注册服务层
 * 
 * @author Nebor
 *
 */
/**
 * @author Nebor
 *
 */
@Service("metaRegService")
public class W_MetaRegServiceImpl implements com.gt.service.W_MetaRegService {

	/**
	 * 元数据数据层
	 */
	@Resource(name = "metaDataDao")
	private W_MetaDataDao metaDataDao;

	/**
	 * 元数据属性项数据层
	 */
	@Resource(name = "metaItmDao")
	private W_MetaItmDao metaItmDao;

	/**
	 * 文件格式数据层
	 */
	@Resource(name = "fileFormatDao")
	private W_FileFormatDao fileFormatDao;
	/**
	 * 资源列表数据层
	 */
	@Resource(name = "resTypeDao")
	private W_ResTypeDao resTypeDao;

	/**
	 * 数据来源列表数据层
	 */
	@Resource(name = "d_dataSourceDao")
	private D_DataSourceDao dataSourceDao;

	/**
	 * 查重元数据表数据层
	 */
	@Resource(name = "chkplanitmDao")
	private W_ChkPlanItmDao chkplanitmDao;
	
	/**
	 * 机构表数据层
	 */
	@Resource(name = "orgDao")
	private W_OrgInfoDao orgDao;
	
	/**
	 * 动态加载注册页面信息_获取元属性列表
	 * 
	 */
	@Override
	public String getMetaItm() {
		// 获取元数据属性列表
		List<Tmetaitm> metaItms = metaItmDao.geTmetaitmsList();
		String jsonString = JSON.toJSONString(metaItms);
		return jsonString;
	}

	/**
	 * 获取文件类型
	 * 
	 * @return
	 */
	@Override
	public String getFcds() {
		// 获取文件格式列表
		List<Tfileformat> fileFormats = fileFormatDao.geTfileformatList();
		String jsonString = JSON.toJSONString(fileFormats, true);
		return jsonString;
	}

	/**
	 * 获取资源种类
	 * 
	 * @return
	 */
	@Override
	public String getTcds() {
		// 获取资源种类列表
		List<Trestype> resTypes = resTypeDao.geTrestypeList();
		String jsonString = JSON.toJSONString(resTypes);
		return jsonString;
	}

	/**
	 * 获取默认数据来源系统列表
	 * 
	 * @return
	 */
	@Override
	public String getSyscd(String orgcd) {
		List<Tlinksys> linkSyses = dataSourceDao.getTlinksysByOrgCd(orgcd);
		String jsonString = JSON.toJSONString(linkSyses);

		return jsonString;
	}

	/**
	 * 根据父级来源编码获取子级数据来源系统列表
	 * 
	 * @return
	 */
	@Override
	public String getChildSyscd(String syscd) {
		List<Tlinksys> linkSyses = dataSourceDao.getChildTlinksys(syscd);
		String jsonString = JSON.toJSONString(linkSyses);
		if (StringUtils.isBlank(jsonString)) {
			jsonString = null;
		}
		return jsonString;
	}

	/**
	 * 批量保存元数据
	 * 
	 * @param metaDatas
	 *            元数据实体集合
	 * 
	 */
	@Override
	public void saveMetaDatas(List<Tmetadata> metaDatas) {

		metaDataDao.saveMetaDatas(metaDatas);
	}

	/**
	 * 获取必填标识
	 * 
	 * @return
	 */
	@Override
	public Map<String, String> getMustFlg() {
		Map<String, String> mustflg = new HashMap<String, String>();
		// 获取元数据属性列表
		List<Tmetaitm> metaItms = metaItmDao.geTmetaitmsList();
		for (Tmetaitm itm : metaItms) {
			mustflg.put(itm.getItemfield(), itm.getMustflg());
		}
		return mustflg;
	}

	/**
	 * 根据资源类型获取权重查重项
	 * 
	 * @param tcd
	 * @return
	 */
	@Override
	public List<Tchkplanitm> getImpPlan(String tcd) {
		Trestype type = resTypeDao.getPlancd(tcd);// 获取查重编号信息
		if (null != type && type.getTchkplan().getPlancd() != null){
			List<Tchkplanitm> resTypes = chkplanitmDao.getImpPlan(type.getTchkplan().getPlancd());
			return resTypes;
		}
		return null;
	}

	/**
	 * 根据资源类型获取一般查重项
	 * 
	 * @param tcd
	 * @return
	 */
	@Override
	public Map<String, Object> getNorPlan(String tcd) {
		Trestype type = resTypeDao.getPlancd(tcd);// 获取查重编号和重复次数信息
		if (null != type && type.getTchkplan().getPlancd() != null) {
			List<Tchkplanitm> resTypes = chkplanitmDao.getNorPlan(type.getTchkplan().getPlancd());// 获取一般查重项
			if (null != resTypes && resTypes.size() > 0 && type.getTchkplan().getRepeatnum()>0) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("norPlan", resTypes);
				map.put("num", type.getTchkplan().getRepeatnum());
				return map;
			}
		}
		return null;
	}

	/**
	 * 根据权重字段查询重复元数据
	 * @param impPlan
	 * @return
	 */
	public List<Tmetadata> srchWeightItem(List<Tchkplanitm> impPlan,Tmetadata data){
		
		return null;
	}
	
	/**
	 * 获取机构信息和服务器信息
	 * @param orgcd
	 * @return
	 */
	public Torg getTorg(String orgcd){
		Torg org = orgDao.geTorgInfo(orgcd);
		return null;
		
	}
}
