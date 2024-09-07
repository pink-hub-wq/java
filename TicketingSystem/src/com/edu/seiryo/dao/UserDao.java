package com.edu.seiryo.dao;

import java.util.List;
import java.sql.*;
import com.edu.seiryo.entity.User;
/**
 * 
 * User���ݴ�����
 * @author WANGQI
 * @time 2024��4��25������3:02:51
 */
import com.edu.seiryo.util.DBUtil;
public class UserDao {
    DBUtil dbUtil = new DBUtil();
    //�û�ע��
    public boolean register(User user) {
    	if(!isUserExist(user.getUserName()) && isUserExist100(user.getUserName()) ){
    		addUser(user);
    		return true;
    	}
		return false;
    }

    //����û��Ƿ����
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
    //����ע��100���û�
    private boolean isUserExist100(String userName) {
        String sql = "select count(*) from UserList";
        int count = 0;
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	if(resultSet != null){
        		resultSet = dbUtil.excuteQuery(sql, userName);
            	while (resultSet.next()) {
    				count++;
    			}	
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
    //����û������ݿ�
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

    //�û���¼
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
    //��֤�û�������
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
    //�һ�����
    public void updateUserPassword(String userName, String newPassword) {
        String sql = "UPDATE UserList SET password = ? WHERE userName = ?";
        boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql, newPassword,userName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
