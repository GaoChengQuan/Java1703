package day3;

public class OOPDemo {

	public static void main(String[] args) {
		String name = "zhangsan";
		int age = 20;
		char gender = '男';
		double salary = 10000.0;
		String email = "34344343@qq.com";
		print(name, age, gender, salary, email);
		
		Teacher teacher = new Teacher();
		teacher.name = "zhangsan";
		teacher.age = 20;
		teacher.gender = '男';
		teacher.email = "zhangsan@qq.com";
		
		teacher.print();
	}
	
	private static void print(Teacher teacher) {
		System.out.println("名字：" + teacher.name);
		System.out.println("年龄：" + teacher.age);
		System.out.println("性别：" + teacher.gender);
		System.out.println("工资：" + teacher.salary);
		System.out.println("地址：" + teacher.address);
	}

	public static void print(String name, int age, 
			char gender, double salary, String email) {
		System.out.println("名字：" + name);
		System.out.println("年龄：" + age);
		System.out.println("性别：" + gender);
		System.out.println("工资：" + salary);
	}
}
