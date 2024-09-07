package com.sanguo.main;

import com.sanguo.entity.*;

public class LX2 {
	public static void main(String[] args) {
        String [] [] wujiangArray = {{"Áõ±¸","4","ÈÊµÂ"},{"ÕÔÔÆ","4","Áúµ¨"},{"²Ü²Ù","4","¼éĞÛ"},{"ÏÄºîª","4","¸ÕÁÒ"},{"ËïÈ¨","4","ÖÆºâ"},{"ÖÜè¤","3","·´¼ä"}};
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
