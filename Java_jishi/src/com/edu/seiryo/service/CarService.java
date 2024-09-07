package com.edu.seiryo.service;

import java.util.List;
import java.util.Map;

public interface CarService {
	/**
	 * 添加商品到购物车
	 * @param commodityId
	 * @param commodityNum
	 * @param uderId
	 * @return true成功/false失败
	 */
	public boolean addCar(int commodityId,int commodityNum,int uderId);
	/**
	 * 查询购物车信息
	 * @param uderId
	 */
	public void selectCar(int uderId);
	/**
	 * 清空购物车
	 * @param uderId
	 */
	public void delectCar(int uderId);
}
