package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.service.CarService;
import com.edu.seiryo.service.CommodityService;
import com.edu.seiryo.service.UsersService;
import com.edu.seiryo.service.imp.CarServiceImp;
import com.edu.seiryo.service.imp.CommodityServiceImp;
import com.edu.seiryo.service.imp.UsersServiceImp;
/**
 * ��Ʒ���򣬲�ѯ�����洰��
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
			System.out.println("��ӭ����ĳ�������");
	        System.out.println("1.�鿴��Ʒ");
	        System.out.println("2.������Ʒ");
	        System.out.println("3.�鿴���ﳵ");
	        System.out.println("4.�鿴������Ϣ");
	        System.out.println("5.������һ��");
	        System.out.println("���������ѡ���㽫���еĲ�����");
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
				System.out.println("����������������룡");
				break;
			}
		}
	}
	
}
