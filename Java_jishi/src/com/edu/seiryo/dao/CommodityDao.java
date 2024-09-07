package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.Commodity;

public interface CommodityDao {
	/**
	 * 查询所有商品
	 * @return List
	 */
	public List<Commodity> queryCommodity();
	/**
	 * 查询商品名称，简述
	 * @return List
	 */
	public List<Commodity> queryCommodityNameAndInfo();
	/**
	 * 根据id查询商品名称
	 * @param id
	 * @return
	 */
	public String queryCommodityName(int id);
	/**
	 * 查询商品的库存是否大于要购买的数量
	 * @param id
	 * @param num
	 * @return boolean
	 */
	public boolean queryCommodityNum(int id,int num);
	/**
	 * 根据id查询商品单价
	 * @param id
	 * @return int
	 */
	public int queryCommodityPrice(int id);
	/**
	 * 更新商品数量
	 * @param id
	 * @param num
	 * @return boolean
	 */
	public boolean updateCommodity(int id,int num);
}
