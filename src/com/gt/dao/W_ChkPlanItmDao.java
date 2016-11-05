package com.gt.dao;

import java.util.List;

import com.gt.model.Tchkplanitm;

public interface W_ChkPlanItmDao {

	/**
	 * 根据查重编号获取权重查重项
	 * @param plancd
	 * @return
	 */
	public List<Tchkplanitm> getImpPlan(int plancd);
	
	/**
	 * 根据查重编号获取一般查重项
	 * @param plancd
	 * @return
	 */
	public List<Tchkplanitm> getNorPlan(int plancd);
}
