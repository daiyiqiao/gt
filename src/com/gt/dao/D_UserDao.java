package com.gt.dao;

import java.util.List;
import java.util.Map;

import com.gt.model.Tuser;
import com.gt.model.Tuser;
import com.gt.util.D_MessageState;
import com.gt.util.Page;
import com.gt.util.PageQuery;

/**
 * 用户相关信息持久层接口
 * @author dyq
 */
public interface D_UserDao {

	/**
	 * 查询所有用户
	 * @return List<Tuser>
	 */
	public List<Tuser> getAllUser();

	/**
	 * 查询该机构所有用户
	 * 
	 * @param orgcd
	 * @return List<Tuser> 用户集合
	 * 
	 */
	public List<Tuser> getAllUser(String orgcd);

	/**
	 * 用户添加
	 * 
	 * @param Tuser
	 */
	public int addUser(Tuser tuser);

	/**
	 * 更新
	 * 
	 * @param Tuser
	 */
	public void updTuser(Tuser tuser);

	/**
	 * 删除 （注意：逻辑删除，不是真实删除）
	 * 
	 * @param idList
	 */
	public void delBatch(List<String> idList);

	/**
	 * 根据条件查询用户信息
	 * 
	 * @param pageBean
	 * @return
	 */
	public List<Tuser> findUserByCondition(String loginid, String uname);

}
