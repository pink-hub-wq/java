package com.edu.seiryo.entity;
/**
 * Usersʵ����
 * @author WANGQI
 *
 */
public class Users {
	/**
	 * �û����
	 */
	private int userId;
	/**
	 * �û���
	 */
	private String userName;
	/**
	 * �û�����
	 */
	private String userPwd;
	/**
	 * �û��Ա�
	 */
	private String userSex;
	/**
	 * �û��绰
	 */
	private String userPhone;
	/**
	 * �û��˻����
	 */
	private double userMoney;
	/**
	 * ����
	 */
	private String userDate;
	/**
	 * �û��ȼ�
	 */
	private int userVip;
	/**
	 * �вι��죬��������
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
	 * �޲ι��죬��������
	 */
	public Users() {
		super();
	}
	/**
	 * �вι��죬��������
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
	 * �вι��죬��������
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
	 * �вι��죬��������
	 * @param name
	 * @param pwd
	 */
	public Users(String name, String pwd) {
		this.userName = name;
	    this.userPwd = pwd;
	}
	/**
	 * ��ȡ�û�id
	 * @return �û�id
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * �����û�id
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * ��ȡ�û���
	 * @return �û���
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * �����û���
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * ��ȡ�û�����
	 * @return �û�����
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	 * �����û�����
	 * @param userPwd
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * ��ȡ�û��Ա�
	 * @return �û��Ա�
	 */
	public String getUserSex() {
		return userSex;
	}
	/**
	 * �����û��Ա�
	 * @param userSex
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	/**
	 * ��ȡ�û��绰
	 * @return �û��绰
	 */
	public String getUserPhone() {
		return userPhone;
	}
	/**
	 * �����û��绰
	 * @param userPhone
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	/**
	 * ��ȡ�û��˻����
	 * @return �û��˻����
	 */
	public double getUserMoney() {
		return userMoney;
	}
	/**
	 * �����û��˻����
	 * @param userMoney
	 */
	public void setUserMoney(double userMoney) {
		this.userMoney = userMoney;
	}
	/**
	 * ��ȡ����
	 * @return ����
	 */
	public String getUserDate() {
		return userDate;
	}
	/**
	 * ��������
	 * @param userDate
	 */
	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}
	/**
	 * ��ȡ�û��˻��ȼ�
	 * @return �û��˻��ȼ�
	 */
	public int getUserVip() {
		return userVip;
	}
	/**
	 * �����û��˻��ȼ�
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
