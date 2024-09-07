package com.edu.seiryo.entity;
/**
 * 订单实体类
 * @author WANGQI
 *
 */
public class Order {
	/**
	 * 订单编号
	 */
	private String id;
	/**
	 * 订单车次名
	 */
    private String trainId;
    /**
     * 订单票总价
     */
    private int trainPrice;
    /**
     * 订单票数量
     */
    private int trainNumber;
    /**
     * 此订单用户id
     */
    private int userId;
   /**
    * 有参构造，创建对象
    * @param id
    * @param trainId
    * @param trainPrice
    * @param trainNumber
    * @param userId
    */
	public Order(String id, String trainId, int trainPrice, int trainNumber, int userId) {
		super();
		this.id = id;
		this.trainId = trainId;
		this.trainPrice = trainPrice;
		this.trainNumber = trainNumber;
		this.userId = userId;
	}
	/**
	 * 获取用户id
	 * @return 用户id
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 设置用户id
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	@Override
	public String toString() {
		return "Order [id=" + id + ", trainId=" + trainId + ", trainPrice=" + trainPrice + ", trainNumber="
				+ trainNumber + ", userId=" + userId + "]";
	}
	/**
	 * 获取订单编号
	 * @return 订单编号
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置订单编号
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取订单车次名
	 * @return 订单车次名
	 */
	public String getTrainId() {
        return trainId;
    }
	/**
	 * 设置订单车次名
	 * @param trainId
	 */
    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }
	/**
	 * 获取订单车票总价格
	 * @return
	 */
    public int getTrainPrice() {
        return trainPrice;
    }
    /**
     * 设置订单车票总价格
     * @param ticket
     */
    public void setTrainPrice(int ticket) {
        this.trainPrice = ticket;
    }
    /**
     * 获取订单车票数量
     * @return 订单车票数量
     */
    public int getTrainNumber() {
        return trainNumber;
    }
    /**
     * 设置订单车票数量
     * @param trainNumber
     */
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    /**
     * 空参构造，创建对象
     */
    public Order() {
    }
    /**
     * 有参构造，创建对象
     * @param trainId
     * @param trainPrice
     * @param trainNumber
     */
    public Order(String trainId, int trainPrice, int trainNumber) {
        this.trainId = trainId;
        this.trainPrice = trainPrice;
        this.trainNumber = trainNumber;
    }
}
