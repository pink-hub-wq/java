import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] user = new String[10][2]; 
        int count = 0;
        StudentMessage studentmessage = new StudentMessage();
        boolean log = false;
        while (true) {
            System.out.println("欢迎使用青凌学生管理系统");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("请输入1或2选择你将进行的操作：");
            int choose = sc.nextInt();
            if (choose == 1) {
                // 登录
                if (count == 0) {
                    System.out.println("没有注册账户，请先注册");
                    continue;
                }
                int i = 0;
                while (i < 3) {
                    System.out.println("请输入账号：");
                    String name = sc.next();
                    System.out.println("请输入密码：");
                    String password = sc.next();
                    for (int j = 0; j < count; j++) {
                        if (name.equals(user[j][0]) && password.equals(user[j][1])) {
                            log = true;
                            break;
                        }
                    }
                    if (log){
                    	break;
                    }                 	
                    i++;
                   System.out.println("账号或密码错误！剩余尝试次数：" + (3 - i));              
                }
                if (!log) {
                    System.out.println("连续三次登录失败，返回主菜单。");
                    continue;
                }
        } else if (choose == 2) {
            // 注册
            System.out.println("请输入账号,账号必须符合首字母大写，最后一个字符为特殊符号");
            String name = sc.next();
            char firstName = name.charAt(0);
            char lastName = name.charAt(name.length() - 1);
            if(((firstName >= 65 && firstName <= 90 && lastName >= 33 && lastName <= 47) || (firstName >= 65 && firstName <= 90 && lastName >= 58 && lastName <= 64) || (firstName >= 65 && firstName <= 90 && lastName >= 91 && lastName <= 96) || (firstName >= 65 && firstName <= 90 && lastName >= 123 && lastName <= 126)) ){
                System.out.println("账号符合要求");
            } else {
                System.out.println("账号不符合要求,请重新输入");
                continue;
            }
            System.out.println("请输入密码,密码必须符合首字母大写，最后一个字符为特殊符号");
            String password = sc.next();
            char firstPassword = password.charAt(0);
            char lastPassword = password.charAt(password.length() - 1);
            if(((firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 33 && lastPassword <= 47) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 58 && lastPassword <= 64) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 91 && lastPassword <= 96) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 123 && lastPassword <= 126)) ){
                System.out.println("密码符合要求,注册成功");
                user[count][0] = name;
                user[count][1] = password;
                count++;
            } else {
                System.out.println("密码不符合要求，请重新输入");
                continue;
            }
        } else {
            System.out.println("输入错误，请重新输入");
            continue;
        }if (log) {
            boolean studentMessage = false;
            while (!studentMessage) {
                System.out.println("--------------------------------------------");
                System.out.println("1、显示所有学生信息");
                System.out.println("2、根据编号查询学生信息");
                System.out.println("3、根据编号修改学生年龄");
                System.out.println("4、根据姓名修改学生班级");
                System.out.println("5、根据班级查询全部学生信息");
                System.out.println("--------------------------------------------");
                System.out.print("请选择[1/2/3/4/5]：");
                int choice = sc.nextInt();
                switch (choice) {
                case 1:
                    studentmessage.Method1();
                    break;
                case 2:
                    studentmessage.Method2();
                    break;
                case 3:
                    studentmessage.Method3();
                    break;
                case 4:
                    studentmessage.Method4();
                    break;
                case 5:
                    studentmessage.Method5();
                    break;
                default:
                    System.out.println("该学生信息不存在");
                    break;
            }
                System.out.println("请问是否继续[y/n]：");
                String a = sc.next();
                if (a.equals("n")) {
                    studentMessage = true;
                } else if (a.equals("y")) {
                	studentMessage = false;
                }else{
                    System.out.println("输入错误,请重新输入");
	                }
	            }
	        }
	    }
    }
}