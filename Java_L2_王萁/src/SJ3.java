import java.util.Scanner;

public class SJ3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("������ϼƽ�");
        double heji = scanner.nextDouble();
        System.out.print("�������տ��");
        double shoukuan = scanner.nextDouble();       
        double zhaoling = shoukuan - heji;
        if (zhaoling < 0) {
            System.out.println("�տ���㣡");
        } else if (zhaoling == 0) {
            System.out.println("����Ҫ���㣡");
        } else {
            int yuan = (int)zhaoling;//�Ҽ�Ԫ
            int jiao = (int)((zhaoling - yuan) * 10); //�Ҽ���
            int fen = (int)(zhaoling * 100 % 10);//�Ҽ���
            System.out.println("������Ϊ��" + yuan + "Ԫ" + jiao + "��" + fen + "��");
        }
    }
}