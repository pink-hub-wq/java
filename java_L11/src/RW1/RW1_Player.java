package RW1;

public class RW1_Player extends RW1_Actor{
	private String type = "���";

    public RW1_Player(RW1_Character character) {
        super(character);
    }
	@Override
	public String toString() {
		return "���ѡ����" + super.toString();
	}
}
