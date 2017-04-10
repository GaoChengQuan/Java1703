package day10;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student[] stuArray = new Student[10];
		int[] array = new int[10];
		//List<int> intList = new ArrayList<int>();
		List<Integer> integers = new ArrayList<Integer>();
		// int Itegeter
		int num = 2;
		Integer integer1 = new Integer(3);
		Integer integer2 = 3;//new Integer(3);
		integers.add(3);
		integers.add(5);
		
		int maxValue = integer1.MAX_VALUE;
		System.out.println(maxValue);
		
		int num2 = integer1.intValue();
		System.out.println(num2);
	}
	
	@Test
	public void test() {
		// NuberFormatException
		String str1 = "12";
		String str2 = "6";
		//str1/str2;
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num2);
		int result = num1 / num2;
		System.out.println(result);
		
		System.out.println(Double.parseDouble("3.14"));
		boolean bool = Boolean.parseBoolean("true");//"true"
		System.out.println(bool);
	}
	
	@Test
	public void test2() {
		String str = "12";
		int num = 3;
		System.out.println(str + num);
		
		int num1 = 34;
		String str1 = num1 + "";
		System.out.println(str1);
		
		String str2 = Integer.toString(num1);
		System.out.println(str2);
		
	}
}
