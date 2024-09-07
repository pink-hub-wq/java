/**
 *if嵌套使用
 */
import
java.util.Scanner;
public class SL6 {
	public static void main(String[] args) {
		System.out.println("请输入你的年龄");
		Scanner sc = new Scanner (System.in);//接收用户输入年龄
		int age = sc.nextInt();				//定义年龄变量age
		if(age < 18){						//当年龄在18岁以下时执行					
			System.out.println("未成年");	
		} else if(age >= 18 && age < 35){	//当年龄在18~35岁之间时执行
			System.out.println("中年");		
		} else if(age >= 35 && age < 55){	//当年龄在35~55岁之间时执行
			System.out.println("半老年");
		} else{								//当年龄大于等于55岁时执行
			System.out.println("老年");
		}
		
	}
}

