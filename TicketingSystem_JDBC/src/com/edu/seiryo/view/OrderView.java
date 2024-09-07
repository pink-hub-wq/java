package com.edu.seiryo.view;

import com.edu.seiryo.service.OrderService;
/**
 * Order方法综合
 * @author WANGQI
 *
 */
public class OrderView {
	OrderService orderService = new OrderService();
	/**
	 * 打印订单
	 * @param id
	 */
	public void orderController(int id){
		orderService.myTickets(id);
	}
}
