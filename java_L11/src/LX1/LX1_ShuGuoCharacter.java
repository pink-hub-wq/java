package LX1;

public class LX1_ShuGuoCharacter extends LX1_Character{
	//���
	private int emotion;
	
	public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	public LX1_ShuGuoCharacter(String name, int maxhp, String skillName, int emotion) {
	    super(name, maxhp, skillName);
	    this.emotion = emotion; 
	}
	public void fight() {
        System.out.println(getName() + "�ó���ɽ�ص��εĲ�ɱ");
    }
}
