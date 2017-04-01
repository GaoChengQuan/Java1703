package day5;

public class Student extends Person {
	private String className;

	public Student() {
		super();
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
		System.out.println(getName() + "正在学习");
	}
}
