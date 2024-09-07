package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.Users;

public interface UsersDao {
	/**
	 * 注册
	 * @param users
	 * @return boolean
	 */
	public boolean regist(Users users);
	/**
	 * 检查用户是否存在
	 * @param users
	 * @return boolean
	 */
	public boolean isUserExist(Users users);
	/**
	 * 登录
	 * @param users
	 * @return boolean
	 */
	public boolean login(Users users);
	/**
	 * 查询登录用户编号
	 * @param name
	 * @return int
	 */
	public int login(String name);
	/**
	 * 查询个人信息
	 * @return
	 */
	public List<Users> queryUsers(int userId);
	/**
	 * 更新用户手中剩余钱数
	 * @param userId
	 * @param money
	 * @return boolean
	 */
	public boolean updateUser_Money(int userId,double money);
	/**
	 * 根据消费的钱数，更新用户等级
	 * @param userId
	 * @param money
	 * @return
	 */
	public boolean updateUser_MoneyVip(int userId,double money);
	/**
	 * 查询用户等级
	 * @param userId
	 * @return int
	 */
	public int selectVipById(int userId);
	/**
	 * 查询用户手中钱数是否足够购买
	 * @param userId
	 * @param money
	 * @return boolean
	 */
	public boolean selectUser_Money(int userId,double money);
}
