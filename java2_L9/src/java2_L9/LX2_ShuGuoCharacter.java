package java2_L9;

public class LX2_ShuGuoCharacter extends LX2_Character {
	//���
    private int emotion;
    
    public LX2_ShuGuoCharacter(String name, int maxhp, String skillName, int hp, int emotion) {
		super(name, maxhp, skillName, hp);
		this.emotion = emotion;
	}

	public int getEmotion() {
		return emotion;
	}

	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
    @Override
    public void fight() {
        System.out.println(getName() + "�ó���ɽ�ص��εĲ�ɱ");
    }
    public void showMsg(){
    	super.showMsg();
    	System.out.print("����ֵ��" + emotion);
    }
}

