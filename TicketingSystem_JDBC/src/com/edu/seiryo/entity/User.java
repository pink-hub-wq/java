package com.edu.seiryo.entity;
/**
 * �û�ʵ����
 * @author WANGQI
 *
 */
public class User {
	/**
	 * �û����
	 */
	private int id;
	/**
	 * �û���
	 */
    private String userName;
    /**
     * �û�����
     */
    private String userPassword;
    /**
     * �û�����
     */
    private String userEmail;
	/**
	 * ��ȡ�û����
	 * @return �û����
	 */
		public int getId() {
		return id;
	}
	/**
	 * �����û����	
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��ȡ�û�����
	 * @return �û�����
	 */
	public String getUserName() {
        return userName;
    }
	/**
	 * �����û�����
	 * @param userName
	 */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * ��ȡ�û�����
     * @return �û�����
     */
    public String getUserPassword() {
        return userPassword;
    }
    /**
     * �����û�����
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    /**
     * ��ȡ�û�����
     * @return �û�����
     */
    public String getUserEmail() {
        return userEmail;
    }
    /**
     * �����û�����
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    /**
     * �ղι��죬��������
     */
    public User() {
    }
    /**
     * �вι��죬��������
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
     * �вι��죬��������
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
	 * �вι���
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
