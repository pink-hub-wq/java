package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.Users;

public interface UsersService {
	/**
	 * 注册
	 * @return true成功/false失败
	 */
	public boolean regist();
	/**
	 * 查询用户是否存在
	 * @param users
	 * @return true成功/false失败
	 */
	public boolean isUserExist(Users users);
	/**
	 * 查询登录用户编号
	 * @return userId
	 */
	public int login();
	/**
	 * 查询用户信息
	 * @param userId
	 */
	public void queryUsers(int userId);
	/**
	 * 更新用户余额
	 * @param userId
	 * @param money
	 * @return true成功/false失败
	 */
	public boolean updateUser_Money(int userId,double money);
	/**
	 * 
	 * @param userId
	 * @param money
	 * @return true成功/false失败
	 */
	public boolean updateUser_MoneyVip(int userId,double money);
	/**
	 * 查询用户等级
	 * @param userId
	 * @return user_Vip
	 */
	public int selectVipById(int userId);
	/**
	 * 查询用户余额
	 * @param userId
	 * @param money
	 * @return true成功/false失败
	 */
	public boolean selectUser_Money(int userId, double money);
}
