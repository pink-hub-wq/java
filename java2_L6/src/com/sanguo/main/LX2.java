package com.sanguo.main;

import com.sanguo.entity.*;

public class LX2 {
	public static void main(String[] args) {
        String [] [] wujiangArray = {{"����","4","�ʵ�"},{"����","4","����"},{"�ܲ�","4","����"},{"�ĺ","4","����"},{"��Ȩ","4","�ƺ�"},{"���","3","����"}};
        RW1 [] characters = new RW1[6];
        int num = 0;
        for (int i = 0;i < characters.length;i++){
            characters[i] = new RW1();
            characters[i].setName(wujiangArray[i][0]);
            characters[i].setMaxhp(Integer.parseInt(wujiangArray[i][1]));
            characters[i].setSkill(wujiangArray[i][2]);
            characters[i].setNumber(++num);
            characters[i].info();
        }
    }
}
