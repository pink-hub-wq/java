import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RW1 {
    static ResultSet resultSet = null;
    DBUtil dbutil = new DBUtil();
    public static void main(String[] args) {
    	RW1 rw1 = new RW1();
    	rw1.showWujiang();
	}
	public void showWujiang(){
		String sql = "select ID,Name,Hp,Skill,Emotion from Wujiang";
		try {
			resultSet = dbutil.executeQuery(sql);
			System.out.println("���\t����\tѪ��\t����\t����");
			System.out.println("=====================================");
			while (resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				int hp = resultSet.getInt("Hp");
				String skill = resultSet.getString("Skill");
				String emotion = resultSet.getString("Emotion");
				if(emotion == null){
					emotion = "";
				}
				System.out.println(id + "\t" + name + "\t" + hp + "\t" + skill + "\t" + emotion);
			}
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