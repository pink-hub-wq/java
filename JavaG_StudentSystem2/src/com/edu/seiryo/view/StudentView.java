package com.edu.seiryo.view;

import java.util.Scanner;

import com.edu.seiryo.service.StudentService;

/**
 * 
 * Student方法综合
 * @author WANGQI
 * @time 2024年4月25日下午3:26:33
 */
public class StudentView {
	Scanner scanner = new Scanner(System.in);
	public boolean studentController(){
		StudentService service = new StudentService();
		boolean iscontinue = true;
		while (iscontinue) {
			System.out.println("--------------------------------------------");
	        System.out.println("1、显示所有学生信息");
	        System.out.println("2、根据编号查询学生信息");
	        System.out.println("3、根据编号修改学生年龄");
	        System.out.println("4、根据姓名修改学生班级");
	        System.out.println("5、根据班级查询全部学生信息");
	        System.out.println("--------------------------------------------");
	        System.out.print("请选择[1/2/3/4/5]：");
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
				System.out.println("您输入的编号有误");
				continue;
			}
	        iscontinue = iscontinue();
		}
		return iscontinue;
	}
	//询问用户是否继续
    public boolean iscontinue() {
    	while (true) {
            System.out.println("是否继续其他操作？(y/n)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                return true;
            } else if (answer.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("您的输入有误，请输入 y或 n继续：");
            }
    	}
    }
}
