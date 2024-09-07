
//使用while循环统计数字9出现的次数 

public class ZD2_3{
	public static void main(String[] args){
		System.out.println("100以下数字9出现的次数");
		//循环变量
		int i = 1;
		//记录个数
		int count = 0;
		while(i <= 100){
			//判断i中是否包含数字9
			//个位数是9的判断
			if ((i + 1) % 10 == 0) {
				count++;
			}else{
				//十位数是9的判断
				if(i >= 90 && i < 99){
					count++;
				}
			}
				//改变循环变量
				i++;
		}
		System.out.println(count);
	}
}