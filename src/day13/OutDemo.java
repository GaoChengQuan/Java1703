package day13;

import day13.Outer.Inner;

public class OutDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		
		Inner inner = outer.new Inner();
//		Inner inner = new Outer().new Inner();
		inner.show();
	}
}
