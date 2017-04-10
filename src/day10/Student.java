package day10;

public class Student {
	private String name;
	private int age;
	private EnumGender gender;

	public Student() {
		super();
	}

	public Student(String name, int age, EnumGender gender) {
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

	public EnumGender getGender() {
		return gender;
	}

	public void setGender(EnumGender gender) {
		this.gender = gender;
//		if (gender == '男' || gender == '女') {
//			this.gender = gender;
//		} else {
//			this.gender = '男';
//		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender.getValue()
				+ "]";
	}

	

}
