package com.edu.seiryo.dao;

import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.entity.Student;

/**
 * 
 * Student数据处理类
 * @author WANGQI
 * @time 2024年4月25日下午2:04:31
 */
public class StudentDao {
	//创建学生集合，并默认内置五个学生的对象
	static List<Student> list = new ArrayList<Student>();
	static {
	    list.add(new Student(1, "张三", '男', 20, "11301"));
	    list.add(new Student(2, "李四", '男', 21, "11302"));
	    list.add(new Student(3, "王五", '男', 20, "11301"));
	    list.add(new Student(4, "麻六", '男', 19, "11301"));
	    list.add(new Student(5, "赵七", '男', 18, "11301"));
	}
//	1、显示所有学生信息
	public List<Student> queryStudents(){
		return list;
	}
//	2、根据编号查询学生信息
	public Student queryStudentById(int id){
		for (int i = 0; i < list.size(); i++) {
			if(id == list.get(i).getStudentId()){
				return list.get(i);
			}
		}
		return null;
	}
//	3、根据编号修改学生年龄
	public boolean updateStudentAgeById(int id,int age){
		for (int i = 0; i < list.size(); i++) {
			if(id == list.get(i).getStudentId()){
				list.get(i).setAge(age);
				return true;
			}
		}
		return false;
	}
//	4、根据姓名修改学生班级
	public boolean updateStudentClassByName(String name,String classNumber){
		for (int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getStudentName())){
				list.get(i).setClassNumber(classNumber);
				return true;
			}
		}
		return false;
	}
//	5、根据班级查询全部学生信息
	public List<Student> queryStudentByClass(String classNumber){
		List<Student> newlist = new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			if(classNumber.equals(list.get(i).getClassNumber())){
				newlist.add(list.get(i));
			}
		}
		return newlist;
	}
}
