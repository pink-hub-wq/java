package java2_L7;

public class SL1 {
	private void test(){
        System.out.println("�޲�������");
    }
    private void test(String msg){
        System.out.println("���ط���������ֵΪ��" + msg);
    }
    public static void main(String[] args){
        SL1 demo = new SL1();
        demo.test();;
        demo.test("���");
    }
}
