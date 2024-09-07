package java_L14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SL5 {
	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String url = "jdbc:sqlserver://localhost:1433;DataBaseName=Seiryo";
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName(driver);
			System.out.println("驱动加载成功");
			connection = DriverManager.getConnection(url,"sa","123");
			System.out.println("数据库连接成功");
			preparedStatement = connection.prepareStatement("update Company set Price = ? where id = ?");
			preparedStatement.setInt(1, 150000000);
			preparedStatement.setInt(2, 2);
			if(preparedStatement.executeUpdate() > 0){
				System.out.println("数据修改成功");
			}
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
