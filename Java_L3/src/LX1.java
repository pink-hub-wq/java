import 
java.util.Scanner;
public class LX1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("�������һ������: ");
        int a = sc.nextInt();
        System.out.print("������ڶ�������: ");
        int b = sc.nextInt();
        System.out.print("�����������:");
        char operator = sc.next().charAt(0);
        if (operator == '+'){
            int result = a + b;
            System.out.println("���=" + result);
        }else if (operator == '-'){
            int result = a - b;
            System.out.println("���=" + result);
        }else if (operator == '*'){
            int result = a * b;
            System.out.println("���=" + result);
        }else if (operator == '%'){
            int result = a % b;
            System.out.println("���=" + result);
        }else if (operator == '/'){
        	if (b == 0){
        		System.out.println("0����������");
        	}else{
        		double c = (double)a / b;
        		System.out.println("���=" + c);
        	}
        }else{        
            System.out.println("����������Ϲ淶");
        }       
    }
}
