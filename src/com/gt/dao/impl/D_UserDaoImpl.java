package com.gt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.gt.dao.D_UserDao;
import com.gt.model.Tuser;
import com.gt.util.D_MessageState;

@SuppressWarnings("unchecked")
@Repository("d_userDao")
public class D_UserDaoImpl extends HibernateDaoSupport implements D_UserDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@Resource
	public void setsessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	// @Resource(name="d_messageState")
	private D_MessageState d_messageState = null;


	// 查询所有用户
	@Override
	public List<Tuser> getAllUser() {
		Session session = sessionFactory.getCurrentSession();

		List<Tuser> list = session.createQuery("from Tuser").getResultList();

		return list;
	}

	// 根据机构id查询用户
	@Override
	public List<Tuser> getAllUser(String orgcd) {
		Session session = sessionFactory.getCurrentSession();
		// TODO 根据机构id查询用户
		List<Tuser> list = session.createQuery("from Tuser u where u.torg.orgcd : orgcd")
				.setParameter("orgcd", orgcd).getResultList();
		return list;
	}

	// 添加用户
	@Override
	public int addUser(Tuser tuser) {
		Session session = sessionFactory.getCurrentSession();

		String loginid = tuser.getLoginid();
		String loginPwd = tuser.getLoginpwd();
		// 先查判断用户存不存在
		// 根据用户名和密码确定唯一用户
		List<Tuser> tuserlist = session
				.createQuery("from Tuser user where user.loginid = :loginid and user.loginpwd = :loginPwd")
				.setParameter("loginid", loginid).setParameter("loginPwd", loginPwd).getResultList();
		if (tuserlist == null || tuserlist.size() == 0) {
			int resultNum = (int) session.save(tuser);
			return resultNum;
		}
		return 0;
	}

	// 用户编辑修改
	@Override
	public void updTuser(Tuser tuser) {
		Session session = sessionFactory.getCurrentSession();

		String loginid = tuser.getLoginid();
		String loginPwd = tuser.getLoginpwd();
		List<Tuser> tuserlist = session
				.createQuery("from Tuser user where user.loginid = :loginid and user.loginpwd = :loginPwd")
				.setParameter("loginid", loginid).setParameter("loginPwd", loginPwd).getResultList();
		if (tuserlist == null || tuserlist.size() == 0) {
			session.update(tuser);
		}
	}

	// 批量删除
	@Override
	public void delBatch(List<String> idList) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(idList);

	}

	// 根据条件查询用户信息
	@Override
	public List<Tuser> findUserByCondition(String loginid, String uname) {
		Session session = sessionFactory.getCurrentSession();
		List<Tuser> tuserlist = (List<Tuser>) session
				.createQuery("from Tuser t where t.loginid like :loginid and t.usrnm like :usrnm")
				.setParameter("loginid", "%" + loginid + "%").setParameter("usrnm", "%" + uname + "%").getResultList();
		/*
		 * for (int i = 0; i < tuserlist.size(); i++) {
		 * System.out.println(tuserlist.get(i).getLoginid()+"-----"+tuserlist.
		 * get(i).getUsrnm()); }
		 */
		return tuserlist;
	}

}
