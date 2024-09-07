import 
java.util.Scanner;
public class LX2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数: ");
        int a = sc.nextInt();
        System.out.print("请输入第二个整数: ");
        int b = sc.nextInt();
        System.out.print("请输入运算符:");
        char operator = sc.next().charAt(0);
        switch (operator){
        case '+':
            int result = a + b;
            System.out.println("结果=" + result);
            break;
        case '-':
            result = a - b;
            System.out.println("结果=" + result);
            break;
        case '*':
            result = a * b;
            System.out.println("结果=" + result);
            break;
        case '%':
            result = a % b;
            System.out.println("结果=" + result);
            break;
        case '/':
            if (b == 0){
            	System.out.println("0不能做除数");               
            }else{
            	double c = (double)a / b;
            	System.out.println("结果=" + c);
            }
            break;
        default:
            System.out.println("运算符不符合规范");
        }
	}
}

