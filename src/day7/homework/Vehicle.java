package day7.homework;

/**
 * 1、请定义一个交通工具(Vehicle)的类，
 * 其中有: 属性：速度(speed)，体积(size)等等
 * 方法：移动(move())，加速speedUp(),减速speedDown()等等.
 * 
 */
public class Vehicle {
	private double speed;
	private double size;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(double speed, double size) {
		super();
		this.speed = speed;
		this.size = size;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public void move() {
		System.out.println("正在以" + speed + "速度移动");
	}
	
	public void speedUp() {
		speed += 10;
	}
	
	public void speedDown() {
		speed -= 10;
	}
}
