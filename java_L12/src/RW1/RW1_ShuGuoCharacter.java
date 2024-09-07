package RW1;

public class RW1_ShuGuoCharacter extends RW1_Character{
	//蜀国
	private int emotion;
	
	public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	public RW1_ShuGuoCharacter(String name, int maxhp, String skillName, int emotion) {
	    super(name, maxhp, skillName);
	    this.emotion = emotion; 
	}
	public void fight() {
        System.out.println(getName() + "擅长于山地地形的搏杀");
    }
}
