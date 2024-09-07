package java2_L8;

public class SL5 {
	private String name;
    private int age;
    private String company;

    public SL5() {
        this.company = "百度";
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
        System.out.println(this.age + "岁的" + this.name + "在" + this.company + "公司任职CEO");
    }
    public static void main(String[] args) {
		SL5 sl5 = new SL5("李彦宏",46);
		sl5.info();
	}
}
