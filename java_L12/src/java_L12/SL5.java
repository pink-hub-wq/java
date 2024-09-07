package java_L12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SL5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        try {
            System.out.println("请输入五个数组元素：");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("请输入数组元素索引：");
            int index = sc.nextInt();
            System.out.println("arr[" + index + "] = " + arr[index]);
            int result = arr[3] / arr[0];
            System.out.println("计算结果为：" + result);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("异常信息：" + e);
        }catch (ArithmeticException e){
            System.out.println("异常信息：" + e);
        }catch (InputMismatchException e){
            System.out.println("异常信息：" + e);
        }
        System.out.println("*****程序结束*****");
    }
}
