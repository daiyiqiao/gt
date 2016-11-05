package com.gt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.W_MetaItmDao;
import com.gt.model.Tmetaitm;

/**
 * 元数据属性项Dao层
 * 
 * @author Nebor
 *
 */
@Repository("metaItmDao")
public class W_MetaItmDaoImpl implements W_MetaItmDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	/**
	 * 获取元数据属性列表
	 * 
	 */
	@Override
	public List<Tmetaitm> geTmetaitmsList() {
		Session session = sessionFactory.getCurrentSession();
		List<Tmetaitm> metaItms = session.createQuery("from Tmetaitm order by metaitemno ")
				.getResultList();

		return metaItms;
	}

}
