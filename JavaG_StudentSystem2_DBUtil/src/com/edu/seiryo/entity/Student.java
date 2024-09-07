package com.edu.seiryo.entity;
/**
 * 
 *
 * @author WANGQI
 * @time 2024年4月25日上午11:19:58
 */
public class Student {
	/**
	 * 学生编号
	 */
	private int studentId;
	/**
	 * 学生姓名
	 */
	private String studentName;
	/**
	 * 学生性别
	 */
	private String studentGender;
	/**
	 * 学生年龄
	 */
	private int age;
	/**
	 * 学生班级
	 */
	private String classNumber;
	/**
	 * 获取学生编号
	 * @return 学生编号
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * 设置学生编号
	 * @param string
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * 获取学生姓名
	 * @return 学生姓名
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * 设置学生姓名
	 * @param studentName
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * 获取学生性别
	 * @return 学生性别
	 */
	public String getStudentGender() {
		return studentGender;
	}
	/**
	 * 设置学生性别
	 * @param gender
	 */
	public void setStudentGender(String gender) {
		this.studentGender = gender;
	}
	/**
	 * 获取学生年龄
	 * @return 学生年龄
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 设置学生年龄
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 获取学生班级
	 * @return 学生班级
	 */
	public String getClassNumber() {
		return classNumber;
	}
	/**
	 * 设置学生班级
	 * @param classNumber
	 */
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	/**
	 * 有参构造，创建对象
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
	 * 无参构造，创建对象
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
