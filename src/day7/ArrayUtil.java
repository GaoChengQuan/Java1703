package day7;

public class ArrayUtil {
	//构造方法私有
	private ArrayUtil() {
		
	}
	
	/**
	 * 返回数组中的最大值
	 * @param array 接收一个整数类型的数组
	 * @return 返回数组中的最大值
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
	 * 返回数组中的最小值
	 * @param array 接收一个整数类型的数组
	 * @return 返回数组中的最小值
	 */
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	
	/**
	 * 冒泡排序
	 * @param array 接收一个int类型的数组
	 */
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	/**
	 * 交换数组中任意两个位置的值
	 * @param array 接收一个整数类型的数组
	 * @param x 交换的位置
	 * @param y 交换的位置
	 */
	private static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
