package com.edu.seiryo.service.imp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.edu.seiryo.dao.CarDao;
import com.edu.seiryo.dao.CommodityDao;
import com.edu.seiryo.dao.UsersDao;
import com.edu.seiryo.dao.imp.CarDaoImp;
import com.edu.seiryo.dao.imp.CommodityDaoImp;
import com.edu.seiryo.dao.imp.UsersDaoImp;
import com.edu.seiryo.service.CarService;
/**
 * Car业务逻辑控制
 * @author WANGQI
 *
 */
public class CarServiceImp implements CarService {
    CarDao carDao = new CarDaoImp();
    UsersDao usersDao = new UsersDaoImp();
    BigDecimal total = BigDecimal.ZERO;
    CommodityDao commodityDao = new CommodityDaoImp();
    /**
     * 添加到购物车
     */
    @Override
    public boolean addCar(int commodityId, int commodityNum, int userId) {
        return carDao.addCar(commodityId, commodityNum, userId);
    }
    /**
     * 查询购物车
     */
    @Override
    public void selectCar(int userId) {
        List<Map<String, Object>> list = carDao.selectCar(userId);
        Timestamp date = null;
        total = BigDecimal.ZERO;

        System.out.println("序号\t商品\t数量\t单价\t小计");
        for (Map<String, Object> map : list) {
            System.out.print(map.get("CarId") + "\t");
            System.out.print(map.get("Commodity_Name") + "\t");
            System.out.print(map.get("Car_Commodity_Number") + "\t");
            System.out.print(map.get("Commodity_price") + "\t");
            System.out.println(map.get("subtotal") + "\t");
            total = total.add((BigDecimal) map.get("subtotal"));
            date = (Timestamp) map.get("User_Date");
        }

        double totalDouble = total.doubleValue();
        double discountedTotal = totalDouble;

        if (usersDao.selectVipById(userId) != 0) {
            discountedTotal = totalDouble * selectDiscount(userId);
        }

        System.out.println("合计：" + discountedTotal);
        System.out.println("日期：" + date);
        System.out.println("==========================");
        System.out.println("1.清空购物车");
        System.out.println("2.返回上一层");

        Scanner sc = new Scanner(System.in);
        String choose = sc.next();
        switch (choose) {
			        /**
			         * 清空购物车
			         */
            case "1":
                boolean successfulBuy = usersDao.selectUser_Money(userId, discountedTotal);
                if (successfulBuy) {
                    for (Map<String, Object> map : list) {
                        int commodityId = (int) map.get("Car_Commodity_Id");
                        int commodityNum = (int) map.get("Car_Commodity_Number");
                        commodityDao.updateCommodity(commodityId, commodityNum);
                        usersDao.updateUser_Money(userId, discountedTotal);
                        usersDao.updateUser_MoneyVip(userId, discountedTotal);
                        delectCar(userId);
                        discountedTotal = 0;
                    }
                    System.out.println("购买成功");
                    break;
                } else {
                    System.out.println("您的余额不足");
                    break;
                }
            default:
                break;
        }
    }
    /**
     * 查询折扣
     * @param userId
     * @return discount
     */
    private double selectDiscount(int userId) {
        int vip = usersDao.selectVipById(userId);
        double discount = 1;
        if (vip == 1) {
            discount = 0.98;
        } else if (vip == 2) {
            discount = 0.95;
        } else if (vip == 3) {
            discount = 0.9;
        }
        return discount;
    }
    /**
     * 清空购物车
     */
    @Override
    public void delectCar(int userId) {
        carDao.delectCar(userId);
    }
}