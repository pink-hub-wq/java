package java2_L8;

public class SL2 extends SL1_1{
	private String position;
    private int salary;

    public SL2() {
        System.out.println("�ҽ�" + getName() + "������" + getAge() + "�꣬��ְ��" + getCompany() + "��˾");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
