package com.edu.seiryo.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.edu.seiryo.entity.User;
/**
 * 
 * User数据处理类
 * @author WANGQI
 * @time 2024年4月25日下午3:02:51
 */
import com.edu.seiryo.util.DBUtil;
import com.seiryo.utile.JDBCUTILE;
public class UserDao {
    DBUtil dbUtil = new DBUtil();
    JDBCUTILE jdbcutile = new JDBCUTILE();
    //用户注册
    public boolean register(User user) {
        if (isUserExist(user.getUserName())) {
            return true;
        } else {
            addUser(user);
            return false;
        }
    }

    //检查用户是否存在
    private boolean isUserExist(String userName) {
        String sql = "select * from UserList where userName = ?";
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
    //添加用户到数据库
    private void addUser(User user) {
        String sql = "insert into UserList (userName, password) values (?, ?)";
        try {
        	dbUtil.excuteUpdate(sql, user.getUserName(),user.getUserPassword());
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

    //用户登录
    public boolean login(User user) {
        String sql = "select id from UserList where userName = ? and password = ?";
        boolean bo = false;
        ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql, user.getUserName(),user.getUserPassword());
        	bo = resultSet.next();
        } catch (Exception e) {
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
    public String test(String userName) {
        String sql = "select userPassword from user where userName = ?";
        boolean bo = false;
        ResultSet resultSet = null;
        String password = "";
        try {
        	resultSet = jdbcutile.selectDataBaseTable(sql,userName);
        	if(resultSet.next()){
        		password = resultSet.getString("userPassword");
        	}
        } catch (Exception e) {
        	e.printStackTrace();
        }finally {
        	try {
        		jdbcutile.dbClose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return password;
    }
}
