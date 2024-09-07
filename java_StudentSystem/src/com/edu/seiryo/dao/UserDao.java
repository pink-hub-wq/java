package com.edu.seiryo.dao;

import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.entity.User;

/**
 * 
 * User数据处理类
 * @author WANGQI
 * @time 2024年4月25日上午11:31:12
 */
public class UserDao {
	List<User> list = new ArrayList<User>();
	//用户注册，存入数据
	public boolean register(User user){
		for (int i = 0; i < list.size(); i++) {
			if(user.getUserName().equals(list.get(i).getUserName())){
				return true;
			}
		}
		list.add(user);
		return false;
	}
	//用户登录，把输入的账号密码与集合中的信息对比
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
