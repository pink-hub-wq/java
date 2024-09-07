
public class SJ1{
    public static void main(String[] args){
    	 int sum = 0;
    	 int n = 0;
    	 while(sum <= 1000){
    		 n++;
    		 sum = sum + 10 * n + 2;
    	 }
    	 System.out.println("满足条件的n的最大取值为" + (n - 1));
    }
}