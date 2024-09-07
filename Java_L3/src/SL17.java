/**
 *break用于循环语句
 */
public class SL17{
	public static void main(String[] args) {
		int i = 0;
		for(i = 1000; i < 2001; i++) {
			if(i % 123 == 0){//判断是否能被123整除
				break;
				}
			}
		System.out.println("第一个能被123整除的数是" + i);
	}
}
