package com.gt.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.gt.dao.W_MetaDataDao;
import com.gt.model.Tmetadata;
/**
 * 元数据类Dao层
 * 
 * @author Nebor
 *
 */
@Repository("metaDataDao")
public class W_MetaDataDaoImpl implements W_MetaDataDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	
	/**
	 * 根据唯一标识符获取元数据
	 */
	@Override
	public Tmetadata geTmetadata(String cdoiCd) {
		Session session = sessionFactory.getCurrentSession();
		Tmetadata metaData = (Tmetadata) session.createQuery("from Tmetadata t where t.cdoicd=:cdoicd and t.delflg = '0' ").setParameter("cdoicd", cdoiCd).getSingleResult();
		return metaData;
	}
	
	/**
	 * 根据页面选择的参数模糊查询对应的元数据
	 * 
	 * @param map 参数集合
	 * @return 元数据集合
	 */
	@Override
	public List<Tmetadata> geTmetadatas(Map<String, String> map){
		Session session = sessionFactory.getCurrentSession();
		DetachedCriteria dc = DetachedCriteria.forClass(Tmetadata.class);
		if(map.get("cdoiCd")!=null){
			dc.add(Restrictions.eq("cdoiCd" , map.get("cdoiCd"))); 
		}
		if(map.get("sysCd")!=null){
			dc.add(Restrictions.eq("sysCd" , map.get("sysCd"))); 
		}
		if(map.get("linkSys")!=null){
			dc.add(Restrictions.eq("linkSys" , map.get("linkSys"))); 
		}
		
		
		Criteria cri = dc.getExecutableCriteria(session);
		List<Tmetadata> metaDatas = cri.list();
		return metaDatas;
	}

	/**
	 * 批量保存元数据
	 * 
	 * @param  元数据集合
	 * @return 成功数量
	 */
	@Override
	public int saveMetaDatas(List<Tmetadata> metaDatas) {
		Session session = sessionFactory.getCurrentSession();
		for(Tmetadata metaData:metaDatas){
			session.save(metaData);
		}
		return 0;
	}
}
