package java_L14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class LX1 {
	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String url = "jdbc:sqlserver://localhost:1433;DataBaseName=SanGuoSha";
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement1 = null;
		PreparedStatement preparedStatement2 = null;
		PreparedStatement preparedStatement3 = null;
		PreparedStatement preparedStatement4 = null;
		PreparedStatement preparedStatement5 = null;
		try {
			Class.forName(driver);
			System.out.println("�������سɹ�");
			connection = DriverManager.getConnection(url,"sa","123");
			System.out.println("���ݿ����ӳɹ�");
			String sql = "insert into Wujiang(ID,Name,Hp,Skill,Emotion) values(?,?,?,?,?)";
			preparedStatement1 = connection.prepareStatement(sql);
			preparedStatement1.setInt(1, 2);
			preparedStatement1.setString(2, "����");
			preparedStatement1.setInt(3, 4);
			preparedStatement1.setString(4, "�ʵ�");
			preparedStatement1.setInt(5, 98);
			preparedStatement2 = connection.prepareStatement(sql);
			preparedStatement2.setInt(1, 3);
			preparedStatement2.setString(2, "�ܲ�");
			preparedStatement2.setInt(3, 4);
			preparedStatement2.setString(4, "�ʵ�");
			preparedStatement2.setInt(5, 98);
			preparedStatement3 = connection.prepareStatement(sql);
			preparedStatement3.setInt(1, 4);
			preparedStatement3.setString(2, "�ĺ");
			preparedStatement3.setInt(3, 4);
			preparedStatement3.setString(4, "�ʵ�");
			preparedStatement3.setInt(5, 98);
			preparedStatement4 = connection.prepareStatement(sql);
			preparedStatement4.setInt(1, 5);
			preparedStatement4.setString(2, "��Ȩ");
			preparedStatement4.setInt(3, 4);
			preparedStatement4.setString(4, "�ʵ�");
			preparedStatement4.setInt(5, 98);
			preparedStatement5 = connection.prepareStatement(sql);
			preparedStatement5.setInt(1, 6);
			preparedStatement5.setString(2, "���");
			preparedStatement5.setInt(3, 4);
			preparedStatement5.setString(4, "�ʵ�");
			preparedStatement5.setInt(5, 98);
			preparedStatement1.execute();
			preparedStatement2.execute();
			preparedStatement3.execute();
			preparedStatement4.execute();
			preparedStatement5.execute();
			System.out.println("���ݲ���ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement1.close();
				preparedStatement2.close();
				preparedStatement3.close();
				preparedStatement4.close();
				preparedStatement5.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
