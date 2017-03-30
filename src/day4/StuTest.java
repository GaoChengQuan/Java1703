package day4;

import java.util.Scanner;

/**
 * 完善学生信息输入的的例子： 1、录入学生信息 2、展示录入的所有学生信息 3、输出如下查询信息 根据条件查询学生信息： 根据姓名查询 ：1 根据年龄查询
 * ：2 根据性别查询 ：3 退出：0 （除非用户输入0，否则一直可以查询。 ） 4、根据输入的条件查询学生的信息，将学生的信息打印出来。
 * 
 * @author Gao
 * 
 */
public class StuTest {
	public static void main(String[] args) {
		Stu[] stuArray = new Stu[2];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println("请输入姓名:");
			String name = scanner.next();
			System.out.println("请输入年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入性别：");
			char gender = scanner.next().charAt(0);
			Stu stu = new Stu(name, age, gender);
			stuArray[i] = stu;
		}

		for (int i = 0; i < stuArray.length; i++) {
			// Stu stu = stuArray[i];
			System.out.println("---学生信息----");
			System.out.println("学生的姓名：" + stuArray[i].getName());
			System.out.println("学生的年龄：" + stuArray[i].getAge());
			System.out.println("学生的性别：" + stuArray[i].getGender());
		}

		while (true) {
			System.out.println("---------------");
			System.out.println("根据条件查询学生信息：");
			System.out.println("根据姓名查询 ：1");
			System.out.println("根据年龄查询 ：2");
			System.out.println("根据性别查询 ：3");
			System.out.println("退出：0 ");
			System.out.println("---------------");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("退出程序");
				break;
			}
			
			switch (type) {
			case 1:// 根据姓名查询
				System.out.println("请输入要查询的姓名：");
				String name = scanner.next();
				boolean isSearchByName = false;
				for (int i = 0; i < stuArray.length; i++) {
					if (name.equals(stuArray[i].getName())) {
						System.out.println("学生的姓名：" + stuArray[i].getName());
						System.out.println("学生的年龄：" + stuArray[i].getAge());
						System.out.println("学生的性别：" + stuArray[i].getGender());
						isSearchByName = true;
					}
				}
				if (isSearchByName == false) {
					System.out.println("没有该姓名的学生");
				}
				break;
			case 2:// 根据年龄查询

				break;
			case 3:// 根据性别查询

				break;
//			case 0:// 退出
//
//				break;

			default:
				break;
			}
		}
	}
}
