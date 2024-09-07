package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.TicketingService;
import com.edu.seiryo.service.UserService;

/**
 * 
 * User�����ۺ�
 * @author WANGQI
 * @time 2024��4��25������1:00:25
 */
public class UserView {
	Scanner scanner = new Scanner(System.in);
	UserService userService = new UserService();
	TicketingService ticketingService = new TicketingService();
	public void userController(){
		boolean flag = false;
		while (true) {
			System.out.println("��ӭʹ�ù�Ʊϵͳ");
	        System.out.println("1.ע��");
	        System.out.println("2.��¼");
	        System.out.println("3.����Ʊ");
	        System.out.println("4.�ҵĶ���");
	        System.out.println("5.�˳�");
	        System.out.println("��ѡ���㽫���еĲ�����");
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
					System.out.println("���ȵ�¼");
					break;
				}
				
			case "4":
				ticketingService.myTickets();
				break;
			case "5":
				System.out.println("�˳�ϵͳ");
                System.exit(0);
				break;
			default:
				System.out.println("����������������룡");
				userController();
			}
		}
	}
}
