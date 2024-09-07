package java2_L9;

abstract class SL2_1 {
	private String name;
    private String id;
    private double pay;

    SL2_1(String name, String id, double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }
    public abstract void work();
}
