package com.edu.seiryo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.entity.Ticket;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;

/**
 * 
 * Student数据处理类
 * @author WANGQI
 * @time 2024年4月25日下午2:04:31
 */
public class TicketingDao {
	DBUtil dbUtil = new DBUtil();
//打印数据库
	public List<Ticket> ticket(){
		ResultSet resultSet = null;
		String sql = "select trainId,trainPrice,trainNumber from ticketingList";
		List<Ticket> list = new ArrayList<Ticket>(); 
		try {
			resultSet = dbUtil.excuteQuery(sql);
			while (resultSet.next()) {
				Ticket ticket = new Ticket();
				ticket.setTrainId(resultSet.getString("trainId"));
				ticket.setTrainPrice(resultSet.getInt("trainPrice"));
				ticket.setTrainNumber(resultSet.getInt("trainNumber"));
				list.add(ticket);
			}
			if(list != null){
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
//	3、购买车票
	public boolean buyTickets(Ticket ticket,int userId){
		String sql = "UPDATE ticketingList SET trainNumber = trainNumber - ? WHERE trainId = ? AND trainNumber >= ?";
		 boolean bo = false;
		 boolean bo2 = false;
		    try {
		    	 bo2 = Tickets(ticket);
		    	 bo = dbUtil.excuteUpdate(sql, ticket.getTrainNumber(),ticket.getTrainId(),ticket.getTrainNumber());
		    	 if(bo && bo2){
		    		 bo = true;
		    		 addTickets(ticket,userId);
		    	 }else {
					bo = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return bo;
	}
//	4、我的订单
	public List<Ticket> myTickets(){
		 String sql = "select * from myTicketingList";
		 ResultSet resultSet = null;
		 List<Ticket> list = new ArrayList<Ticket>(); 
		    try {
		    	resultSet = dbUtil.excuteQuery(sql);
		    	while (resultSet.next()) {
					Ticket ticket = new Ticket();
					ticket.setTrainId(resultSet.getString("trainId"));
					ticket.setTrainPrice(resultSet.getInt("trainPrice"));
					ticket.setTrainNumber(resultSet.getInt("trainNumber"));
					list.add(ticket);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
	}
//查询车票数量
	public boolean Tickets(Ticket ticket){
		 String sql = "select * from ticketingList where trainId = ? and trainNumber >= ?";
		 boolean bo = false;
		 ResultSet resultSet = null;
		    try {
		    	resultSet = dbUtil.excuteQuery(sql,ticket.getTrainId(),ticket.getTrainNumber());
		    	if(resultSet.next()){
		    		bo = true;
		    	}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return bo;
	}
//查询车票价格
	public int TicketPrice(Ticket ticket){
		 String sql = "select trainPrice from ticketingList where trainId = ? and trainNumber >= ?";
		 ResultSet resultSet = null;
		 int price = 0;
		    try {
		    	resultSet = dbUtil.excuteQuery(sql,ticket.getTrainId(),ticket.getTrainNumber());
		    	while(resultSet.next()){
		    		price = resultSet.getInt("trainPrice");
		    	}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return price;
	}
// 将购买车票放入我的数据库
	public  boolean addTickets(Ticket ticket ,int userId) {
        String sql = "insert into myTicketingList values (?,?, ?,?)";
        int price = TicketPrice(ticket);
        boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,userId ,ticket.getTrainId(),price,ticket.getTrainNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
    }
}
