package com.edu.seiryo.dao;
/**
 * User数据处理类
 */
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import java.sql.*;
import com.edu.seiryo.entity.User;
/**
 * 
 * User数据处理类
 * @author WANGQI
 * @time 2024年4月25日下午3:02:51
 */
import com.edu.seiryo.util.DBUtil;
public class UserDao {
    DBUtil dbUtil = new DBUtil();
    /**
     * 用户注册
     * @param user
     * @return boolean
     */
    public boolean register(User user) {
    	if(!isUserExist(user.getUserName()) && isUserExist100() ){
    		addUser(user);
    		return true;
    	}
		return false;
    }
    /**
     * 检查用户是否存在
     * @param userName
     * @return boolean
     */
    private boolean isUserExist(String userName) {
        String sql = "select userName,password,email from UserList where userName = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	resultSet = dbUtil.excuteQuery(sql, userName);
        	if(resultSet.next()){
        		bo = true;
        	}
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return bo;
    }
    /**
     * 至多注册100个用户
     * @param userName
     * @return boolean
     */
    private boolean isUserExist100() {
        String sql = "select count(*) from UserList";
        int count = 0;
        ResultSet resultSet = null;
        boolean bo = false;
        try {
    		resultSet = dbUtil.excuteQuery(sql);
        	while (resultSet.next()) {
				count++;
        	}
        	if(count <= 100){
        		bo = true;
        	}
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return bo;
    }
    /**
     * 添加用户到数据库
     * @param user
     */
    public void addUser(User user) {
        String sql = "insert into UserList (userName, password,email) values (?, ?,?)";
        try {
        	dbUtil.excuteUpdate(sql, user.getUserName(),user.getUserPassword(),user.getUserEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
    /**
     * 用户登录
     * @param user
     * @return boolean
     */
    public boolean login(User user) {
        String sql = "select id from UserList where userName = ? and password = ?";
        boolean bo = false;
        ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql, user.getUserName(),user.getUserPassword());
        	bo = resultSet.next();
        	if(bo){
        		return true;
        	}
        } catch (Exception e) {
        	e.printStackTrace();
        }finally {
        	try {
        		dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return false;
    }
    /**
     * 验证用户名邮箱
     * @param userName
     * @param email
     * @return boolean
     */
    public boolean selectUserName(String userName, String email) {
    	String sql = "select id from UserList where userName = ? and email = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	resultSet = dbUtil.excuteQuery(sql, userName,email);
        	if(resultSet.next()){
        		bo = true;
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
		return bo;
    }
    /**
     * 设置新密码
     * @param userName
     * @param newPassword
     */
    //
    public void updateUserPassword(String userName, String newPassword) {
        String sql = "update UserList set password = ? where userName = ?";
        boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql, newPassword,userName);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
			try {
				dbUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
    /**
     * 拿到用户id
     * @param user
     * @return 用户id
     */
    public int selectUserid(User user) {
        String sql = "select id from UserList where userName = ?";
        ResultSet resultSet = null;
        int id = 0;
        try {
        	resultSet = dbUtil.excuteQuery(sql,user.getUserName());
        	if(resultSet.next()){
        		id = resultSet.getInt("id");
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
			try {
				dbUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return id;
    }
}
