package com.edu.seiryo.dao;

import java.util.List;
import java.util.Map;

public interface CarDao {
	/**
	 * ��ӵ����ﳵ
	 * @param commodityId
	 * @param commodityNum
	 * @param uderId
	 * @return boolean
	 */
	public boolean addCar(int commodityId,int commodityNum,int uderId);
	/**
	 * ��ӡ���ﳵ��Ϣ
	 * @param uderId
	 * @return List
	 */
	public List<Map<String, Object>> selectCar(int uderId);
	/**
	 * ��չ��ﳵ
	 * @param uderId
	 * @return boolean
	 */
	public boolean delectCar(int uderId);
}
