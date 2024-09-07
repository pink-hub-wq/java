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
 * Ticketҵ���߼�����
 * @author WANGQI
 */
public class TicketingService {
    TicketingDao ticketingDao = new TicketingDao();
    UserService userService = new UserService();
    Scanner scanner = new Scanner(System.in);
    DBUtil dbUtil = new DBUtil();
    /**
     * ����Ʊ
     * @param id
     * @return boolean
     */
    public boolean buyTickets(int id) {
        List<Ticket> list = ticketingDao.ticket();
        System.out.println("����\t�۸�\t����");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getTrainId() + "\t");
            System.out.print(list.get(i).getTrainPrice() + "\t");
            System.out.println(list.get(i).getTrainNumber() + "\t");
        }
        boolean bo = false;
        System.out.println("��������Ҫ����ĳ�Ʊ��ţ�");
        String ticketId = scanner.next();
        System.out.println("��������Ҫ����ĳ�Ʊ������");
        int ticketNumber = scanner.nextInt();
        Ticket ticket = new Ticket();
        ticket.setTrainId(ticketId);
        ticket.setTrainNumber(ticketNumber);
        bo = ticketingDao.buyTickets(ticket, id);
        if (bo) {
            System.out.println("����ɹ���");
        } else {
            System.out.println("����ʧ�ܣ�");
        }
        return bo;
    }
}
