package java2_L8;

public class SL6_2 extends SL6_1 {
    private String position;
    private int salary;
    
    public SL6_2(String name, int age, String company,String position,int salary) {
        super(name, age, company);
        System.out.println("ִ�����๹�췽��");
        this.position = position;
        this.salary = salary;
    }
    public void showEngineerInfo(){
        super.showEmployeeInfo();
        System.out.print("����λ��" + position + "����н" + salary + "Ԫ");
    }
}

