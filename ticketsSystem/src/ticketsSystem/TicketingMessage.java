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
		System.out.println("��ѡ��");
		System.out.println("����\t�۸�\t����"); 
		for (int i = 0; i < trips.length; i++) { 
			System.out.println(trips[i] + "\t" + price[i] + "\t" + number[i]); 
		}	
		boolean buy = true;
		while(buy){
			System.out.println("������Ҫ����ĳ���:");	
			String buyTrips = sc.next();
			boolean a = false;
			for(int i = 0;i < trips.length;i++){
				if(buyTrips.equals(trips[i])){
					System.out.println("������Ҫ���������");					
					int buyNumber = sc.nextInt();
					if(buyNumber <= number[i]){
						System.out.println("����ɹ�");
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
						System.out.println("��Ʊ���㣬����������");
						a = true;
						break;
					}
				} 
			}
			if(!a){
				System.out.println("���޴˳��Σ�����������");
			}
		}
	} 	
	public void Method2(){
		System.out.println("��ѡ��");
		System.out.println("�ҵĶ���");
		System.out.println("����\t�۸�\t����");
		 if (orderCount == 0) {
	            System.out.println("����û�ж�����");
	            return;
	        }
		 for (int i = 0; i < orderCount; i++) {
			 if (orders[i] != null) {
	                String c = "����: " + orders[i].trips+ "\t�۸�: " + orders[i].price  + "\t����: " + orders[i].number;
	                System.out.println(c);
			 }
		 }
	}
}
