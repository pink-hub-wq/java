package java_L10;

public class LX1_WeiGuoCharacter extends LX1_Character{
	//κ��
    public LX1_WeiGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ƽԭ���εĲ�ɱ");
    }
}
