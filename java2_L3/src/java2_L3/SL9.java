package java2_L3;

public class SL9 {
	public static void main(String[] args) {
        int teamCount = 10;
        int javaNo = 8;
        for (int i = 1; i <= teamCount; i++) {
            if(i == javaNo){
                System.out.println("编号为" + i + "的员工精通Java，符合要求");
                continue;
            }
            System.out.println("编号为" + i + "的员工不符合要求");
        }
    }
}
