package java2_L8;

public class SL5 {
	private String name;
    private int age;
    private String company;

    public SL5() {
        this.company = "�ٶ�";
    }

    public SL5(String name) {
        this();
        this.name = name;
    }

    public SL5(String name, int age) {
        this(name);
        this.age = age;
    }
    public void info(){
        System.out.println(this.age + "���" + this.name + "��" + this.company + "��˾��ְCEO");
    }
    public static void main(String[] args) {
		SL5 sl5 = new SL5("�����",46);
		sl5.info();
	}
}
