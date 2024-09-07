package java2_L9;

public class LX1_Test {
	public static void main(String[] args) {
		LX1_Actor actor = null;
        RW1_Character character = null;
        character = new RW1_ShuGuoCharacter("’‘‘∆",4,"¡˙µ®",85);
        actor = new LX1_Player(character);
        actor.selectWuJiang();
        character = new RW1_WeiGuoCharacter("≤‹≤Ÿ",4,"ºÈ–€",85);
        actor = new LX1_PlayerAI(character);
        actor.selectWuJiang();
    }
}
