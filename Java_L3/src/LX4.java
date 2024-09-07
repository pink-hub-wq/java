public class LX4 {
    public static void main(String[] args) {
    	 int a = 1;//前2个数
         int b = 1;//前1个数
         int c = 0;//现在这个数
         System.out.println(a);
         System.out.println(b);
         for(int i = 3;i < 21;i++) {
             c = a + b;
             System.out.println(c);
             a = b;
             b = c;
         }
     }
 }