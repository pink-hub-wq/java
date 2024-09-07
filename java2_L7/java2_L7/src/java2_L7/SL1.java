package java2_L7;

public class SL1 {
	private void test(){
        System.out.println("无参数方法");
    }
    private void test(String msg){
        System.out.println("重载方法，参数值为：" + msg);
    }
    public static void main(String[] args){
        SL1 demo = new SL1();
        demo.test();;
        demo.test("你好");
    }
}
