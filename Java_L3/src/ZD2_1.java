
//利用for循环判断正整数并计算阶乘

import
java.util.Scanner;
public class ZD2_1{
	public static void main(String[] args){
		System.out.println("请输入一个正整数:");
		//接收用户输入
		Scanner sc = new Scanner(System.in);
		//将输入内容赋给变量a
		int a = sc.nextInt();
		//存储阶乘的积
		long j = 1;
		//大于0的整数才能进行阶乘运算
		if (a >= 0){
			//循环计算
			for (; a>=1; a--){
				j = j * a;
			}
			System.out.println("的阶乘为" + j);
		}else{
			System.out.println(a + "不能进行阶乘计算。");
		}
	}
}