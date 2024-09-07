package java2_L3;

public class SL6 {
	public static void main(String[] args) {
        System.out.println("淘宝公司计划招聘10名软件工程师");
        System.out.println("--------------------------");
        int count = 0;
        do{
            count++;
            System.out.println("招聘了" + count + "名软件工程师");
        }while (count < 10);
        System.out.println("---------------------------");
        System.out.println("已完成" + count + "名软件工程师招聘");
    }
}
