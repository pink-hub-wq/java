package com.edu.seiryo.view;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.TicketingService;
import com.edu.seiryo.service.UserService;
/**
 * Ticket�����ۺ�
 * @author WANGQI
 *
 */
public class TicketingView {
	TicketingService ticketingService = new TicketingService();
	/**
	 * ��Ʊ
	 * @param id
	 * @return boolean
	 */
	public boolean ticketingController(int id){
		return ticketingService.buyTickets(id);
	}
}
