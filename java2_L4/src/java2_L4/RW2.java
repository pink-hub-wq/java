package java2_L4;

public class RW2 {
	public static void main(String[] args) {
        String [] [] wujiangArray = {{"����","4","�ʵ�"},{"����","4","����"},{"�ܲ�","4","����"},{"�ĺ","4","����"},{"��Ȩ","4","�ƺ�"},{"���","3","����"}};
        for (int i = 0; i < wujiangArray.length; i++) {
            System.out.println((i + 1) + "." + wujiangArray[i][0] + "\t Ѫ����" + wujiangArray[i][1] + "\t ���ܣ�" + wujiangArray[i][2]);
        }
    }
}
