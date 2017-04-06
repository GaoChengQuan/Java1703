package day8;

//The type Bird must implement the inherited abstract method Animal.showInfo()
public class Bird extends Animal{

	public Bird() {
		super();
	}

	public Bird(String name, int age) {
		super(name, age);
	}

	//Cannot override the final method from Animal
	@Override
	public final void eat() {
		System.out.println("eat");
	}
	
	@Override
	public void showInfo() {
		System.out.println("Bird: " + name + "的年龄是： " + age);
	}
}
