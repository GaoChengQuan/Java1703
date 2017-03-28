package day2;

import org.junit.Test;

public class ForDemo {

	@Test
	public void test1() {
		int i = 1;
		while (i <= 5) {
			System.out.println("HelloWorld!");
			i++;
		}
		System.out.println("------------");
		for (int j = 1; j <=5; j++) {
			System.out.println("HelloWorld!");
		}
	}
	
	@Test
	public void test2() {
		int j = 1;
		for (; j <=5; ) {
			System.out.println("HelloWorld!");
			j++;
		}
		
		while (true) {
			
		}
		
//		for (;;) {
//			System.out.println("HelloWorld!");
//		}
	}
	
	/**
	 * 1+2+3+...+100=5050
	 */
	@Test
	public void sum() {
		int sum = 0;
		for (int i = 1; i <=100; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("sum: " + sum);
	}
	
	/**
	 * 1-100中7的倍数
	 */
	@Test
	public void countNum() {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("count: " + count);
	}
	
	@Test
	public void forFor() {
		//****
		//****
		//****
		
		//*
		//*
		//*
		for (int i = 1; i <= 3; i++) {
			System.out.println("*");
		}
		
		//****
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	*
//	**
//	***
//	****
//	*****
	@Test
	public void test4() {
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// i=1	1
		// i=2	2
		// i=3	3
	}
	
	/**
	 * 九九乘法表：
	 */
	@Test
	public void test5() {
		int num = 7;
		for (int i = 1; i <= num; i++) {
			System.out.print(i + "*" + num + "=" + (i * num) + "\t");
		}
		System.out.println();

		num = 8;
		for (int i = 1; i <= num; i++) {
			System.out.print(i + "*" + num + "=" + (i * num) + "\t");
		}
		System.out.println();
		
		num = 9;
		// 1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "*" + num + "=" + (i * num) + "\t");
		}
	}
	
	/**
	 * 九九乘法表：
	 */
	@Test
	public void test6() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
	}
}
