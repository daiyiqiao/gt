package com.gt.service;

import java.util.List;

import com.gt.model.Tfileformat;

public interface D_FileFormatInfoService {

	/**
	 * 查询所有文件格式
	 * @return List<Tfileformat>
	 * */
	
	public List<Tfileformat> findAllFileFormat();

}
