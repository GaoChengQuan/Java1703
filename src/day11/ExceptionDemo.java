package day11;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			//需要被检测的代码
			int result = div(6, 0);//ArithmeticException
			System.out.println(result);
		} catch (ArithmeticException e) {
			// 异常处理的代码
			System.out.println("算数除零");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
	
	public static int div(int num1, int num2) {
		return num1 / num2;
	}
}
