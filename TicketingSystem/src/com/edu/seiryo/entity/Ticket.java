package com.edu.seiryo.entity;
/**
 * 
 *
 * @author WANGQI
 * @time 2024年4月25日上午11:19:58
 */
public class Ticket {
    private String trainId;
    private int trainPrice;
    private int trainNumber;

    @Override
    public String toString() {
        return "Ticket{" +
                "trainId='" + trainId + '\'' +
                ", trainPrice=" + trainPrice +
                ", trainNumber=" + trainNumber +
                '}';
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public int getTrainPrice() {
        return trainPrice;
    }

    public void setTrainPrice(int ticket) {
        this.trainPrice = ticket;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Ticket() {
    }

    public Ticket(String trainId, int trainPrice, int trainNumber) {
        this.trainId = trainId;
        this.trainPrice = trainPrice;
        this.trainNumber = trainNumber;
    }
}
