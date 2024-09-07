package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.TicketingService;
import com.edu.seiryo.service.UserService;

/**
 * 
 * User方法综合
 * @author WANGQI
 * @time 2024年4月25日下午1:00:25
 */
public class UserView {
	Scanner scanner = new Scanner(System.in);
	UserService userService = new UserService();
	TicketingService ticketingService = new TicketingService();
	public void userController(){
		boolean flag = false;
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
				userService.register();
				break;
			case "2":
				User user = new User();
				user = userService.login();
				if(user != null){
					break;
				}
			case "3":
				if(flag){
					ticketingService.buyTickets();
					break;
				}else {
					System.out.println("请先登录");
					break;
				}
				
			case "4":
				ticketingService.myTickets();
				break;
			case "5":
				System.out.println("退出系统");
                System.exit(0);
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				userController();
			}
		}
	}
}
