package day7;

public class Number {
	private int num1;
	private int num2;
	
	public Number() {
		super();
	}

	public Number(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int add() {
		int result = num1 + num2;
		return result;
	}
	
	public int  sub() {
		return num1 - num2;
	}

	public int multi() {
		return num1 * num2;
	}
	
	public int div() {
		return num1 / num2;
	}
}
