package LX1;

public class LX1_WuGuoCharacter extends LX1_Character{
	//���
    public LX1_WuGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ˮ����εĲ�ɱ");
    }
}
