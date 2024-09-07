package com.edu.seiryo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.seiryo.dao.StudentDao;
import com.edu.seiryo.entity.Student;
/**
 * 
 * Studentҵ���߼�����
 * @author WANGQI
 * @time 2024��4��25������2:32:24
 */
public class StudentService {
	StudentDao studentDao = new StudentDao();
	Scanner scanner = new Scanner(System.in);
//	1����ʾ����ѧ����Ϣ
	public void queryStudents(){
		List<Student> list = studentDao.queryStudents();
		System.out.println("���\t����\t�Ա�\t����\t�༶");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getStudentId()+"\t");
			System.out.print(list.get(i).getStudentName()+"\t");
			System.out.print(list.get(i).getStudentGender()+"\t");
			System.out.print(list.get(i).getAge()+"\t");
			System.out.println(list.get(i).getClassNumber()+"\t");
		}
	}
//	2�����ݱ�Ų�ѯѧ����Ϣ
	public void queryStudentById(){
		System.out.println("������Ҫ��ѯ�ı�ţ�");
		int id = scanner.nextInt();
		Student student = studentDao.queryStudentById(id);
		if(student != null){
			System.out.println("���\t����\t�Ա�\t����\t�༶");
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getStudentGender()+"\t"+student.getAge()+"\t"+student.getClassNumber()+"\t");
		}else{
			System.out.println("������ı�Ų�����");
		}
	}
////	3�����ݱ���޸�ѧ������
	public void updateStudentAgeById(){
		System.out.println("������Ҫ�޸������ѧ����ţ�");
		int id = scanner.nextInt();
		System.out.println("������Ҫ�޸ĵ�ѧ�����䣺");
		int age = scanner.nextInt();
		boolean flag = studentDao.updateStudentAgeById(id,age);
		if(!flag){
			System.out.println("û�в�ѯ����ѧ��");
		}
		if(flag){
			System.out.println("�޸ĳɹ�");
		}
	}
////	4�����������޸�ѧ���༶
	public void updateStudentClassByName(){
		System.out.println("������Ҫ�޸İ༶��ѧ��������");
		String name = scanner.next();
		System.out.println("������Ҫ�޸ĵİ༶��");
		String classNumber = scanner.next();
		boolean flag = studentDao.updateStudentClassByName(name, classNumber);
		if(!flag){
			System.out.println("û�в�ѯ����ѧ��");
		}
	}
////	5�����ݰ༶��ѯȫ��ѧ����Ϣ
	public void queryStudentByClass(){
		System.out.println("������Ҫ��ѯ�İ༶��");
		String classNumber = scanner.next();
		List<Student> list = studentDao.queryStudentByClass(classNumber);
		if(list.size() == 0){
			System.out.println("�ð༶û��ѧ��������������");
		}
		System.out.println("���\t����\t�Ա�\t����\t�༶");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getStudentId()+"\t");
			System.out.print(list.get(i).getStudentName()+"\t");
			System.out.print(list.get(i).getStudentGender()+"\t");
			System.out.print(list.get(i).getAge()+"\t");
			System.out.println(list.get(i).getClassNumber()+"\t");
		}
	}
}
