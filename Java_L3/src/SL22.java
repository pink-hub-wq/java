
public class SL22 {
	public static void main(String[] args) {
		int numeric = 3;
		while(numeric <= 50){//控制被除数
			int tempNum = 2;
			while(tempNum < numeric){//当除数不在2至被除数本身之间时，循环结束
				if(numeric % tempNum == 0) { //如果能被整除，则跳出内循环		
					break;
				}
				++tempNum;//使除数加1
			}
			if (tempNum == numeric) {//如果只能被本身整除，则为素数
			System.out.println(numeric);
			}
			++numeric;
		}
	}
}
