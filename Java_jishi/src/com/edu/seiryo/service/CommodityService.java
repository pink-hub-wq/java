package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.Commodity;

public interface CommodityService {
	/**
	 * ��ѯ������Ʒ��Ϣ
	 * @param userid
	 */
	public void queryCommodity(int userid);
	/**
	 * ��ѯ��Ʒ���ͼ��
	 */
	public void queryCommodityNameAndInfo();
	/**
	 * ��ѯ��Ʒ��
	 * @param id
	 * @return ��Ʒ��
	 */
	public String queryCommodityName(int id);
	/**
	 * ��ѯ�������
	 * @param id
	 * @param num
	 * @return true�ɹ�/falseʧ��
	 */
	public boolean queryCommodityNum(int id,int num);
	/**
	 * ��ѯ��Ʒ����
	 * @param id
	 * @return ��Ʒ����
	 */
	public int queryCommodityPrice(int id);
	/**
	 * ������Ʒ�������
	 * @param id
	 * @param num
	 * @return true�ɹ�/falseʧ��
	 */
	public boolean updateCommodity(int id,int num);
}
