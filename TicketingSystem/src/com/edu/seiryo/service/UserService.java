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
	public User login(){
        int count = 0;
        while (true) {
        	User user = new User();
            System.out.println("请输入账号：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();
            user.setUserName(name);
            user.setUserPassword(password);
            boolean bo = userDao.login(user);
            if (bo) {
                System.out.println("登陆成功");
                return user;
            }
            count++;
            System.out.println("账号或密码错误！剩余尝试次数：" + (3 - count));   
                boolean bo2 = false;
                if(count == 3){
                	bo2 = true;
                	System.out.println("连续三次登录失败，进入找回密码功能。");
                	while(bo2){
                		System.out.println("请输入账号：");
                        String forgetName = scanner.next();
                        System.out.println("请输入邮箱：");
                        String forgetemail = scanner.next();
                        if(userDao.selectUserName(forgetName,forgetemail)){
                        	System.out.println("输入正确，请重新设置密码：");
                        	String newPassword = scanner.next();
                        	userDao.updateUserPassword(newPassword, forgetName);
                        	System.out.println("重置成功");
                        	break;
                        }else{
                        	System.out.println("输入错误，是否继续输入");
                        	String choose = scanner.next();
                        	if(choose.equals("是")){
                        		continue;
                        	}else {
								break;
							}
                        }                   
                }
               
            }
        }
	}
	//用户注册
	public boolean register(){
        System.out.println("请输入用户名：");
        String userName = scanner.next();
        char[] userNameChar = userName.toCharArray();
        for (int i = 0; i < userNameChar.length; i++) {
        	if (!((userNameChar[i] >= '0' && userNameChar[i] <= '9') || (userNameChar[i] >= 'a' && userNameChar[i] <= 'z'))) {
                System.out.println("用户名只可以使用小写英文字母或数字");
                return false;
            }
		}
        if(userName.length() <= 6){
        	System.out.println("用户名要大于6位");
            return false;
        }
        System.out.println("请输入密码：");
        String userPassword = scanner.next();
        System.out.println("请输入邮箱：");
        String email = scanner.next();
        boolean register = userDao.register(new User(userName,userPassword,email));
    	if(!register){
			System.out.println("用户名重复，请重新注册");
			return false;
    	}
        System.out.println("注册成功");
		return true;
	}
//	//验证注册密码逻辑
//	public boolean passwordRegist(String userPassword){
//		char firstPassword = userPassword.charAt(0);
//        char lastPassword = userPassword.charAt(userPassword.length() - 1);
//        if(((firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 33 && lastPassword <= 47) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 58 && lastPassword <= 64) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 91 && lastPassword <= 96) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 123 && lastPassword <= 126)) ){
//        	return true;
//        }
//        return false;
//	
//	}
}
