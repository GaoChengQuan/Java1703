package day7;

public class NumberTest {
	public static void main(String[] args) {
		Number number = new Number(3, 5);
		int result = number.add();
		System.out.println(result);
		System.out.println("--------");
		Add add = new Add();
		int result1 = add.add(3, 5);
		System.out.println(result1);
		
		System.out.println("--------");
		int max = Math.max(3, 5);
		System.out.println(max);
	}
}
