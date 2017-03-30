package day4;

public class Student {
	// 成员属性
	private String name;
    private int age;
    private char gender;
    
    public Student() {
		System.out.println("Student()");
	}
    
    //构造函数constructor
    public Student(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

    public Student(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    
    public void setAll(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
    
    public void setName(String name) {
    	//就近原则
    	// The assignment to variable name has no effect
    	// name = name;
    	
    	// this 当前类Student的对象
    	// student1.name = name;
    	// student2.name = name;
		this.name = name;
	}

    public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 100) {
			this.age = age;
		} else {
			this.age = 18;
		}
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if (gender == '男' || gender == '女') {
			this.gender = gender;
		} else {
			this.gender = '男';
		}
	}
}
