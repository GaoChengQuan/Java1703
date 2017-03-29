package day2;

import java.util.Scanner;

import org.junit.Test;

public class HomeWork {
	public static void main(String[] args) {
		int[] array = new int[]{2, 45, 6, 67, 1};
		int max = max(array);
		System.out.println(max);
		int sum = sum(array);
		System.out.println(sum);
				
	}
	
	/**
	 * 1、学生成绩的等级，使用switch完成
		>=90 <100     /10    9   98=9*10+8
	 */
	@Test
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = scanner.nextInt();
		if (score <0 || score > 100) {
			System.out.println("非法的输入");
			return;
		}
		
		int type = score / 10;
		switch (type) {
		case 9:
		case 10:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("一般");
			break;
		case 6:
			System.out.println("及格");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("不及格");
			break;
		default:
			break;
		}
	}
	
//	1
//	12
//	123
//	1234
//	12345
	@Test
	public void test2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		// 1	1
		// 2	2
	}

	/**
	 * 传入一个整型数组，返回数组的最大值
	 * @param array 整数类型的数组
	 * @return 数组的最大值
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	/**
	 * 写一个函数，名字是sum，参数是int[],求数组元素的和并返回
	 */
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}
