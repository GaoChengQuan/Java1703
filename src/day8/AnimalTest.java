package day8;


public class AnimalTest {
	public static void main(String[] args) {
		//Cannot instantiate the type Animal
		// Animal animal = new Animal();
		Person person = new Student("zahnsgan", 23, '男', "Java1703");
		person.showInfo();
		person.walk();
		
		Animal bird = new Bird("bird", 20);
		bird.showInfo();
	}
}
