package day6;

import org.junit.Test;

public class GraphicsTest {
	public static void main(String[] args) {
		Graphics graphics = new Square(4);
		graphics.draw();
		
		graphics = new Circular(34);
		graphics.draw();
	}
	
	@Test
	public void test22() {
		Graphics graphics = new Square();
		Square square = (Square)graphics;
		square.setLength(23);
	}
}
