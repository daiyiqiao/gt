package com.gt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gt.dao.W_FileFormatDao;
import com.gt.model.Tfileformat;
import com.gt.model.Trestype;

/**
 * 文件格式表Dao层
 * 
 * @author Nebor
 *
 */
@Repository("fileFormatDao")
public class W_FileFormatDaoImpl implements W_FileFormatDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	/**
	 * 获取文件格式列表
	 * 
	 */
	@Override
	public List<Tfileformat> geTfileformatList() {
		Session session = sessionFactory.getCurrentSession();
		List<Tfileformat> fileFormats = session.createQuery("from Tfileformat f where f.delflg = '0' order by f.fcd").getResultList();

		return fileFormats;
	}

}
