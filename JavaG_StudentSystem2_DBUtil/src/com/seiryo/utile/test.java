package com.seiryo.utile;

import com.edu.seiryo.dao.UserDao;

public class test {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		String password = userDao.test("����");
		if("".equals(password)){
			System.out.println("����Ϣ");
		}else {
			System.out.println(password);
		}
	}
}
