/**
 * 遍历数组
 */
public class ZD1 {
	public static void main(String[] args) {
		//声明数组a，用于存放偶数
		int [] a = new int[30];
		//声明数组b，用于存放平均值
		int [] b = new int[6];
		//遍历数组a
		for (int i = 0; i < a.length; i++) {
			//赋值偶数
			a [i] = 2 * (i + 1);
			//如果是第五个数则计算平均数
			if ((i + 1) %5 == 0) {
				int avg = 0;
				//遍历数组a中5个连续的元素
				for (int j = i - 4; j <= i; j++){
				avg = avg + a [j];
				}
				//将平均值赋给b
				b[(i + 1) / 5-1] = avg / 5;
				System.out.println(b[(i + 1) / 5 - 1] + "");
			}
		}
	}
}
