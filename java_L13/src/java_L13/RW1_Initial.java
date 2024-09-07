package java_L13;

public class RW1_Initial {
	public void convertToGeneral(String str){
        String [] strs = str.split("，");
        for (int i = 0; i < strs.length; i++) {
            String ele = strs[i];
            String[] cell = ele.split("-");
            String info = null;
            if(cell.length == 4){
                info = "武将" + cell[0] + "的血量是" + cell[1] + "，技能是：" + cell[2] + "，情义值是：" + cell[3];
            }
            if(cell.length == 3){
                info = "武将" + cell[0] + "的血量是" + cell[1] + "，技能是：" + cell[2];
            }
            System.out.println(info);
        }
    }
}
