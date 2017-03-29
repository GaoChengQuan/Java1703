package day3;

import java.util.Scanner;

public class StudentTeacherTest {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.name = "zhangsan";
		
		Student student = new Student();
		student.name = "lisi";
		
		Student[] students = new Student[2];
		// name age gender
		Scanner scanner = new Scanner(System.in);
		// index: the index of the char value.
		char gender = scanner.next().charAt(0);
		System.out.println(gender);
	}
}
