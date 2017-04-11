package day11;



public class ExceptionDemo1 {
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 0;
		try {
			div(num1, num2);// ArrayIndexOutOfBoundsException
		} catch (ArithmeticException e) {
			System.out.println("算数异常：除以0");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("出错了");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("over");
	}
	

	private static int div(int num1, int num2) throws ArithmeticException, ArrayIndexOutOfBoundsException{
		int[] array = new int[2];
		array[2] = 10;
		return num1 / num2;
	}
}
