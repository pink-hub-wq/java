package com.edu.seiryo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.seiryo.dao.StudentDao;
import com.edu.seiryo.entity.Student;
/**
 * 
 * Student业务逻辑控制
 * @author WANGQI
 * @time 2024年4月25日下午2:32:24
 */
public class StudentService {
	StudentDao studentDao = new StudentDao();
	Scanner scanner = new Scanner(System.in);
//	1、显示所有学生信息
	public void queryStudents(){
		List<Student> list = studentDao.queryStudents();
		System.out.println("编号\t姓名\t性别\t年龄\t班级");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getStudentId()+"\t");
			System.out.print(list.get(i).getStudentName()+"\t");
			System.out.print(list.get(i).getStudentGender()+"\t");
			System.out.print(list.get(i).getAge()+"\t");
			System.out.println(list.get(i).getClassNumber()+"\t");
		}
	}
//	2、根据编号查询学生信息
	public void queryStudentById(){
		System.out.println("请输入要查询的编号：");
		int id = scanner.nextInt();
		Student student = studentDao.queryStudentById(id);
		if(student != null){
			System.out.println("编号\t姓名\t性别\t年龄\t班级");
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getStudentGender()+"\t"+student.getAge()+"\t"+student.getClassNumber()+"\t");
		}else{
			System.out.println("您输入的编号不存在");
		}
	}
////	3、根据编号修改学生年龄
	public void updateStudentAgeById(){
		System.out.println("请输入要修改年龄的学生编号：");
		int id = scanner.nextInt();
		System.out.println("请输入要修改的学生年龄：");
		int age = scanner.nextInt();
		boolean flag = studentDao.updateStudentAgeById(id,age);
		if(!flag){
			System.out.println("没有查询到该学生");
		}
		if(flag){
			System.out.println("修改成功");
		}
	}
////	4、根据姓名修改学生班级
	public void updateStudentClassByName(){
		System.out.println("请输入要修改班级的学生姓名：");
		String name = scanner.next();
		System.out.println("请输入要修改的班级：");
		String classNumber = scanner.next();
		boolean flag = studentDao.updateStudentClassByName(name, classNumber);
		if(!flag){
			System.out.println("没有查询到该学生");
		}
	}
////	5、根据班级查询全部学生信息
	public void queryStudentByClass(){
		System.out.println("请输入要查询的班级：");
		String classNumber = scanner.next();
		List<Student> list = studentDao.queryStudentByClass(classNumber);
		if(list.size() == 0){
			System.out.println("该班级没有学生，请重新输入");
		}
		System.out.println("编号\t姓名\t性别\t年龄\t班级");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getStudentId()+"\t");
			System.out.print(list.get(i).getStudentName()+"\t");
			System.out.print(list.get(i).getStudentGender()+"\t");
			System.out.print(list.get(i).getAge()+"\t");
			System.out.println(list.get(i).getClassNumber()+"\t");
		}
	}
}
