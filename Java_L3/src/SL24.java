
public class SL24 {
	public static void main (String[] args){
	for (int i = 1;i <= 9;i++){
		if (i % 2 == 0){ //��Ϊż���У�����
			System.out.println ();
		} else {//��Ϊ�����У����ӡ
			for(int k = 0;k <= (9 - i) / 2;k++) { //�ȴ�ӡ�ո�
				System. out. print(" ");
				}
			for (int j = 1;j <= i;j++){
				System. out. print ("*");
				}
			}
		}
	}
}
