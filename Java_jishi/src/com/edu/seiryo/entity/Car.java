package com.edu.seiryo.entity;
/**
 * Carʵ����
 * @author WANGQI
 *
 */
public class Car {
	/**
	 * ���ﳵ���
	 */
	private int carId;
	/**
	 * ���ﳵ���
	 */
	private int CommodityId;
	/**
	 * ���ﳵ��Ʒ���
	 */
	private int CommodityNum;
	/**
	 * ���ﳵ�û����
	 */
	private int UserId;
	/**
	 * ��ȡ���ﳵ���
	 * @return
	 */
	public int getCarId() {
		return carId;
	}
	/**
	 * ���ù��ﳵ���
	 * @param carId
	 */
	public void setCarId(int carId) {
		this.carId = carId;
	}
	/**
	 * ��ȡ���ﳵ��Ʒ���
	 * @return ���ﳵ��Ʒ���
	 */
	public int getCommodityId() {
		return CommodityId;
	}
	/**
	 * ���ù��ﳵ��Ʒ���
	 * @param commodityId
	 */
	public void setCommodityId(int commodityId) {
		CommodityId = commodityId;
	}
	/**
	 * ��ȡ���ﳵ��Ʒ����
	 * @return
	 */
	public int getCommodityNum() {
		return CommodityNum;
	}
	/**
	 * ���ù��ﳵ��Ʒ����
	 * @param commodityNum
	 */
	public void setCommodityNum(int commodityNum) {
		CommodityNum = commodityNum;
	}
	/**
	 * ��ȡ���ﳵ�û����
	 * @return
	 */
	public int getUserId() {
		return UserId;
	}
	/**
	 * ���ù��ﳵ�û����
	 * @param userId
	 */
	public void setUserId(int userId) {
		UserId = userId;
	}
	/**
	 * �вι��죬��������
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
	 * �޲ι��죬��������
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
