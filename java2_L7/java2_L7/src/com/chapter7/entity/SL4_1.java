package com.chapter7.entity;

public class SL4_1 {
	private static String ceoName = "½����";
    private String subName;

    public SL4_1(String subName) {
        this.subName = subName;
    }
    public static void ceo(){
        System.out.println("����Ͱ�CEO�ǣ�" + ceoName);
    }
    public void info(){
        System.out.println(subName + "�ǰ���Ͱ��ӹ�˾");
    }
}
