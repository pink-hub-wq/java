package java_L14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class RW2 {
	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String url = "jdbc:sqlserver://localhost:1433;DataBaseName=SanGuoSha";
	public void updateWujiang(String sql,Object[] preparedStatements) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName(driver);
			System.out.println("�������سɹ�");
			connection = DriverManager.getConnection(url,"sa","123");
			System.out.println("���ݿ����ӳɹ�");
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < preparedStatements.length; i++) {
				preparedStatement.setObject(i + 1, preparedStatements[i]);
			}
			int num = preparedStatement.executeUpdate();
			if(num > 0){
				System.out.println("�����޸ĳɹ�");
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
	public static void main(String[] args) {
		RW2 rw2 = new RW2();
		String modifySql_preparedStatement = "update Wujiang set Skill = ?,Hp=? where Name = ?";
		Object[] preparedStatements = {"����",3,"���"};
		rw2.updateWujiang(modifySql_preparedStatement, preparedStatements);
	}
}
