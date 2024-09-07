package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.edu.seiryo.dao.CarDao;
import com.edu.seiryo.util.DBUtil;
/**
 * Car数据处理类
 * @author WANGQI
 *
 */
public class CarDaoImp implements CarDao{
	/**
	 * 添加到购物车
	 */
	@Override
	public boolean addCar(int commodityId, int commodityNum, int uderId) {
		String sql = "insert Car_Info values(?,?,?)";
		boolean bo = false;
		try {
			bo = DBUtil.excuteUpdate(sql,commodityId,commodityNum,uderId);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * 打印购物车信息
	 */
	@Override
	public List<Map<String, Object>> selectCar(int userId) {
	    List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	    String sql = "SELECT c.Car_Id, c.Car_Commodity_Id, com.Commodity_name, c.Car_Commodity_number, com.Commodity_price, (c.Car_Commodity_number * com.Commodity_price) AS subtotal, (SELECT SUM(c2.Car_Commodity_number * com2.Commodity_price) FROM Car_Info c2 INNER JOIN Commodity_Info com2 ON c2.Car_Commodity_Id = com2.Commodity_Id WHERE c2.Car_user_Id = c.Car_user_Id) AS total, GETDATE() AS User_Date FROM Car_Info c INNER JOIN Commodity_Info com ON c.Car_Commodity_Id = com.Commodity_Id WHERE c.Car_user_Id = ?";
	    ResultSet resultSet = null;
	    try {
	        resultSet = DBUtil.excuteQuery(sql, userId);
	        while (resultSet.next()) {
	            Map<String, Object> map = new HashMap<String, Object>();
	            map.put("CarId", resultSet.getInt("Car_Id"));
	            map.put("Car_Commodity_Id", resultSet.getInt("Car_Commodity_Id"));
	            map.put("Commodity_Name", resultSet.getString("Commodity_Name"));
	            map.put("Car_Commodity_Number", resultSet.getInt("Car_Commodity_Number"));
	            map.put("Commodity_price", resultSet.getBigDecimal("Commodity_price"));
	            map.put("subtotal", resultSet.getBigDecimal("subtotal"));
	            map.put("total", resultSet.getBigDecimal("total"));
	            map.put("User_Date", resultSet.getTimestamp("User_Date"));
	            list.add(map);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            DBUtil.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return list;
	}
	/**
	 * 清空购物车
	 */
	@Override
	public boolean delectCar(int uderId) {
		String sql = "delete Car_Info where Car_user_Id = ?";
		boolean bo = false;
		try {
			bo = DBUtil.excuteUpdate(sql,uderId);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bo;
	}


}
