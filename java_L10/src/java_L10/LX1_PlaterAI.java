package java_L10;

public class LX1_PlaterAI extends LX1_Actor{
	private String type = "对手";

    public LX1_PlaterAI(LX1_Character character) {
        super();
    }
	@Override
	public String toString() {
		return "对手选择了" + super.toString();
	}
}
