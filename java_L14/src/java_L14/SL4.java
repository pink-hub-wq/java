package java_L14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SL4 {
	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String url = "jdbc:sqlserver://localhost:1433;DataBaseName=Seiryo";
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName(driver);
			System.out.println("�������سɹ�");
			connection = DriverManager.getConnection(url,"sa","123");
			System.out.println("���ݿ����ӳɹ�");
			preparedStatement = connection.prepareStatement("insert into Company(ID,Name,Price)values(?,?,?)");
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "��Ѷ");
			preparedStatement.setInt(3, 140000000);
			preparedStatement.execute();
			System.out.println("���ݲ���ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
