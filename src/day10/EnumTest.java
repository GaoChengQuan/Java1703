package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnumTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入姓名:");
			String name = scanner.next();
			System.out.println("请输入年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入性别：0-男，1-女");
			int genderType = scanner.nextInt();
			EnumGender gender = null;
			if (genderType == 0) {
				gender = EnumGender.MAIL;
			} else if (genderType == 1) {
				gender = EnumGender.FEMAIL;
			}
			Student stu = new Student(name, age, gender);
			studentList.add(stu);
			System.out.println("是否继续输入？0退出，1继续");
			int result = scanner.nextInt();
			if (result == 0) {
				break;
			}
		}

		printStudentList(studentList);
	}

	public static void printStudentList(List<Student> list) {
		for (Student student : list) {
//			if (student.getGender() == EnumGender.MAIL) {
//				System.out.println(student.getName() + "是"
//						+ student.getGender().getValue() + "生需要打扫卫生");
//			} else if (student.getGender() == EnumGender.FEMAIL) {
//				System.out.println(student.getName() + "是"
//						+ student.getGender().getValue() + "生不需要打扫卫生");
//			}
			
			switch (student.getGender()) {
			case MAIL:
				System.out.println(student.getName() + "是"
						+ student.getGender().getValue() + "生需要打扫卫生");
				break;
			case FEMAIL:
				System.out.println(student.getName() + "是"
						+ student.getGender().getValue() + "生不需要打扫卫生");
			break;
			default:
				break;
			}
		}
	}
}
