package day4;

public class Dog {

	private String name;
	private String color;

	public Dog() {
	}

	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move() {
		System.out.println(color + "的" + name + "正在移动");
	}

	public void cry() {
		System.out.println(color + "的" + name + "正在咬人");
	}

}
