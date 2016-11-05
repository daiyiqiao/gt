package com.gt.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.W_OrgInfoDao;
import com.gt.model.Torg;

/**
 * 机构信息类Dao层
 * 
 * @author Nebor
 *
 */
@Repository("orgDao")
public class W_OrgInfoDaoImpl implements W_OrgInfoDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	/**
	 * 根据机构代码查询机构信息
	 * 
	 */
	@Override
	public Torg geTorgInfo(String orgcd) {
		Session session = sessionFactory.getCurrentSession();
		Torg org = (Torg) session.createQuery("from Torg t where t.orgcd = :orgcd and delflg = '0'").setParameter("orgcd", orgcd)
				.getSingleResult();
		return org;
	}

}
