package day2;

import java.util.Scanner;

import org.junit.Test;

public class WhileDemo {
	/**
	 * 输出5遍HelloWorld！
	 */
	@Test
	public void test1() {
		int i = 1;// 1、循环条件的初始化
		while (i <= 5) {//2、循环条件的控制
			System.out.println("HelloWorld!");
			i--;//3、循环条件的改变(趋向于循环条件)
		}
	}
	
	/**
	 * 1+2+3+...+100=5050
	 */
	@Test
	public void sum() {
		int i = 1;//1、循环条件的初始化
		int sum = 0;
		while (i <= 100) { // 2、循环条件的控制
			System.out.println(i);
			sum += i;
			i++; // 3、循环条件的改变(趋向于循环条件)
		}
		System.out.println("sum: " + sum);
	}
	
	/**
	 * 1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
	 */
	@Test
	public void test2() {
		int i = 1;
		while (i <= 9) {
			System.out.print(i + "*9=" + (i * 9) + "\t");
			i++;
		}
	}
	
	/*例题：随机生成并存储一个整数：
	用户输入一个整数，程序给出与存储的数字“大”或“小”的比较结果，直到用户猜到数字为止。
	如果中途，用户希望程序结束，可以输入0退出。
	int num = 250;
	猜吧！
	300
	太大了
	猜吧！
	200
	太小了
	....
	猜吧！
	250
	恭喜你，猜对了。*/
	@Test
	public void guessNum() {
		//随机生成一个1-1000的整数
		// Returns a double value with a positive sign, 
		// greater than or equal to 0.0 and less than 1.0 
		// 		  0.0---------0.99999999.....
		// *1000  0.0---------999.999999.....
		// +1	  1.0--------1000.999999.....
		// (int)    1--------1000
		// int random = (int)(Math.random() * 1000 + 1);
		// System.out.println(random);
		
		int random = (int) (Math.random() * 1000 + 1);
		System.out.println(random);
		Scanner scanner = new Scanner(System.in);
		System.out.println("猜吧！");
		int num = scanner.nextInt();//1
		while (num != random) {//2
			if (num == 0) {
				System.out.println("下次再来");
				return;
			}
			if (num > random) {
				System.out.println("太大了");
			} else {
				System.out.println("太小了");
			}
			System.out.println("猜吧！");
			num = scanner.nextInt();//3
		}
		System.out.println("恭喜你，猜对了。");
	}
	
	@Test
	public void doWhile() {
		Scanner scanner = new Scanner(System.in);
		int pwd;
		do {
			System.out.println("请输入密码");
			pwd = scanner.nextInt();
		} while (123 != pwd);
		System.out.println("over");
	}
	
}
