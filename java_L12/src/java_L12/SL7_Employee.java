package java_L12;

public class SL7_Employee {
	 private String name;
	    private int age;
	    public SL7_Employee(String name,int age){
	        try {
	            if(age < 18 || age > 60){
	                throw new Exception("员工年龄应该在18~60岁之间");
	            }
	            this.name = name;
	            this.age = age;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	    public void showEmpInfo(){
	        System.out.println("员工：" + name + "年龄为：" + age);
	    }

}
