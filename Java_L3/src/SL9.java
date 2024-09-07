import
java.util.Scanner;
public class SL9 {
	public static void main(String[] args) {
		System.out.println("请输入月份");
		Scanner sc = new Scanner (System.in);//接收用户输入月份
		int month = sc.nextInt();		//定义月份变量month		
		if(month == 12 || month == 1 || month == 2){//当month == 1或2或12时执行				
			System.out.println("大约是冬季");
		} else {
			if(month == 3 || month == 4 || month == 5){	//当month == 3或4或5时执行
				System.out.println("大约是春季");
			} else {
				if(month == 6 || month == 7 || month == 8){	//当month == 6或7或8时执行
					System.out.println("大约是夏季");
				} else {
					if(month == 9 || month == 10 || month == 11){//当month == 9或10或11时执行
						System.out.println("大约是秋季");
					} else{//当month不在1~12之间时执行
						System.out.println("月份不合法");
					}
				}
			}
		}
	}
}