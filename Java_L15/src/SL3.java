import java.sql.ResultSet;

public class SL3 {
	public static void main(String[] args) {
		SL2 dbUtil = new SL2();
		ResultSet resultSet = null;
		String sql = "select id,name,price from Company where price > ?";
		try {
			resultSet = dbUtil.executeQuery(sql, 200000000);
			while (resultSet.next()) {
				String name = resultSet.getString(2);
				int price = resultSet.getInt("price");
				System.out.println("公司：" + name + "\t市值（单位千美元）" + price);
			}
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
