package com.edu.seiryo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Test {
	//����γ̣�����13���Ͽ�
	//�����ύ����14���~
	//����11��ǰ�ύѧ������ϵͳ�����ݿ�棩
	//���������ݿ��л�ȡ�����ݷ���list��
	
	
	//��jdk��ֻ��jdbc�Ľӿڣ���û�о���ʵ��
			//����ʵ�֣������������������ݿ⳧���ṩ��jar������ʵ��
			//������������ʵ����һ�ֶ�̬
			//ͬ���Ĳ������������벻ͬ��jar���Բ�����ͬ�����ݿ�
			
			
			//ѧϰʹ��sqlserver���ݿ⣬�����������ݲ�������ͬ
//			Connection connection = new ConnectionImp();
			//JDBC�������ݿⲽ��
			//1.�����������������
				//1.1����jar������Ŀ��
				//1.2��jar�����Ҽ�build path����뻷����
				//1.3ʹ�õ���jar���е�������:SQLServerDriver
					//ע�⣺��Ҫ���ʸ����ȫ·��com.microsoft.sqlserver.jdbc.SQLServerDriver
					//ע�⣺��jar�����ҵ����ļ����Ҽ�copy Quailfied name�õ�ȫ·��
					//��ע�⣺copy�󣬴���class��׺�ģ���Ҫɾ������ɾ������
			//2.�����������������ݿ�����
				//����һ��һ��������һ���������ݿ⣬Ĭ�ϰ�װʱTCP/IP�����ǳ��ڹرյģ���һ����Ҫ�ֶ���������������Ҫ
					//��SQLServer���ù��������������ã������������û�������win+R���룺SQLServerManager11.msc�򿪹�����
					//��SQLServer�������ã���MSSQLSERVER��Э�飬��TCP/IP״̬��Ϊ�������Ķ�����Ҫ����������Ч��
				//ͨ��DriverManager�࣬������������������
					//ͨ������getConnection������������
					//ͨ���������ӵ�ַ�������û������������룬�������ݿ�
						//���ӵ�ַ��"jdbc:sqlserver:"����ͬ�����ݿ�jar�������ӷ�ʽ��ͬ����jar����������ӵ�
						//����������Ҫ���ӵ��ĸ���ַ����̨����/��������
						//���ӵ�ַ��"localhost",localhost����������˼������д�ɣ�127.0.0.1Ҳ�Ǵ������������Ǳ�����IP��ַҲ����
						//���ӵ�ַ��"1549",�����sqlserver�����ƺ�
						//���ӵ�ַ��DataBaseName���ӵ���һ�����ݿ�
			//3.��������SQL������
				//��ע��Statement����sql�����У�����beansҲ�У����������ˡ�
			//4.����SQL���
				//SQL��䱨����sql��临�Ƶ�sql����������
			//5.������
				//��ɾ��(����boolean��int)
					//execute����booleanֵ�����ء�false���������ִ�гɹ������ء�true���������ִ��ʧ��
					//executeUpdate����intֵ�����ظò���Ӱ�����������
				//��ѯ�����ص������ݱ���
					//executeQuery������ResutSet�������
			
			//�ر���Դ
				//�������ݿ����һ��Ҫ�ر���Դ�����ö�Ӧ�����close��������
			
			//���ݲ�Ĵ���
	private final static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final static String URL = "jdbc:sqlserver://localhost:1433;DataBaseName=Java_L14";
	private final static String USER = "sa";
	private final static String PWD = "123";
	public static void main(String[] args) {
		Test test = new Test();
		test.query();
	}
	public void query(){
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USER,PWD);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from users");
			//���ݿ�����ݷ�װ����resultSet��
			while(resultSet.next()){
				//һ���Ǹ���������ȡ��һ���Ǹ���������ȡ��һ������¸���������ȡ
				//����û�������������֪�������������ʱ��Ҫд123��������
				System.out.print(resultSet.getInt(1)+"\t");//resultSet.getInt(1);
				System.out.print(resultSet.getString(2)+"\t");
				System.out.println(resultSet.getString(3));
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		//һ����ǹر���Դʹ�õ�
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void delete(){
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USER,PWD);
			statement = connection.createStatement();
			int bo = statement.executeUpdate("delete form users where userid = 3");
			System.out.println(bo);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		//һ����ǹر���Դʹ�õ�
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
