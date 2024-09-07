package RW1;

import java.util.ArrayList;
import java.util.Iterator;

public class RW1_Actor {
	private RW1_Character character;

    public RW1_Actor() {

    }

    public RW1_Actor(RW1_Character character) {
        this.character = character;
    }

    public RW1_Character getCharacter() {
        return character;
    }

    public void setCharacter(RW1_Character character) {
        this.character = character;
    }

    public String toString() {
        return "武将" + character.getName() + "，他的血量是：" + character.getMaxhp() + "，技能是：" + character.getSkillName();
    }
    
}
