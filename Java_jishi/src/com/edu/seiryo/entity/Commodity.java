package com.edu.seiryo.entity;
/**
 * Commodityʵ����
 * @author WANGQI
 *
 */
public class Commodity {
	/**
	 * ��Ʒ���
	 */
	private int commodityId;
	/**
	 * ��Ʒ����
	 */
	private String commodityName;
	/**
	 * ��Ʒ����
	 */
	private String commodityInfo;
	/**
	 * ��Ʒ�۸�
	 */
	private double commodityPrice;
	/**
	 * ��Ʒ�������
	 */
	private int commodityNum;
	/**
	 * ��ȡ��Ʒ���
	 * @return ��Ʒ���
	 */
	public int getCommodityId() {
		return commodityId;
	}
	/**
	 * ������Ʒ���
	 * @param commodityId
	 */
	public void setCommodityId(int commodityId) {
		this.commodityId = commodityId;
	}
	/**
	 * ��ȡ��Ʒ��
	 * @return ��Ʒ��
	 */
	public String getCommodityName() {
		return commodityName;
	}
	/**
	 * ������Ʒ��
	 * @param commodityName
	 */
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	/**
	 * ��ȡ��Ʒ����
	 * @return ��Ʒ����
	 */
	public String getCommodityInfo() {
		return commodityInfo;
	}
	/**
	 * ������Ʒ����
	 * @param commodityInfo
	 */
	public void setCommodityInfo(String commodityInfo) {
		this.commodityInfo = commodityInfo;
	}
	/**
	 * ��ȡ��Ʒ�۸�
	 * @return
	 */
	public double getCommodityPrice() {
		return commodityPrice;
	}
	/**
	 * ������Ʒ�۸�
	 * @param commodityPrice
	 */
	public void setCommodityPrice(double commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
	/**
	 * ��ȡ��Ʒ�������
	 * @return ��Ʒ�������
	 */
	public int getCommodityNum() {
		return commodityNum;
	}
	/**
	 * ������Ʒ�������
	 * @param commodityNum
	 */
	public void setCommodityNum(int commodityNum) {
		this.commodityNum = commodityNum;
	}
	/**
	 * �вι��죬��������
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
	 * �޲ι��죬��������
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
