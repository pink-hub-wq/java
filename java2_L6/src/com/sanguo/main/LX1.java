package com.sanguo.main;
import com.sanguo.entity.*;
public class LX1 {
	public static void main(String[] args) {
        int number = 0;
        RW1 character1 = new RW1();
        character1.setName("Áõ±¸");
        character1.setMaxhp(4);
        character1.setSkill("ÈÊµÂ");
        character1.setNumber(++number);
        character1.info();
        RW1 character2 = new RW1();
        character2.setName("ÕÔÔÆ");
        character2.setMaxhp(4);
        character2.setSkill("Áúµ¨");
        character2.setNumber(++number);
        character2.info();
        RW1 character3 = new RW1();
        character3.setName("²Ü²Ù");
        character3.setMaxhp(4);
        character3.setSkill("¼éĞÛ");
        character3.setNumber(++number);
        character3.info();
        RW1 character4 = new RW1();
        character4.setName("ÏÄºîª");
        character4.setMaxhp(4);
        character4.setSkill("¸ÕÁÒ");
        character4.setNumber(++number);
        character4.info();
        RW1 character5 = new RW1();
        character5.setName("ËïÈ¨");
        character5.setMaxhp(4);
        character5.setSkill("ÖÆºâ");
        character5.setNumber(++number);
        character5.info();
        RW1 character6 = new RW1();
        character6.setName("ÖÜè¤");
        character6.setMaxhp(3);
        character6.setSkill("·´¼ä");
        character6.setNumber(++number);
        character6.info();
    }
}
