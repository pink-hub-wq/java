/**
*ǿ������ת��
*/
public class SL15 {
	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;
		System.out.println("������ת��Ϊ�ֽ��ͣ�");
		b=(byte)i;
		System.out.println("i��b:" + i + "��" + b);
		System.out.println("��˫������ת��Ϊ���ͣ�");
		i=(int)d;
		System.out.println("d��i:" + d + "��" + i);
		System.out.println("��˫������ת��Ϊ�ֽ��ͣ�");
		b=(byte)d;
		System.out.println("d��b:" + d + "��" + b);		
	}
}
