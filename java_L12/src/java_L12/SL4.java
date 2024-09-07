package java_L12;

public class SL4 {
    public static void main(String[] args) {
        String appName [] = {"微信","来往"};
        try {
            for (int i = 0; i <= appName.length; i++) {
                System.out.println("应用：" + (i + 1) + ":" + appName[i]);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("数组下标越界异常:" + e.toString());
        }finally {
            System.out.println("无论是否有异常，都会执行finally语句");
        }
    }
}

