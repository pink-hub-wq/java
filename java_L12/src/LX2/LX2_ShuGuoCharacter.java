package LX2;

public class LX2_ShuGuoCharacter extends LX2_Character{
	//���
	private int emotion;
	
	public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	public LX2_ShuGuoCharacter(String name, int maxhp, String skillName, int emotion) {
	    super(name, maxhp, skillName);
	    this.emotion = emotion; 
	}
	public void fight() {
        System.out.println(getName() + "�ó���ɽ�ص��εĲ�ɱ");
    }
}
