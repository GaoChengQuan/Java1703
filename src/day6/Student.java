package day6;

public class Student extends Person {
	String className = "Java1703";
	//int age = 18;
	
	public void study() {
		System.out.println("study()");
	}
	
	//Cannot reduce the visibility of the inherited method from Person
	public void show() {
		System.out.println(className + "的" + name + "的年龄是：" + age);
	}
	
	public int getAge() {
		age = age + 1;
		return age;
	}
	
	public int getSuperAge() {
		return super.age;
	}
}
