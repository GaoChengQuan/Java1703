package day5;

public class Fish {

	private String name;
	private String color;

	public Fish() {
	}

	public Fish(String name, String color) {
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


}
