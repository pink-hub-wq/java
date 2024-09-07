package java2_L9;

public class RW1_PlayerAI extends RW1_Actor{
    private String type = "对手";

    public RW1_PlayerAI(RW1_Character character) {
        super(character);
    }

    @Override
    public String toString() {
        return "对手选择了" + super.toString();
    }
}
