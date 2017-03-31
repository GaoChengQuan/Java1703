package day4;

/**
 * 
 描述动物、 狗、 鱼 三个类，动物都具备name、 color两个属性、 动物都具备移动的行为。 狗特有的一个方法就是咬人。 鱼特有的一个行为：吹泡泡。
 * 
 * @author Gao
 * 
 */
public class Animal {
	private String name;
	private String color;

	public Animal() {
	}

	public Animal(String name, String color) {
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
