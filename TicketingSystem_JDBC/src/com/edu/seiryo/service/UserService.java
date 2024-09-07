package com.edu.seiryo.service;

import java.util.Scanner;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

/**
 * User业务逻辑控制
 * @author WANGQI
 *
 */
public class UserService {
	UserDao userDao = new UserDao();
	Scanner scanner = new Scanner(System.in);
	boolean bo2 = false;
	/**
	 * 用户登录
	 * @return 用户id
	 */
	public int login(){
        int count = 0;
        int id = 0;
        while (count < 3) {
        	User user = new User();
            System.out.println("请输入账号：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();
            user.setUserName(name);
            user.setUserPassword(password);
            bo2 = userDao.login(user);
            if (bo2) {
            	id = selectUserid(user);
                System.out.println("登陆成功");
                return id;
            }
            count++;
            System.out.println("账号或密码错误！剩余尝试次数：" + (3 - count));
        }
            if(count == 3){
            	System.out.println("连续三次登录失败，进入找回密码功能。");
            	while(true){
            		boolean bo2 = false;
            		bo2 = findPwd();
            		if(bo2){
            			break;
            		}else {
						break;
					}
               }          
            }
            return id;
        }
	/**
	 * 用户注册
	 * @return boolean
	 */
	public boolean register(){
		String userName = "";
		while(true){
			boolean bo = false;
			System.out.println("请输入用户名：");
	        userName = scanner.next();
	        bo = nameRegist(userName);
	        if(bo){
	        	break;
	        }
	        System.out.println("用户名不符合要求，请重新输入");
		}
	        System.out.println("请输入密码：");
	        String userPassword = scanner.next();
	        System.out.println("请输入邮箱：");
	        String email = scanner.next();
	        User user = new User();
	        boolean register = userDao.register(new User(userName,userPassword,email));
	    	if(!register){
				System.out.println("用户名重复，请重新注册");
				return false;
	    	}
	        System.out.println("注册成功");
			return true;    
	}
	/**
	 * 验证用户名
	 * @param userName
	 * @return boolean
	 */
	public boolean nameRegist(String userName){
		if(userName.length() < 6){
			return false;
		}
		for (int i = 0; i < userName.length(); i++) {
			char c = userName.charAt(i);
        	if (!((c >= 97 && c <= 122) || (c >= 48 && c <= 57))) {
                return false;
            }
		}
		return true;
	}
	/**
	 * 找回密码
	 * @return boolean
	 */
	public boolean findPwd(){
		System.out.println("请输入账号：");
        String forgetName = scanner.next();
        System.out.println("请输入邮箱：");
        String forgetemail = scanner.next();
        if(userDao.selectUserName(forgetName,forgetemail)){
        	System.out.println("输入正确，请重新设置密码：");
        	String newPassword = scanner.next();
        	userDao.updateUserPassword(forgetName,newPassword);
        	System.out.println("重置成功");
        	return true;
        }else{
        	System.out.println("输入错误，是否继续输入");
        	String choose = scanner.next();
        	if(choose.equals("是")){
        		findPwd();
        	}
        }
		return false;
	}
	/**
	 * 拿到登录用户的id
	 * @param user
	 * @return
	 */
	public int selectUserid(User user){
		int id = 0;
		id =  userDao.selectUserid(user);
		return id;
	}
}
