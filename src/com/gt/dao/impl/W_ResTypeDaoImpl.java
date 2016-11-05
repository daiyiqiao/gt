package com.gt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.W_ResTypeDao;
import com.gt.model.Tmetaitm;
import com.gt.model.Trestype;

/**
 * 资源类型表Dao层
 * 
 * @author Nebor
 *
 */
@Repository("resTypeDao")
public class W_ResTypeDaoImpl implements W_ResTypeDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	/**
	 * 获取资源类型列表
	 * 
	 */
	@Override
	public List<Trestype> geTrestypeList() {
		Session session = sessionFactory.getCurrentSession();
		//String sql = "select t.tcd,t.tnm from Trestype t where t.delflg = '0'";
		List<Trestype> resTypes = session.createQuery("from Trestype t where t.delflg = '0' order by t.tcd ").getResultList();
		return resTypes;
	}

	/**
	 * 根据资源类型编号获取查重编号
	 * 
	 */
	@Override
	public Trestype getPlancd(String tcd) {
		Session session = sessionFactory.getCurrentSession();
		List<Trestype> slist=session.createQuery("from Trestype t where t.tcd=:tcd and  t.delflg = '0'").setParameter("tcd", tcd).getResultList();		
		return slist.get(0);
	}

	
	
}
