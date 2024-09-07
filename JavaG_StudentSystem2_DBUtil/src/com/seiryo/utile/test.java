package com.seiryo.utile;

import com.edu.seiryo.dao.UserDao;

public class test {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		String password = userDao.test("张三");
		if("".equals(password)){
			System.out.println("无信息");
		}else {
			System.out.println(password);
		}
	}
}
