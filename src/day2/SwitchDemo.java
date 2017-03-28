package day2;

import java.io.InputStreamReader;
import java.util.Scanner;

import org.junit.Test;

public class SwitchDemo {
	@Test
	public void test() {
		// 1,2,3...0
		int type = 3;
		/*if (type == 0) {
			System.out.println("0");
		} else if (type == 1) {
			System.out.println("1");
		} else if (type == 2) {
			System.out.println("2");
		} else if (type == 3) {
			System.out.println("3");
		} else if (type == 4) {
			System.out.println("4");
		}*/
		
		switch (type) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default://默认执行
			System.out.println("default");
			break;
		}
	}
	
	@Test
	public void test1() {
	//		int type = 3;
	//		byte type = 3;
	//		short type = 3;
		char ch = 'a';
		
		switch (ch) {
		case 'a':
			System.out.println("a");
			break;
		case 'b':
			System.out.println("b");
			break;
		case 'c':
			System.out.println("c");
			break;
		case 'd':
			System.out.println("d");
			break;
		case 'e':
			System.out.println("e");
			break;
		default://默认执行
			System.out.println("default");
			break;
		}
	}
	
//	输入月份，年份判断天数
//	1、3、5、7、8、10、12---------------------31天
//	4、6、9、11-------------------------------------30天
//	2-----------------------------------------------------28天/29天
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		if (month <=0 || month > 12) {
			System.out.println("非法的月份!");
			return;
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) 
					|| (year % 400 == 0)) {
				System.out.println("29天");
			} else {
				System.out.println("28天");
			}
			break;
		default:
			break;
		}
	}

}
