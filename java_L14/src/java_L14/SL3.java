package java_L14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SL3 {
	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String url = "jdbc:sqlserver://localhost:1433;DataBaseName=Seiryo";
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(driver);
			System.out.println("�������سɹ�");
			connection = DriverManager.getConnection(url,"sa","123");
			System.out.println("���ݿ����ӳɹ�");
			statement = connection.createStatement();
			String sql = "insert into Company(ID,Name,Price)values(1,'�ٶ�',120000000)";
			int num = statement.executeUpdate(sql);
			if(num > 0){
				System.out.println("���ݲ���ɹ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
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
