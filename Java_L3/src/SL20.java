
public class SL20{
	public static void main (String[] args) {
			for (int i = 1;i < 10;i++){//第一层for循环控制行
				for(int j = 1;j <= i;j++){//第二层for循环控制列
					System.out.println (i+ "*" + j + "=" + i * j + "");
				}
			}
			System.out.println ();
	}
}
