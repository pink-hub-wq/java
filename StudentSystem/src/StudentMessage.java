import java.util.Scanner; 
public class StudentMessage { 
	public Scanner sc; 
	public int [] bianhao = {1, 2, 3, 4, 5}; 
	public String[] names = {"张三", "李四", "王五", "麻六", "赵七"};
	public String[] genders = {"男", "男", "男", "男", "男"}; 
	public int [] ages = {20, 21, 20, 19, 18}; 
	public int [] classes = {11301, 11302, 11301, 11301, 11301}; 
	public StudentMessage() {
		sc = new Scanner(System.in);
		} 
	public void Method1() {
		System.out.println("编号\t姓名\t性别\t年龄\t班级"); 
		for (int i = 0; i < bianhao.length; i++) { 
			System.out.println(bianhao[i] + "\t" + names[i] + "\t" + genders[i] + "\t" + ages[i] + "\t" + classes[i]); 
			}
		} 
	public void Method2(){
		System.out.println("请输入需要查询的学生编号：");
        int bianhao1 = sc.nextInt();
        sc.nextLine();
        boolean a = false;
        for (int i = 0; i < bianhao.length; i++) {
            if (bianhao[i] == bianhao1) {
                System.out.println("编号 " + bianhao[i] + "，姓名 " + names[i] + "，性别 " + genders[i] + "，年龄 " + ages[i] + "，班级 " + classes[i]);
                a = true;
                break;
            }
        }
        if (!a) {
            System.out.println("该学生信息不存在");
        }
    }
	public void Method3() {
        System.out.println("请输入学生编号：");
        int bianhao1 = sc.nextInt();
        sc.nextLine();
        boolean a = false;
        for (int i = 0; i < bianhao.length; i++) {
            if (bianhao[i] == bianhao1) {
                System.out.println("当前学生年龄为 " + ages[i] + "。请输入新的年龄：");
                ages[i] = sc.nextInt();
                System.out.println("年龄修改成功！");
                a = true;
                break;
            }
        }
        if (!a) {
            System.out.println("该学生信息不存在");
        }
    }
	public void Method4() {
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        sc.nextLine();
        boolean a = false;
        for (int i = 0; i < names.length; i++) {
        if (names[i].equals(name)) {
            System.out.println("当前学生班级为 " + classes[i] + "。请输入新的班级：");
            classes[i] = sc.nextInt();
            System.out.println("班级修改成功！");
            a = true;
            break;
        }
    }
        if (!a) {
            System.out.println("该学生信息不存在");
        }
    }
    public void Method5()  {
        System.out.println("请输入班级：");
        int class1 = sc.nextInt();
        sc.nextLine();
        boolean a = false;
        System.out.println("班级 " + class1 + " 的学生信息如下：");
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] == class1) {
                System.out.println("编号：" + bianhao[i] + "，姓名：" + names[i] + "，性别：" + genders[i] + "，年龄：" + ages[i]);
                a = true;
            }
        }
        if (!a) {
            System.out.println("该班级信息不存在");
        }
    }
}
