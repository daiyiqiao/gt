package com.gt.dao;

import java.util.List;
import java.util.Map;

import com.gt.model.Tmetadata;

public interface W_MetaDataDao {

	public Tmetadata geTmetadata(String cdoi);
	public List<Tmetadata> geTmetadatas(Map<String, String> map);
	public int saveMetaDatas(List<Tmetadata> metaDatas);
}
