package java_suanfa;


//��������
public class SL3 {
//��һ�����֣��ֱ�Ϊ1��1��2��3��5��8��13��21..��
//�����������ֳ��ֵĹ���,������������׼ȷ�ؼ������1-20λ�����ֵĺ͡�
	 public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int sum = a + b;
        for (int i = 2; i < 20; i++) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }
        System.out.println("��1-20λ�����ֵĺ�Ϊ��" + sum);
    }
}
