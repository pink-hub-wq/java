
package LX2;

public class LX2_WuGuoCharacter extends LX2_Character{
	//���
    public LX2_WuGuoCharacter(String name, int maxhp, String skillName) {
        super(name, maxhp, skillName);
    }
    public void fight() {
        System.out.println(getName() + "�ó���ˮ����εĲ�ɱ");
    }
}
