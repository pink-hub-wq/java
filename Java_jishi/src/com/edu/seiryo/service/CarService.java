package com.edu.seiryo.service;

import java.util.List;
import java.util.Map;

public interface CarService {
	/**
	 * �����Ʒ�����ﳵ
	 * @param commodityId
	 * @param commodityNum
	 * @param uderId
	 * @return true�ɹ�/falseʧ��
	 */
	public boolean addCar(int commodityId,int commodityNum,int uderId);
	/**
	 * ��ѯ���ﳵ��Ϣ
	 * @param uderId
	 */
	public void selectCar(int uderId);
	/**
	 * ��չ��ﳵ
	 * @param uderId
	 */
	public void delectCar(int uderId);
}
