package com.edu.seiryo.service;

import java.util.Scanner;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

/**
 * 
 * User业务逻辑控制
 * @author WANGQI
 * @time 2024年4月25日上午11:41:56
 */

public class UserService {
	UserDao userDao = new UserDao();
	Scanner scanner = new Scanner(System.in);	//用户登录
	public boolean login(){
        int count = 0;
        while (true) {
            System.out.println("请输入账号：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();
            boolean bo = userDao.login(new User(name,password));
            if (bo) {
                System.out.println("登陆成功");
                return true;
            } else {
                count++;
                if(count == 3){
                	System.out.println("连续三次登录失败，返回主菜单。");
                	return false;
                }
                System.out.println("账号或密码错误！剩余尝试次数：" + (3 - count));
            }
        }
	}
	//用户注册
	public void register(){
        System.out.println("请输入账号,账号必须符合首字母大写，最后一个字符为特殊符号");
        String userName = scanner.next();
        char firstName = userName.charAt(0);
        char lastName = userName.charAt(userName.length() - 1);
        if(((firstName >= 65 && firstName <= 90 && lastName >= 33 && lastName <= 47) || (firstName >= 65 && firstName <= 90 && lastName >= 58 && lastName <= 64) || (firstName >= 65 && firstName <= 90 && lastName >= 91 && lastName <= 96) || (firstName >= 65 && firstName <= 90 && lastName >= 123 && lastName <= 126)) ){
            System.out.println("账号符合要求");
        } else {
            System.out.println("账号不符合要求,请重新输入");
            register();
            return;
        }
        System.out.println("请输入密码,密码必须符合首字母大写，最后一个字符为特殊符号");
        String userPassword = scanner.next();
        boolean passwordRegist =  passwordRegist(userPassword);
        while (!passwordRegist(userPassword)) {
            System.out.println("密码不符合要求，请重新输入:");
        	System.out.println("密码必须符合首字母大写，最后一个字符为特殊符号");
            userPassword = scanner.next();
        }
    	boolean register = userDao.register(new User(userName,userPassword));
    	if(register){
			System.out.println("用户名重复，请重新注册");
			return;
    	}
        System.out.println("注册成功");
	}
	//验证注册密码逻辑
	public boolean passwordRegist(String userPassword){
		char firstPassword = userPassword.charAt(0);
        char lastPassword = userPassword.charAt(userPassword.length() - 1);
        if(((firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 33 && lastPassword <= 47) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 58 && lastPassword <= 64) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 91 && lastPassword <= 96) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 123 && lastPassword <= 126)) ){
        	return true;
        }
        return false;
	
	}
}
