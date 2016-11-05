package com.gt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.W_ChkPlanItmDao;
import com.gt.model.Tchkplanitm;

/**
 * 
 * 查重规则/元数据属性项Dao层
 * 
 * @author Nebor
 *
 */
@Repository("chkplanitmDao")
public class W_ChkPlanItmDaoImpl implements W_ChkPlanItmDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	/**
	 * 根据查重编号获取权重查重项
	 * 
	 * @param plancd
	 * @return
	 */
	@Override
	public List<Tchkplanitm> getImpPlan(int plancd) {
		Session session = sessionFactory.getCurrentSession();
		List<Tchkplanitm> resTypes = session.createQuery("from Tchkplanitm t where t.plancd = :plancd and t.chkweight='1' order by t.tmetaitm.metaitemno ").setParameter("plancd", plancd).getResultList();
		return resTypes;
	}
	
	/**
	 * 根据查重编号获取一般查重项
	 * @param plancd
	 * @return
	 */
	public List<Tchkplanitm> getNorPlan(int plancd){
		Session session = sessionFactory.getCurrentSession();
		List<Tchkplanitm> resTypes = session.createQuery("from Tchkplanitm t where t.plancd = :plancd and t.chkweight='2' order by t.tmetaitm.metaitemno ").setParameter("plancd", plancd).getResultList();
		return resTypes;
	}
}
