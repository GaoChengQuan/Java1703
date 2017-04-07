package day8.homework;

public abstract class Student extends AbstractPerson{
	protected String className;

	protected Student() {
		super();
	}

	protected Student(String name, int age, String className) {
		super(name, age);
		this.className = className;
	}

	public abstract void study();
	
}
