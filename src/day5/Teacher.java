package day5;

public class Teacher extends Person{
	private double salary;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, char gender, double salary) {
		super(name, age, gender);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void teach() {
		System.out.println(getName() + "正在教课");
	}

}
