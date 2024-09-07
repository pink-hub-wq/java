package java2_L9;

public class RW1_Test {
	public static void main(String[] args) {
        RW1_Actor actor = null;
        RW1_Character character = null;
        character = new RW1_ShuGuoCharacter("’‘‘∆",4,"¡˙µ®",85);
        actor = new RW1_Player(character);
        System.out.println(actor);
        character = new RW1_WeiGuoCharacter("≤‹≤Ÿ",4,"ºÈ–€",85);
        actor = new RW1_PlayerAI(character);
        System.out.println(actor);
    }
}
