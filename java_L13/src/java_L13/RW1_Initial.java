package java_L13;

public class RW1_Initial {
	public void convertToGeneral(String str){
        String [] strs = str.split("��");
        for (int i = 0; i < strs.length; i++) {
            String ele = strs[i];
            String[] cell = ele.split("-");
            String info = null;
            if(cell.length == 4){
                info = "�佫" + cell[0] + "��Ѫ����" + cell[1] + "�������ǣ�" + cell[2] + "������ֵ�ǣ�" + cell[3];
            }
            if(cell.length == 3){
                info = "�佫" + cell[0] + "��Ѫ����" + cell[1] + "�������ǣ�" + cell[2];
            }
            System.out.println(info);
        }
    }
}
