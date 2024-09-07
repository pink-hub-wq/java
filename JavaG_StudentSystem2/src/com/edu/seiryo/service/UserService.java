package com.edu.seiryo.service;

import java.util.Scanner;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

/**
 * 
 * Userҵ���߼�����
 * @author WANGQI
 * @time 2024��4��25������11:41:56
 */

public class UserService {
	UserDao userDao = new UserDao();
	Scanner scanner = new Scanner(System.in);	//�û���¼
	public boolean login(){
        int count = 0;
        while (true) {
            System.out.println("�������˺ţ�");
            String name = scanner.next();
            System.out.println("���������룺");
            String password = scanner.next();
            boolean bo = userDao.login(new User(name,password));
            if (bo) {
                System.out.println("��½�ɹ�");
                return true;
            } else {
                count++;
                if(count == 3){
                	System.out.println("�������ε�¼ʧ�ܣ��������˵���");
                	return false;
                }
                System.out.println("�˺Ż��������ʣ�ೢ�Դ�����" + (3 - count));
            }
        }
	}
	//�û�ע��
	public void register(){
        System.out.println("�������˺�,�˺ű����������ĸ��д�����һ���ַ�Ϊ�������");
        String userName = scanner.next();
        char firstName = userName.charAt(0);
        char lastName = userName.charAt(userName.length() - 1);
        if(((firstName >= 65 && firstName <= 90 && lastName >= 33 && lastName <= 47) || (firstName >= 65 && firstName <= 90 && lastName >= 58 && lastName <= 64) || (firstName >= 65 && firstName <= 90 && lastName >= 91 && lastName <= 96) || (firstName >= 65 && firstName <= 90 && lastName >= 123 && lastName <= 126)) ){
            System.out.println("�˺ŷ���Ҫ��");
        } else {
            System.out.println("�˺Ų�����Ҫ��,����������");
            register();
            return;
        }
        System.out.println("����������,��������������ĸ��д�����һ���ַ�Ϊ�������");
        String userPassword = scanner.next();
        boolean passwordRegist =  passwordRegist(userPassword);
        while (!passwordRegist(userPassword)) {
            System.out.println("���벻����Ҫ������������:");
        	System.out.println("��������������ĸ��д�����һ���ַ�Ϊ�������");
            userPassword = scanner.next();
        }
    	boolean register = userDao.register(new User(userName,userPassword));
    	if(register){
			System.out.println("�û����ظ���������ע��");
			return;
    	}
        System.out.println("ע��ɹ�");
	}
	//��֤ע�������߼�
	public boolean passwordRegist(String userPassword){
		char firstPassword = userPassword.charAt(0);
        char lastPassword = userPassword.charAt(userPassword.length() - 1);
        if(((firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 33 && lastPassword <= 47) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 58 && lastPassword <= 64) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 91 && lastPassword <= 96) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 123 && lastPassword <= 126)) ){
        	return true;
        }
        return false;
	
	}
}
