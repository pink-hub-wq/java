
public class SL19{
	public static void main (String[] args) {
		long sum=0;//定义long型的求和变量
		int i = 1;
		while(i < 7) {
			long c = 1;//定义long型的c来存放各个数的阶乘值
			for (int j = 1; j <= i; j++) {
			c *= j;
			}
			sum += c;
			i++;
		}
	System.out.println ("1!+2!+3!+.....+6!="+sum);
	}
}

