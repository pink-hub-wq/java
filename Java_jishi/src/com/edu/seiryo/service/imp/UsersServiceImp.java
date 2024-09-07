package com.edu.seiryo.service.imp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import com.edu.seiryo.dao.UsersDao;
import com.edu.seiryo.dao.imp.UsersDaoImp;
import com.edu.seiryo.entity.Users;
import com.edu.seiryo.service.UsersService;
import com.edu.seiryo.view.CommodityView;
import com.edu.seiryo.view.UsersView;
/**
 * User业务逻辑控制
 * @author WANGQI
 *
 */
public class UsersServiceImp implements UsersService{
	UsersDao UsersDao = new UsersDaoImp();
	Scanner scanner = new Scanner(System.in);
	boolean flag = false;
	boolean flag2 = false;
	@Override
	/**
	 * 注册
	 */
	public boolean regist() {
	    System.out.println("1.账号注册");
	    System.out.println("2.返回上一级");
	    System.out.println("选择你需要的服务：");
	    String choose = scanner.next();
	    switch (choose) {
	        case "1":
	            System.out.println("请输入想注册的用户名：");
	            String name = scanner.next();
	            System.out.println("请输入密码：");
	            String pwd = scanner.next();
	            System.out.println("请输入性别：");
	            String sex = scanner.next();
	            System.out.println("请输入手机号：");
	            String phone = scanner.next();
	            System.out.println("请输入首冲金额：");
	            double price = scanner.nextDouble();
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	            Date date1 = new Date();
	            String date = dateFormat.format(date1);
	            Users users = new Users(name, pwd, sex,phone, price, date,0);
	            boolean bo2 = isUserExist(users);
	            if (bo2) {
	                System.out.println("用户名重复！");
	                flag = false;
	            } else {
	                boolean registSuccess = UsersDao.regist(users);
	                if (registSuccess) {
	                    System.out.println("注册成功");
	                    flag = true;
	                    break;
	                } else {
	                    System.out.println("注册失败");
	                    flag = false;
	                    break;
	                }
	            }
	        case "2":
	        	 flag = false;
	        	 break;
	        default:
	            System.out.println("您的输入有误！");
	            flag = false;
	    }
		return flag;
	}
	
	/**
	 * 检查用户是否存在
	 */
	@Override
	public boolean isUserExist(Users users) {
		return UsersDao.isUserExist(users);
	}
	/**
	 * 登录
	 */
	@Override
	public int login() {
		int userId = 0;
		System.out.println("1.账号登录");
	    System.out.println("2.返回上一级");
	    System.out.println("选择你需要的服务：");
	    String choose = scanner.next();
	    switch (choose) {
	        case "1":
	            System.out.println("请输入用户名：");
	            String name = scanner.next();
	            System.out.println("请输入密码：");
	            String pwd = scanner.next();
	            Users users = new Users(name, pwd);
	            flag2 = UsersDao.login(users);
	                if (flag2) {
	                    System.out.println("登录成功");
	                    userId = UsersDao.login(name);
	                    CommodityView commodityView = new CommodityView();
	                    commodityView.CommodityController(userId);
	                    flag = true;
	                    
	                } else {
	                    System.out.println("登录失败");
	                    flag = false;
	                }
	        case "2":
	        	 flag2 = false;
	        	 break;
	        default:
	            System.out.println("您的输入有误！");
	            flag2 = false;
	    }
		return userId;
	}
	/**
	 * 更新用户余额
	 */
	@Override
	public boolean updateUser_Money(int userId, double money) {
		return UsersDao.updateUser_Money(userId, money);
	}
	/**
	 * 更新用户等级
	 */
	@Override
	public boolean updateUser_MoneyVip(int userId, double money) {
		return UsersDao.updateUser_MoneyVip(userId, money);
	}
	/**
	 * 查询用户等级
	 */
	@Override
	public int selectVipById(int userId) {
		return UsersDao.selectVipById(userId);
	}
	/**
	 * 查询用户信息
	 */
	@Override
	public void queryUsers(int userId) {
		List<Users> list = UsersDao.queryUsers(userId);
		for (Users users : list) {
			System.out.println("尊敬的" + users.getUserName() + "用户您的信息如下：");
			if(users.getUserVip() == 0){
				System.out.println("会员:" + "普通会员");
			}
			if(users.getUserVip() == 1){
				System.out.println("会员:" + "白银会员（九八折）");
			}
			if(users.getUserVip() == 2){
				System.out.println("会员:" + "黄金会员（九五折）");
			}
			if(users.getUserVip() == 3){
				System.out.println("会员:" + "白金会员（九折）");
			}
			System.out.println("账号:" + users.getUserName());
			System.out.println("手机号:" + users.getUserPhone());
			System.out.println("剩余金额:" + users.getUserMoney());
		}
	}
	/**
	 * 查询用户余额
	 */
	@Override
	public boolean selectUser_Money(int userId, double money) {
		return UsersDao.selectUser_Money(userId, money);
	}

}
