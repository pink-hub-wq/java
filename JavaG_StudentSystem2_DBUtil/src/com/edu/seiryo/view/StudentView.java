package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.service.StudentService;

/**
 * 
 * Student�����ۺ�
 * @author WANGQI
 * @time 2024��4��25������3:26:33
 */
public class StudentView {
	Scanner scanner = new Scanner(System.in);
	public boolean studentController(){
		StudentService service = new StudentService();
		boolean iscontinue = true;
		while (iscontinue) {
			System.out.println("--------------------------------------------");
	        System.out.println("1����ʾ����ѧ����Ϣ");
	        System.out.println("2�����ݱ�Ų�ѯѧ����Ϣ");
	        System.out.println("3�����ݱ���޸�ѧ������");
	        System.out.println("4�����������޸�ѧ���༶");
	        System.out.println("5�����ݰ༶��ѯȫ��ѧ����Ϣ");
	        System.out.println("--------------------------------------------");
	        System.out.print("��ѡ��[1/2/3/4/5]��");
	        String choose = scanner.next();
	        switch (choose) {
			case "1":
				service.queryStudents();
				break;
			case "2":
				service.queryStudentById();
				break;
			case "3":
				service.updateStudentAgeById();
				break;
			case "4":
				service.updateStudentClassByName();
				break;
			case "5":
				service.queryStudentByClass();				
				break;
			default:
				System.out.println("������ı������");
				continue;
			}
	        iscontinue = iscontinue();
		}
		return iscontinue;
	}
	//ѯ���û��Ƿ����
    public boolean iscontinue() {
    	while (true) {
            System.out.println("�Ƿ��������������(y/n)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                return true;
            } else if (answer.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("������������������ y�� n������");
            }
    	}
    }
}
