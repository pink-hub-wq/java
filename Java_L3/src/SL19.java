
public class SL19{
	public static void main (String[] args) {
		long sum=0;//����long�͵���ͱ���
		int i = 1;
		while(i < 7) {
			long c = 1;//����long�͵�c����Ÿ������Ľ׳�ֵ
			for (int j = 1; j <= i; j++) {
			c *= j;
			}
			sum += c;
			i++;
		}
	System.out.println ("1!+2!+3!+.....+6!="+sum);
	}
}

