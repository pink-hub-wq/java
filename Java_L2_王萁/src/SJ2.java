
import java.util.Scanner;
public class SJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//�����û����������
        System.out.println("������һ����λ����");
        int number = scanner.nextInt();//�������ֱ���      
        if (number < 100 || number > 999) {
        System.out.println("����Ĳ���һ����λ����");
        } else {
        int a = number / 100;//��ȡ��λ�ϵ���
        int b = number / 10 % 10;//��ȡʮλ�ϵ���
        int c = number % 10;//��ȡ��λ�ϵ���
        int sum = a + b +c;//��λ����֮��
        System.out.println("��λ�ϵ���Ϊ��" + a);
        System.out.println("ʮλ�ϵ���Ϊ��" + b);
        System.out.println("��λ�ϵ���Ϊ��" + c);
        System.out.println("��λ����֮��Ϊ��" + sum);
        }
    }
}
