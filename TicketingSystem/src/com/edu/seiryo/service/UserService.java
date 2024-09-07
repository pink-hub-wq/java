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
	public User login(){
        int count = 0;
        while (true) {
        	User user = new User();
            System.out.println("�������˺ţ�");
            String name = scanner.next();
            System.out.println("���������룺");
            String password = scanner.next();
            user.setUserName(name);
            user.setUserPassword(password);
            boolean bo = userDao.login(user);
            if (bo) {
                System.out.println("��½�ɹ�");
                return user;
            }
            count++;
            System.out.println("�˺Ż��������ʣ�ೢ�Դ�����" + (3 - count));   
                boolean bo2 = false;
                if(count == 3){
                	bo2 = true;
                	System.out.println("�������ε�¼ʧ�ܣ������һ����빦�ܡ�");
                	while(bo2){
                		System.out.println("�������˺ţ�");
                        String forgetName = scanner.next();
                        System.out.println("���������䣺");
                        String forgetemail = scanner.next();
                        if(userDao.selectUserName(forgetName,forgetemail)){
                        	System.out.println("������ȷ���������������룺");
                        	String newPassword = scanner.next();
                        	userDao.updateUserPassword(newPassword, forgetName);
                        	System.out.println("���óɹ�");
                        	break;
                        }else{
                        	System.out.println("��������Ƿ��������");
                        	String choose = scanner.next();
                        	if(choose.equals("��")){
                        		continue;
                        	}else {
								break;
							}
                        }                   
                }
               
            }
        }
	}
	//�û�ע��
	public boolean register(){
        System.out.println("�������û�����");
        String userName = scanner.next();
        char[] userNameChar = userName.toCharArray();
        for (int i = 0; i < userNameChar.length; i++) {
        	if (!((userNameChar[i] >= '0' && userNameChar[i] <= '9') || (userNameChar[i] >= 'a' && userNameChar[i] <= 'z'))) {
                System.out.println("�û���ֻ����ʹ��СдӢ����ĸ������");
                return false;
            }
		}
        if(userName.length() <= 6){
        	System.out.println("�û���Ҫ����6λ");
            return false;
        }
        System.out.println("���������룺");
        String userPassword = scanner.next();
        System.out.println("���������䣺");
        String email = scanner.next();
        boolean register = userDao.register(new User(userName,userPassword,email));
    	if(!register){
			System.out.println("�û����ظ���������ע��");
			return false;
    	}
        System.out.println("ע��ɹ�");
		return true;
	}
//	//��֤ע�������߼�
//	public boolean passwordRegist(String userPassword){
//		char firstPassword = userPassword.charAt(0);
//        char lastPassword = userPassword.charAt(userPassword.length() - 1);
//        if(((firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 33 && lastPassword <= 47) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 58 && lastPassword <= 64) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 91 && lastPassword <= 96) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 123 && lastPassword <= 126)) ){
//        	return true;
//        }
//        return false;
//	
//	}
}
