import java.util.Scanner; 
public class StudentMessage { 
	public Scanner sc; 
	public int [] bianhao = {1, 2, 3, 4, 5}; 
	public String[] names = {"����", "����", "����", "����", "����"};
	public String[] genders = {"��", "��", "��", "��", "��"}; 
	public int [] ages = {20, 21, 20, 19, 18}; 
	public int [] classes = {11301, 11302, 11301, 11301, 11301}; 
	public StudentMessage() {
		sc = new Scanner(System.in);
		} 
	public void Method1() {
		System.out.println("���\t����\t�Ա�\t����\t�༶"); 
		for (int i = 0; i < bianhao.length; i++) { 
			System.out.println(bianhao[i] + "\t" + names[i] + "\t" + genders[i] + "\t" + ages[i] + "\t" + classes[i]); 
			}
		} 
	public void Method2(){
		System.out.println("��������Ҫ��ѯ��ѧ����ţ�");
        int bianhao1 = sc.nextInt();
        sc.nextLine();
        boolean a = false;
        for (int i = 0; i < bianhao.length; i++) {
            if (bianhao[i] == bianhao1) {
                System.out.println("��� " + bianhao[i] + "������ " + names[i] + "���Ա� " + genders[i] + "������ " + ages[i] + "���༶ " + classes[i]);
                a = true;
                break;
            }
        }
        if (!a) {
            System.out.println("��ѧ����Ϣ������");
        }
    }
	public void Method3() {
        System.out.println("������ѧ����ţ�");
        int bianhao1 = sc.nextInt();
        sc.nextLine();
        boolean a = false;
        for (int i = 0; i < bianhao.length; i++) {
            if (bianhao[i] == bianhao1) {
                System.out.println("��ǰѧ������Ϊ " + ages[i] + "���������µ����䣺");
                ages[i] = sc.nextInt();
                System.out.println("�����޸ĳɹ���");
                a = true;
                break;
            }
        }
        if (!a) {
            System.out.println("��ѧ����Ϣ������");
        }
    }
	public void Method4() {
        System.out.println("������ѧ��������");
        String name = sc.next();
        sc.nextLine();
        boolean a = false;
        for (int i = 0; i < names.length; i++) {
        if (names[i].equals(name)) {
            System.out.println("��ǰѧ���༶Ϊ " + classes[i] + "���������µİ༶��");
            classes[i] = sc.nextInt();
            System.out.println("�༶�޸ĳɹ���");
            a = true;
            break;
        }
    }
        if (!a) {
            System.out.println("��ѧ����Ϣ������");
        }
    }
    public void Method5()  {
        System.out.println("������༶��");
        int class1 = sc.nextInt();
        sc.nextLine();
        boolean a = false;
        System.out.println("�༶ " + class1 + " ��ѧ����Ϣ���£�");
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] == class1) {
                System.out.println("��ţ�" + bianhao[i] + "��������" + names[i] + "���Ա�" + genders[i] + "�����䣺" + ages[i]);
                a = true;
            }
        }
        if (!a) {
            System.out.println("�ð༶��Ϣ������");
        }
    }
}
