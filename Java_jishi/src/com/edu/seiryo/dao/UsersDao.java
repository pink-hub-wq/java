package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.Users;

public interface UsersDao {
	/**
	 * ע��
	 * @param users
	 * @return boolean
	 */
	public boolean regist(Users users);
	/**
	 * ����û��Ƿ����
	 * @param users
	 * @return boolean
	 */
	public boolean isUserExist(Users users);
	/**
	 * ��¼
	 * @param users
	 * @return boolean
	 */
	public boolean login(Users users);
	/**
	 * ��ѯ��¼�û����
	 * @param name
	 * @return int
	 */
	public int login(String name);
	/**
	 * ��ѯ������Ϣ
	 * @return
	 */
	public List<Users> queryUsers(int userId);
	/**
	 * �����û�����ʣ��Ǯ��
	 * @param userId
	 * @param money
	 * @return boolean
	 */
	public boolean updateUser_Money(int userId,double money);
	/**
	 * �������ѵ�Ǯ���������û��ȼ�
	 * @param userId
	 * @param money
	 * @return
	 */
	public boolean updateUser_MoneyVip(int userId,double money);
	/**
	 * ��ѯ�û��ȼ�
	 * @param userId
	 * @return int
	 */
	public int selectVipById(int userId);
	/**
	 * ��ѯ�û�����Ǯ���Ƿ��㹻����
	 * @param userId
	 * @param money
	 * @return boolean
	 */
	public boolean selectUser_Money(int userId,double money);
}
