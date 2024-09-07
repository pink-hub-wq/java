package com.edu.seiryo.entity;
/**
 * 
 *
 * @author WANGQI
 * @time 2024��4��25������11:19:58
 */
public class Student {
	/**
	 * ѧ�����
	 */
	private int studentId;
	/**
	 * ѧ������
	 */
	private String studentName;
	/**
	 * ѧ���Ա�
	 */
	private String studentGender;
	/**
	 * ѧ������
	 */
	private int age;
	/**
	 * ѧ���༶
	 */
	private String classNumber;
	/**
	 * ��ȡѧ�����
	 * @return ѧ�����
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * ����ѧ�����
	 * @param string
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * ��ȡѧ������
	 * @return ѧ������
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * ����ѧ������
	 * @param studentName
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * ��ȡѧ���Ա�
	 * @return ѧ���Ա�
	 */
	public String getStudentGender() {
		return studentGender;
	}
	/**
	 * ����ѧ���Ա�
	 * @param gender
	 */
	public void setStudentGender(String gender) {
		this.studentGender = gender;
	}
	/**
	 * ��ȡѧ������
	 * @return ѧ������
	 */
	public int getAge() {
		return age;
	}
	/**
	 * ����ѧ������
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * ��ȡѧ���༶
	 * @return ѧ���༶
	 */
	public String getClassNumber() {
		return classNumber;
	}
	/**
	 * ����ѧ���༶
	 * @param classNumber
	 */
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	/**
	 * �вι��죬��������
	 * @param studentId
	 * @param studentName
	 * @param studentGender
	 * @param age
	 * @param classNumber
	 */
	public Student(int studentId, String studentName, String studentGender, int age, String classNumber) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.age = age;
		this.classNumber = classNumber;
	}
	/**
	 * �޲ι��죬��������
	 */
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentGender=" + studentGender
				+ ", age=" + age + ", classNumber=" + classNumber + "]";
	}
	
}
