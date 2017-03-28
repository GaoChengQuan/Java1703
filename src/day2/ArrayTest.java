package day2;

import org.junit.Test;

public class ArrayTest {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 656;
		int num3 = 43;
		int num4 = 34;
		int num5 = 87;
		int num6 = 23;
		int num7 = 9;
		
		// 定义了int类型的数组，数组的长度是4
		int[] array1 = new int[4];
		array1[0] = 3;
		array1[1] = 6;
		array1[2] = 1;
		array1[3] = 9;
		System.out.println(array1.length);
		System.out.println(array1[3]);
		System.out.println(array1[array1.length - 1]);
		
		int[] array2 = {3, 4, 6, 87};
		int[] array3 = new int[]{3, 4, 6, 87};
	}
	
	@Test
	public void test1() {
		int[] array = {3, 4, 6, 87};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println("---------");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}
