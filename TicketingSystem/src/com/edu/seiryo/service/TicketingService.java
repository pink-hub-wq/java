package com.edu.seiryo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.seiryo.dao.TicketingDao;
import com.edu.seiryo.entity.Ticket;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;
/**
 * 
 * Student业务逻辑控制
 * @author WANGQI
 * @time 2024年4月25日下午2:32:24
 */
public class TicketingService {
	TicketingDao ticketingDao = new TicketingDao();
	Scanner scanner = new Scanner(System.in);
	DBUtil dbUtil = new DBUtil();
	UserService userService = new UserService();
//	3、购买车票
	public void buyTickets(){
		List<Ticket> list = ticketingDao.ticket();
		System.out.println("车次\t价格\t数量");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getTrainId()+"\t");
			System.out.print(list.get(i).getTrainPrice()+"\t");
			System.out.println(list.get(i).getTrainNumber()+"\t");
		}
		boolean bo = false;
		System.out.println("请输入你要购买的车票编号：");
		 String ticketId = scanner.next();
		 System.out.println("请输入你要购买的车票数量：");
		 int ticketNumber= scanner.nextInt();
		 Ticket ticket = new Ticket();
		 ticket.setTrainId(ticketId);
		 ticket.setTrainNumber(ticketNumber);
		 User user = userService.login();
		 int id = user.getId();
		 bo = ticketingDao.buyTickets(ticket,);
		 if(bo){
			 System.out.println("购买成功！");
		 }else {
			System.out.println("购买失败！");
		}
	}
//	4、我的订单
	public void myTickets(){
		List<Ticket> list = ticketingDao.myTickets();
		try {
			System.out.println("车次\t价格\t数量");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTrainId()+"\t");
				System.out.print(list.get(i).getTrainPrice()+"\t");
				System.out.println(list.get(i).getTrainNumber()+"\t");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// 将购买车票放入数据库
	private void addTickets() {
		boolean bo = false;
		System.out.println("请输入你要购买的车票编号：");
		 String ticketId = scanner.next();
		 System.out.println("请输入你要购买的车票数量：");
		 int ticketNumber= scanner.nextInt();
		 Ticket ticket = new Ticket();
		 ticket.setTrainId(ticketId);
		 ticket.setTrainNumber(ticketNumber);
		 ticket.setTrainPrice(ticketingDao.TicketPrice(ticket));
		 if (ticket.getTrainPrice() != 0) { // 如果价格不为零，则表示价格获取成功
		        bo = true; // 设置 bo 为 true
		        ticketingDao.addTickets(ticket);
		    } else {
		        System.out.println("获取价格失败！请稍后再试。");
		    }
    }
}
