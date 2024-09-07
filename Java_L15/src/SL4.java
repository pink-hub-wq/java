import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;

public class SL4 {
	public static void main(String[] args) {
		SL2 dbUtil = new SL2();
		ResultSet resultSet = null;
		CallableStatement callableStatement = null;
		Connection connection = null;
		try {
			connection = dbUtil.getConnection();
			callableStatement = connection.prepareCall("{call proc_Company(?,?)}"); 
				String name = "谷歌";
				callableStatement.setString(1, name);
				callableStatement.registerOutParameter(2, Types.INTEGER);
				callableStatement.execute(); 
			    int price = callableStatement.getInt(2);
			    System.out.println(name + "公司的市值是：" + price);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
