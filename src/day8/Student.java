package day8;

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

	@Override
	public void showInfo() {
		System.out.println(name + "的年龄是： " + age + " 性别是：" + gender);
	}
}
