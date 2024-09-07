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

/**
 * 
 * Student数据处理类
 * @author WANGQI
 * @time 2024年4月25日下午2:04:31
 */
public class StudentDao {
	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String url = "jdbc:sqlserver://localhost:1433;DataBaseName=StudentSystem";
    private static final String username = "sa";
    private static final String pwd = "123";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

//	1、显示所有学生信息
	public List<Student> queryStudents(){
		List<Student> students = new ArrayList<>();
	    String sql = "select * from StudentsList";
	    try {
	    	 Class.forName(driver);
	    	 connection = DriverManager.getConnection(url,username,pwd);
	         preparedStatement = connection.prepareStatement(sql);
	         resultSet = preparedStatement.executeQuery();
	         while (resultSet.next()) {
	            Student student = new Student();
	            student.setStudentId(resultSet.getInt("id"));
	            student.setStudentName(resultSet.getString("name"));
	            student.setStudentGender(resultSet.getString("gender"));
	            student.setAge(resultSet.getInt("age"));
	            student.setClassNumber(resultSet.getString("class"));
	            students.add(student);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
        	try {
				preparedStatement.close();
				connection.close();
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    return students;
	}
//	2、根据编号查询学生信息
	public Student queryStudentById(int id){
		String sql = "select * from StudentsList where id = ?";
	    try {
	    	 Class.forName(driver);
	    	 connection = DriverManager.getConnection(url,username,pwd);
	         preparedStatement = connection.prepareStatement(sql);
	         preparedStatement.setInt(1, id);
	         ResultSet resultSet = preparedStatement.executeQuery();
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
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    return null;
    }
//	3、根据编号修改学生年龄
	public boolean updateStudentAgeById(int id, int age) {
	    String sql = "update StudentsList set age = ? where id = ?";
	    try {
	    	 Class.forName(driver);
	    	 connection = DriverManager.getConnection(url,username,pwd);
	         preparedStatement = connection.prepareStatement(sql);
	         preparedStatement.setInt(1, age);
	         preparedStatement.setInt(2, id);
	         if(preparedStatement.executeUpdate() > 0){
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

//	4、根据姓名修改学生班级
	public boolean updateStudentClassByName(String name,String classNumber){
		String sql = "update StudentsList set class = ? where name = ?";
		 try {
			 Class.forName(driver);
	    	 connection = DriverManager.getConnection(url,username,pwd);
	         preparedStatement = connection.prepareStatement(sql);
	         preparedStatement.setString(1, classNumber);
	         preparedStatement.setString(2, name);
	         if(preparedStatement.executeUpdate() > 0){
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
//	5、根据班级查询全部学生信息
	public List<Student> queryStudentByClass(String classNumber) {
	    List<Student> students = new ArrayList<>();
	    String sql = "select * from StudentsList where class = ?";
	    try {
	    	 Class.forName(driver);
	    	 connection = DriverManager.getConnection(url,username,pwd);
	         preparedStatement = connection.prepareStatement(sql);
	         preparedStatement.setString(1, classNumber);
	         resultSet = preparedStatement.executeQuery();
	         while (resultSet.next()) {
	            Student student = new Student();
	            student.setStudentId(resultSet.getInt("id"));
	            student.setStudentName(resultSet.getString("name"));
	            student.setStudentGender(resultSet.getString("gender"));
	            student.setAge(resultSet.getInt("age"));
	            student.setClassNumber(resultSet.getString("class"));
	            students.add(student);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }finally {
        	try {
				preparedStatement.close();
				connection.close();
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    return students;
	}
}
