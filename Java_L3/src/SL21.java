
public class SL21 {
	public static void main (String[] args) {
	for(int i = 0;i <= 9;i++) {//循环个位上的数字
		for(int j = 0;j <= 9;j++){ //循环十位上的数字
			for (int k = 1 ;k <= 9;k++){ //循环百位上的数字
				if (i * i * i + j * j * j + k * k * k == k * 100 + j * 10 +i ){//判断水仙花条件
					System.out.println(k*100+j*10+i+"是水仙花数");
				}
			}
		}
	}
	}
}