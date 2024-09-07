package java_suanfa;

import java.util.Scanner;

//ºËÌÒµÄÊýÁ¿
public class SL2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((a > 0 && a < 30) && (a > 0 && a < 30) && (a > 0 && a < 30)){
            int i = 0;
            do {
                i++;
                if(i % a == 0 && i % b == 0 && i % c == 0) {
                    System.out.println(i);
                    return;
                }
            }while (i < a * b * c);
        }
	}
}

