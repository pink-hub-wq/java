package com.edu.seiryo.test;

import java.util.Scanner;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.TicketingService;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.view.OrderView;
import com.edu.seiryo.view.TicketingView;
import com.edu.seiryo.view.UserView;

/**
 * �������
 * @author WANGQI
 *
 */
public class Test {
	public static void main(String[] args) {
		int id = 0;
		Scanner scanner = new Scanner(System.in);
		User user = new User();
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
						System.out.println("���ȵ�¼");
					}
					break;
				case "4":
					OrderView orderView = new OrderView();
					orderView.orderController(id);
					break;
				case "5":
					System.out.println("�˳�ϵͳ");
	                System.exit(0);
					break;
				default:
					System.out.println("����������������룡");
					break;
			}
		}
	}
}
