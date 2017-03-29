package day3;

import java.util.Arrays;

public class ArraySortDemo {
	public static void main(String[] args) {
//		long start = System.currentTimeMillis();
//		int[] array = new int[]{23, 5, 56, 1, 4, 67, 0, 32};
//		Arrays.sort(array);
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//		long end = System.currentTimeMillis();
//		long delta = end - start;
//		System.out.println("delta: " + delta);
		
		int[] array = new int[]{23, 5, 56, 1, 4, 67, 0, 32};
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
		     for (int j = 0; j < array.length - i - 1 ; j++) {
		          if (array[j] > array[j + 1]) {
		              int temp = array[j];
		               array[j] = array[j + 1];
		               array[j + 1] = temp; 
		          }
		     }
		}
	}
}
