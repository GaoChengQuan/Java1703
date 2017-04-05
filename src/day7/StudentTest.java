package day7;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("zhangsan", 20, '男');
		System.out.println(student1);
		Student student2 = new Student("lisi", 20, '女');
		System.out.println(student2);

		System.out.println("-------");
		System.out.println(student1.getCountry());
		student1.setCountry("US");
		System.out.println(student2.getCountry());
		System.out.println(Student.getCountry());
	}
}
