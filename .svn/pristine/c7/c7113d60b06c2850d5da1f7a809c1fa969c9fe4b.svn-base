package com.gt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gt.dao.D_ResTypeInfoDao;
import com.gt.model.Trestype;
import com.gt.service.D_ResTypeInfoService;


@Service("d_resTypeInfoService")
public class D_ResTypeInfoServiceImpl implements D_ResTypeInfoService{

	@Resource(name="d_resTypeInfoDao")
	private D_ResTypeInfoDao d_resTypeInfoDao;

	@Override
	public List<Trestype> findAllResType() {
		return d_resTypeInfoDao.findAllResType();
	}
	
	
}
