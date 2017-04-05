package day7.cal;

public class Cal {
	protected int num1;
	protected int num2;

	public Cal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cal(int num1, int num2) {
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
	
	public int getResult() {
		System.out.println("getResult()");
		return 0;
	}

}
