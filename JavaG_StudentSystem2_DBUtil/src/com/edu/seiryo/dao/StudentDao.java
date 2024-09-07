package com.edu.seiryo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.entity.Student;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;

/**
 * 
 * Student���ݴ�����
 * @author WANGQI
 * @time 2024��4��25������2:04:31
 */
public class StudentDao {
	DBUtil dbUtil = new DBUtil();

//	1����ʾ����ѧ����Ϣ
	public List<Student> queryStudents(){
		List<Student> list = new ArrayList<>();
	    String sql = "select id,name,gender,age,class from StudentsList";
	    ResultSet resultSet = null;
	    try {
	    	 resultSet = dbUtil.excuteQuery(sql);
	         while (resultSet.next()) {
	            Student student = new Student();
	            student.setStudentId(resultSet.getInt("id"));
	            student.setStudentName(resultSet.getString("name"));
	            student.setStudentGender(resultSet.getString("gender"));
	            student.setAge(resultSet.getInt("age"));
	            student.setClassNumber(resultSet.getString("class"));
	            list.add(student);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    return list;
	}
//	2�����ݱ�Ų�ѯѧ����Ϣ
	public Student queryStudentById(int id){
		String sql = "select id,name,gender,age,class from StudentsList where id = ?";
		ResultSet resultSet = null;
	    try {
	    	resultSet = dbUtil.excuteQuery(sql, id);
            if (resultSet.next()) {
                Student student = new Student();
                student.setStudentId(resultSet.getInt("id"));
                student.setStudentName(resultSet.getString("name"));
                student.setStudentGender(resultSet.getString("gender"));
                student.setAge(resultSet.getInt("age"));
                student.setClassNumber(resultSet.getString("class"));
                return student;
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
	    return null;
    }
//	3�����ݱ���޸�ѧ������
	public boolean updateStudentAgeById(int id, int age) {
	    String sql = "update StudentsList set age = ? where id = ?";
	    boolean bo = false;
	    try {
	    	 bo = dbUtil.excuteUpdate(sql, age,id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}

//	4�����������޸�ѧ���༶
	public boolean updateStudentClassByName(String name,String classNumber){
		String sql = "update StudentsList set class = ? where name = ?";
		boolean bo = false;
		 try {
			 bo = dbUtil.excuteUpdate(sql, classNumber,name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
//	5�����ݰ༶��ѯȫ��ѧ����Ϣ
	public List<Student> queryStudentByClass(String classNumber) {
	    List<Student> list = new ArrayList<>();
	    String sql = "select id,name,gender,age,class from StudentsList where class = ?";
	    ResultSet resultSet = null;
	    boolean bo = false;
	    try {
	         resultSet = dbUtil.excuteQuery(sql, classNumber);
	         while (resultSet.next()) {
	            Student student = new Student();
	            student.setStudentId(resultSet.getInt("id"));
	            student.setStudentName(resultSet.getString("name"));
	            student.setStudentGender(resultSet.getString("gender"));
	            student.setAge(resultSet.getInt("age"));
	            student.setClassNumber(resultSet.getString("class"));
	            list.add(student);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }finally {
        	try {
				dbUtil.close();
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    return list;
	}
}
