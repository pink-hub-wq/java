package com.edu.seiryo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.timer.TimerNotification;

import com.edu.seiryo.entity.Ticket;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.util.DBUtil;

/**
 * 车票数据处理类
 * @author WANGQI
 *
 */
public class TicketingDao {
	DBUtil dbUtil = new DBUtil();
	/**
	 * 显示所有车票信息
	 * @return 所有车票信息
	 */
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
		}finally {
			try {
				dbUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	/**
	 * 购买车票
	 * @param ticket
	 * @param id
	 * @return boolean
	 */
	public boolean buyTickets(Ticket ticket,int id){
		String sql = "update ticketingList set trainNumber = trainNumber - ? where trainId = ? and trainNumber >= ?";
		 boolean bo = false;
		 boolean bo2 = false;
		    try {
		    	 bo2 = Tickets(ticket);
		    	 bo = dbUtil.excuteUpdate(sql, ticket.getTrainNumber(),ticket.getTrainId(),ticket.getTrainNumber());
		    	 if(bo && bo2){
		    		 addTickets(ticket,id);
		    		 bo = true;
		    	 }else {
					bo = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					dbUtil.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return bo;
	}
	/**
	 * 查询车票数量
	 * @param ticket
	 * @return boolean
	 */
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
			}finally {
				try {
					dbUtil.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return bo;
	}
	/**
	 * 查询车票价格
	 * @param trainId
	 * @return 车票价格
	 */
	public int TicketPrice(String trainId){
		 String sql = "select trainPrice from ticketingList where trainId = ?";
		 ResultSet resultSet = null;
		 int price = 0;
		    try {
		    	resultSet = dbUtil.excuteQuery(sql,trainId);
		    	if(resultSet.next()){
		    		price = resultSet.getInt("trainPrice");
		    	}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					dbUtil.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return price;
	}
	/**
	 * 将购买车票放入订单数据库
	 * @param ticket
	 * @param id
	 * @return boolean
	 */
	public boolean addTickets(Ticket ticket, int id) {
		int price = 0;
        if (!checkUserExists(id)) {
            return false;
        }
        boolean bo = false;
        if(getTrainId(ticket,id)){
        	String sql = "update myTicketingList set trainPrice = trainPrice + ?,trainNumber = trainNumber + ? where userId = ? and trainId = ?";
        	price = getPrice(ticket.getTrainId());
        	try {
				bo = dbUtil.excuteUpdate(sql, price * ticket.getTrainNumber(), ticket.getTrainNumber(),id, ticket.getTrainId());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					dbUtil.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
        }else {
             String sql = "insert into myTicketingList (userId, trainId, trainPrice, trainNumber) values (?, ?, ?, ?)";
             try {
             	price = getPrice(ticket.getTrainId());
                 bo = dbUtil.excuteUpdate(sql, id, ticket.getTrainId(), price * ticket.getTrainNumber(), ticket.getTrainNumber());
             } catch (Exception e) {
                 e.printStackTrace();
                 return false;
             }finally {
     			try {
     				dbUtil.close();
     			} catch (SQLException e) {
     				e.printStackTrace();
     			}
     		}
		}
		return bo;
		
    }
	/**
	 * 查询订单中是否存在要购买的车票
	 * @return boolean
	 */
	public boolean getTrainId(Ticket ticket, int id){
		boolean bo = false;
		String sql = "select trainId from myTicketingList where userId =? and trainId = ?";
		ResultSet resultSet = null;
		try {
			resultSet = dbUtil.excuteQuery(sql,id, ticket.getTrainId());
			if(resultSet.next()){
				bo = true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				dbUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * 查询用户是否存在
	 * @param userId
	 * @return boolean
	 */
	public boolean checkUserExists(int userId) {
	    String sql = "select userName from userList where id = ?";
	    ResultSet resultSet = null;
	    boolean bo = false;
	    try {
	        resultSet = dbUtil.excuteQuery(sql, userId);
	        bo = resultSet.next(); 
	    } catch (Exception e) {
	        e.printStackTrace();
	    }finally {
			try {
				dbUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * 拿到票价
	 * @param trainId
	 * @return 票价
	 */
	public int getPrice(String trainId) {
        String sql = "select trainPrice from ticketingList where trainId = ?";
        ResultSet resultSet = null;
        int price = 0;
        try {
        	resultSet = dbUtil.excuteQuery(sql,trainId);
            if (resultSet.next()) {
            	price =  resultSet.getInt("trainPrice");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
			try {
				dbUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return price;
    }
}
