package day12;
public class Person extends Animal{
	private String name = "dfdaaa";//Filed
	private String address = "aaaaa";
	public int age;
	public char gender;

	public Person() {//Constructor
		super();
	}
	public Person(String name) {//Constructor
		super();
		this.name = name;
	}
	public String getName() {//Method
		return name;
	}
	private void setName(String name) {//Method
		this.name = name;
	}
	
	private void show() {
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
}
