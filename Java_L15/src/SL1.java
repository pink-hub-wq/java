import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SL1 {
	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String url = "jdbc:sqlserver://localhost:1433;DataBaseName=Seiryo";
    private static final String username = "sa";
    private static final String pwd = "123";
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;
    public static void main(String[] args) {
    	String sql = "select id,name,price from Company";
		try {
			Class.forName(driver);
			System.out.println("驱动加载成功");
	    	connection = DriverManager.getConnection(url,username,pwd);
	    	System.out.println("数据库连接成功");
	    	preparedStatement = connection.prepareStatement(sql);
	    	resultSet = preparedStatement.executeQuery();
	    	while (resultSet.next()) {
				String name = resultSet.getString(2);
				int price = resultSet.getInt("price");
				System.out.println("公司：" + name + "\t市值（单位千美元）" + price);
			}
	    	System.out.println("数据查询成功");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
