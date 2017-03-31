package day4;
/**
 * 定义一个矩形类，有计算面积与周长的方法。
 * @author Gao
 *
 */
public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	// This method must return a result of type double
	public double getPerimeter() {
		return (width + length) * 2;
	}
	
	public double getArea() {
		return width * length;
	}
}
