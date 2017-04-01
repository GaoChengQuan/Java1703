package day6;

public class Teacher extends Person{
	double salary = 1000;

	public void teach() {
		System.out.println("teach()");
		//System.out.println(name + "的年龄是：" + age + ", 薪资：" + salary);
	}
}
