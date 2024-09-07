package java2_L9;

public class LX1_PlayerAI extends LX1_Actor  {
    private String type = "对手";

    public LX1_PlayerAI(RW1_Character character) {
        super(character);
    }
	@Override
	public void selectWuJiang() {
		System.out.println("对手选择了" + super.toString());
	}
}
