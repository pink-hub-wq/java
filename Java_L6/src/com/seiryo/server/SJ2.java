package com.seiryo.server;

public class SJ2 {
	public String name;
	public int studentId;
	static int count = 0;
	public SJ2(String newname){
		name = newname;
		count++;
		studentId = count; 
	}
	public int classId(){
		return(studentId - 1) / 10 + 1;
	}
	public void printstudent(){
		System.out.println("ĞÕÃû£º" + name + "°à¼¶£º" + classId() + "Ñ§ºÅ£º" + studentId);
	}
}
