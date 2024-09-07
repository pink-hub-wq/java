package java_suanfa;


//计算数字
public class SL3 {
//有一串数字，分别为1、1、2、3、5、8、13、21..，
//根据以上数字出现的规律,请你借助计算机准确地计算出第1-20位的数字的和。
	 public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int sum = a + b;
        for (int i = 2; i < 20; i++) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }
        System.out.println("第1-20位的数字的和为：" + sum);
    }
}
