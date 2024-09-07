package com.edu.seiryo.entity;
/**
 * Commodity实体类
 * @author WANGQI
 *
 */
public class Commodity {
	/**
	 * 商品编号
	 */
	private int commodityId;
	/**
	 * 商品名称
	 */
	private String commodityName;
	/**
	 * 商品简述
	 */
	private String commodityInfo;
	/**
	 * 商品价格
	 */
	private double commodityPrice;
	/**
	 * 商品库存数量
	 */
	private int commodityNum;
	/**
	 * 获取商品编号
	 * @return 商品编号
	 */
	public int getCommodityId() {
		return commodityId;
	}
	/**
	 * 设置商品编号
	 * @param commodityId
	 */
	public void setCommodityId(int commodityId) {
		this.commodityId = commodityId;
	}
	/**
	 * 获取商品名
	 * @return 商品名
	 */
	public String getCommodityName() {
		return commodityName;
	}
	/**
	 * 设置商品名
	 * @param commodityName
	 */
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	/**
	 * 获取商品简述
	 * @return 商品简述
	 */
	public String getCommodityInfo() {
		return commodityInfo;
	}
	/**
	 * 设置商品简述
	 * @param commodityInfo
	 */
	public void setCommodityInfo(String commodityInfo) {
		this.commodityInfo = commodityInfo;
	}
	/**
	 * 获取商品价格
	 * @return
	 */
	public double getCommodityPrice() {
		return commodityPrice;
	}
	/**
	 * 设置商品价格
	 * @param commodityPrice
	 */
	public void setCommodityPrice(double commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
	/**
	 * 获取商品库存数量
	 * @return 商品库存数量
	 */
	public int getCommodityNum() {
		return commodityNum;
	}
	/**
	 * 设置商品库存数量
	 * @param commodityNum
	 */
	public void setCommodityNum(int commodityNum) {
		this.commodityNum = commodityNum;
	}
	/**
	 * 有参构造，创建对象
	 * @param commodityId
	 * @param commodityName
	 * @param commodityInfo
	 * @param commodityPrice
	 * @param commodityNum
	 */
	public Commodity(int commodityId, String commodityName, String commodityInfo, double commodityPrice,
			int commodityNum) {
		super();
		this.commodityId = commodityId;
		this.commodityName = commodityName;
		this.commodityInfo = commodityInfo;
		this.commodityPrice = commodityPrice;
		this.commodityNum = commodityNum;
	}
	/**
	 * 无参构造，创建对象
	 */
	public Commodity() {
		super();
	}

	@Override
	public String toString() {
		return "Commodity [commodityId=" + commodityId + ", commodityName=" + commodityName + ", commodityInfo="
				+ commodityInfo + ", commodityPrice=" + commodityPrice + ", commodityNum=" + commodityNum + "]";
	}
	
}
