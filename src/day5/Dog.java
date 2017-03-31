package day5;

public class Dog extends Animal{

//	private String name;
//	private String color;
	private int legCount;

	public Dog() {
		//super();
	}

	public Dog(String name, String color, int legCount) {
		// super();
		super(name, color);
//		this.name = name;
//		this.color = color;
		this.legCount = legCount;
		System.out.println("Dog()");
	}

	public int getLegCount() {
		return legCount;
	}

	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}

	public void cry() {
		System.out.println(super.getColor() + "的" + super.getName() + "正在咬人");
	}
}
