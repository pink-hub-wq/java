package com.edu.seiryo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.seiryo.dao.TicketingDao;
import com.edu.seiryo.entity.Ticket;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;
/**
 * 
 * Studentҵ���߼�����
 * @author WANGQI
 * @time 2024��4��25������2:32:24
 */
public class TicketingService {
	TicketingDao ticketingDao = new TicketingDao();
	Scanner scanner = new Scanner(System.in);
	DBUtil dbUtil = new DBUtil();
	UserService userService = new UserService();
//	3������Ʊ
	public void buyTickets(){
		List<Ticket> list = ticketingDao.ticket();
		System.out.println("����\t�۸�\t����");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getTrainId()+"\t");
			System.out.print(list.get(i).getTrainPrice()+"\t");
			System.out.println(list.get(i).getTrainNumber()+"\t");
		}
		boolean bo = false;
		System.out.println("��������Ҫ����ĳ�Ʊ��ţ�");
		 String ticketId = scanner.next();
		 System.out.println("��������Ҫ����ĳ�Ʊ������");
		 int ticketNumber= scanner.nextInt();
		 Ticket ticket = new Ticket();
		 ticket.setTrainId(ticketId);
		 ticket.setTrainNumber(ticketNumber);
		 User user = userService.login();
		 int id = user.getId();
		 bo = ticketingDao.buyTickets(ticket,);
		 if(bo){
			 System.out.println("����ɹ���");
		 }else {
			System.out.println("����ʧ�ܣ�");
		}
	}
//	4���ҵĶ���
	public void myTickets(){
		List<Ticket> list = ticketingDao.myTickets();
		try {
			System.out.println("����\t�۸�\t����");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTrainId()+"\t");
				System.out.print(list.get(i).getTrainPrice()+"\t");
				System.out.println(list.get(i).getTrainNumber()+"\t");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// ������Ʊ�������ݿ�
	private void addTickets() {
		boolean bo = false;
		System.out.println("��������Ҫ����ĳ�Ʊ��ţ�");
		 String ticketId = scanner.next();
		 System.out.println("��������Ҫ����ĳ�Ʊ������");
		 int ticketNumber= scanner.nextInt();
		 Ticket ticket = new Ticket();
		 ticket.setTrainId(ticketId);
		 ticket.setTrainNumber(ticketNumber);
		 ticket.setTrainPrice(ticketingDao.TicketPrice(ticket));
		 if (ticket.getTrainPrice() != 0) { // ����۸�Ϊ�㣬���ʾ�۸��ȡ�ɹ�
		        bo = true; // ���� bo Ϊ true
		        ticketingDao.addTickets(ticket);
		    } else {
		        System.out.println("��ȡ�۸�ʧ�ܣ����Ժ����ԡ�");
		    }
    }
}
