package java2_L8;

public class LX2_2 extends RW2_1{
    //���
    public LX2_2(String name, int maxhp, String skillName, int hp) {
        super(name, maxhp, skillName, hp);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ˮ����εĲ�ɱ");
    }
    public static void main(String[] args) {
    	LX2_2 wuguo = new LX2_2("���",3,"����",3);
        wuguo.fight();
	}
}
