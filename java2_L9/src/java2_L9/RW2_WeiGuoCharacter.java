package java2_L9;

public class RW2_WeiGuoCharacter extends RW2_Character{
    //κ��
    private int emotion;
    public RW2_WeiGuoCharacter(String name, int maxhp, String skillName) {
        setName(name);
        setMaxhp(maxhp);
        setHp(maxhp);
        setSkillName(skillName);
    }
    public RW2_WeiGuoCharacter(String name, int maxhp, String skillName,int emotion) {
        this(name,maxhp,skillName);
        this.emotion = emotion;
    }

    @Override
    public void fight() {
        System.out.println(getName() + "�ó���ƽԭ���εĲ�ɱ");
    }
}

