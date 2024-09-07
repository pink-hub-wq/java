package com.edu.seiryo.service.imp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import com.edu.seiryo.dao.UsersDao;
import com.edu.seiryo.dao.imp.UsersDaoImp;
import com.edu.seiryo.entity.Users;
import com.edu.seiryo.service.UsersService;
import com.edu.seiryo.view.CommodityView;
import com.edu.seiryo.view.UsersView;
/**
 * Userҵ���߼�����
 * @author WANGQI
 *
 */
public class UsersServiceImp implements UsersService{
	UsersDao UsersDao = new UsersDaoImp();
	Scanner scanner = new Scanner(System.in);
	boolean flag = false;
	boolean flag2 = false;
	@Override
	/**
	 * ע��
	 */
	public boolean regist() {
	    System.out.println("1.�˺�ע��");
	    System.out.println("2.������һ��");
	    System.out.println("ѡ������Ҫ�ķ���");
	    String choose = scanner.next();
	    switch (choose) {
	        case "1":
	            System.out.println("��������ע����û�����");
	            String name = scanner.next();
	            System.out.println("���������룺");
	            String pwd = scanner.next();
	            System.out.println("�������Ա�");
	            String sex = scanner.next();
	            System.out.println("�������ֻ��ţ�");
	            String phone = scanner.next();
	            System.out.println("�������׳��");
	            double price = scanner.nextDouble();
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	            Date date1 = new Date();
	            String date = dateFormat.format(date1);
	            Users users = new Users(name, pwd, sex,phone, price, date,0);
	            boolean bo2 = isUserExist(users);
	            if (bo2) {
	                System.out.println("�û����ظ���");
	                flag = false;
	            } else {
	                boolean registSuccess = UsersDao.regist(users);
	                if (registSuccess) {
	                    System.out.println("ע��ɹ�");
	                    flag = true;
	                    break;
	                } else {
	                    System.out.println("ע��ʧ��");
	                    flag = false;
	                    break;
	                }
	            }
	        case "2":
	        	 flag = false;
	        	 break;
	        default:
	            System.out.println("������������");
	            flag = false;
	    }
		return flag;
	}
	
	/**
	 * ����û��Ƿ����
	 */
	@Override
	public boolean isUserExist(Users users) {
		return UsersDao.isUserExist(users);
	}
	/**
	 * ��¼
	 */
	@Override
	public int login() {
		int userId = 0;
		System.out.println("1.�˺ŵ�¼");
	    System.out.println("2.������һ��");
	    System.out.println("ѡ������Ҫ�ķ���");
	    String choose = scanner.next();
	    switch (choose) {
	        case "1":
	            System.out.println("�������û�����");
	            String name = scanner.next();
	            System.out.println("���������룺");
	            String pwd = scanner.next();
	            Users users = new Users(name, pwd);
	            flag2 = UsersDao.login(users);
	                if (flag2) {
	                    System.out.println("��¼�ɹ�");
	                    userId = UsersDao.login(name);
	                    CommodityView commodityView = new CommodityView();
	                    commodityView.CommodityController(userId);
	                    flag = true;
	                    
	                } else {
	                    System.out.println("��¼ʧ��");
	                    flag = false;
	                }
	        case "2":
	        	 flag2 = false;
	        	 break;
	        default:
	            System.out.println("������������");
	            flag2 = false;
	    }
		return userId;
	}
	/**
	 * �����û����
	 */
	@Override
	public boolean updateUser_Money(int userId, double money) {
		return UsersDao.updateUser_Money(userId, money);
	}
	/**
	 * �����û��ȼ�
	 */
	@Override
	public boolean updateUser_MoneyVip(int userId, double money) {
		return UsersDao.updateUser_MoneyVip(userId, money);
	}
	/**
	 * ��ѯ�û��ȼ�
	 */
	@Override
	public int selectVipById(int userId) {
		return UsersDao.selectVipById(userId);
	}
	/**
	 * ��ѯ�û���Ϣ
	 */
	@Override
	public void queryUsers(int userId) {
		List<Users> list = UsersDao.queryUsers(userId);
		for (Users users : list) {
			System.out.println("�𾴵�" + users.getUserName() + "�û�������Ϣ���£�");
			if(users.getUserVip() == 0){
				System.out.println("��Ա:" + "��ͨ��Ա");
			}
			if(users.getUserVip() == 1){
				System.out.println("��Ա:" + "������Ա���Ű��ۣ�");
			}
			if(users.getUserVip() == 2){
				System.out.println("��Ա:" + "�ƽ��Ա�������ۣ�");
			}
			if(users.getUserVip() == 3){
				System.out.println("��Ա:" + "�׽��Ա�����ۣ�");
			}
			System.out.println("�˺�:" + users.getUserName());
			System.out.println("�ֻ���:" + users.getUserPhone());
			System.out.println("ʣ����:" + users.getUserMoney());
		}
	}
	/**
	 * ��ѯ�û����
	 */
	@Override
	public boolean selectUser_Money(int userId, double money) {
		return UsersDao.selectUser_Money(userId, money);
	}

}
