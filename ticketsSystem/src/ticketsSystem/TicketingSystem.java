package ticketsSystem;
import java.util.Scanner;

public class TicketingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] user = new String[100][3];
        int count = 0;
        TicketingMessage ticketingMessage = new TicketingMessage();  
        boolean log = false;
        while (true) {
            System.out.println("��ӭʹ�ù�Ʊϵͳ");
            System.out.println("1.ע��");
            System.out.println("2.��¼");
            System.out.println("3.����Ʊ");
            System.out.println("4.�ҵĶ���");
            System.out.println("5.�˳�");
            System.out.println("������1~5ѡ���㽫���еĲ�����");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("�������û�����");
                String name = sc.next();
                boolean name1 = false;
                for (int i = 0; i < count; i++) {
                    if (name.equals(user[i][0])) {
                        name1 = true;
                        System.out.println("�û����Ѵ���,������ע��");
                        break;
                    }
                }
                if (count >= 100) {
                    System.out.println("���ע��100���û�,�ѳ�������,ע��ʧ��");
                    continue;
                }
                if (!name1) {
                    if (name.length() < 7) {
                        System.out.println("�û������Ȳ���7λ,����������");
                    } else {
                        boolean name2 = true;
                        for (int i = 0; i < name.length(); i++) {
                            char name3 = name.charAt(i);
                            if (!((name3 >= 97 && name3 <= 122) || (name3 >= 48 && name3 <= 57))) {
                                name2 = false;
                                System.out.println("�û���ֻ�ܰ���Сд��ĸ������,����������");
                                break;
                            }
                        }
                        if (name2) {
                            System.out.println("���������룺");
                            String password = sc.next();
                            System.out.println("�����������ַ��");
                            String email = sc.next();
                            user[count][0] = name;
                            user[count][1] = password;
                            user[count][2] = email;
                            count++;
                            System.out.println("ע��ɹ���");                          
                        }
                    }
                }
            }
            if (choose == 2) {
                System.out.println("�������û�����");
                String logName = sc.next();
                boolean a = false;
                for (int i = 0; i < count; i++) {
                    if (logName.equals(user[i][0])) {
                        a = true;
                        break;
                    }
                }
                if (a) {
                    System.out.println("���������룺");
                    String logPassword = sc.next();
                    int passwordCount = 0;
                    boolean b = false;
                    while (passwordCount < 3) {
                        for (int i = 0; i < count; i++) {
                            if (logPassword.equals(user[i][1])) {
                                b = true;
                                System.out.println("��¼�ɹ���");
                                log = true;
                            }
                        }
                        if (b) {
                            break;
                        } else {
                            passwordCount++;
                            if (passwordCount < 3) {
                                System.out.println("�������,�������������룺");
                                logPassword = sc.next();
                            }
                        }
                    }
                    if (passwordCount == 3) {
                        System.out.println("����3���������,�����һ����빦��");
                        boolean find = false;
                        while (!find) {
                            System.out.println("�һ����빦��");
                            System.out.println("�������û�����");
                            String findName = sc.next();
                            System.out.println("�����������ַ��");
                            String findEmail = sc.next();
                            for (int i = 0; i < count; i++) {
                                if (findName.equals(user[i][0]) && findEmail.equals(user[i][2])) {
                                    System.out.println("�����������룺");
                                    String newPassword = sc.next();
                                    user[i][1] = newPassword;
                                    System.out.println("���������óɹ���");
                                    find = true;
                                    break;
                                }
                            }
                            if (!find) {
                                System.out.println("�û����������ַ����,�޷��һ����룡");
                                System.out.println("�Ƿ�������������û����������ַ��(��/��)");
                                String c = sc.next();
                                if (c.equals("��")) {
                                    find = true;
                                } else if (c.equals("��")) {
                                	find = false;
                                }else{
                                    System.out.println("�������,����������");
                	                }
                                }
                            }
                    	}
	                }else{
	                    System.out.println("�û�����������������");
                }
            }
            if(choose == 3){
            	if(log){
            		ticketingMessage.Method1();
            	}else{
            	System.out.println("���ȵ�¼�����˺�");
            	}
            }
            if(choose == 4){
            	if(log){
            		ticketingMessage.Method2();
            	}else{
            	System.out.println("���ȵ�¼�����˺�");
            	}
            }
            if (choose == 5) {
                System.out.println("�˳�");
                break;
            }
        }
    }
}
