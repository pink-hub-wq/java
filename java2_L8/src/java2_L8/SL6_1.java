package java2_L8;

public class SL6_1 {
    private String name;
    private int age;
    private String company;

    public SL6_1(String name, int age, String company) {
        System.out.println("ִ�и��๹�췽��");
        this.name = name;
        this.age = age;
        this.company = company;
    }
    public void showEmployeeInfo(){
        System.out.print(company + "��˾" + "Ա��" + name + "������" + age + "��");
    }
}

