package day3;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		// double[] d = new double[3];
		// null
		Car[] carArray = new Car[2];
		// inputCars(carArray);
		printCars(carArray);
	}

	/**
	 * 打印学生类型数组中所有学生的信息
	 * 
	 * @param cars
	 */
	private static void printCars(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			Car car = cars[i];
			car.show();
			
//			System.out.println("brand：" + cars[i].brand);
//			System.out.println("prince：" + cars[i].price);
//			System.out.println("color：" + cars[i].color);
		}
	}

	/**
	 * 输入学生信息列表
	 * 
	 * @param students
	 */
	public static void inputCars(Student[] students) {
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
