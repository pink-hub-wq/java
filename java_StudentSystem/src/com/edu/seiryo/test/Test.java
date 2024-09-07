package com.edu.seiryo.test;

import com.edu.seiryo.view.StudentView;
import com.edu.seiryo.view.UserView;

/**
 * 
 * 测试类
 * @author WANGQI
 * @time 2024年4月25日下午1:05:47
 */
public class Test {
	public static void main(String[] args) {
		UserView userView = new UserView();
		userView.userController();
		StudentView studentView = new StudentView();
		studentView.studentController();
	}
}
