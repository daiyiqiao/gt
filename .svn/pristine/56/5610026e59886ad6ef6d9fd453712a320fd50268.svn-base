package com.gt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gt.dao.D_FileFormatInfoDao;
import com.gt.model.Tfileformat;
import com.gt.service.D_FileFormatInfoService;
@Service("d_fileFormatInfoService")
public class D_FileFormatInfoServiceImpl implements D_FileFormatInfoService {
	@Resource(name = "d_fileFormatInfoDao")
	private D_FileFormatInfoDao d_fileFormatInfoDao;
	

	// 查询所有文件格式
	
	@Override
	public List<Tfileformat> findAllFileFormat() {
		return d_fileFormatInfoDao.findAllFileFormat();
	}

}
