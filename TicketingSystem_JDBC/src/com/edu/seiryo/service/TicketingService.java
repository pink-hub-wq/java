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
 * Ticket业务逻辑控制
 * @author WANGQI
 */
public class TicketingService {
    TicketingDao ticketingDao = new TicketingDao();
    UserService userService = new UserService();
    Scanner scanner = new Scanner(System.in);
    DBUtil dbUtil = new DBUtil();
    /**
     * 购买车票
     * @param id
     * @return boolean
     */
    public boolean buyTickets(int id) {
        List<Ticket> list = ticketingDao.ticket();
        System.out.println("车次\t价格\t数量");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getTrainId() + "\t");
            System.out.print(list.get(i).getTrainPrice() + "\t");
            System.out.println(list.get(i).getTrainNumber() + "\t");
        }
        boolean bo = false;
        System.out.println("请输入你要购买的车票编号：");
        String ticketId = scanner.next();
        System.out.println("请输入你要购买的车票数量：");
        int ticketNumber = scanner.nextInt();
        Ticket ticket = new Ticket();
        ticket.setTrainId(ticketId);
        ticket.setTrainNumber(ticketNumber);
        bo = ticketingDao.buyTickets(ticket, id);
        if (bo) {
            System.out.println("购买成功！");
        } else {
            System.out.println("购买失败！");
        }
        return bo;
    }
}
