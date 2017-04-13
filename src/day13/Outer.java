package day13;

public class Outer {
	public void show() {
		System.out.println("outer show");
	}
	
	public class Inner {
		public void show() {
			System.out.println("inner show");
		}
	}
}
