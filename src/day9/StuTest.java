package day9;

import java.util.ArrayList;
import java.util.List;
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
		List<Stu> stuList = new ArrayList<Stu>();
		// 1、输入所有的学生信息
		inputStuInfos(stuList);
		// 2、打印所有的学生信息
		printAllStuInfo(stuList);
		// 3、搜索学生信息
		searchStuInfos(stuList);
	}

	/**
	 * 录入学生信息保存到数组中
	 * 
	 * @param list
	 * @return
	 */
	private static void inputStuInfos(List<Stu> list) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入姓名:");
			String name = scanner.next();
			System.out.println("请输入年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入性别：");
			char gender = scanner.next().charAt(0);
			Stu stu = new Stu(name, age, gender);
			//list[i] = stu;
			list.add(stu);
			System.out.println("是否继续输入？0退出，1继续");
			int result = scanner.nextInt();
			if (result == 0) {
				break;
			}
		}
	}

	/**
	 * 打印传入的学生数组中所有学生信息
	 * 
	 * @param list
	 */
	private static void printAllStuInfo(List<Stu> list) {
		for (int i = 0; i < list.size(); i++) {
			Stu stu = list.get(i);
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
	 * @param list
	 */
	public static void searchStuInfos(List<Stu> list) {
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
				searchByName(list);
				break;
			case 2:// 根据年龄查询
				searchByAge(list);
				break;
			case 3:// 根据性别查询
				searchByGender(list);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * 通过性别来搜索
	 * 
	 * @param list
	 */
	private static void searchByGender(List<Stu> list) {
		System.out.println("请输入要查询的性别：");
		Scanner scanner = new Scanner(System.in);
		char gender = scanner.next().charAt(0);
		boolean isSearchByGenderFound = false;
		for (int i = 0; i < list.size(); i++) {
			if (gender == list.get(i).getGender()) {
				printStuInfo(list.get(i));
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
	 * @param list
	 */
	private static void searchByAge(List<Stu> list) {
		System.out.println("请输入要查询的年龄：");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		boolean isSearchByAgeFound = false;
		for (int i = 0; i < list.size(); i++) {
			if (age == list.get(i).getAge()) {
				printStuInfo(list.get(i));
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
	 * @param list
	 */
	private static void searchByName(List<Stu> list) {
		System.out.println("请输入要查询的姓名：");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		boolean isSearchByNameFound = false;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				printStuInfo(list.get(i));
				isSearchByNameFound = true;
			}
		}
		if (isSearchByNameFound == false) {
			System.out.println("没有该姓名的学生");
		}
	}
}
