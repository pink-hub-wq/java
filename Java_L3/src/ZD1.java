import
java.util.Scanner;
public class ZD1 {
	public static void main(String[] args) {
		System.out.println("请输入你的分数");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		//小于60时执行
		if(x < 60){
			System.out.println("成绩是差！");
			//在60~75之间时执行
		} else if (x >= 60 && x < 75){
			System.out.println("成绩是中！");
			//在75~95之间时执行
		} else if (x >= 75 && x < 95){
			System.out.println("成绩是良！");
			//大于95时执行
		} else {
			System.out.println("成绩是优！");
		}
			
	}
}
