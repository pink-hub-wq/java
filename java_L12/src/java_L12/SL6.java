package java_L12;

public class SL6 {
    public static void main(String[] args) throws Exception{
        try {
            showException();
        }catch (Exception e){
            System.out.println("����ֻ��showException������\n" + "����main�����в�����쳣��" + "\n" + e);
        }
    }
    public static void showException()throws Exception{
        Object x = new Integer(0);
        System.out.println((String)x);
    }
}

