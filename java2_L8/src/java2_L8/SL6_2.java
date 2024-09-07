package java2_L8;

public class SL6_2 extends SL6_1 {
    private String position;
    private int salary;
    
    public SL6_2(String name, int age, String company,String position,int salary) {
        super(name, age, company);
        System.out.println("执行子类构造方法");
        this.position = position;
        this.salary = salary;
    }
    public void showEngineerInfo(){
        super.showEmployeeInfo();
        System.out.print("，岗位是" + position + "，月薪" + salary + "元");
    }
}

