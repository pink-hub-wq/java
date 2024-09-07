package com.edu.seiryo.entity;
/**
 * Users实体类
 * @author WANGQI
 *
 */
public class Users {
	/**
	 * 用户编号
	 */
	private int userId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 用户密码
	 */
	private String userPwd;
	/**
	 * 用户性别
	 */
	private String userSex;
	/**
	 * 用户电话
	 */
	private String userPhone;
	/**
	 * 用户账户金额
	 */
	private double userMoney;
	/**
	 * 日期
	 */
	private String userDate;
	/**
	 * 用户等级
	 */
	private int userVip;
	/**
	 * 有参构造，创建对象
	 * @param userId
	 * @param userName
	 * @param userPwd
	 * @param userSex
	 * @param userPhone
	 * @param userMoney
	 * @param userDate
	 * @param userVip
	 */
	public Users(int userId, String userName, String userPwd, String userSex, String userPhone, double userMoney,
			String userDate, int userVip) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userSex = userSex;
		this.userPhone = userPhone;
		this.userMoney = userMoney;
		this.userDate = userDate;
		this.userVip = userVip;
	}
	/**
	 * 无参构造，创建对象
	 */
	public Users() {
		super();
	}
	/**
	 * 有参构造，创建对象
	 * @param name
	 * @param pwd
	 * @param sex
	 * @param phone
	 * @param price
	 * @param date
	 */
	public Users(String name, String pwd, String sex, String phone, double price, String date) {
	    this.userName = name;
	    this.userPwd = pwd;
	    this.userSex = sex;
	    this.userPhone = phone;
	    this.userMoney = price;
	    this.userDate = date;
	}
	/**
	 * 有参构造，创建对象
	 * @param name
	 * @param pwd
	 * @param sex
	 * @param phone
	 * @param price
	 * @param date
	 * @param userVip
	 */
	public Users(String name, String pwd, String sex, String phone, double price, String date,int userVip) {
		   this.userName = name;
		    this.userPwd = pwd;
		    this.userSex = sex;
		    this.userPhone = phone;
		    this.userMoney = price;
		    this.userDate = date;
		    this.userVip = userVip;
	}
	/**
	 * 有参构造，创建对象
	 * @param name
	 * @param pwd
	 */
	public Users(String name, String pwd) {
		this.userName = name;
	    this.userPwd = pwd;
	}
	/**
	 * 获取用户id
	 * @return 用户id
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 设置用户id
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 获取用户名
	 * @return 用户名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置用户名
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取用户密码
	 * @return 用户密码
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	 * 设置用户密码
	 * @param userPwd
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * 获取用户性别
	 * @return 用户性别
	 */
	public String getUserSex() {
		return userSex;
	}
	/**
	 * 设置用户性别
	 * @param userSex
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	/**
	 * 获取用户电话
	 * @return 用户电话
	 */
	public String getUserPhone() {
		return userPhone;
	}
	/**
	 * 设置用户电话
	 * @param userPhone
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	/**
	 * 获取用户账户金额
	 * @return 用户账户金额
	 */
	public double getUserMoney() {
		return userMoney;
	}
	/**
	 * 设置用户账户金额
	 * @param userMoney
	 */
	public void setUserMoney(double userMoney) {
		this.userMoney = userMoney;
	}
	/**
	 * 获取日期
	 * @return 日期
	 */
	public String getUserDate() {
		return userDate;
	}
	/**
	 * 设置日期
	 * @param userDate
	 */
	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}
	/**
	 * 获取用户账户等级
	 * @return 用户账户等级
	 */
	public int getUserVip() {
		return userVip;
	}
	/**
	 * 设置用户账户等级
	 * @param userVip
	 */
	public void setUserVip(int userVip) {
		this.userVip = userVip;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userSex=" + userSex
				+ ", userPhone=" + userPhone + ", userMoney=" + userMoney + ", userDate=" + userDate + ", userVip="
				+ userVip + "]";
	}
	
}
