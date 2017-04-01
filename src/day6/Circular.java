package day6;

public class Circular extends Graphics {
	private double r;

	public Circular() {
		super();
	}

	public Circular(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public void draw() {
		System.out.println("圆形半径为：" + r + ",正在绘制");
	}
	
}
