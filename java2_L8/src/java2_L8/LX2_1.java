package java2_L8;

public class LX2_1 extends RW2_1{
    //κ��
    public LX2_1(String name, int maxhp, String skillName, int hp) {
        super(name, maxhp, skillName, hp);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ƽԭ���εĲ�ɱ");
    }
    public static void main(String[] args) {
    	LX2_1 weiguo = new LX2_1("�ܲ�",4,"����",4);
        weiguo.fight();
	}
}
