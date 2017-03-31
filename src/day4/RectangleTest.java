package day4;


public class RectangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(10);
		rectangle.setLength(20);
		
		System.out.println("width: " + rectangle.getWidth());
		System.out.println("length: " + rectangle.getLength());
		
		double perimeter = rectangle.getPerimeter();
		System.out.println("周长： " + perimeter);
		double area = rectangle.getArea();
		System.out.println("面积： " + area);
	}

}
