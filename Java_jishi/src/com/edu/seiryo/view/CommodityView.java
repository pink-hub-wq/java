package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.service.CarService;
import com.edu.seiryo.service.CommodityService;
import com.edu.seiryo.service.UsersService;
import com.edu.seiryo.service.imp.CarServiceImp;
import com.edu.seiryo.service.imp.CommodityServiceImp;
import com.edu.seiryo.service.imp.UsersServiceImp;
/**
 * 商品购买，查询主界面窗口
 * @author WANGQI
 *
 */
public class CommodityView {
	Scanner scanner = new Scanner(System.in);
	CommodityService commodityService = new CommodityServiceImp();
	CarService carService = new CarServiceImp();
	UsersService usersService = new UsersServiceImp();
	
	String choose;
	boolean flag = false;
	public void CommodityController(int userId){
		while (!flag) {
			System.out.println("欢迎来到某宝购物店");
	        System.out.println("1.查看商品");
	        System.out.println("2.购买商品");
	        System.out.println("3.查看购物车");
	        System.out.println("4.查看个人信息");
	        System.out.println("5.返回上一层");
	        System.out.println("请输入序号选择你将进行的操作：");
	        choose = scanner.next();
	        switch (choose) {
			case "1":
				commodityService.queryCommodityNameAndInfo();
				break;
			case "2":
				commodityService.queryCommodity(userId);
				break;
			case "3":
				carService.selectCar(userId);;
				break;
			case "4":
				usersService.queryUsers(userId);
				break;
			case "5":
				flag = true;
				UsersView usersView = new UsersView();
				usersView.userController();
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				break;
			}
		}
	}
	
}
