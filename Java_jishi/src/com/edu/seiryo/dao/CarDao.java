package com.edu.seiryo.dao;

import java.util.List;
import java.util.Map;

public interface CarDao {
	/**
	 * 添加到购物车
	 * @param commodityId
	 * @param commodityNum
	 * @param uderId
	 * @return boolean
	 */
	public boolean addCar(int commodityId,int commodityNum,int uderId);
	/**
	 * 打印购物车信息
	 * @param uderId
	 * @return List
	 */
	public List<Map<String, Object>> selectCar(int uderId);
	/**
	 * 清空购物车
	 * @param uderId
	 * @return boolean
	 */
	public boolean delectCar(int uderId);
}
