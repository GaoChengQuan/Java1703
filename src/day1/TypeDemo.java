package day1;

import java.util.Scanner;

import org.junit.Test;

/**
 * 基本数据类型
 * @author Gao
 *
 */
public class TypeDemo {
	public static void main(String[] args) {
	}

	@Test
	public void test1() {
		// 70 80
		int num = 70;
		num = 80;
		num = 88888888;
		System.out.println(num);
		num = 1000000000;
		num = 1;
		num = -1;
		//byte short int long
	}
	
	@Test
	public void test2() {
		// char 2个字节
		//Unicode
		char c1 = 'a';
		System.out.println(c1 + 0);
		
		char c2 = '字';
		char c3 = '中';
		char c4 = ' ';
		//char c5 = "";
		//char c6 = '中国';
		
		System.out.println(c3 + 0);
		
		System.out.println(c1);
		System.out.println(c1 + 1);
		System.out.println((char)(c1 + 1));
		System.out.println((char)(c1 + 2));
		
		double d1 = 3.14;
		// Type mismatch: cannot convert from double to float
		float f1 = (float)3.14;
		float f2 = 3.14F;
		
		int num = (int)3.14;
		System.out.println(num);
	}
	
	@Test
	public void test3() {
		int num = 3 + 5;
		
		int num1  = 8 / 3;
		int num2 = 8 % 3;
		System.out.println(num1);
		System.out.println(num2);
	}
	
	@Test
	public void test4() {
//		比较运算符: >   <   ==  <=   >=  !=
		int num1 = 3;
		int num2 = 5;
		System.out.println(num1 > num2);
		boolean bool = num1 > num2;
		System.out.println(bool);
		
		System.out.println(34 >= 34);
	}
	
	@Test
	public void test5() {
//		逻辑运算符 && ||
		int num1 = 3;
		int num2 = 5;
		System.out.println(num1 > 0 && num1 < num2);//true&&true=true
		System.out.println(num1 < 0 && num1 < num2);//false&&true=false
		
		System.out.println(num1 <0 || num1 < num2);//false||true=true
	}
	
	@Test
	public void test6() {
		// i++   ++i
		int i = 3;
		i++;//i = i + 1
		System.out.println(i);//4
		++i;
		System.out.println(i);//5
		System.out.println(i++);//5
		System.out.println(++i);//7
	}
	
	@Test
	public void test7() {
		int num1 = 3;
		int num2 = 5;
		//&&短路
		System.out.println(num1 < 0 && num1++ < num2);
		System.out.println(num1);//3
		System.out.println(num2);//5
		
		// ||短路
		System.out.println(num1 > 0 || num1++ < num2);
		System.out.println(num1);
		System.out.println(num2);
	}
	
	@Test
	public void test8() {
//		赋值运算符：=     +=   *=    /=     %=
		int num = 9;
		num += 3;// num = num + 3
		System.out.println(num);
		
		num /= 3;// num = num / 3
		System.out.println(num);
	}
	
	@Test
	public void test9() {
		// 交换两个变量的值
		int a = 3;
		int b = 5;
		System.out.println(a);
		System.out.println(b);
		
	    // 1
		int temp = a;
		// 2
		a = b;
		// 3
		b = temp;
		
		System.out.println("After:" + a);
		System.out.println("After:" + b);
	}
	
	@Test
	public void test10() {
		short s = 50;//右侧的值的范围只要不超过short
		//Type mismatch: cannot convert from int to short
		//s = s + 3;
		
		byte b1 = 3;
		byte b2 = 5;
		//Type mismatch: cannot convert from int to byte
		//byte num = b1 + b2;
	}
	
	@Test
	public void test11() {
//		+号运算符：
//		1、两边都是数字，则做加法运算
//		2、若一边为字符串，则做字符串拼接
		System.out.println(3 + 4);
		
		int age = 20;
		// 我的年龄是20
		System.out.println("我的年龄是" + age);
		// 我20岁了
		System.out.println("我" + age + "岁了");
		
		System.out.println(10 + 20 + "" + 30);//3030
		System.out.println("" + 10 + 20 + 30);//102030
	}
	
	@Test
	public void test12() {
		//三目运算符：
		//语法：     boolean?数1:数2
		int num1 = 7;
		int num2 = 5;
		int max = num1 > num2 ? num1 : num2;
		System.out.println(max);
	}
	
	@Test
	public void isLeapYear() {
		//求某年是不是闰年
		// 1、能被4整除，但是不能被100整除
		// ||
		// 2、能被400整除
		int year = 2017;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) 
				|| (year % 400 == 0);
		String result = isLeapYear ? year + "是闰年" : year + "不是闰年";
		System.out.println(result);
	}
	
	@Test
	public void test13() {
		// 分解一个三位数：386=3*100+8*10+6*1
		// 百位：3  十位：8  个位：6
		int num = 386;
		int bai = num / 100;
		int shi = num % 100 / 10; 
		int ge = num % 100 % 10;
		System.out.println("百位：" + bai);
		System.out.println("十位：" + shi);
		System.out.println("个位：" + ge);
	}
	
}
