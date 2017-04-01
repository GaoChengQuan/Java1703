package day6;

public class Square extends Graphics{
	private double length;
	
	public Square() {
		super();
	}

	public Square(double length) {
		super();
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public void draw() {
		System.out.println("正方形的边长为： " + length + ",正在绘制");
	}
}
