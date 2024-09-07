package java2_L9;

public class SL2_3 extends SL2_1{
    private double bonus;

    public SL2_3(String name, String id, double pay,double bonus) {
        super(name, id, pay);
        this.bonus = bonus;
    }
    @Override
    public void work() {
        System.out.println("经理的工作");
    }
}
