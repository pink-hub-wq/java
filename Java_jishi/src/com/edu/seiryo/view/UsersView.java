package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.service.CommodityService;
import com.edu.seiryo.service.UsersService;
import com.edu.seiryo.service.imp.CommodityServiceImp;
import com.edu.seiryo.service.imp.UsersServiceImp;
/**
 * 用户登录注册主界面窗口
 * @author WANGQI
 *
 */
public class UsersView {
	Scanner scanner = new Scanner(System.in);
	UsersService usersService = new UsersServiceImp();
	CommodityService commodityService = new CommodityServiceImp();
	CommodityView commodityView = new CommodityView();
	boolean bo = false;
	int userId = 0;
	public void userController(){
		boolean flag = false;
		while (!flag) {
			System.out.println("欢迎来到某宝购物店");
	        System.out.println("1.到店里转转");
	        System.out.println("2.注册新账号");
	        System.out.println("3.再见！");
	        System.out.println("请输入序号选择你将进行的操作：");
	        String choose = scanner.next();
	        switch (choose) {
			case "1":
				userId = usersService.login();
				if(userId != 0){
					commodityView.CommodityController(userId);
				}
				break;
			case "2":
				usersService.regist();
				break;
			case "3":
				System.out.println("程序退出");
				System.exit(0);
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				break;
			}
		}
	}
}
