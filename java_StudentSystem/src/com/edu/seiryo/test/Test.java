package com.edu.seiryo.test;

import com.edu.seiryo.view.StudentView;
import com.edu.seiryo.view.UserView;

/**
 * 
 * ������
 * @author WANGQI
 * @time 2024��4��25������1:05:47
 */
public class Test {
	public static void main(String[] args) {
		UserView userView = new UserView();
		userView.userController();
		StudentView studentView = new StudentView();
		studentView.studentController();
	}
}
