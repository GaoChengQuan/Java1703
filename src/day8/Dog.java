package day8;

public class Dog extends Animal{

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		//Cannot directly invoke the abstract method showInfo() for the type Animal
		// super.showInfo();
		System.out.println("Dog: " + name + "的年龄是： " + age);
	}
}
