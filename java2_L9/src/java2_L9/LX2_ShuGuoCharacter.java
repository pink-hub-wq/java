package java2_L9;

public class LX2_ShuGuoCharacter extends LX2_Character {
	//蜀国
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
        System.out.println(getName() + "擅长于山地地形的搏杀");
    }
    public void showMsg(){
    	super.showMsg();
    	System.out.print("情义值：" + emotion);
    }
}

