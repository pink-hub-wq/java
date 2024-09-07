package com.edu.seiryo.entity;
/**
 * 车票实体类
 * @author WANGQI
 *
 */
public class Ticket {
	/**
	 * 车次编号
	 */
	private String id;
	/**
	 * 车次名
	 */
    private String trainId;
    /**
     * 车次价格
     */
    private int trainPrice;
    /**
     * 车次票数量
     */
    private int trainNumber;

    /**
     * 有参构造，创建对象
     * @param id
     * @param trainId
     * @param trainPrice
     * @param trainNumber
     */
	public Ticket(String id,String trainId, int trainPrice, int trainNumber) {
		super();
		this.id = id;
		this.trainId = trainId;
		this.trainPrice = trainPrice;
		this.trainNumber = trainNumber;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", trainId=" + trainId + ", trainPrice=" + trainPrice
				+ ", trainNumber=" + trainNumber + "]";
	}
	/**
	 * 获取车次编号
	 * @return 车次编号
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置车次编号
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取车次名
	 * @return 车次名
	 */
	public String getTrainId() {
        return trainId;
    }
	/**
	 * 设置车次名
	 * @param trainId
	 */
    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }
    /**
     * 获取车次票价
     * @return 车次票价
     */
    public int getTrainPrice() {
        return trainPrice;
    }
    /**
     * 设置车次票价
     * @param ticket
     */
    public void setTrainPrice(int ticket) {
        this.trainPrice = ticket;
    }
    /**
     * 获取车次票数量
     * @return 车次票数量
     */
    public int getTrainNumber() {
        return trainNumber;
    }
    /**
     * 设置车次票数量
     * @param trainNumber
     */
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    /**
     * 空参构造，创建对象
     */
    public Ticket() {
    }
    /**
     * 无参构造，创建对象
     * @param trainId
     * @param trainPrice
     * @param trainNumber
     */
    public Ticket(String trainId, int trainPrice, int trainNumber) {
        this.trainId = trainId;
        this.trainPrice = trainPrice;
        this.trainNumber = trainNumber;
    }
}
