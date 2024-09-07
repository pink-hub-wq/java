import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

public class LX2 {
	ResultSet resultSet = null;
	CallableStatement callableStatement = null;
	Connection connection = null;
    DBUtil dbutil = new DBUtil();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	LX2 lx2 = new LX2();
    	lx2.countWujiang();
	}
	public void countWujiang(){
		try {
			connection = dbutil.getConnection();
			callableStatement = connection.prepareCall("{call proc_AddWujiang(?,?,?,?,?,?)}");
			System.out.println("�������佫������");
			String name = scanner.next();
			callableStatement.setString(1, name);
			System.out.println("�������佫Ѫ����");
			int hp = scanner.nextInt();
			callableStatement.setInt(2, hp);
			System.out.println("�������佫���ܣ�");
			String skill = scanner.next();
			callableStatement.setString(3, skill);
			System.out.println("�������佫����ֵ��");
			int emotion = scanner.nextInt();
			callableStatement.setInt(4, emotion);
			System.out.println("�������佫������");
			String area = scanner.next();
			callableStatement.setString(5, area);		
			callableStatement.registerOutParameter(6, Types.INTEGER);
			callableStatement.execute();
			int id = callableStatement.getInt(6);
			System.out.println("���\t����\tѪ��\t����\t����");
			System.out.println("=====================================");
			System.out.println(id + "\t" + name + "\t" + hp + "\t" + skill + "\t" + emotion);
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
