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
		// 1、输入所有的学生信息
		inputStuInfos(stuArray);
		// 2、打印所有的学生信息
		printAllStuInfo(stuArray);
		// 3、搜索学生信息
		searchStuInfos(stuArray);
	}

	/**
	 * 录入学生信息保存到数组中
	 * 
	 * @param stuArray
	 * @return
	 */
	private static Scanner inputStuInfos(Stu[] stuArray) {
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
		return scanner;
	}

	/**
	 * 打印传入的学生数组中所有学生信息
	 * 
	 * @param stuArray
	 */
	private static void printAllStuInfo(Stu[] stuArray) {
		for (int i = 0; i < stuArray.length; i++) {
			Stu stu = stuArray[i];
			printStuInfo(stu);
		}
	}

	/**
	 * 打印某一个具体的学生对象
	 * 
	 * @param stu
	 *            要打印的学生对象
	 */
	private static void printStuInfo(Stu stu) {
		System.out.println("---学生信息----");
		System.out.println("学生的姓名：" + stu.getName());
		System.out.println("学生的年龄：" + stu.getAge());
		System.out.println("学生的性别：" + stu.getGender());
	}

	/**
	 * 搜索学生信息
	 * 
	 * @param array
	 */
	public static void searchStuInfos(Stu[] array) {
		Scanner scanner = new Scanner(System.in);
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
				searchByName(array);
				break;
			case 2:// 根据年龄查询
				searchByAge(array);
				break;
			case 3:// 根据性别查询
				searchByGender(array);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * 通过性别来搜索
	 * 
	 * @param array
	 */
	private static void searchByGender(Stu[] array) {
		System.out.println("请输入要查询的性别：");
		Scanner scanner = new Scanner(System.in);
		char gender = scanner.next().charAt(0);
		boolean isSearchByGenderFound = false;
		for (int i = 0; i < array.length; i++) {
			if (gender == array[i].getGender()) {
				printStuInfo(array[i]);
				isSearchByGenderFound = true;
			}
		}
		if (isSearchByGenderFound == false) {
			System.out.println("没有该年龄的学生");
		}
	}

	/**
	 * 通过年龄来搜索
	 * 
	 * @param array
	 */
	private static void searchByAge(Stu[] array) {
		System.out.println("请输入要查询的年龄：");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		boolean isSearchByAgeFound = false;
		for (int i = 0; i < array.length; i++) {
			if (age == array[i].getAge()) {
				printStuInfo(array[i]);
				isSearchByAgeFound = true;
			}
		}
		if (isSearchByAgeFound == false) {
			System.out.println("没有该年龄的学生");
		}
	}

	/**
	 * 通过名字来搜索
	 * 
	 * @param array
	 */
	private static void searchByName(Stu[] array) {
		System.out.println("请输入要查询的姓名：");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		boolean isSearchByNameFound = false;
		for (int i = 0; i < array.length; i++) {
			if (name.equals(array[i].getName())) {
				printStuInfo(array[i]);
				isSearchByNameFound = true;
			}
		}
		if (isSearchByNameFound == false) {
			System.out.println("没有该姓名的学生");
		}
	}
}
