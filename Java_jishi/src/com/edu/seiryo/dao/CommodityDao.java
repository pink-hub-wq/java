package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.Commodity;

public interface CommodityDao {
	/**
	 * ��ѯ������Ʒ
	 * @return List
	 */
	public List<Commodity> queryCommodity();
	/**
	 * ��ѯ��Ʒ���ƣ�����
	 * @return List
	 */
	public List<Commodity> queryCommodityNameAndInfo();
	/**
	 * ����id��ѯ��Ʒ����
	 * @param id
	 * @return
	 */
	public String queryCommodityName(int id);
	/**
	 * ��ѯ��Ʒ�Ŀ���Ƿ����Ҫ���������
	 * @param id
	 * @param num
	 * @return boolean
	 */
	public boolean queryCommodityNum(int id,int num);
	/**
	 * ����id��ѯ��Ʒ����
	 * @param id
	 * @return int
	 */
	public int queryCommodityPrice(int id);
	/**
	 * ������Ʒ����
	 * @param id
	 * @param num
	 * @return boolean
	 */
	public boolean updateCommodity(int id,int num);
}
