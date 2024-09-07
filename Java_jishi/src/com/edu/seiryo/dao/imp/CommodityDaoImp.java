package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.CommodityDao;
import com.edu.seiryo.entity.Commodity;
import com.edu.seiryo.util.DBUtil;
/**
 * Commodity���ݴ�����
 * @author WANGQI
 *
 */
public class CommodityDaoImp implements CommodityDao{
	/**
	 * ��ѯ������Ʒ
	 */
	@Override
	public List<Commodity> queryCommodity() {
		List<Commodity> list = new ArrayList<Commodity>();
		String sql = "select Commodity_Id,Commodity_name,Commodity_price,Commodity_number from Commodity_Info ";
		ResultSet resultSet = null;
		try {
			resultSet = DBUtil.excuteQuery(sql);
			while(resultSet.next()){
				Commodity commodity = new Commodity();
				commodity.setCommodityId(resultSet.getInt("Commodity_Id"));
				commodity.setCommodityName(resultSet.getString("Commodity_name"));
				commodity.setCommodityPrice(resultSet.getDouble("Commodity_price"));
				commodity.setCommodityNum(resultSet.getInt("Commodity_number"));
				list.add(commodity);
			}
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
		return list;
	}
	/**
	 * ��ѯ��Ʒ���ƣ�����
	 */
	@Override
	public List<Commodity> queryCommodityNameAndInfo() {
		List<Commodity> list = new ArrayList<Commodity>();
		String sql = "select Commodity_name,Commodity_info from Commodity_Info ";
		ResultSet resultSet = null;
		try {
			resultSet = DBUtil.excuteQuery(sql);
			while(resultSet.next()){
				Commodity commodity = new Commodity();
				commodity.setCommodityName(resultSet.getString("Commodity_name"));
				commodity.setCommodityInfo(resultSet.getString("Commodity_info"));
				list.add(commodity);
			}
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
		return list;
	}
	/**
	 * ����id��ѯ��Ʒ����
	 */
	@Override
	public String queryCommodityName(int id) {
		String name = "";
		String sql = "select Commodity_name from Commodity_Info where Commodity_Id = ?";
		ResultSet resultSet = null;
		try {
			resultSet = DBUtil.excuteQuery(sql,id);
			if(resultSet.next()){
				name = resultSet.getString("Commodity_name");
			}
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
		return name;
	}
	/**
	 * ��ѯ��Ʒ�Ŀ���Ƿ����Ҫ���������
	 */
	@Override
	public boolean queryCommodityNum(int id,int num) {
		String sql = "select Commodity_number from Commodity_Info where Commodity_Id = ? and Commodity_number >= ?";
		ResultSet resultSet = null;
		boolean bo = false;
		try {
			resultSet = DBUtil.excuteQuery(sql,id,num);
			if(resultSet.next()){
				bo = true;
			}
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
	 * ����id��ѯ��Ʒ����
	 */
	@Override
	public int queryCommodityPrice(int id) {
		String sql = "select Commodity_price from Commodity_Info where Commodity_Id = ?";
		ResultSet resultSet = null;
		int price= 0;
		try {
			resultSet = DBUtil.excuteQuery(sql,id);
			if(resultSet.next()){
				price = resultSet.getInt("Commodity_price");
			}
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
		return price;
	}
	/**
	 * ������Ʒ����
	 */
	@Override
	public boolean updateCommodity(int id, int num) {
		String sql = "update Commodity_Info set Commodity_number = Commodity_number - ? where Commodity_Id = ?";
		boolean bo = false;
		try {
			bo = DBUtil.excuteUpdate(sql,num,id);
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
