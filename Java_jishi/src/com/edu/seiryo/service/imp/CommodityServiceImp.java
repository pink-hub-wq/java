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
 * Commodity业务逻辑控制
 * @author WANGQI
 *
 */
public class CommodityServiceImp implements CommodityService {
	CommodityDao CommodityDao = new CommodityDaoImp();
	CarDao carDao = new CarDaoImp();
	UsersDao usersDao = new UsersDaoImp();
	Scanner Scanner = new Scanner(System.in);
	/**
	 * 查询并购买商品
	 */
	@Override
	public void queryCommodity(int userId) {
	    System.out.println("序号\t商品\t价格\t限量剩余");
	    List<Commodity> list = CommodityDao.queryCommodity();
	    for (int i = 0; i < list.size(); i++) {
	        System.out.print(list.get(i).getCommodityId() + "\t");
	        System.out.print(list.get(i).getCommodityName() + "\t");
	        System.out.print(list.get(i).getCommodityPrice() + "\t");
	        System.out.println(list.get(i).getCommodityNum());
	    }
	    System.out.println("请输入你要购买的商品序号:");
	    int id = Scanner.nextInt();
	    if(queryCommodityName(id).equals("")){
	        System.out.println("您的输入有误！");
	        queryCommodity(userId);
	    } else {
	        System.out.println("您选择的商品是：" +  queryCommodityName(id));
	        System.out.println("请输入购买个数：");
	        int num = Scanner.nextInt();
	        boolean bo = queryCommodityNum(id,num);
	        if(!bo){
	            System.out.println("购买失败");
	            queryCommodity(userId);
	        } else {
	            boolean flag = carDao.addCar(id, num, userId);
	            if(flag){
	                System.out.println("商品加入购物车成功");
	                double totalPrice = num * queryCommodityPrice(id);
	                System.out.println("您购买的数量是："+ queryCommodityName(id) + num + "单价为：" + queryCommodityPrice(id));
	                System.out.println("您的订单总价为：" + totalPrice);
	                System.out.println("还需要购买什么东西吗");
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
	 * 查询商品名称和简介
	 */
	@Override
	public void queryCommodityNameAndInfo() {
		System.out.println("商品\t简述");
		List<Commodity> list = CommodityDao.queryCommodityNameAndInfo();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getCommodityName() + "\t");
            System.out.println(list.get(i).getCommodityInfo() + "\t");
        }
		
	}
	/**
	 * 查询商品名
	 */
	@Override
	public String queryCommodityName(int id) {
		String name = "";
		return name = CommodityDao.queryCommodityName(id);
	}
	/**
	 * 查询库存数量
	 */
	@Override
	public boolean queryCommodityNum(int id, int num) {
		return CommodityDao.queryCommodityNum(id, num);
	}
	/**
	 * 查询商品单价
	 */
	@Override
	public int queryCommodityPrice(int id) {
		return CommodityDao.queryCommodityPrice(id);
	}
	/**
	 * 更新商品数量
	 */
	@Override
	public boolean updateCommodity(int id, int num) {
		return CommodityDao.updateCommodity(id, num);
	}

}
