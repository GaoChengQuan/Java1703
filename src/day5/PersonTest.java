package day5;

public class PersonTest {
    public static void main(String[] args) {
    	Teacher teacher = new Teacher();
    	teacher.setName("zhangsan");
    	teacher.setAge(20);
    	teacher.setGender('男');
    	teacher.setSalary(1000);
    	teacher.eat();
    	teacher.teach();
    	
    	System.out.println("------------");
    	String name = "lisi";
    	int age = 20;
    	Student student = new Student(name, age, '女', "Java1703");
    	student.eat();
    	student.study();
	}	
}
