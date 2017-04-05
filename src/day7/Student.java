package day7;

public class Student {
	private String name;
	private int age;
	private char gender;
	private static String country = "CN";

	public Student() {
		super();
	}

	public Student(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Student.country = country;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender
				+ ", country=" + country + "]";
	}

}
