package com.edu.seiryo.entity;
/**
 * Car实体类
 * @author WANGQI
 *
 */
public class Car {
	/**
	 * 购物车编号
	 */
	private int carId;
	/**
	 * 购物车编号
	 */
	private int CommodityId;
	/**
	 * 购物车商品编号
	 */
	private int CommodityNum;
	/**
	 * 购物车用户编号
	 */
	private int UserId;
	/**
	 * 获取购物车编号
	 * @return
	 */
	public int getCarId() {
		return carId;
	}
	/**
	 * 设置购物车编号
	 * @param carId
	 */
	public void setCarId(int carId) {
		this.carId = carId;
	}
	/**
	 * 获取购物车商品编号
	 * @return 购物车商品编号
	 */
	public int getCommodityId() {
		return CommodityId;
	}
	/**
	 * 设置购物车商品编号
	 * @param commodityId
	 */
	public void setCommodityId(int commodityId) {
		CommodityId = commodityId;
	}
	/**
	 * 获取购物车商品数量
	 * @return
	 */
	public int getCommodityNum() {
		return CommodityNum;
	}
	/**
	 * 设置购物车商品数量
	 * @param commodityNum
	 */
	public void setCommodityNum(int commodityNum) {
		CommodityNum = commodityNum;
	}
	/**
	 * 获取购物车用户编号
	 * @return
	 */
	public int getUserId() {
		return UserId;
	}
	/**
	 * 设置购物车用户编号
	 * @param userId
	 */
	public void setUserId(int userId) {
		UserId = userId;
	}
	/**
	 * 有参构造，创建对象
	 * @param carId
	 * @param commodityId
	 * @param commodityNum
	 * @param userId
	 */
	public Car(int carId, int commodityId, int commodityNum, int userId) {
		super();
		this.carId = carId;
		CommodityId = commodityId;
		CommodityNum = commodityNum;
		UserId = userId;
	}
	/**
	 * 无参构造，创建对象
	 */
	public Car() {
		super();
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", CommodityId=" + CommodityId + ", CommodityNum=" + CommodityNum + ", UserId="
				+ UserId + "]";
	}
	
}
