package com.gt.controller;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.hibernate.criterion.DetachedCriteria;

import com.gt.util.PageQuery;


/**
 * Description:Controller基本类
 */
public class D_BaseController<T> {
	
	protected PageQuery pageBean = new PageQuery();// 创建分页查询对象

	public void setRows(int rows) {
		pageBean.setPageSize(rows);// 设置每页条数
	}

	public void setPage(int page) {
		pageBean.setStartPage(page);// 设置当前页
	}

	// public class UserAction extends BaseAction<User>
	public D_BaseController() {
		ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
		Type[] types = parameterizedType.getActualTypeArguments();// 获取的是BaseAction<T>中的[T]
		Class<T> entityClass = (Class<T>) types[0];//取出第一个给entityClass赋值
		DetachedCriteria dc = DetachedCriteria.forClass(entityClass);// 设置离线查询条件
		//pageBean.setDc(dc);
		
		try {
			entityClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	
	}
}
