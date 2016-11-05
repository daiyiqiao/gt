package com.gt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.D_FileFormatInfoDao;
import com.gt.model.Tfileformat;
@Repository("d_fileFormatInfoDao")
public class D_FileFormatInfoDaoImpl implements D_FileFormatInfoDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	
	// 查询所有文件格式
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Tfileformat> findAllFileFormat() {
		Session session = sessionFactory.getCurrentSession();
		
		return (List<Tfileformat>) session.createQuery("from Tfileformat ff order by ff.fcd").getResultList();
	}

}
