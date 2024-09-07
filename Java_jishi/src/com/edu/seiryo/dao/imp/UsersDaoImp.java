package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.UsersDao;
import com.edu.seiryo.entity.Users;
import com.edu.seiryo.util.DBUtil;
/**
 * User���ݴ�����
 * @author WANGQI
 *
 */
public class UsersDaoImp implements UsersDao{
	/**
	 * ע��
	 */
	@Override
	public boolean regist(Users users) {
		boolean flag = isUserExist(users);
		boolean bo = false;
		if(!flag){
			String sql = "insert into User_Info (User_Name, User_pwd, User_gender, User_phone, User_Money, User_Date, User_vip) values (?, ?, ?, ?, ?, ?, ?)";

			try {
				bo = DBUtil.excuteUpdate(sql, users.getUserName(),users.getUserPwd(),users.getUserSex(),users.getUserPhone(),users.getUserMoney(),users.getUserDate(),users.getUserVip());
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally{
				try {
					DBUtil.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return bo;
	}
	/**
	 * ����û��Ƿ����
	 */
	@Override
	public boolean isUserExist(Users users) {
		String sql = "select User_Id from User_Info where User_Name = ?";
		boolean bo = false;
		ResultSet resultSet = null;
		try {
			resultSet = DBUtil.excuteQuery(sql, users.getUserName());
			if(resultSet.next()){
				bo = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * ��¼
	 */
	@Override
	public boolean login(Users users) {
		String sql = "select User_Id from User_Info where User_Name = ? and User_pwd = ?";
		boolean bo = false;
		ResultSet resultSet = null;
		try {
			resultSet = DBUtil.excuteQuery(sql, users.getUserName(),users.getUserPwd());
			if(resultSet.next()){
				bo = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * ��ѯ��¼�û����
	 */
	@Override
	public int login(String name) {
		String sql = "select User_Id from User_Info where User_Name = ?";
		boolean bo = false;
		ResultSet resultSet = null;
		int id = 0;
		try {
			resultSet = DBUtil.excuteQuery(sql,name);
			if(resultSet.next()){
				id = resultSet.getInt("User_Id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return id;
	}
	/**
	 * ��ѯ������Ϣ
	 */
	@Override
	public List<Users> queryUsers(int userId) {
		List<Users> list = new ArrayList<Users>();
		String sql = "select User_vip,User_Name,User_phone,User_Money from User_Info where User_Id = ?";
		boolean bo = false;
		ResultSet resultSet = null;
		try {
			resultSet = DBUtil.excuteQuery(sql, userId);
			while(resultSet.next()){
				Users users = new Users();
				users.setUserVip(resultSet.getInt("User_vip"));
				users.setUserName(resultSet.getString("User_Name"));
				users.setUserPhone(resultSet.getString("User_phone"));
				users.setUserMoney(resultSet.getDouble("User_Money"));
				list.add(users);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	/**
	 * �����û�����ʣ��Ǯ��
	 */
	@Override
	public boolean updateUser_Money(int userId,double money) {
		String sql = "update User_Info set User_Money = User_Money - ? where User_Id = ?";
		boolean bo = false;
		try {
			bo = DBUtil.excuteUpdate(sql, money,userId);
			if(bo){
				bo = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * �������ѵ�Ǯ���������û��ȼ�
	 */
	@Override
	public boolean updateUser_MoneyVip(int userId, double money) {
		String sql = "update User_Info set User_vip = ? where User_Id = ?";
		boolean bo = false;
		try {
			if(money > 500){
				bo = DBUtil.excuteUpdate(sql, 1,userId);
			}
			if(money > 1500){
				bo = DBUtil.excuteUpdate(sql, 2,userId);
			}
			if(money > 3000){
				bo = DBUtil.excuteUpdate(sql, 3,userId);
			}
			if(bo){
				bo = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * ��ѯ�û��ȼ�
	 */
	@Override
	public int selectVipById(int userId) {
		String sql = "select User_vip from  User_Info  where User_Id = ?";
		int vip = 0;
		boolean bo = false;
		ResultSet resultSet = null;
		try {
			resultSet = DBUtil.excuteQuery(sql,userId);
			if(resultSet.next()){
				vip = resultSet.getInt("User_vip");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vip;
	}
	/**
	 * ��ѯ�û�����Ǯ���Ƿ��㹻����
	 */
	@Override
	public boolean selectUser_Money(int userId, double money) {
		String sql = "select User_Id from User_Info where User_Id = ? and User_Money >= ? ";
		boolean bo = false;
		ResultSet resultSet = null;
		try {
			resultSet = DBUtil.excuteQuery(sql, userId,money);
			if(resultSet.next()){
				bo = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bo;
	}

}
