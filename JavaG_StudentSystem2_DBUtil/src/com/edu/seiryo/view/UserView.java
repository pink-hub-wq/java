package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.service.StudentService;
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
	StudentView studentView = new StudentView();
	public void userController(){
		boolean flag = false;
		while (!flag) {
			System.out.println("��ӭʹ������ѧ������ϵͳ");
	        System.out.println("1.��¼");
	        System.out.println("2.ע��");
	        System.out.println("������1��2ѡ���㽫���еĲ�����");
	        String choose = scanner.next();
	        switch (choose) {
			case "1":
				//�û���¼�Ƿ�ɹ�
				flag = userService.login();
				//����û���¼�ɹ����ж��û���Ҫ����������ֹ
				if(flag){
					//����û�ѡ����ֹ���ص�������
					if (!studentView.studentController()) {
	                    flag = false;
	                }else {
						return;
					}
				}
				break;
			case "2":
				userService.register();
				break;
			default:
				System.out.println("����������������룡");
				userController();
			}
		}
	}
}
