
public class LX2 {
	public static void main(String[] args) {
        int[][] a = {{0, 1, 2}, {3, 4, 5}, {6, 7, 9}};
        int[][] b = {{10, 11, 22}, {33, 24, 55}, {66, 27, 19}};
        int[][] result = new int[a.length][b.length];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                result [i] [j] = a [i] [j] + b [i] [j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result [i].length; j++) {
                System.out.print(result [i] [j] + " ");
            }
            System.out.println();
        }
    }
}
