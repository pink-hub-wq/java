package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.TicketingService;
import com.edu.seiryo.service.UserService;

/**
 * User方法综合
 * @author WANGQI
 *
 */
public class UserView {
	UserService userService = new UserService();
	int id = 0;
	/**
	 * 注册或登录
	 * @param flag
	 * @return 用户id
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
