package day5;

public class Fish extends Animal{

	public Fish() {
		//super();
		System.out.println("Fish()");
	}

	public Fish(String name, String color) {
		super(name, color);
		System.out.println("Fish()----2");
	}

	public void bubble() {
		System.out.println(getColor() + "的" + getName() + "吹泡泡");
	}

}
