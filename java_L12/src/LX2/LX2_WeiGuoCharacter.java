package LX2;

public class LX2_WeiGuoCharacter extends LX2_Character{
	//κ��
    public LX2_WeiGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ƽԭ���εĲ�ɱ");
    }
}
