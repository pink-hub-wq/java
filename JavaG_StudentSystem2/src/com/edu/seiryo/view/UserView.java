package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.service.StudentService;
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
	StudentView studentView = new StudentView();
	public void userController(){
		boolean flag = false;
		while (!flag) {
			System.out.println("欢迎使用青凌学生管理系统");
	        System.out.println("1.登录");
	        System.out.println("2.注册");
	        System.out.println("请输入1或2选择你将进行的操作：");
	        String choose = scanner.next();
	        switch (choose) {
			case "1":
				//用户登录是否成功
				flag = userService.login();
				//如果用户登录成功，判断用户是要继续还是终止
				if(flag){
					//如果用户选择终止，回到主界面
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
				System.out.println("输入错误，请重新输入！");
				userController();
			}
		}
	}
}
