package day7;




public class Son extends Father{

	public Son() {
		super();
	}
	
	public Son(int num) {
		super(num);
		//this.num = num;
	}
	
	public void display() {
		System.out.println(getNum());
	}
	
}
