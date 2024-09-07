import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

public class RW2 {
	ResultSet resultSet = null;
	CallableStatement callableStatement = null;
	Connection connection = null;
    DBUtil dbutil = new DBUtil();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	RW2 rw2 = new RW2();
    	rw2.countWujiang();
	}
	public void countWujiang(){
		try {
			connection = dbutil.getConnection();
			callableStatement = connection.prepareCall("{call proc_WujiangCount(?,?)}");
			System.out.println("请输入武将所属地区：");
			String area = scanner.next();
			callableStatement.setString(1, area);
			callableStatement.registerOutParameter(2, Types.INTEGER);
			callableStatement.execute();
			int num = callableStatement.getInt(2);
			System.out.println(area + "的武将数是：" + num);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dbutil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
