package java_L10;

public class RW2_ShuGuoCharacter extends RW2_Character{
	//���
	private int emotion;
	
	public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	public RW2_ShuGuoCharacter(String name, int maxhp, String skillName, int emotion) {
	    super(name, maxhp, skillName);
	    this.emotion = emotion; 
	}
	public void fight() {
        System.out.println(getName() + "�ó���ɽ�ص��εĲ�ɱ");
    }
}
