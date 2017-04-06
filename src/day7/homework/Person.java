package day7.homework;

public class Person extends Animal{

	 private char gender;

	public Person() {
		super();
	}

	public Person(String name, int age, char gender) {
		super(name, age);
		this.gender = gender;
	}

	@Override
	public void showInfo() {
		System.out.println(name + "的年龄是： " + age + " 性别是：" + gender);
	}
	
	public void walk() {
		System.out.println(name + "能直立行走 ");
	}
	 
}

