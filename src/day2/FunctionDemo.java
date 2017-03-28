package day2;

public class FunctionDemo {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
		
		int num3 = 89;
		int num4 = 39;
		int sum1 = num3 + num4;
		System.out.println(sum1);
		
		int sum2 = sum(34, 45);
		System.out.println(sum2);
		
		System.out.println(sum(2, 5));
		print();
		
	}
	
	/*
	 * 传入两个整数，返回最大的那个的值
	 */
	public int max(int num1, int num2) {
		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public int max1(int num1, int num2) {
		// boolean?数1：数2
		// return num1 >= num2 ? num1 : num2;
		int max = num1 >= num2 ? num1 : num2;
		return max;
	}
	
	/**
	 * 
	 */
	
	public static void print() {
		System.out.println("---");
		return;
	}
	
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	

}
