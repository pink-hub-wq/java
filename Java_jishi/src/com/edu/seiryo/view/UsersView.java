package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.service.CommodityService;
import com.edu.seiryo.service.UsersService;
import com.edu.seiryo.service.imp.CommodityServiceImp;
import com.edu.seiryo.service.imp.UsersServiceImp;
/**
 * �û���¼ע�������洰��
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
			System.out.println("��ӭ����ĳ�������");
	        System.out.println("1.������תת");
	        System.out.println("2.ע�����˺�");
	        System.out.println("3.�ټ���");
	        System.out.println("���������ѡ���㽫���еĲ�����");
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
				System.out.println("�����˳�");
				System.exit(0);
				break;
			default:
				System.out.println("����������������룡");
				break;
			}
		}
	}
}
