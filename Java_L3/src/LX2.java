import 
java.util.Scanner;
public class LX2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("�������һ������: ");
        int a = sc.nextInt();
        System.out.print("������ڶ�������: ");
        int b = sc.nextInt();
        System.out.print("�����������:");
        char operator = sc.next().charAt(0);
        switch (operator){
        case '+':
            int result = a + b;
            System.out.println("���=" + result);
            break;
        case '-':
            result = a - b;
            System.out.println("���=" + result);
            break;
        case '*':
            result = a * b;
            System.out.println("���=" + result);
            break;
        case '%':
            result = a % b;
            System.out.println("���=" + result);
            break;
        case '/':
            if (b == 0){
            	System.out.println("0����������");               
            }else{
            	double c = (double)a / b;
            	System.out.println("���=" + c);
            }
            break;
        default:
            System.out.println("����������Ϲ淶");
        }
	}
}

