package java_L14;

public class SL1 {
	static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static void main(String[] args) {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
