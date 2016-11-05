package com.gt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.D_ResTypeInfoDao;
import com.gt.model.Trestype;

@Repository("d_resTypeInfoDao")
public class D_ResTypeInfoDaoImpl implements D_ResTypeInfoDao{
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public List<Trestype> findAllResType() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Trestype rt order by rt.tcd").getResultList();
	}

}
