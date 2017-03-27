package day1;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		int num = 9;
		num = 4;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入：");
		int num1 = scanner.nextInt();
		double d = scanner.nextDouble();
		System.out.println(num1);
		System.out.println(d);
	}
}
