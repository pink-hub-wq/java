package java2_L8;

public class RW2_2 extends RW2_1{
    //���
    public RW2_2(String name, int maxhp, String skillName, int hp) {
        super(name, maxhp, skillName, hp);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ɽ�ص��εĲ�ɱ");
    }
    public static void main(String[] args) {
    	RW2_2 shuguo = new RW2_2("����",4,"����",4);
        shuguo.fight();
	}
}
