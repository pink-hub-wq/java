package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.Commodity;

public interface CommodityService {
	/**
	 * 查询所有商品信息
	 * @param userid
	 */
	public void queryCommodity(int userid);
	/**
	 * 查询商品名和简介
	 */
	public void queryCommodityNameAndInfo();
	/**
	 * 查询商品名
	 * @param id
	 * @return 商品名
	 */
	public String queryCommodityName(int id);
	/**
	 * 查询库存数量
	 * @param id
	 * @param num
	 * @return true成功/false失败
	 */
	public boolean queryCommodityNum(int id,int num);
	/**
	 * 查询商品单价
	 * @param id
	 * @return 商品单价
	 */
	public int queryCommodityPrice(int id);
	/**
	 * 更新商品库存数量
	 * @param id
	 * @param num
	 * @return true成功/false失败
	 */
	public boolean updateCommodity(int id,int num);
}
