package day7.cal;

public class Div extends Cal{

	public Div() {
		super();
	}

	public Div(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int getResult() {
		return num1 / num2;
	}
}
