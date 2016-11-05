package com.gt.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gt.dao.D_UserDao;
import com.gt.model.Tuser;
import com.gt.service.D_UserService;
import com.gt.util.D_MessageState;
import com.gt.util.Page;
import com.gt.util.PageQuery;

@Service("d_userService")
@Transactional
public class D_UserServiceImpl implements D_UserService {
	@Resource(name = "d_userDao")
	private D_UserDao d_userDao;

	private D_MessageState d_messageState = null;

	// 查询所有用户
	@Override
	public List<Tuser> getAllUser() {
		return d_userDao.getAllUser();
	}

	// 查询该机构所有用户
	@Override
	public List<Tuser> getAllUser(String orgcd) {
		return d_userDao.getAllUser(orgcd);
	}

	// 添加用户
	@Override
	public int addUser(Tuser tuser) {
		return d_userDao.addUser(tuser);
	}

	// 更新
	@Override
	public void updTuser(Tuser tuser) {
		d_userDao.updTuser(tuser);

	}

	// 删除
	@Override
	public void delBatch(List<String> idList) {
		d_userDao.delBatch(idList);

	}

	// 根据条件查询用户信息
	@Override
	public List<Tuser> findUserByCondition(String loginid, String uname) {
		return d_userDao.findUserByCondition(loginid, uname);
	}

}
