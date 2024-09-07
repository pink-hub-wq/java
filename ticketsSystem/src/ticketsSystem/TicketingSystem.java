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
            System.out.println("欢迎使用购票系统");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.购买车票");
            System.out.println("4.我的订单");
            System.out.println("5.退出");
            System.out.println("请输入1~5选择你将进行的操作：");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("请输入用户名：");
                String name = sc.next();
                boolean name1 = false;
                for (int i = 0; i < count; i++) {
                    if (name.equals(user[i][0])) {
                        name1 = true;
                        System.out.println("用户名已存在,请重新注册");
                        break;
                    }
                }
                if (count >= 100) {
                    System.out.println("最多注册100个用户,已超过上限,注册失败");
                    continue;
                }
                if (!name1) {
                    if (name.length() < 7) {
                        System.out.println("用户名长度不足7位,请重新输入");
                    } else {
                        boolean name2 = true;
                        for (int i = 0; i < name.length(); i++) {
                            char name3 = name.charAt(i);
                            if (!((name3 >= 97 && name3 <= 122) || (name3 >= 48 && name3 <= 57))) {
                                name2 = false;
                                System.out.println("用户名只能包含小写字母和数字,请重新输入");
                                break;
                            }
                        }
                        if (name2) {
                            System.out.println("请输入密码：");
                            String password = sc.next();
                            System.out.println("请输入邮箱地址：");
                            String email = sc.next();
                            user[count][0] = name;
                            user[count][1] = password;
                            user[count][2] = email;
                            count++;
                            System.out.println("注册成功！");                          
                        }
                    }
                }
            }
            if (choose == 2) {
                System.out.println("请输入用户名：");
                String logName = sc.next();
                boolean a = false;
                for (int i = 0; i < count; i++) {
                    if (logName.equals(user[i][0])) {
                        a = true;
                        break;
                    }
                }
                if (a) {
                    System.out.println("请输入密码：");
                    String logPassword = sc.next();
                    int passwordCount = 0;
                    boolean b = false;
                    while (passwordCount < 3) {
                        for (int i = 0; i < count; i++) {
                            if (logPassword.equals(user[i][1])) {
                                b = true;
                                System.out.println("登录成功！");
                                log = true;
                            }
                        }
                        if (b) {
                            break;
                        } else {
                            passwordCount++;
                            if (passwordCount < 3) {
                                System.out.println("密码错误,请重新输入密码：");
                                logPassword = sc.next();
                            }
                        }
                    }
                    if (passwordCount == 3) {
                        System.out.println("连续3次密码错误,进入找回密码功能");
                        boolean find = false;
                        while (!find) {
                            System.out.println("找回密码功能");
                            System.out.println("请输入用户名：");
                            String findName = sc.next();
                            System.out.println("请输入邮箱地址：");
                            String findEmail = sc.next();
                            for (int i = 0; i < count; i++) {
                                if (findName.equals(user[i][0]) && findEmail.equals(user[i][2])) {
                                    System.out.println("请输入新密码：");
                                    String newPassword = sc.next();
                                    user[i][1] = newPassword;
                                    System.out.println("密码已重置成功！");
                                    find = true;
                                    break;
                                }
                            }
                            if (!find) {
                                System.out.println("用户名或邮箱地址错误,无法找回密码！");
                                System.out.println("是否继续重新输入用户名和邮箱地址？(是/否)");
                                String c = sc.next();
                                if (c.equals("否")) {
                                    find = true;
                                } else if (c.equals("是")) {
                                	find = false;
                                }else{
                                    System.out.println("输入错误,请重新输入");
                	                }
                                }
                            }
                    	}
	                }else{
	                    System.out.println("用户名错误，请重新输入");
                }
            }
            if(choose == 3){
            	if(log){
            		ticketingMessage.Method1();
            	}else{
            	System.out.println("请先登录您的账号");
            	}
            }
            if(choose == 4){
            	if(log){
            		ticketingMessage.Method2();
            	}else{
            	System.out.println("请先登录您的账号");
            	}
            }
            if (choose == 5) {
                System.out.println("退出");
                break;
            }
        }
    }
}
