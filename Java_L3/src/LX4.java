public class LX4 {
    public static void main(String[] args) {
    	 int a = 1;//ǰ2����
         int b = 1;//ǰ1����
         int c = 0;//���������
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