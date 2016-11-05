package com.gt.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.D_DataSourceDao;
import com.gt.model.Tlinksys;

@Repository("d_dataSourceDao")
public class D_DataSourceDaoImpl implements D_DataSourceDao {
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	// 根据系统编号或系统名称查询数据来源
	@Override
	public Tlinksys getTlinksys(Map<String, String> condition) {
		Session session = sessionFactory.getCurrentSession();
		// 数据来源编号
		String sysCd = condition.get("sysCd");
		// 数据来源名称
		String sysNm = condition.get("sysNm");

		Tlinksys tls = null;
		// 判断查询字段
		// 数据来源编号和数据来源名称均不为空
		if (StringUtils.isNotBlank(sysCd) && StringUtils.isNotBlank(sysNm)) {

			tls = (Tlinksys) session.createQuery("from Tlinksys tls where tls.id.sysCd = :sysCd and tls.sysNm =:sysNm")
					.setParameter("sysCd", sysCd).setParameter("sysNm", sysNm).getSingleResult();

		}
		// 数据来源编号不空,根据编号查
		if (StringUtils.isNotBlank(sysCd)) {

			tls = (Tlinksys) session.createQuery("from Tlinksys tls where tls.id.sysCd = :sysCd")
					.setParameter("sysCd", sysCd).getSingleResult();

		}

		// 数据来源名称不空,编号为空,根据名称查
		if (StringUtils.isNotBlank(sysNm) && StringUtils.isBlank(sysCd)) {

			tls = (Tlinksys) session.createQuery("from Tlinksys tls where tls.sysNm =:sysNm")
					.setParameter("sysNm", sysNm).getSingleResult();

		}

		// 数据来源编号和数据来源名称均为空
		if (StringUtils.isBlank(sysNm) || StringUtils.isBlank(sysNm)) {

			return null;
		}
		return tls;
	}

	// 根据机构编号查询数据来源
	@Override
	public List<Tlinksys> getTlinksysByOrgCd(String orgCd) {
		Session session = sessionFactory.getCurrentSession();
		List<Tlinksys> tlsList = session
				.createQuery("from Tlinksys tls where tls.upsyscd = :orgCd and tls.delflg = '0' order by tls.syscd")
				.setParameter("orgCd", orgCd).getResultList();
		return tlsList;
	}

	/**
	 * 根据父级系统编码查询子级数据来源系统列表
	 * 
	 * @param syscd
	 * @return
	 */
	@Override
	public List<Tlinksys> getChildTlinksys(String upsyscd) {
		Session session = sessionFactory.getCurrentSession();
		List<Tlinksys> tlsList = session
				.createQuery("from Tlinksys tls where tls.upsyscd = :upsyscd and tls.delflg = '0' order by tls.syscd")
				.setParameter("upsyscd", upsyscd).getResultList();
		return tlsList;
	}

}
