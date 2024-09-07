package com.edu.seiryo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.Ticket;
import com.edu.seiryo.util.DBUtil;
/**
 * �������ݴ�����
 * @author WANGQI
 *
 */
public class OrderDao {
	DBUtil dbUtil = new DBUtil();
	/**
	 * ��ʾ���ж�����Ϣ
	 * @param userId
	 * @return ���ж�����Ϣ
	 */
	public List<Order> myTickets(int userId){
		 String sql = "select trainId,trainPrice,trainNumber from myTicketingList where userId = ?";
		 ResultSet resultSet = null;
		 List<Order> list = new ArrayList<Order>(); 
		    try {
		    	resultSet = dbUtil.excuteQuery(sql,userId);
		    	while (resultSet.next()) {
		    		Order order = new Order();
		    		order.setTrainId(resultSet.getString("trainId"));
		    		order.setTrainPrice(resultSet.getInt("trainPrice"));
		    		order.setTrainNumber(resultSet.getInt("trainNumber"));
					list.add(order);
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
			return list;
	}
}
