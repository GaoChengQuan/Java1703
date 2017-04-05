package day7.cal;

public class CalTest {
	public static void main(String[] args) {
		Cal cal = new Add(3, 5);
		int addResult = cal.getResult();
		System.out.println(addResult);
		cal = new Div(4, 2);
		int divResult = cal.getResult();
		System.out.println(divResult);
	}
}
