package day7;

public class ArrayUtilTest {
	public static void main(String[] args) {
		int[] array = new int[] {12, 3, 45, 0};
		int max = ArrayUtil.max(array);
		System.out.println("max: " + max);
		int min = ArrayUtil.min(array);
		System.out.println("min: " + min);
		ArrayUtil.bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
