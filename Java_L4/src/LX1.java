
public class LX1 {
	public static void main(String[] args) {
		int [] a = new int [] {8,6,5,4,1};
		int tempLength = a.length;
		for(;--tempLength > 0;){
			for(int i = 0;i < tempLength;++i ){
				if(a[i] > a[i + 1]){
					int temp = a [i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		for(int i = 0;i < a.length;++i){
			System.out.print(a[i] + " ");
		}
	}
}