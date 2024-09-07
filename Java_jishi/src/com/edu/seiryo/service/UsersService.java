package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.Users;

public interface UsersService {
	/**
	 * ע��
	 * @return true�ɹ�/falseʧ��
	 */
	public boolean regist();
	/**
	 * ��ѯ�û��Ƿ����
	 * @param users
	 * @return true�ɹ�/falseʧ��
	 */
	public boolean isUserExist(Users users);
	/**
	 * ��ѯ��¼�û����
	 * @return userId
	 */
	public int login();
	/**
	 * ��ѯ�û���Ϣ
	 * @param userId
	 */
	public void queryUsers(int userId);
	/**
	 * �����û����
	 * @param userId
	 * @param money
	 * @return true�ɹ�/falseʧ��
	 */
	public boolean updateUser_Money(int userId,double money);
	/**
	 * 
	 * @param userId
	 * @param money
	 * @return true�ɹ�/falseʧ��
	 */
	public boolean updateUser_MoneyVip(int userId,double money);
	/**
	 * ��ѯ�û��ȼ�
	 * @param userId
	 * @return user_Vip
	 */
	public int selectVipById(int userId);
	/**
	 * ��ѯ�û����
	 * @param userId
	 * @param money
	 * @return true�ɹ�/falseʧ��
	 */
	public boolean selectUser_Money(int userId, double money);
}
