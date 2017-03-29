package day3;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		// double[] d = new double[3];
		// null
		Student[] students = new Student[2];
		inputStudentInfos(students);
		printStudentInfos(students);
	}

	/**
	 * 打印学生类型数组中所有学生的信息
	 * @param students
	 */
	private static void printStudentInfos(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println("姓名：" + students[i].name);
			System.out.println("年龄：" + students[i].age);
			System.out.println("性别：" + students[i].gender);
		}
	}
	
	/**
	 * 输入学生信息列表
	 * @param students
	 */
	public static void inputStudentInfos(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.println("请输入学生的姓名:");
			student.name = scanner.next();
			System.out.println("请输入学生的年龄:");
			student.age = scanner.nextInt();
			System.out.println("请输入学生的性别:");
			student.gender = scanner.next().charAt(0);
			students[i] = student;
		}
	}
}
