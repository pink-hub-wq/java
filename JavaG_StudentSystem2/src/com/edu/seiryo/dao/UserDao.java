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
public class UserDao {
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String url = "jdbc:sqlserver://localhost:1433;DataBaseName=StudentSystem";
    private static final String username = "sa";
    private static final String pwd = "123";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
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
        String sql = "select count(*) from UserList where userName = ?";
        try {
        	Class.forName(driver);
        	connection = DriverManager.getConnection(url,username,pwd);
        	preparedStatement = connection.prepareStatement(sql);
        	preparedStatement.setString(1, userName);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return false;
    }
    //添加用户到数据库
    private void addUser(User user) {
        String sql = "insert into UserList (userName, userPassword) values (?, ?)";
        try {
        	Class.forName(driver);
        	connection = DriverManager.getConnection(url,username,pwd);
        	preparedStatement = connection.prepareStatement(sql);
        	preparedStatement.setString(1, user.getUserName());
        	preparedStatement.setString(2, user.getUserPassword());
        	preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }

    //用户登录
    public boolean login(User user) {
        String sql = "select userPassword from UserList where userName = ?";
        try {
        	Class.forName(driver);
        	connection = DriverManager.getConnection(url,username,pwd);
        	preparedStatement = connection.prepareStatement(sql);
        	preparedStatement.setString(1, user.getUserName());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next() && resultSet.getString("userPassword").equals(user.getUserPassword())) {
                return true;
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }finally {
        	try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return false;
    }
}
