package com.edu.seiryo.dao;

import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.entity.User;

/**
 * 
 * User���ݴ�����
 * @author WANGQI
 * @time 2024��4��25������11:31:12
 */
public class UserDao {
	List<User> list = new ArrayList<User>();
	//�û�ע�ᣬ��������
	public boolean register(User user){
		for (int i = 0; i < list.size(); i++) {
			if(user.getUserName().equals(list.get(i).getUserName())){
				return true;
			}
		}
		list.add(user);
		return false;
	}
	//�û���¼����������˺������뼯���е���Ϣ�Ա�
	public boolean login(User user){
		for (int i = 0; i < list.size(); i++) {
			User nowLoginUser = list.get(i);
			if(nowLoginUser.getUserName().equals(user.getUserName()) && nowLoginUser.getUserPassword().equals(user.getUserPassword())){
				return true;
			}
		}
		return false;
	}
}
