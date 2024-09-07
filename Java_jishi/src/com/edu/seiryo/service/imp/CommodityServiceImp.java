package com.edu.seiryo.service.imp;

import java.util.List;
import java.util.Scanner;

import com.edu.seiryo.dao.CarDao;
import com.edu.seiryo.dao.CommodityDao;
import com.edu.seiryo.dao.UsersDao;
import com.edu.seiryo.dao.imp.CarDaoImp;
import com.edu.seiryo.dao.imp.CommodityDaoImp;
import com.edu.seiryo.dao.imp.UsersDaoImp;
import com.edu.seiryo.entity.Commodity;
import com.edu.seiryo.service.CommodityService;
/**
 * Commodityҵ���߼�����
 * @author WANGQI
 *
 */
public class CommodityServiceImp implements CommodityService {
	CommodityDao CommodityDao = new CommodityDaoImp();
	CarDao carDao = new CarDaoImp();
	UsersDao usersDao = new UsersDaoImp();
	Scanner Scanner = new Scanner(System.in);
	/**
	 * ��ѯ��������Ʒ
	 */
	@Override
	public void queryCommodity(int userId) {
	    System.out.println("���\t��Ʒ\t�۸�\t����ʣ��");
	    List<Commodity> list = CommodityDao.queryCommodity();
	    for (int i = 0; i < list.size(); i++) {
	        System.out.print(list.get(i).getCommodityId() + "\t");
	        System.out.print(list.get(i).getCommodityName() + "\t");
	        System.out.print(list.get(i).getCommodityPrice() + "\t");
	        System.out.println(list.get(i).getCommodityNum());
	    }
	    System.out.println("��������Ҫ�������Ʒ���:");
	    int id = Scanner.nextInt();
	    if(queryCommodityName(id).equals("")){
	        System.out.println("������������");
	        queryCommodity(userId);
	    } else {
	        System.out.println("��ѡ�����Ʒ�ǣ�" +  queryCommodityName(id));
	        System.out.println("�����빺�������");
	        int num = Scanner.nextInt();
	        boolean bo = queryCommodityNum(id,num);
	        if(!bo){
	            System.out.println("����ʧ��");
	            queryCommodity(userId);
	        } else {
	            boolean flag = carDao.addCar(id, num, userId);
	            if(flag){
	                System.out.println("��Ʒ���빺�ﳵ�ɹ�");
	                double totalPrice = num * queryCommodityPrice(id);
	                System.out.println("������������ǣ�"+ queryCommodityName(id) + num + "����Ϊ��" + queryCommodityPrice(id));
	                System.out.println("���Ķ����ܼ�Ϊ��" + totalPrice);
	                System.out.println("����Ҫ����ʲô������");
	                String choose = Scanner.next();
	                if(choose.equalsIgnoreCase("Y")){
	                    queryCommodity(userId);
	                } else {
	                    return;
	                }
	            }
	        }
	    }
	}
	/**
	 * ��ѯ��Ʒ���ƺͼ��
	 */
	@Override
	public void queryCommodityNameAndInfo() {
		System.out.println("��Ʒ\t����");
		List<Commodity> list = CommodityDao.queryCommodityNameAndInfo();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getCommodityName() + "\t");
            System.out.println(list.get(i).getCommodityInfo() + "\t");
        }
		
	}
	/**
	 * ��ѯ��Ʒ��
	 */
	@Override
	public String queryCommodityName(int id) {
		String name = "";
		return name = CommodityDao.queryCommodityName(id);
	}
	/**
	 * ��ѯ�������
	 */
	@Override
	public boolean queryCommodityNum(int id, int num) {
		return CommodityDao.queryCommodityNum(id, num);
	}
	/**
	 * ��ѯ��Ʒ����
	 */
	@Override
	public int queryCommodityPrice(int id) {
		return CommodityDao.queryCommodityPrice(id);
	}
	/**
	 * ������Ʒ����
	 */
	@Override
	public boolean updateCommodity(int id, int num) {
		return CommodityDao.updateCommodity(id, num);
	}

}
