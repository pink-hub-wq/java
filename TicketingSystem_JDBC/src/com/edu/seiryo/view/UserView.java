package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.TicketingService;
import com.edu.seiryo.service.UserService;

/**
 * User�����ۺ�
 * @author WANGQI
 *
 */
public class UserView {
	UserService userService = new UserService();
	int id = 0;
	/**
	 * ע����¼
	 * @param flag
	 * @return �û�id
	 */
	public int userController(boolean flag){
		if(flag){
			userService.register();
		}else {
			id = userService.login();
		}
		return id;
	}
}
