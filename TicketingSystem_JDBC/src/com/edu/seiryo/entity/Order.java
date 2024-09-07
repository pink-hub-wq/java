package com.edu.seiryo.entity;
/**
 * ����ʵ����
 * @author WANGQI
 *
 */
public class Order {
	/**
	 * �������
	 */
	private String id;
	/**
	 * ����������
	 */
    private String trainId;
    /**
     * ����Ʊ�ܼ�
     */
    private int trainPrice;
    /**
     * ����Ʊ����
     */
    private int trainNumber;
    /**
     * �˶����û�id
     */
    private int userId;
   /**
    * �вι��죬��������
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
	 * ��ȡ�û�id
	 * @return �û�id
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * �����û�id
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
	 * ��ȡ�������
	 * @return �������
	 */
	public String getId() {
		return id;
	}
	/**
	 * ���ö������
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * ��ȡ����������
	 * @return ����������
	 */
	public String getTrainId() {
        return trainId;
    }
	/**
	 * ���ö���������
	 * @param trainId
	 */
    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }
	/**
	 * ��ȡ������Ʊ�ܼ۸�
	 * @return
	 */
    public int getTrainPrice() {
        return trainPrice;
    }
    /**
     * ���ö�����Ʊ�ܼ۸�
     * @param ticket
     */
    public void setTrainPrice(int ticket) {
        this.trainPrice = ticket;
    }
    /**
     * ��ȡ������Ʊ����
     * @return ������Ʊ����
     */
    public int getTrainNumber() {
        return trainNumber;
    }
    /**
     * ���ö�����Ʊ����
     * @param trainNumber
     */
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    /**
     * �ղι��죬��������
     */
    public Order() {
    }
    /**
     * �вι��죬��������
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
