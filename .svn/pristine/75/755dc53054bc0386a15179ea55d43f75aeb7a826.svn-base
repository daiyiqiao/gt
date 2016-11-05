package com.gt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.D_MetaDataInfoDao;
import com.gt.model.Tmetaitm;

@Repository("d_metaDataInfoDao")
public class D_MetaDataInfoDaoImpl implements D_MetaDataInfoDao {

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<Tmetaitm> findAllMetaData() {
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Tmetaitm").getResultList();
	}

}
