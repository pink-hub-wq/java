package com.edu.seiryo.service;

import java.util.List;
import java.util.Scanner;

import com.edu.seiryo.dao.OrderDao;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.Ticket;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;
/**
 * Orderҵ���߼�����
 * @author WANGQI
 *
 */
public class OrderService {
	OrderDao orderDao = new OrderDao();
	DBUtil dbUtil = new DBUtil();
	/**
	 * ��ӡ������Ϣ
	 * @param userId
	 * @return
	 */
	public void myTickets(int userId){
        List<Order> list = orderDao.myTickets(userId);
        if (list.size() == 0) {
            System.out.println("�޶�����Ϣ");
            return;
        }
        System.out.println("����\t�۸�\t����");
        for (Order order : list) {
            System.out.print(order.getTrainId() + "\t");
            System.out.print(order.getTrainPrice() + "\t");
            System.out.println(order.getTrainNumber());
        }
    }
}
