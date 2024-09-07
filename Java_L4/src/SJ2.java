import java.util.Arrays;
public class SJ2 {
	  public static void main(String[] args) {
	        int[][] a = {{4, 6, 7}, {1, 2, 8}, {3, 5, 9}};
	        int[][] b = new int[3][3];
	        int[] c = flatten(a);
	        Arrays.sort(c);
	        int index = 0;
	        for (int i = 0; i < b.length; i++) {
	            for (int j = 0; j < b[i].length; j++) {
	                b[i][j] = c[index];
	                index++;
	            }
	        }
	        printArray(b);
	    }
	    public static int[] flatten(int[][] a) {
	        int[] c = new int[a.length * a[0].length];
	        int index = 0;
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                c[index++] = a[i][j];
	            }
	        }
	        return c;
	    }
	    public static void printArray(int[][] a) {
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
