package com.sanguo.main;
import com.sanguo.entity.*;
public class LX1 {
	public static void main(String[] args) {
        int number = 0;
        RW1 character1 = new RW1();
        character1.setName("����");
        character1.setMaxhp(4);
        character1.setSkill("�ʵ�");
        character1.setNumber(++number);
        character1.info();
        RW1 character2 = new RW1();
        character2.setName("����");
        character2.setMaxhp(4);
        character2.setSkill("����");
        character2.setNumber(++number);
        character2.info();
        RW1 character3 = new RW1();
        character3.setName("�ܲ�");
        character3.setMaxhp(4);
        character3.setSkill("����");
        character3.setNumber(++number);
        character3.info();
        RW1 character4 = new RW1();
        character4.setName("�ĺ");
        character4.setMaxhp(4);
        character4.setSkill("����");
        character4.setNumber(++number);
        character4.info();
        RW1 character5 = new RW1();
        character5.setName("��Ȩ");
        character5.setMaxhp(4);
        character5.setSkill("�ƺ�");
        character5.setNumber(++number);
        character5.info();
        RW1 character6 = new RW1();
        character6.setName("���");
        character6.setMaxhp(3);
        character6.setSkill("����");
        character6.setNumber(++number);
        character6.info();
    }
}
