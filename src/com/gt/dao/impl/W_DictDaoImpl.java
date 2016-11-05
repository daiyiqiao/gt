package com.gt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.W_DictDao;
import com.gt.model.Tdict;
import com.gt.model.Trestype;

/**
 * 术语表Dao层
 * 
 * @author Nebor
 *
 */
@Repository("dictDao")
public class W_DictDaoImpl implements W_DictDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	/**
	 * 获取术语列表
	 * 
	 */
	@Override
	public List<Tdict> getLangList() {
		Session session = sessionFactory.getCurrentSession();
		List<Tdict> dicts = session.createQuery("from Tdict where dictcield = 'LANG' order by dictcd ").getResultList();
		return dicts;
	}

}
