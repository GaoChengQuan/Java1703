package day4;

import org.junit.Test;

public class StudentTest {
	public static void main(String[] args) {
//		Student student = new Student();
		// The field Student.name is not visible
//		student.name = "zhangsan";
//		student.age = 20;
//		student.gender = '男';
//		
//		student.age = 200;
		
		Student student1 = new Student();
		student1.setName("zhangsan");
		String name = student1.getName();
		System.out.println(name);
		
		Student student2 = new Student();
		student2.setName("lisi");
		String name2 = student2.getName();
		System.out.println(name2);
		
		student2.setAge(200);
		student2.setGender('A');
		
		System.out.println(student2.getGender());
	}
	
	@Test
	public void test1() {
		String name = "zhangsan";
		int age = 18;
		char gender = '男';
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		student.setGender(gender);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getGender());
		
		student.setAll(name, age, gender);
	}
	
	@Test
	public void test2() {
		String name = "zhangsan";
		int age = 18;
		char gender = '男';
		//The constructor Student() is undefined未定义
		Student student = new Student();
		Student stu = new Student(name, age, gender);
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println(stu.getGender());
		
		Student stu2 = new Student(name, age);
	}
}
