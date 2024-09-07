package com.edu.seiryo.entity;
/**
 * ��Ʊʵ����
 * @author WANGQI
 *
 */
public class Ticket {
	/**
	 * ���α��
	 */
	private String id;
	/**
	 * ������
	 */
    private String trainId;
    /**
     * ���μ۸�
     */
    private int trainPrice;
    /**
     * ����Ʊ����
     */
    private int trainNumber;

    /**
     * �вι��죬��������
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
	 * ��ȡ���α��
	 * @return ���α��
	 */
	public String getId() {
		return id;
	}
	/**
	 * ���ó��α��
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * ��ȡ������
	 * @return ������
	 */
	public String getTrainId() {
        return trainId;
    }
	/**
	 * ���ó�����
	 * @param trainId
	 */
    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }
    /**
     * ��ȡ����Ʊ��
     * @return ����Ʊ��
     */
    public int getTrainPrice() {
        return trainPrice;
    }
    /**
     * ���ó���Ʊ��
     * @param ticket
     */
    public void setTrainPrice(int ticket) {
        this.trainPrice = ticket;
    }
    /**
     * ��ȡ����Ʊ����
     * @return ����Ʊ����
     */
    public int getTrainNumber() {
        return trainNumber;
    }
    /**
     * ���ó���Ʊ����
     * @param trainNumber
     */
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    /**
     * �ղι��죬��������
     */
    public Ticket() {
    }
    /**
     * �޲ι��죬��������
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
