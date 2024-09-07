package com.edu.seiryo.test;

import java.util.Scanner;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.TicketingService;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.view.OrderView;
import com.edu.seiryo.view.TicketingView;
import com.edu.seiryo.view.UserView;

/**
 * 程序入口
 * @author WANGQI
 *
 */
public class Test {
	public static void main(String[] args) {
		int id = 0;
		Scanner scanner = new Scanner(System.in);
		User user = new User();
			while (true) {
				System.out.println("欢迎使用购票系统");
		        System.out.println("1.注册");
		        System.out.println("2.登录");
		        System.out.println("3.购买车票");
		        System.out.println("4.我的订单");
		        System.out.println("5.退出");
		        System.out.println("请选择你将进行的操作：");
		        String choose = scanner.next();
		        switch (choose) {
				case "1":
					UserView userView = new UserView();
					userView.userController(true);
					break;
				case "2":
					UserView userView2 = new UserView();
					id = userView2.userController(false);
					break;
				case "3":
					if(id != 0){
						TicketingView ticketingView = new TicketingView();
						ticketingView.ticketingController(id);
					}else {
						System.out.println("请先登录");
					}
					break;
				case "4":
					OrderView orderView = new OrderView();
					orderView.orderController(id);
					break;
				case "5":
					System.out.println("退出系统");
	                System.exit(0);
					break;
				default:
					System.out.println("输入错误，请重新输入！");
					break;
			}
		}
	}
}
