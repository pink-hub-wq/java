
public class SL24 {
	public static void main (String[] args){
	for (int i = 1;i <= 9;i++){
		if (i % 2 == 0){ //若为偶数行，则换行
			System.out.println ();
		} else {//若为奇数行，则打印
			for(int k = 0;k <= (9 - i) / 2;k++) { //先打印空格
				System. out. print(" ");
				}
			for (int j = 1;j <= i;j++){
				System. out. print ("*");
				}
			}
		}
	}
}
