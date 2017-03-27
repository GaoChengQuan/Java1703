package day1;

import java.util.Scanner;

import org.junit.Test;

public class IfDemo {
	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入：");
		int num = scanner.nextInt();
		// num > 100,输出结果
		if (num > 100) {
			System.out.println(num);
		} else {
			System.out.println("<=100");
		}

		System.out.println("over");
	}

	@Test
	public void test2() {
		/**
		 * 学生成绩的等级： 
		 * >=90 <=100 优秀 
		 * >=80 <90 良好 
		 * >=70 <80 一般 
		 * >=60 <70 及格 
		 * <60 不及格
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入：");
		int score = scanner.nextInt();
		if (score < 0 || score > 100) {
			System.out.println("非法的输入");
		} else {
			if (score >= 90 && score <= 100) {
				System.out.println("优秀");
			} else if (score >= 80 && score < 90) {
				System.out.println("良好");
			} else if (score >= 70 && score < 80) {
				System.out.println("一般");
			} else if (score >= 60 && score < 70) {
				System.out.println("及格");
			} else {
				System.out.println("不及格");
			}
		}
	}

	@Test
	public void test3() {
		/**
		 * 学生成绩的等级： 
		 * >=90 <=100 优秀 
		 * >=80 <90 良好 
		 * >=70 <80 一般 
		 * >=60 <70 及格 
		 * <60 不及格
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入：");
		int score = scanner.nextInt();
		if (score < 0 || score > 100) {
			System.out.println("非法的输入");
		} else if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 80 && score < 90) {
			System.out.println("良好");
		} else if (score >= 70 && score < 80) {
			System.out.println("一般");
		} else if (score >= 60 && score < 70) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
	
	@Test
	public void test4() {
		/**
		 * 学生成绩的等级： 
		 * >=90 <=100 优秀 
		 * >=80 <90 良好 
		 * >=70 <80 一般 
		 * >=60 <70 及格 
		 * <60 不及格
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入：");
		int score = scanner.nextInt();
		if (score < 0 || score > 100) {
			System.out.println("非法的输入");
			return;
		}
		
		if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 80) {
			System.out.println("良好");
		} else if (score >= 70) {
			System.out.println("一般");
		} else if (score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
}
