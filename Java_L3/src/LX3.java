
public class LX3{
    public static void main(String[] args){
    	 for (int i = 0; i <= 20; i++){ 
             for (int j = 0; j <= 33; j++){ 
                 	int k = 100 - i - j; 
                 if (5 * i + 3 * j + k / 3 == 100 && k % 3 == 0 && i + j + k == 100) {
                    System.out.println("¹«¼¦£º" + i + "Ä¸¼¦£º" + j + "¼¦³û£º" + k);
                }
            }
    	 }
    }
}