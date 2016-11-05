package com.gt.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.W_CdoiStructDao;
import com.gt.model.Tcdoistruct;

/**
 * 服务节点类Dao层
 * 
 * @author Nebor
 *
 */
@Repository("cdoiStructDao")
public class W_CdoiStructDaoImpl implements W_CdoiStructDao {

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	/**
	 * 根据服务器编号获取服务节点信息
	 */
	@Override
	public Tcdoistruct geTcdoistruct(String serCd) {
		Session session = sessionFactory.getCurrentSession();
		Tcdoistruct cdoiStruct= (Tcdoistruct) session.createQuery("from Tcdoistruct where sercd=:sercd").setParameter("sercd", serCd).getSingleResult();
		
		return cdoiStruct;
	}

}
