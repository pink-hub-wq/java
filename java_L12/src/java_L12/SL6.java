package java_L12;

public class SL6 {
    public static void main(String[] args) throws Exception{
        try {
            showException();
        }catch (Exception e){
            System.out.println("这是只在showException中声明\n" + "并在main方法中捕获的异常：" + "\n" + e);
        }
    }
    public static void showException()throws Exception{
        Object x = new Integer(0);
        System.out.println((String)x);
    }
}

