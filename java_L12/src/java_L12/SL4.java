package java_L12;

public class SL4 {
    public static void main(String[] args) {
        String appName [] = {"΢��","����"};
        try {
            for (int i = 0; i <= appName.length; i++) {
                System.out.println("Ӧ�ã�" + (i + 1) + ":" + appName[i]);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("�����±�Խ���쳣:" + e.toString());
        }finally {
            System.out.println("�����Ƿ����쳣������ִ��finally���");
        }
    }
}

