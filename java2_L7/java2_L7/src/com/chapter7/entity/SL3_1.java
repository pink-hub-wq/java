package com.chapter7.entity;

public class SL3_1 {
	private static String ceoName = "½����";
    private String subName;

    public SL3_1(String subName) {
        this.subName = subName;
    }
    public void info(){
        System.out.println("����Ͱ�CEO�ǣ�" + ceoName);
        System.out.println(subName + "�ǰ���Ͱ��ӹ�˾");
    }
}
