package com.edu.seiryo.service;

import java.util.Scanner;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

/**
 * Userҵ���߼�����
 * @author WANGQI
 *
 */
public class UserService {
	UserDao userDao = new UserDao();
	Scanner scanner = new Scanner(System.in);
	boolean bo2 = false;
	/**
	 * �û���¼
	 * @return �û�id
	 */
	public int login(){
        int count = 0;
        int id = 0;
        while (count < 3) {
        	User user = new User();
            System.out.println("�������˺ţ�");
            String name = scanner.next();
            System.out.println("���������룺");
            String password = scanner.next();
            user.setUserName(name);
            user.setUserPassword(password);
            bo2 = userDao.login(user);
            if (bo2) {
            	id = selectUserid(user);
                System.out.println("��½�ɹ�");
                return id;
            }
            count++;
            System.out.println("�˺Ż��������ʣ�ೢ�Դ�����" + (3 - count));
        }
            if(count == 3){
            	System.out.println("�������ε�¼ʧ�ܣ������һ����빦�ܡ�");
            	while(true){
            		boolean bo2 = false;
            		bo2 = findPwd();
            		if(bo2){
            			break;
            		}else {
						break;
					}
               }          
            }
            return id;
        }
	/**
	 * �û�ע��
	 * @return boolean
	 */
	public boolean register(){
		String userName = "";
		while(true){
			boolean bo = false;
			System.out.println("�������û�����");
	        userName = scanner.next();
	        bo = nameRegist(userName);
	        if(bo){
	        	break;
	        }
	        System.out.println("�û���������Ҫ������������");
		}
	        System.out.println("���������룺");
	        String userPassword = scanner.next();
	        System.out.println("���������䣺");
	        String email = scanner.next();
	        User user = new User();
	        boolean register = userDao.register(new User(userName,userPassword,email));
	    	if(!register){
				System.out.println("�û����ظ���������ע��");
				return false;
	    	}
	        System.out.println("ע��ɹ�");
			return true;    
	}
	/**
	 * ��֤�û���
	 * @param userName
	 * @return boolean
	 */
	public boolean nameRegist(String userName){
		if(userName.length() < 6){
			return false;
		}
		for (int i = 0; i < userName.length(); i++) {
			char c = userName.charAt(i);
        	if (!((c >= 97 && c <= 122) || (c >= 48 && c <= 57))) {
                return false;
            }
		}
		return true;
	}
	/**
	 * �һ�����
	 * @return boolean
	 */
	public boolean findPwd(){
		System.out.println("�������˺ţ�");
        String forgetName = scanner.next();
        System.out.println("���������䣺");
        String forgetemail = scanner.next();
        if(userDao.selectUserName(forgetName,forgetemail)){
        	System.out.println("������ȷ���������������룺");
        	String newPassword = scanner.next();
        	userDao.updateUserPassword(forgetName,newPassword);
        	System.out.println("���óɹ�");
        	return true;
        }else{
        	System.out.println("��������Ƿ��������");
        	String choose = scanner.next();
        	if(choose.equals("��")){
        		findPwd();
        	}
        }
		return false;
	}
	/**
	 * �õ���¼�û���id
	 * @param user
	 * @return
	 */
	public int selectUserid(User user){
		int id = 0;
		id =  userDao.selectUserid(user);
		return id;
	}
}
