package com.seiryo.test.SJ;

public class SJ1 {
	public static void main(String[] args) {
		 DiceGame game = new DiceGame();
	     boolean result =DiceGame.play();
	     if(result){
	    	 System.out.println("Ӯ��");
	     }else{
	    	 System.out.println("����"); 
	     }
	}
}
