import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] user = new String[10][2]; 
        int count = 0;
        StudentMessage studentmessage = new StudentMessage();
        boolean log = false;
        while (true) {
            System.out.println("��ӭʹ������ѧ������ϵͳ");
            System.out.println("1.��¼");
            System.out.println("2.ע��");
            System.out.println("������1��2ѡ���㽫���еĲ�����");
            int choose = sc.nextInt();
            if (choose == 1) {
                // ��¼
                if (count == 0) {
                    System.out.println("û��ע���˻�������ע��");
                    continue;
                }
                int i = 0;
                while (i < 3) {
                    System.out.println("�������˺ţ�");
                    String name = sc.next();
                    System.out.println("���������룺");
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
                   System.out.println("�˺Ż��������ʣ�ೢ�Դ�����" + (3 - i));              
                }
                if (!log) {
                    System.out.println("�������ε�¼ʧ�ܣ��������˵���");
                    continue;
                }
        } else if (choose == 2) {
            // ע��
            System.out.println("�������˺�,�˺ű����������ĸ��д�����һ���ַ�Ϊ�������");
            String name = sc.next();
            char firstName = name.charAt(0);
            char lastName = name.charAt(name.length() - 1);
            if(((firstName >= 65 && firstName <= 90 && lastName >= 33 && lastName <= 47) || (firstName >= 65 && firstName <= 90 && lastName >= 58 && lastName <= 64) || (firstName >= 65 && firstName <= 90 && lastName >= 91 && lastName <= 96) || (firstName >= 65 && firstName <= 90 && lastName >= 123 && lastName <= 126)) ){
                System.out.println("�˺ŷ���Ҫ��");
            } else {
                System.out.println("�˺Ų�����Ҫ��,����������");
                continue;
            }
            System.out.println("����������,��������������ĸ��д�����һ���ַ�Ϊ�������");
            String password = sc.next();
            char firstPassword = password.charAt(0);
            char lastPassword = password.charAt(password.length() - 1);
            if(((firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 33 && lastPassword <= 47) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 58 && lastPassword <= 64) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 91 && lastPassword <= 96) || (firstPassword >= 65 && firstPassword <= 90 && lastPassword >= 123 && lastPassword <= 126)) ){
                System.out.println("�������Ҫ��,ע��ɹ�");
                user[count][0] = name;
                user[count][1] = password;
                count++;
            } else {
                System.out.println("���벻����Ҫ������������");
                continue;
            }
        } else {
            System.out.println("�����������������");
            continue;
        }if (log) {
            boolean studentMessage = false;
            while (!studentMessage) {
                System.out.println("--------------------------------------------");
                System.out.println("1����ʾ����ѧ����Ϣ");
                System.out.println("2�����ݱ�Ų�ѯѧ����Ϣ");
                System.out.println("3�����ݱ���޸�ѧ������");
                System.out.println("4�����������޸�ѧ���༶");
                System.out.println("5�����ݰ༶��ѯȫ��ѧ����Ϣ");
                System.out.println("--------------------------------------------");
                System.out.print("��ѡ��[1/2/3/4/5]��");
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
                    System.out.println("��ѧ����Ϣ������");
                    break;
            }
                System.out.println("�����Ƿ����[y/n]��");
                String a = sc.next();
                if (a.equals("n")) {
                    studentMessage = true;
                } else if (a.equals("y")) {
                	studentMessage = false;
                }else{
                    System.out.println("�������,����������");
	                }
	            }
	        }
	    }
    }
}