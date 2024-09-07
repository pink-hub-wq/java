package ticketsSystem;

import java.util.Scanner;

public class TicketingMessage {
	public Scanner sc; 
	public String[] trips = {"G101","G102", "G103", "G104", "G105"}; 
	public int[] price = {100, 200, 300, 250, 150};
	public int[] number = {50, 35, 30, 40, 45}; 
	public Order[] orders;
	public int orderCount;
	public TicketingMessage() {
		sc = new Scanner(System.in);
		orders = new Order[100];
		orderCount = 0;
		} 
	public void Method1() {
		System.out.println("请选择");
		System.out.println("车次\t价格\t数量"); 
		for (int i = 0; i < trips.length; i++) { 
			System.out.println(trips[i] + "\t" + price[i] + "\t" + number[i]); 
		}	
		boolean buy = true;
		while(buy){
			System.out.println("请输入要购买的车次:");	
			String buyTrips = sc.next();
			boolean a = false;
			for(int i = 0;i < trips.length;i++){
				if(buyTrips.equals(trips[i])){
					System.out.println("请输入要购买的数量");					
					int buyNumber = sc.nextInt();
					if(buyNumber <= number[i]){
						System.out.println("购买成功");
						number[i] = number[i] -  buyNumber;
						a = true;
						buy = false;
						boolean b = false;
                        for (int j = 0; j < orderCount; j++) {
                            if (orders[j].trips.equals(trips[i])) {
                                orders[j].number += buyNumber;
                                b = true;
                                break;
                            }
                        }
                        if (!b && orderCount < orders.length) {
                            orders[orderCount] = new Order(trips[i], price[i], buyNumber);
                            orderCount++;
                        }else{
                        break;
                        }
					}else{
						System.out.println("余票不足，请重新输入");
						a = true;
						break;
					}
				} 
			}
			if(!a){
				System.out.println("查无此车次，请重新输入");
			}
		}
	} 	
	public void Method2(){
		System.out.println("请选择");
		System.out.println("我的订单");
		System.out.println("车次\t价格\t数量");
		 if (orderCount == 0) {
	            System.out.println("您还没有订单。");
	            return;
	        }
		 for (int i = 0; i < orderCount; i++) {
			 if (orders[i] != null) {
	                String c = "车次: " + orders[i].trips+ "\t价格: " + orders[i].price  + "\t数量: " + orders[i].number;
	                System.out.println(c);
			 }
		 }
	}
}
