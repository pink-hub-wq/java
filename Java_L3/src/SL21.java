
public class SL21 {
	public static void main (String[] args) {
	for(int i = 0;i <= 9;i++) {//ѭ����λ�ϵ�����
		for(int j = 0;j <= 9;j++){ //ѭ��ʮλ�ϵ�����
			for (int k = 1 ;k <= 9;k++){ //ѭ����λ�ϵ�����
				if (i * i * i + j * j * j + k * k * k == k * 100 + j * 10 +i ){//�ж�ˮ�ɻ�����
					System.out.println(k*100+j*10+i+"��ˮ�ɻ���");
				}
			}
		}
	}
	}
}