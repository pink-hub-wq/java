package com.edu.seiryo.dao;

import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.entity.Student;

/**
 * 
 * Student���ݴ�����
 * @author WANGQI
 * @time 2024��4��25������2:04:31
 */
public class StudentDao {
	//����ѧ�����ϣ���Ĭ���������ѧ���Ķ���
	static List<Student> list = new ArrayList<Student>();
	static {
	    list.add(new Student(1, "����", '��', 20, "11301"));
	    list.add(new Student(2, "����", '��', 21, "11302"));
	    list.add(new Student(3, "����", '��', 20, "11301"));
	    list.add(new Student(4, "����", '��', 19, "11301"));
	    list.add(new Student(5, "����", '��', 18, "11301"));
	}
//	1����ʾ����ѧ����Ϣ
	public List<Student> queryStudents(){
		return list;
	}
//	2�����ݱ�Ų�ѯѧ����Ϣ
	public Student queryStudentById(int id){
		for (int i = 0; i < list.size(); i++) {
			if(id == list.get(i).getStudentId()){
				return list.get(i);
			}
		}
		return null;
	}
//	3�����ݱ���޸�ѧ������
	public boolean updateStudentAgeById(int id,int age){
		for (int i = 0; i < list.size(); i++) {
			if(id == list.get(i).getStudentId()){
				list.get(i).setAge(age);
				return true;
			}
		}
		return false;
	}
//	4�����������޸�ѧ���༶
	public boolean updateStudentClassByName(String name,String classNumber){
		for (int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getStudentName())){
				list.get(i).setClassNumber(classNumber);
				return true;
			}
		}
		return false;
	}
//	5�����ݰ༶��ѯȫ��ѧ����Ϣ
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
