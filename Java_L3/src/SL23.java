
public class SL23 {
	public static void main (String[] args) {
		int number = 0;
			for(int i = 1;i <= 4;i++){//第一层for循环控制百位数
				for(int j = 1;j <= 4;j++){//第一层for循环控制十位数
					for(int k = 1;k <= 4;k++){//第二层 for循环控制个位数
						number++;
						}
					}
				}
				System.out.println("能够组成" + number + "个不同的3位数");
	}
}
