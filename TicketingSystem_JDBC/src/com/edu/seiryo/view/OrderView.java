package com.edu.seiryo.view;

import com.edu.seiryo.service.OrderService;
/**
 * Order�����ۺ�
 * @author WANGQI
 *
 */
public class OrderView {
	OrderService orderService = new OrderService();
	/**
	 * ��ӡ����
	 * @param id
	 */
	public void orderController(int id){
		orderService.myTickets(id);
	}
}
