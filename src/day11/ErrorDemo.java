package day11;

public class ErrorDemo {
	public static void main(String[] args) {
		fun();
		System.out.println("over");
	}

	private static void fun() {
		fun();
	}
}
