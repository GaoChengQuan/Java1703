package day6;

import org.junit.Test;

import day4.Stu;

public class PersonTest {
    public static void main(String[] args) {
    	Person person = new Person();
    	System.out.println(person.age);
    	Student student = new Student();
    	System.out.println(student.age);
    	System.out.println(student.getSuperAge());
    	System.out.println(student.getAge());
    }
    
    @Test
    public void testMethod1() {
    	Student student = new Student();
    	student.name = "zhangsan";
    	student.age = 18;
    	student.className = "Java1703";
    	
    	student.show();
	}
    
    @Test
    public void testMethod2() {
    	/*Person person = new Student();
    	person.name = "zhangsan";
    	person.age = 18;
    	//person.className = "Java1703";
    	person.show();*/
    	
    	
    	Student student = new Student();
    	student.name = "zhangsan";
    	student.age = 20;
    	
    	Person person = new Teacher();
    	person.name = "lisi";
    	person.age = 20;
    	//personTeacher.salary = 1000;
    	person.show();
    	System.out.println("--------");
    	person = student;
    	person.show();
    	
    	//Person person = // new Student、new Teacher
    	
    	
    	System.out.println("---------");
    	Teacher teacher = new Teacher();
    	teacher.name = "lisi";
    	teacher.age = 20;
    	//personTeacher.salary = 1000;
    	teacher.show();
	}
    
    
    @Test
    public void testMethod3() {
    	Student student = new Student();
    	student.name = "zhangsan";
    	student.age = 20;
    	printStudent(student);
    	//Person person = new Student();
    	print(student);
    	
    	Teacher teacher = new Teacher();
    	teacher.name = "lisi";
    	teacher.age = 20;
    	//printTeacher(teacher);
    	// Person p = new Teacher();
    	print(teacher);
	}
    
	public void print(Person person) {
		System.out.println(person.name);
		System.out.println(person.age);
		person.show();
	}
    
	public void printTeacher(Teacher teacher) {
		System.out.println(teacher.name);
		System.out.println(teacher.age);
	}
	
	public void printStudent(Student student) {
		System.out.println(student.name);
		System.out.println(student.age);
	}
    
    @Test
    public void test44() {
    	// 我以一个人的身份来看这个学生
    	Person person = new Student();
    	person.name = "lisi";
    	person.age = 20;
    	person.show();
    	//java.lang.ClassCastException: day6.Student cannot be cast to day6.Teacher
    	//Teacher teacher = (Teacher)person;
		//teacher.teach();
    	// instanceof
    	if (person instanceof Teacher) {
    		Teacher teacher = (Teacher)person;
    		teacher.teach();
		} else if (person instanceof Student) {
			Student student = (Student)person;
			student.study();
		}
	}
}
