package day3;

import java.util.Scanner;

import org.junit.Test;

public class ArrayDemo {
	
	public static void main(String[] args) {
		int num = 8;
		boolean bool = true;
		double d = 3.14;
		int[] array = new int[3];
		array[0] = 34;
		array[1] = 4;
		array[2] = 8;
		System.out.println(array[0]);
		array = null;
		//NullPointerException
		System.out.println(array[0]);
		
		int[] array1 = null;
		System.out.println(array1[0]);
		
	}

	/**
	 * 1、数组越界异常
	 * ArrayIndexOutOfBoundsException:3
	 */
	@Test
	public void test1() {
		int[] array = new int[]{3, 32, 1};
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	/**
	 * 空指针异常
	 */
	@Test
	public void test2() {
		int num = 8;
	}
	
	
	/**
	 * int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		求出上面数组中0-9分别出现的次数
	 */
	@Test
	public void countNum() {
		int[] score = {0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int num0 = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
			if (score[i] == 0) {
				num0++;
			}
		}
		System.out.println("0 出现次数：" + num0);
	}
	
	
	/**
	 * int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		求出上面数组中0-9分别出现的次数
	 */
	@Test
	public void countNum1() {
		int[] score = {0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int[] numArray = new int[10];
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
			switch (score[i]) {
			case 0:
				numArray[0]++;
				break;
			case 1:
				numArray[1]++;
				break;
			case 2:
				numArray[2]++;
				break;
			case 3:
				numArray[3]++;
				break;

			default:
				break;
			}
		}
		for (int i = 0; i < numArray.length; i++) {
			
		}
	}
	
	@Test
	public void test3() {
		int[] numArray = new int[10];
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i]);
		}
		System.out.println();
		
		boolean[] boolArray = new boolean[10];
		for (int i = 0; i < boolArray.length; i++) {
			System.out.print(boolArray[i] + " ");
		}
		System.out.println();
		
		double[] doubleArray = new double[10];
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[i] + " ");
		}
	}
	
	/**
	 * int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		要求求出其中的奇数个数和偶数个数。
	 */
	@Test
	public void countOddEvenNum() {
		int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int countOdd = 0;
		int countEven = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}
	}
	
	/**
	 * 输入一组学生的成绩，然后计算他们的平均值
	 */
	@Test
	public void test() {
		int[] scoreArray = new int[2];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println("请输入学生的成绩：");
			scoreArray[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < scoreArray.length; i++) {
			sum += scoreArray[i];
		}
		int avg = sum / scoreArray.length;
		System.out.println("平均值是： " + avg);
	}
	
}
