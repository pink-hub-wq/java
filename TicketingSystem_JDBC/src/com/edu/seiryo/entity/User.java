package com.edu.seiryo.entity;
/**
 * 用户实体类
 * @author WANGQI
 *
 */
public class User {
	/**
	 * 用户编号
	 */
	private int id;
	/**
	 * 用户名
	 */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户邮箱
     */
    private String userEmail;
	/**
	 * 获取用户编号
	 * @return 用户编号
	 */
		public int getId() {
		return id;
	}
	/**
	 * 设置用户编号	
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获取用户姓名
	 * @return 用户姓名
	 */
	public String getUserName() {
        return userName;
    }
	/**
	 * 设置用户姓名
	 * @param userName
	 */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * 获取用户密码
     * @return 用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }
    /**
     * 设置用户密码
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    /**
     * 获取用户邮箱
     * @return 用户邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }
    /**
     * 设置用户邮箱
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    /**
     * 空参构造，创建对象
     */
    public User() {
    }
    /**
     * 有参构造，创建对象
     * @param userName
     * @param userPassword
     * @param userEmail
     */
    public User(String userName, String userPassword, String userEmail) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }
    /**
     * 有参构造，创建对象
     * @param id
     * @param userName
     * @param userPassword
     * @param userEmail
     */
	public User(int id, String userName, String userPassword, String userEmail) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
	}
	/**
	 * 有参构造
	 * @param userName
	 * @param userPassword
	 */
	public User(String userName, String userPassword) {
		
    }
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + "]";
	}
}
