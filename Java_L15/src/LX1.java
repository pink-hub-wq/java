import java.sql.ResultSet;

public class LX1 {
	static ResultSet resultSet = null;
    DBUtil dbutil = new DBUtil();
    public static void main(String[] args) {
    	LX1 lx1 = new LX1();
    	lx1.showWujiang();
	}
	public void showWujiang(){
		String sql = "select ID,Name,Hp,Skill,Emotion from Wujiang where Hp = ?";
		try {
			resultSet = dbutil.executeQuery(sql,4);
			System.out.println("编号\t名字\t血量\t技能\t情义");
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
