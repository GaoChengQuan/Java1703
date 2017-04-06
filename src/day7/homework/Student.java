package day7.homework;

public class Student extends Person{
	private String className;

	public Student() {
		super();
	}
	
	public Student(String name, int age, char gender) {
		super(name, age, gender);
	}
	
	public Student(String name, int age, char gender, String className) {
		super(name, age, gender);
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public void study() {
		System.err.println(name + "正在学习");
	}
}
