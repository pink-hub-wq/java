package com.edu.seiryo.service;

import java.util.List;
import java.util.Scanner;

import com.edu.seiryo.dao.OrderDao;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.Ticket;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;
/**
 * Order业务逻辑控制
 * @author WANGQI
 *
 */
public class OrderService {
	OrderDao orderDao = new OrderDao();
	DBUtil dbUtil = new DBUtil();
	/**
	 * 打印订单信息
	 * @param userId
	 * @return
	 */
	public void myTickets(int userId){
        List<Order> list = orderDao.myTickets(userId);
        if (list.size() == 0) {
            System.out.println("无订单信息");
            return;
        }
        System.out.println("车次\t价格\t数量");
        for (Order order : list) {
            System.out.print(order.getTrainId() + "\t");
            System.out.print(order.getTrainPrice() + "\t");
            System.out.println(order.getTrainNumber());
        }
    }
}
