package java_L14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class RW1 {
	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String url = "jdbc:sqlserver://localhost:1433;DataBaseName=SanGuoSha";
	public void insertWujiang(String sql) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(driver);
			System.out.println("�������سɹ�");
			connection = DriverManager.getConnection(url,"sa","123");
			System.out.println("���ݿ����ӳɹ�");
			statement = connection.createStatement();
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
	public static void main(String[] args) {
		RW1 rw1 = new RW1();
		String insertSql = "insert into WuJiang(ID,Name,Hp,Skill,Emotion) values(1,'����',4,'�ʵ�',98)";
		rw1.insertWujiang(insertSql);
	}
}
