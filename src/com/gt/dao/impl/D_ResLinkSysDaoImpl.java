package com.gt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.D_ResLinkSysDao;
import com.gt.model.Tlinksys;
import com.gt.model.Tuser;

@SuppressWarnings("unchecked")
@Repository("d_resLinkSysDao")
public class D_ResLinkSysDaoImpl implements D_ResLinkSysDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	// 查询所有
	@Override
	public List<Tlinksys> findAllLinksys() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Tlinksys").getResultList();
	}

	// 条件查询
	@Override
	public List<Tlinksys> findResLink(String syscd, String sysnm) {
		Session session = sessionFactory.getCurrentSession();
		List<Tlinksys> tuserlist = (List<Tlinksys>) session
				.createQuery("from Tlinksys ls where ls.syscd like :syscd and ls.sysnm like :sysnm")
				.setParameter("syscd", "%" + syscd + "%").setParameter("sysnm", "%" + sysnm + "%").getResultList();
		return tuserlist;
	}

	// 添加
	@Override
	public int addRseSys(Tlinksys tlinksys) {
		Session session = sessionFactory.getCurrentSession();
		String sysnm = tlinksys.getSysnm();
		List<Tuser> tuserlist = session.createQuery("from Tlinksys lk where lk.sysnm = :sysnm ")
				.setParameter("sysnm", sysnm).getResultList();
		int resultNum = 0;
		if (tuserlist == null || tuserlist.size() == 0) {

			try {
				session.save(tlinksys);
				resultNum = 1;
			} catch (Exception e) {
				resultNum = 0;
				e.printStackTrace();
			}
		}
		return resultNum;
	}

	// 修改
	@Override
	public void updRseSys(Tlinksys tlinksys) {
		Session session = sessionFactory.getCurrentSession();
		String sysnm = tlinksys.getSysnm();
		List<Tuser> tuserlist = session.createQuery("from Tlinksys lk where lk.sysnm = :sysnm ")
				.setParameter("sysnm", sysnm).getResultList();
		if (tuserlist == null || tuserlist.size() == 0) {
			session.saveOrUpdate(tlinksys);
		}

	}

}
